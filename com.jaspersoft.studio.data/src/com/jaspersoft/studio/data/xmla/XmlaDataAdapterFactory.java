/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.data.xmla;

import net.sf.jasperreports.data.DataAdapter;
import net.sf.jasperreports.data.DataAdapterService;
import net.sf.jasperreports.data.xmla.XmlaDataAdapterImpl;

import org.eclipse.swt.graphics.Image;

import com.jaspersoft.studio.data.Activator;
import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.DataAdapterFactory;
import com.jaspersoft.studio.data.adapter.IDataAdapterCreator;
import com.jaspersoft.studio.data.messages.Messages;

public class XmlaDataAdapterFactory implements DataAdapterFactory {

	public DataAdapterDescriptor createDataAdapter() {
		return new XmlaDataAdapterDescriptor();
	}

	public String getDataAdapterClassName() {
		return XmlaDataAdapterImpl.class.getName();
	}

	public String getLabel() {
		return Messages.XmlaDataAdapterFactory_label;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.data.DataAdapterFactory#getDescription()
	 */
	public String getDescription() {
		return Messages.XmlaDataAdapterFactory_description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.data.DataAdapterFactory#getIcon(int)
	 */
	public Image getIcon(int size) {
		if (size == 16) {
			return Activator.getDefault().getImage("icons/database.png"); //$NON-NLS-1$
		}
		return null;
	}

	public DataAdapterService createDataAdapterService(DataAdapter dataAdapter) {
		return null;
	}

	@Override
	public IDataAdapterCreator iReportConverter() {
		return new XMLACreator();
	}

	@Override
	public boolean isDeprecated() {
		return false;
	}
}