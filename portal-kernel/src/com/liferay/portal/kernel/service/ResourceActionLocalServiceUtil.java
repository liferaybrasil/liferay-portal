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

package com.liferay.portal.kernel.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;

/**
 * Provides the local service utility for ResourceAction. This utility wraps
 * <code>com.liferay.portal.service.impl.ResourceActionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ResourceActionLocalService
 * @generated
 */
public class ResourceActionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.portal.service.impl.ResourceActionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the resource action to the database. Also notifies the appropriate model listeners.
	 *
	 * @param resourceAction the resource action
	 * @return the resource action that was added
	 */
	public static com.liferay.portal.kernel.model.ResourceAction
		addResourceAction(
			com.liferay.portal.kernel.model.ResourceAction resourceAction) {

		return getService().addResourceAction(resourceAction);
	}

	public static com.liferay.portal.kernel.model.ResourceAction
		addResourceAction(String name, String actionId, long bitwiseValue) {

		return getService().addResourceAction(name, actionId, bitwiseValue);
	}

	public static void checkResourceActions() {
		getService().checkResourceActions();
	}

	public static void checkResourceActions(
		String name, java.util.List<String> actionIds) {

		getService().checkResourceActions(name, actionIds);
	}

	public static void checkResourceActions(
		String name, java.util.List<String> actionIds,
		boolean addDefaultActions) {

		getService().checkResourceActions(name, actionIds, addDefaultActions);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new resource action with the primary key. Does not add the resource action to the database.
	 *
	 * @param resourceActionId the primary key for the new resource action
	 * @return the new resource action
	 */
	public static com.liferay.portal.kernel.model.ResourceAction
		createResourceAction(long resourceActionId) {

		return getService().createResourceAction(resourceActionId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the resource action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resourceActionId the primary key of the resource action
	 * @return the resource action that was removed
	 * @throws PortalException if a resource action with the primary key could not be found
	 */
	public static com.liferay.portal.kernel.model.ResourceAction
			deleteResourceAction(long resourceActionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteResourceAction(resourceActionId);
	}

	/**
	 * Deletes the resource action from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resourceAction the resource action
	 * @return the resource action that was removed
	 */
	public static com.liferay.portal.kernel.model.ResourceAction
		deleteResourceAction(
			com.liferay.portal.kernel.model.ResourceAction resourceAction) {

		return getService().deleteResourceAction(resourceAction);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portal.model.impl.ResourceActionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portal.model.impl.ResourceActionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.portal.kernel.model.ResourceAction
		fetchResourceAction(long resourceActionId) {

		return getService().fetchResourceAction(resourceActionId);
	}

	public static com.liferay.portal.kernel.model.ResourceAction
		fetchResourceAction(String name, String actionId) {

		return getService().fetchResourceAction(name, actionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the resource action with the primary key.
	 *
	 * @param resourceActionId the primary key of the resource action
	 * @return the resource action
	 * @throws PortalException if a resource action with the primary key could not be found
	 */
	public static com.liferay.portal.kernel.model.ResourceAction
			getResourceAction(long resourceActionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getResourceAction(resourceActionId);
	}

	public static com.liferay.portal.kernel.model.ResourceAction
			getResourceAction(String name, String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getResourceAction(name, actionId);
	}

	/**
	 * Returns a range of all the resource actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portal.model.impl.ResourceActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of resource actions
	 * @param end the upper bound of the range of resource actions (not inclusive)
	 * @return the range of resource actions
	 */
	public static java.util.List<com.liferay.portal.kernel.model.ResourceAction>
		getResourceActions(int start, int end) {

		return getService().getResourceActions(start, end);
	}

	public static java.util.List<com.liferay.portal.kernel.model.ResourceAction>
		getResourceActions(String name) {

		return getService().getResourceActions(name);
	}

	/**
	 * Returns the number of resource actions.
	 *
	 * @return the number of resource actions
	 */
	public static int getResourceActionsCount() {
		return getService().getResourceActionsCount();
	}

	public static int getResourceActionsCount(String name) {
		return getService().getResourceActionsCount(name);
	}

	/**
	 * Updates the resource action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param resourceAction the resource action
	 * @return the resource action that was updated
	 */
	public static com.liferay.portal.kernel.model.ResourceAction
		updateResourceAction(
			com.liferay.portal.kernel.model.ResourceAction resourceAction) {

		return getService().updateResourceAction(resourceAction);
	}

	public static ResourceActionLocalService getService() {
		if (_service == null) {
			_service = (ResourceActionLocalService)PortalBeanLocatorUtil.locate(
				ResourceActionLocalService.class.getName());
		}

		return _service;
	}

	private static ResourceActionLocalService _service;

}