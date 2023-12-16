package com.example.GateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;

@SpringBootApplication
public class GateWayApplication {
	
	@Bean
	public DiscoveryClientRouteDefinitionLocator routesDynamique(
	    ReactiveDiscoveryClient rdc,
	    DiscoveryLocatorProperties dlp
	) {
	    return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
	}


	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);
	}

}
