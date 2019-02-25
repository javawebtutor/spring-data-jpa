package com.jwt.digital.jwtrac.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConditionalOnProperty(prefix = "swagger", value = "enable")
public class SwaggerConfig {
	
	@Value("${app.title}")
	private String title;
	@Value("${app.description}")
	private String description;
	@Value("${app.version}")
	private String version;
	@Value("${app.termsofserviceurl}")
	private String termsOfServiceUrl;
	@Value("${app.contactname}")
	private String contactName;
	@Value("${app.license}")
	private String license;
	@Value("${app.licenseurl}")
	private String licenseUrl;

	@Value("${spring.application.name}")
	private String groupName;
	@Value("${app.creatorteam}")
	private String creatorTeam;
	@Value("${app.creatoremail}")
	private String creatorEmail;

	/**
	 * 
	 * @return
	 */
	@Bean
	public Docket newAPIAncillariesDetailsService() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName(groupName).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.jwt.digital.jwtrac")).paths(PathSelectors.any()).build();
	}


	/**
	 * 
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title).description(description).termsOfServiceUrl(termsOfServiceUrl)
				.version(version)
				// .contact(new Contact(creatorTeam, creatorEmail, contactName))
				.license(license).licenseUrl(licenseUrl)
				.build();
	}
}
