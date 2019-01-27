module com.jwebmp.plugins.weblogappender {

	exports com.jwebmp.plugins.weblogappender;
	exports com.jwebmp.plugins.weblogappender.annotations;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.weblogappender.WebLogAppenderPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.weblogappender.implementations.WebLogAppenderExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.weblogappender.implementations.WebLogAppenderExclusionsModule;

	opens com.jwebmp.plugins.weblogappender to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.weblogappender.annotations to com.fasterxml.jackson.databind, com.jwebmp.core;
}
