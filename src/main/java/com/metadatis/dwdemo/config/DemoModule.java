package com.metadatis.dwdemo.config;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.yammer.dropwizard.config.Configuration;

public class DemoModule extends AbstractModule {

	@Override
	protected void configure() {
		
	}

	@Provides
	public DemoConfiguration configuration(Configuration configuration) {
		return (DemoConfiguration) configuration;
	}
}
