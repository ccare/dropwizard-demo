package com.metadatis.dwdemo.config;

import com.hubspot.dropwizard.guice.GuiceBundle;
import com.metadatis.dwdemo.resources.ServiceInfoResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class DemoService extends Service<DemoConfiguration> {
	
	    public static void main(String[] args) throws Exception {
	        new DemoService().run(args);
	    }

		@Override
		public void initialize(Bootstrap<DemoConfiguration> bootstrap) {
			bootstrap.setName("demo-service");
			bootstrap.addBundle(GuiceBundle.newBuilder()
					.addModule(new DemoModule())
					.enableAutoConfig("com.metadatis.dwdemo.resources")
		            .build()
		        );
		}

		@Override
		public void run(DemoConfiguration configuration, Environment environment)
				throws Exception {
		    final String serviceName = configuration.getServiceName();
		//	environment.addResource(new ServiceInfoResource(serviceName));
			
		}
}
