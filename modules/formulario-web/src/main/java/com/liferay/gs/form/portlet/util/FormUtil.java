package com.liferay.gs.form.portlet.util;

import static com.liferay.gs.form.constants.FormularioWebPortletKeys.*;

import com.liferay.gs.form.model.FormEntry;
import com.liferay.gs.form.service.FormEntryLocalServiceUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import javax.portlet.ActionRequest;
import javax.portlet.PortletPreferences;

import javax.servlet.http.HttpServletRequest;

public class FormUtil {

	public static FormEntry addFormEntry(ActionRequest actionRequest) {
		DateFormat dateFormat = new SimpleDateFormat(
			SIMPLE_DATE_FORMAT_PATTERN);

		Date birthday = ParamUtil.getDate(
			actionRequest, BIRTHDAY_KEY_PARAM, dateFormat);

		String nameParam = ParamUtil.getString(actionRequest, NAME_KEY_PARAM);
		String lastNameParam = ParamUtil.getString(
			actionRequest, LAST_NAME_KEY_PARAM);
		String emailParam = ParamUtil.getString(actionRequest, EMAIL_KEY_PARAM);

		if (_log.isDebugEnabled()) {
			_log.debug("Persisting Form information");
		}

		FormEntry formEntry = FormEntryLocalServiceUtil.addFormEntry(
			nameParam, lastNameParam, emailParam, birthday);

		if (_log.isDebugEnabled()) {
			_log.debug(
				"Form information persisted. Returning email: " +
					formEntry.getEmail());
		}

		return formEntry;
	}

	public static void sendEmail(String email, ActionRequest actionRequest)
		throws PortalException {

		InternetAddress internetAddressTo = _buildEmailAddress(email);

		PortletPreferences preferences =
			PortletPreferencesFactoryUtil.getPortletSetup(
				actionRequest, PortalUtil.getPortletId(actionRequest));

		HttpServletRequest httpServletRequest =
			PortalUtil.getHttpServletRequest(actionRequest);

		String emailFrom = PortalUtil.getEmailFromAddress(
			preferences, PortalUtil.getDefaultCompanyId(),
			LanguageUtil.get(httpServletRequest, DEFAULT_FROM_EMAIL_KEY));

		InternetAddress internetAddressFrom = _buildEmailAddress(emailFrom);

		MailMessage mailMessage = new MailMessage(
			internetAddressFrom, internetAddressTo,
			LanguageUtil.get(httpServletRequest, EMAIL_SUBJECT_KEY),
			LanguageUtil.get(httpServletRequest, EMAIL_BODY_KEY), false);

		MailServiceUtil.sendEmail(mailMessage);

		if (_log.isDebugEnabled()) {
			_log.debug("Email Sent: " + mailMessage.getBody());
		}
	}

	private static InternetAddress _buildEmailAddress(String email) {
		InternetAddress address = null;

		try {
			address = new InternetAddress(email);
		}
		catch (AddressException ae) {
			_log.error(
				"I could not send email to the customer due to problems with email address " +
					ae);
		}

		return address;
	}

	private static Log _log = LogFactoryUtil.getLog(FormUtil.class);

	//	@Reference
	//	private static FormEntryLocalService formEntryLocalService;

}