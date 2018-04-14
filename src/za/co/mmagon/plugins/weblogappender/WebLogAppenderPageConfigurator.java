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
package za.co.mmagon.plugins.weblogappender;

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.plugins.PluginInformation;

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
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-ProjectTemplate",
		pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-ProjectTemplate",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-ProjectTemplate/wiki",
		pluginOriginalHomepage = "http://www.jwebswing.com",
		pluginDownloadUrl = "",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2017/03/04"
)
public class WebLogAppenderPageConfigurator extends PageConfigurator
{

	public static final String WebConsoleLoggingEnabled = "webconsole-enabled";
	private static final long serialVersionUID = 1L;
	/**
	 * Sets the log appenderr enabled
	 */
	private static boolean Enabled;
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
	 * Sets the appender enabled
	 *
	 * @return
	 */
	public static boolean isEnabled()
	{
		return Enabled;
	}

	/**
	 * Sets the appender disabled
	 *
	 * @param Enabled
	 */
	public static void setEnabled(boolean Enabled)
	{
		WebLogAppenderPageConfigurator.Enabled = Enabled;
	}

	public static boolean isInsertAtTop()
	{
		return InsertAtTop;
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
		return webLogDivName;
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
		return webLogDivDisplayName;
	}

	public static void setWebLogDivDisplayName(String webLogDivDisplayName)
	{
		WebLogAppenderPageConfigurator.webLogDivDisplayName = webLogDivDisplayName;
	}

	@Override
	public Page configure(Page page)
	{
		return page;
	}

}
