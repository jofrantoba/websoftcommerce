package com.develtrex.sofcommerce.app.requestfactory;

import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyForName("com.develtrex.sofcommerce.app.requestfactory.GreetingResponse")
public interface GreetingResponseProxy extends ValueProxy {
	
	boolean isSuccessful();

	String getError();
	
	String getGreeting();

	String getServerInfo();

	String getUserAgent();
}