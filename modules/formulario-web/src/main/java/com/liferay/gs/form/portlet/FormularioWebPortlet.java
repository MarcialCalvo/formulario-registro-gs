package com.liferay.gs.form.portlet;

import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.gs.form.constants.FormularioWebPortletKeys;
import com.liferay.gs.form.model.FormEntry;
import com.liferay.gs.form.portlet.util.FormUtil;
import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author m.calvo.valenzuela
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=FormularioWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FormularioWebPortletKeys.FORMULARIOWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FormularioWebPortlet extends MVCPortlet {

	@Override
	public void processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException {

		if (_log.isDebugEnabled()) {
			_log.info("Starting captcha validation");
		}

		try {
			CaptchaUtil.check(actionRequest);
		}
		catch (CaptchaException ce) {
			SessionErrors.add(actionRequest, ce.getClass(), ce);

			return;
		}

		FormEntry formEntry = FormUtil.addFormEntry(actionRequest);

		try {
			FormUtil.sendEmail(formEntry.getEmail(), actionRequest);
		}
		catch (PortalException pe) {
			_log.error(
				"Problem occurs trying to send email to the customer " + pe);
		}

		super.processAction(actionRequest, actionResponse);
	}

	@Override
	public void serveResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {

		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);
		}
		catch (IOException ioe) {
			_log.error(ioe);
		}
	}

	private Log _log = LogFactoryUtil.getLog(FormularioWebPortlet.class);

}