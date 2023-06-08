package com.capeelectric;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaClient
@CrossOrigin("*")
public class ApiGatewayApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApiGatewayApplication.class);
	}

//    @Bean
//    public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils){
//
//        EurekaInstanceConfigBean config = new EurekaInstanceConfigBean(inetUtils);
//        String ip = null;
//        try {
//        ip = InetAddress.getLocalHost().getHostAddress();
//            
//        } catch (UnknownHostException e) {
//        e.printStackTrace();
//        }
//       
//        config.setIpAddress(ip);
//        config.setPreferIpAddress(true);
//          
//
//        return config;
//       }
}
