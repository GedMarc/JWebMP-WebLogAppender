/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
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
package com.jwebmp.plugins.weblogappender;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 15 Feb 2017
 */
@PluginInformation(pluginName = "Web Logger",
		pluginUniqueName = "web-log-appender",
		pluginDescription = "This plugin outputs system logs into a JWebSwing push function. Instantly send your logs as they happen to your page.",
		pluginVersion = "0.1",
		pluginDependancyUniqueIDs = "atmosphere",
		pluginCategories = "jwebswing, logging",
		pluginSubtitle = "Instantly push logs to your pages",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-ProjectTemplate",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-ProjectTemplate",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-ProjectTemplate/wiki",
		pluginOriginalHomepage = "http://www.jwebswing.com",
		pluginDownloadUrl = "",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2017/03/04")
public class WebLogAppenderPageConfigurator
		implements IPageConfigurator<WebLogAppenderPageConfigurator>
{
	public static final String WebConsoleLoggingEnabled = "webconsole-enabled";

	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Insert the record at the top of the web display div
	 */
	private static boolean InsertAtTop;
	private static String webLogDivName = "WebLogAppenderDiv";
	private static String webLogDivDisplayName = "WebLogDisplay";

	public WebLogAppenderPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return WebLogAppenderPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		WebLogAppenderPageConfigurator.enabled = mustEnable;
	}

	public static boolean isInsertAtTop()
	{
		return WebLogAppenderPageConfigurator.InsertAtTop;
	}

	public static void setInsertAtTop(boolean InsertAtTop)
	{
		WebLogAppenderPageConfigurator.InsertAtTop = InsertAtTop;
	}

	/**
	 * Returns the web log div name
	 *
	 * @return
	 */
	public static String getWebLogDivName()
	{
		return WebLogAppenderPageConfigurator.webLogDivName;
	}

	/**
	 * Sets the web log div name
	 *
	 * @param webLogDivName
	 */
	public static void setWebLogDivName(String webLogDivName)
	{
		WebLogAppenderPageConfigurator.webLogDivName = webLogDivName;
	}

	public static String getWebLogDivDisplayName()
	{
		return WebLogAppenderPageConfigurator.webLogDivDisplayName;
	}

	public static void setWebLogDivDisplayName(String webLogDivDisplayName)
	{
		WebLogAppenderPageConfigurator.webLogDivDisplayName = webLogDivDisplayName;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return WebLogAppenderPageConfigurator.enabled;
	}

}
