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

package com.liferay.gs.form.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link FormEntry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FormEntry
 * @generated
 */
@ProviderType
public class FormEntryWrapper
	extends BaseModelWrapper<FormEntry>
	implements FormEntry, ModelWrapper<FormEntry> {

	public FormEntryWrapper(FormEntry formEntry) {
		super(formEntry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("formId", getFormId());
		attributes.put("name", getName());
		attributes.put("lastName", getLastName());
		attributes.put("birthday", getBirthday());
		attributes.put("email", getEmail());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long formId = (Long)attributes.get("formId");

		if (formId != null) {
			setFormId(formId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	/**
	 * Returns the birthday of this form entry.
	 *
	 * @return the birthday of this form entry
	 */
	@Override
	public Date getBirthday() {
		return model.getBirthday();
	}

	/**
	 * Returns the create date of this form entry.
	 *
	 * @return the create date of this form entry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this form entry.
	 *
	 * @return the email of this form entry
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the form ID of this form entry.
	 *
	 * @return the form ID of this form entry
	 */
	@Override
	public long getFormId() {
		return model.getFormId();
	}

	/**
	 * Returns the last name of this form entry.
	 *
	 * @return the last name of this form entry
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the name of this form entry.
	 *
	 * @return the name of this form entry
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this form entry.
	 *
	 * @return the primary key of this form entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this form entry.
	 *
	 * @return the uuid of this form entry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the birthday of this form entry.
	 *
	 * @param birthday the birthday of this form entry
	 */
	@Override
	public void setBirthday(Date birthday) {
		model.setBirthday(birthday);
	}

	/**
	 * Sets the create date of this form entry.
	 *
	 * @param createDate the create date of this form entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this form entry.
	 *
	 * @param email the email of this form entry
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the form ID of this form entry.
	 *
	 * @param formId the form ID of this form entry
	 */
	@Override
	public void setFormId(long formId) {
		model.setFormId(formId);
	}

	/**
	 * Sets the last name of this form entry.
	 *
	 * @param lastName the last name of this form entry
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the name of this form entry.
	 *
	 * @param name the name of this form entry
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this form entry.
	 *
	 * @param primaryKey the primary key of this form entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this form entry.
	 *
	 * @param uuid the uuid of this form entry
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected FormEntryWrapper wrap(FormEntry formEntry) {
		return new FormEntryWrapper(formEntry);
	}

}