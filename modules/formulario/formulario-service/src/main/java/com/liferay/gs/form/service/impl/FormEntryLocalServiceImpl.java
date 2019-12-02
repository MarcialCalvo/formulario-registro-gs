/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.gs.form.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.gs.form.model.FormEntry;
import com.liferay.gs.form.service.base.FormEntryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the form entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.gs.form.service.FormEntryLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FormEntryLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.gs.form.model.FormEntry",
	service = AopService.class
)
public class FormEntryLocalServiceImpl extends FormEntryLocalServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.gs.form.service.FormEntryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.gs.form.service.FormEntryLocalServiceUtil</code>.
	 */
	public FormEntry addFormEntry(
		String name, String lastName, String email, Date birthday) {

		//		long formId = counterLocalService.increment();
		long formId = CounterLocalServiceUtil.increment();

		FormEntry formEntry = createFormEntry(formId);

		formEntry.setName(name);
		formEntry.setLastName(lastName);
		formEntry.setEmail(email);
		formEntry.setBirthday(birthday);

		return super.addFormEntry(formEntry);
	}

}