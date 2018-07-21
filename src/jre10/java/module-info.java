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
}
