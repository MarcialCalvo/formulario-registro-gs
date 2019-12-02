package com.liferay.gs.form.portlet.model.listener;

import com.liferay.gs.form.model.FormEntry;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = ModelListener.class)
public class FormEntryModelListener extends BaseModelListener<FormEntry> {

	@Override
	public void onBeforeCreate(FormEntry formEntry)
		throws ModelListenerException {

		formEntry.setCreateDate(new Date());
	}

}