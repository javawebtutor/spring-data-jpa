package com.jwt.digital.jwtrac.config;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;*/
import org.springframework.web.client.RestTemplate;

//import com.jwt.digital.jwtrac.model.Unauthenticated;

@Configuration
//@EnableResourceServer
public class ResourceServerConfiguration //extends ResourceServerConfigurerAdapter 
{

	/*@Autowired
	private Unauthenticated unauthenticated;*/

	// @LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * Provide security so that endpoints are only served if the request is
	 * already authenticated.
	 */
	/*@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers(unauthenticated.getPermit().toArray(new String[unauthenticated.getPermit().size()]))
				.permitAll().anyRequest().authenticated();
	}*/
}
