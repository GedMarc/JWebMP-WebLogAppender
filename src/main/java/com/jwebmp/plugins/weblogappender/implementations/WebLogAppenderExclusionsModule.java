package com.jwebmp.plugins.weblogappender.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class WebLogAppenderExclusionsModule
		implements IGuiceScanModuleExclusions<WebLogAppenderExclusionsModule>,
				           IGuiceScanJarExclusions<WebLogAppenderExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-web-log-appender-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.weblogappender");
		return strings;
	}
}
