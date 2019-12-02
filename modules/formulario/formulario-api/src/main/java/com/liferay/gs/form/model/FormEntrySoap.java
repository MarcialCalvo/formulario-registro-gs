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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class FormEntrySoap implements Serializable {

	public static FormEntrySoap toSoapModel(FormEntry model) {
		FormEntrySoap soapModel = new FormEntrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFormId(model.getFormId());
		soapModel.setName(model.getName());
		soapModel.setLastName(model.getLastName());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setEmail(model.getEmail());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static FormEntrySoap[] toSoapModels(FormEntry[] models) {
		FormEntrySoap[] soapModels = new FormEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FormEntrySoap[][] toSoapModels(FormEntry[][] models) {
		FormEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FormEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new FormEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FormEntrySoap[] toSoapModels(List<FormEntry> models) {
		List<FormEntrySoap> soapModels = new ArrayList<FormEntrySoap>(
			models.size());

		for (FormEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FormEntrySoap[soapModels.size()]);
	}

	public FormEntrySoap() {
	}

	public long getPrimaryKey() {
		return _formId;
	}

	public void setPrimaryKey(long pk) {
		setFormId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFormId() {
		return _formId;
	}

	public void setFormId(long formId) {
		_formId = formId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private String _uuid;
	private long _formId;
	private String _name;
	private String _lastName;
	private Date _birthday;
	private String _email;
	private Date _createDate;

}