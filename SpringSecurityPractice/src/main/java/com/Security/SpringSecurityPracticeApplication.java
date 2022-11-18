package com.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "REST API",version = "1.1"),
//security = {
//		@SecurityRequirement(name = "basicAuth"),
//		@SecurityRequirement(name = "bearerToken")
//},
//servers = {
//		@Server(url = "/",description = "Default Server URL")
//}
//)
//@SecuritySchemes({
//	@SecurityScheme(name = "basicAuth",type = SecuritySchemeType.HTTP,scheme = "basic"),
//	@SecurityScheme(name = "bearerToken",type= SecuritySchemeType.HTTP,scheme = "bearer",bearerFormat = "JWT")
//})

// The above code is only for swagger users

@EnableWebSecurity(debug = true)
public class SpringSecurityPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityPracticeApplication.class, args);
		System.out.println("");
		System.out.println("                                  ===============================  Completed  ==============================");
	}

}
