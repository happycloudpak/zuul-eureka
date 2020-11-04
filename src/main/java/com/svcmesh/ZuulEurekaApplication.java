package com.svcmesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEurekaApplication.class, args);
	}
	
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
