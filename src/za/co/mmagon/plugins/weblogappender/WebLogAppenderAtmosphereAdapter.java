/*
 * The MIT License
 *
 * Copyright 2017 Marc Magon.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.plugins.weblogappender;

import org.atmosphere.cpr.AtmosphereResourceEvent;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.plugins.atmosphere.abstraction.AtmosphereAdapter;
import za.co.mmagon.logger.LogFactory;

import java.util.logging.Logger;

/**
 * @author Marc Magon
 * @since 22 Apr 2017
 */
public class WebLogAppenderAtmosphereAdapter extends AtmosphereAdapter
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
	public AjaxResponse onReady()
	{
		log.info("Web Log Appender Atmosphere Adapter Connected");
		return super.onReady();
	}

	@Override
	public void onDisconnect(AtmosphereResourceEvent event)
	{
		log.info("Web Log Appender Atmosphere Adapter Disconnected");
		super.onDisconnect(event);
	}
}
