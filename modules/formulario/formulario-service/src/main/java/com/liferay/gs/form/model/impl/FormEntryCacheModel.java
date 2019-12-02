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

package com.liferay.gs.form.model.impl;

import com.liferay.gs.form.model.FormEntry;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing FormEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class FormEntryCacheModel
	implements CacheModel<FormEntry>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FormEntryCacheModel)) {
			return false;
		}

		FormEntryCacheModel formEntryCacheModel = (FormEntryCacheModel)obj;

		if (formId == formEntryCacheModel.formId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, formId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", formId=");
		sb.append(formId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", email=");
		sb.append(email);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FormEntry toEntityModel() {
		FormEntryImpl formEntryImpl = new FormEntryImpl();

		if (uuid == null) {
			formEntryImpl.setUuid("");
		}
		else {
			formEntryImpl.setUuid(uuid);
		}

		formEntryImpl.setFormId(formId);

		if (name == null) {
			formEntryImpl.setName("");
		}
		else {
			formEntryImpl.setName(name);
		}

		if (lastName == null) {
			formEntryImpl.setLastName("");
		}
		else {
			formEntryImpl.setLastName(lastName);
		}

		if (birthday == Long.MIN_VALUE) {
			formEntryImpl.setBirthday(null);
		}
		else {
			formEntryImpl.setBirthday(new Date(birthday));
		}

		if (email == null) {
			formEntryImpl.setEmail("");
		}
		else {
			formEntryImpl.setEmail(email);
		}

		if (createDate == Long.MIN_VALUE) {
			formEntryImpl.setCreateDate(null);
		}
		else {
			formEntryImpl.setCreateDate(new Date(createDate));
		}

		formEntryImpl.resetOriginalValues();

		return formEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		formId = objectInput.readLong();
		name = objectInput.readUTF();
		lastName = objectInput.readUTF();
		birthday = objectInput.readLong();
		email = objectInput.readUTF();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(formId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeLong(birthday);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(createDate);
	}

	public String uuid;
	public long formId;
	public String name;
	public String lastName;
	public long birthday;
	public String email;
	public long createDate;

}