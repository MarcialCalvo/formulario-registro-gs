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

package com.liferay.gs.form.service.persistence;

import com.liferay.gs.form.exception.NoSuchEntryException;
import com.liferay.gs.form.model.FormEntry;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the form entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FormEntryUtil
 * @generated
 */
@ProviderType
public interface FormEntryPersistence extends BasePersistence<FormEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FormEntryUtil} to access the form entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the form entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching form entries
	 */
	public java.util.List<FormEntry> findByUuid(String uuid);

	/**
	 * Returns a range of all the form entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form entries
	 * @param end the upper bound of the range of form entries (not inclusive)
	 * @return the range of matching form entries
	 */
	public java.util.List<FormEntry> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the form entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form entries
	 * @param end the upper bound of the range of form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching form entries
	 */
	@Deprecated
	public java.util.List<FormEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FormEntry> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the form entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form entries
	 * @param end the upper bound of the range of form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching form entries
	 */
	public java.util.List<FormEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FormEntry> orderByComparator);

	/**
	 * Returns the first form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form entry
	 * @throws NoSuchEntryException if a matching form entry could not be found
	 */
	public FormEntry findByUuid_First(
			String uuid, OrderByComparator<FormEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form entry, or <code>null</code> if a matching form entry could not be found
	 */
	public FormEntry fetchByUuid_First(
		String uuid, OrderByComparator<FormEntry> orderByComparator);

	/**
	 * Returns the last form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form entry
	 * @throws NoSuchEntryException if a matching form entry could not be found
	 */
	public FormEntry findByUuid_Last(
			String uuid, OrderByComparator<FormEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form entry, or <code>null</code> if a matching form entry could not be found
	 */
	public FormEntry fetchByUuid_Last(
		String uuid, OrderByComparator<FormEntry> orderByComparator);

	/**
	 * Returns the form entries before and after the current form entry in the ordered set where uuid = &#63;.
	 *
	 * @param formId the primary key of the current form entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form entry
	 * @throws NoSuchEntryException if a form entry with the primary key could not be found
	 */
	public FormEntry[] findByUuid_PrevAndNext(
			long formId, String uuid,
			OrderByComparator<FormEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the form entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of form entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching form entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the form entry in the entity cache if it is enabled.
	 *
	 * @param formEntry the form entry
	 */
	public void cacheResult(FormEntry formEntry);

	/**
	 * Caches the form entries in the entity cache if it is enabled.
	 *
	 * @param formEntries the form entries
	 */
	public void cacheResult(java.util.List<FormEntry> formEntries);

	/**
	 * Creates a new form entry with the primary key. Does not add the form entry to the database.
	 *
	 * @param formId the primary key for the new form entry
	 * @return the new form entry
	 */
	public FormEntry create(long formId);

	/**
	 * Removes the form entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formId the primary key of the form entry
	 * @return the form entry that was removed
	 * @throws NoSuchEntryException if a form entry with the primary key could not be found
	 */
	public FormEntry remove(long formId) throws NoSuchEntryException;

	public FormEntry updateImpl(FormEntry formEntry);

	/**
	 * Returns the form entry with the primary key or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param formId the primary key of the form entry
	 * @return the form entry
	 * @throws NoSuchEntryException if a form entry with the primary key could not be found
	 */
	public FormEntry findByPrimaryKey(long formId) throws NoSuchEntryException;

	/**
	 * Returns the form entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param formId the primary key of the form entry
	 * @return the form entry, or <code>null</code> if a form entry with the primary key could not be found
	 */
	public FormEntry fetchByPrimaryKey(long formId);

	/**
	 * Returns all the form entries.
	 *
	 * @return the form entries
	 */
	public java.util.List<FormEntry> findAll();

	/**
	 * Returns a range of all the form entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form entries
	 * @param end the upper bound of the range of form entries (not inclusive)
	 * @return the range of form entries
	 */
	public java.util.List<FormEntry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the form entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of form entries
	 * @param end the upper bound of the range of form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of form entries
	 */
	@Deprecated
	public java.util.List<FormEntry> findAll(
		int start, int end, OrderByComparator<FormEntry> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the form entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form entries
	 * @param end the upper bound of the range of form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of form entries
	 */
	public java.util.List<FormEntry> findAll(
		int start, int end, OrderByComparator<FormEntry> orderByComparator);

	/**
	 * Removes all the form entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of form entries.
	 *
	 * @return the number of form entries
	 */
	public int countAll();

}