module com.jwebmp.plugins.weblogappender {

	exports com.jwebmp.plugins.weblogappender;
	exports com.jwebmp.plugins.weblogappender.annotations;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.atmosphere;
	requires atmosphere.runtime;

	opens com.jwebmp.plugins.weblogappender to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.weblogappender.annotations to com.fasterxml.jackson.databind,com.jwebmp.core;
}
