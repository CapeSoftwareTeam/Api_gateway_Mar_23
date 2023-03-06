package com.capeelectric;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 
@SpringBootApplication	
@EnableEurekaClient
//@CrossOrigin(origins = "http://localhost:4200") 
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

//	@Bean
//	public CorsWebFilter corsWebFilter() {
//
//		final CorsConfiguration corsConfig = new CorsConfiguration();
//		corsConfig.setAllowedOrigins(Collections.singletonList("*"));
//		corsConfig.setMaxAge(3600L);
//		corsConfig.setAllowedMethods(Arrays.asList("GET", "POST"));
//		corsConfig.addAllowedHeader("*");
//		
//	 
//
//		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", corsConfig);
//
//		return new CorsWebFilter(source);
//	}
	
 
}
