/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.dynamicdatalists.util;

import com.liferay.portal.kernel.template.StringTemplateResource;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateContextType;
import com.liferay.portal.kernel.template.TemplateManagerUtil;
import com.liferay.portal.kernel.template.TemplateResource;
import com.liferay.portal.kernel.templateparser.TemplateContext;
import com.liferay.portal.util.PropsValues;

/**
 * @author Marcellus Tavares
 */
public class FreeMarkerTemplateParser extends
	com.liferay.portlet.journal.util.FreeMarkerTemplateParser {

	@Override
	protected String getErrorTemplateId() {
		return PropsValues.DYNAMIC_DATA_LISTS_ERROR_TEMPLATE_FREEMARKER;
	}

	@Override
	protected TemplateContext getTemplateContext() throws Exception {
		TemplateResource templateResource = new StringTemplateResource(
			getTemplateId(), getScript());

		return TemplateManagerUtil.getTemplate(
			TemplateConstants.LANG_TYPE_FTL, templateResource,
			getErrorTemplateResource(), TemplateContextType.STANDARD);
	}

}