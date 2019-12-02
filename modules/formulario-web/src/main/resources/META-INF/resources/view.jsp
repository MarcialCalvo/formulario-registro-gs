<%@ include file="/init.jsp" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:actionURL var="submitURL" />
<portlet:resourceURL var="captchaURL" />

<aui:form action="${submitURL}" method="post" name="fm">
	<aui:fieldset-group markupView="lexicon">
		<aui:input label="name" name="name" title="name" type="text" />
		<aui:input label="last-name" name="lastName" title="last-name" type="text" />
		<aui:input label="email" name="email" title="email" type="email" />

		<label for="birthday" title="birthday"><liferay-ui:message key="birthday" /></label>

		<liferay-ui:input-date dayValue="1" monthValue="0" name="birthday" yearValue="1960" />

		<liferay-captcha:captcha url="${captchaURL}" />

		<liferay-ui:error exception="<%= CaptchaException.class %>" message="captcha-verification-failed" />
		<liferay-ui:error exception="<%= CaptchaTextException.class %>" message="text-verification-failed" />

		<aui:button type="submit" />
	</aui:fieldset-group>
</aui:form>