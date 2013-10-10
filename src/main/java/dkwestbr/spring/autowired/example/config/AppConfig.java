package dkwestbr.spring.autowired.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"dkwestbr.spring.autowired.example"})
public class AppConfig {
/*
    private static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Configuration
    @PropertySource("classpath:configuration.properties")
    static class Production { }
    
    @Configuration
    @Profile("test")
    @PropertySource("classpath:configuration.properties")
    static class Test { }
    */
}
