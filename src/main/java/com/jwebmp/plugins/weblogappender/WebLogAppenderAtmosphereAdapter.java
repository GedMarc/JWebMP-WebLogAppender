/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.weblogappender;

import com.jwebmp.base.ajax.AjaxResponse;
import com.jwebmp.logger.LogFactory;
import com.jwebmp.plugins.atmosphere.abstraction.AtmosphereAdapter;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.AtmosphereResourceEvent;

import java.util.logging.Logger;

/**
 * @author Marc Magon
 * @since 22 Apr 2017
 */
public class WebLogAppenderAtmosphereAdapter
		extends AtmosphereAdapter
{
	private static final Logger log = LogFactory.getLog("WebLogAtomsphereAdapter");

	/*
	 * Constructs a new WebLogAppenderAtmosphereAdapter
	 */
	public WebLogAppenderAtmosphereAdapter()
	{
		//Nothing needed
	}

	@Override
	public AjaxResponse onReady(AtmosphereResource r)
	{
		log.info("Web Log Appender Atmosphere Adapter Connected");
		return super.onReady(r);
	}

	@Override
	public void onDisconnect(AtmosphereResourceEvent event)
	{
		log.info("Web Log Appender Atmosphere Adapter Disconnected");
		super.onDisconnect(event);
	}
}
