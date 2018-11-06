import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.weblogappender.WebLogAppenderPageConfigurator;
import com.jwebmp.plugins.weblogappender.implementations.WebLogAppenderExclusionsModule;

module com.jwebmp.plugins.weblogappender {

	exports com.jwebmp.plugins.weblogappender;
	exports com.jwebmp.plugins.weblogappender.annotations;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with WebLogAppenderPageConfigurator;
	provides IGuiceScanJarExclusions with WebLogAppenderExclusionsModule;
	provides IGuiceScanModuleExclusions with WebLogAppenderExclusionsModule;

	opens com.jwebmp.plugins.weblogappender to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.weblogappender.annotations to com.fasterxml.jackson.databind, com.jwebmp.core;
}
