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

package com.liferay.gs.form.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link FormEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FormEntryLocalService
 * @generated
 */
@ProviderType
public class FormEntryLocalServiceWrapper
	implements FormEntryLocalService, ServiceWrapper<FormEntryLocalService> {

	public FormEntryLocalServiceWrapper(
		FormEntryLocalService formEntryLocalService) {

		_formEntryLocalService = formEntryLocalService;
	}

	/**
	 * Adds the form entry to the database. Also notifies the appropriate model listeners.
	 *
	 * @param formEntry the form entry
	 * @return the form entry that was added
	 */
	@Override
	public com.liferay.gs.form.model.FormEntry addFormEntry(
		com.liferay.gs.form.model.FormEntry formEntry) {

		return _formEntryLocalService.addFormEntry(formEntry);
	}

	@Override
	public com.liferay.gs.form.model.FormEntry addFormEntry(
		String name, String lastName, String email, java.util.Date birthday) {

		return _formEntryLocalService.addFormEntry(
			name, lastName, email, birthday);
	}

	/**
	 * Creates a new form entry with the primary key. Does not add the form entry to the database.
	 *
	 * @param formId the primary key for the new form entry
	 * @return the new form entry
	 */
	@Override
	public com.liferay.gs.form.model.FormEntry createFormEntry(long formId) {
		return _formEntryLocalService.createFormEntry(formId);
	}

	/**
	 * Deletes the form entry from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formEntry the form entry
	 * @return the form entry that was removed
	 */
	@Override
	public com.liferay.gs.form.model.FormEntry deleteFormEntry(
		com.liferay.gs.form.model.FormEntry formEntry) {

		return _formEntryLocalService.deleteFormEntry(formEntry);
	}

	/**
	 * Deletes the form entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formId the primary key of the form entry
	 * @return the form entry that was removed
	 * @throws PortalException if a form entry with the primary key could not be found
	 */
	@Override
	public com.liferay.gs.form.model.FormEntry deleteFormEntry(long formId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formEntryLocalService.deleteFormEntry(formId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _formEntryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _formEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.gs.form.model.impl.FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _formEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.gs.form.model.impl.FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _formEntryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _formEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _formEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.gs.form.model.FormEntry fetchFormEntry(long formId) {
		return _formEntryLocalService.fetchFormEntry(formId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _formEntryLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the form entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.gs.form.model.impl.FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form entries
	 * @param end the upper bound of the range of form entries (not inclusive)
	 * @return the range of form entries
	 */
	@Override
	public java.util.List<com.liferay.gs.form.model.FormEntry> getFormEntries(
		int start, int end) {

		return _formEntryLocalService.getFormEntries(start, end);
	}

	/**
	 * Returns the number of form entries.
	 *
	 * @return the number of form entries
	 */
	@Override
	public int getFormEntriesCount() {
		return _formEntryLocalService.getFormEntriesCount();
	}

	/**
	 * Returns the form entry with the primary key.
	 *
	 * @param formId the primary key of the form entry
	 * @return the form entry
	 * @throws PortalException if a form entry with the primary key could not be found
	 */
	@Override
	public com.liferay.gs.form.model.FormEntry getFormEntry(long formId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formEntryLocalService.getFormEntry(formId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _formEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _formEntryLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the form entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param formEntry the form entry
	 * @return the form entry that was updated
	 */
	@Override
	public com.liferay.gs.form.model.FormEntry updateFormEntry(
		com.liferay.gs.form.model.FormEntry formEntry) {

		return _formEntryLocalService.updateFormEntry(formEntry);
	}

	@Override
	public FormEntryLocalService getWrappedService() {
		return _formEntryLocalService;
	}

	@Override
	public void setWrappedService(FormEntryLocalService formEntryLocalService) {
		_formEntryLocalService = formEntryLocalService;
	}

	private FormEntryLocalService _formEntryLocalService;

}