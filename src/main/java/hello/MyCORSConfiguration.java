package hello;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class MyCORSConfiguration {

	   @Bean
	    public CorsFilter corsFilter() {

	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        CorsConfiguration config = new CorsConfiguration();
	        config.setAllowCredentials(true); // you USUALLY want this
	        config.addAllowedOrigin("http://localhost:3000");  // "*" for all 
	        config.addAllowedOrigin("http://localhost:3011");  // "*" for all 
	        config.addAllowedHeader("*");
	        config.addAllowedMethod("GET");
	        config.addAllowedMethod("PUT");
	        source.registerCorsConfiguration("/**", config);
	        return new CorsFilter();
	}
}