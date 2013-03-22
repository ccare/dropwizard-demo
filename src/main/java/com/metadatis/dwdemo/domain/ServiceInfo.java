package com.metadatis.dwdemo.domain;

public class ServiceInfo {

	private final long currentTimestamp;
	private final String serviceName;
	
	public ServiceInfo(long currentTimestamp, String serviceName) {
		this.currentTimestamp = currentTimestamp;
		this.serviceName = serviceName;
	}

	public long getCurrentTimestamp() {
		return currentTimestamp;
	}

	public String getServiceName() {
		return serviceName;
	}
	
	
}
