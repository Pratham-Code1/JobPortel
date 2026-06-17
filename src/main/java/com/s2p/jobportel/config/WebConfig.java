package com.s2p.jobportel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig  implements WebMvcConfigurer {

    public void configureApiVersioning(ApiVersionConfigurer configurer){
        configurer.useMediaTypeParameter(MediaType.parseMediaType("application/vnd.s2p+json"),"v");
        configurer.addSupportedVersions("1.0","2.0","3.0");
        configurer.setDefaultVersion("1.0")  ;
    }


    @Override
   public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }

}
