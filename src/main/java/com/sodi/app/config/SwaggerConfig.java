package com.sodi.app.config;

import java.util.Arrays;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.RequiredArgsConstructor;

@OpenAPIDefinition(info = @Info(title = "sodi App", description = "api명세", version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

	/**
	 * swagger 화면에 authorize 버튼 보이게 할때 사용 :  Available authorizations
	 * @return
	 */
//	@Bean
//	public OpenAPI openAPI() {
//		SecurityScheme securityScheme = new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer")
//				.bearerFormat("JWT").in(SecurityScheme.In.HEADER).name("Authorization");
//		SecurityRequirement securityRequirement = new SecurityRequirement().addList("bearerAuth");
//
//		return new OpenAPI()
//				.components(new Components().addSecuritySchemes("bearerAuth", securityScheme))
//				.security(Arrays.asList(securityRequirement))
//				;
//	}


	/**
	 * mapping vi 인 경우만 나오게 할때
	 * @return
	 */
//	@Profile({"test || dev"})
//    @Profile({"!test && !dev"})
//	@Bean
//	public GroupedOpenApi chatOpenApi() {
//		String[] paths = { "/api/v1/**" };
//
//		return GroupedOpenApi.builder().group("COUPLE API v1").pathsToMatch(paths).build();
//	}



}









