package com.metadatis.dwdemo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.inject.Inject;
import com.metadatis.dwdemo.config.DemoConfiguration;
import com.metadatis.dwdemo.domain.ServiceInfo;
import com.yammer.metrics.annotation.Timed;

@Path("/service-info")
public class ServiceInfoResource {

    private final String serviceName;

    @Inject
    public ServiceInfoResource(DemoConfiguration configuration) {
        this.serviceName = configuration.getServiceName();
    }
    
    public ServiceInfoResource(String serviceName) {
        this.serviceName = serviceName;
    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public ServiceInfo sayHello() {
        return new ServiceInfo(System.currentTimeMillis(), serviceName);
    }
}
