package dkwestbr.spring.autowired.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import dkwestbr.spring.autowired.example.IStringGetter;
import dkwestbr.spring.autowired.example.stringGetter.impl.A;

@Configuration
@ComponentScan(basePackages = {"dkwestbr.spring.fun.stringGetter.**"})
public class AppConfig {

    @Bean
    private static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
	@Bean
	public IStringGetter getTheThing() {
		return new A();
	}

    @Configuration
    @PropertySource("classpath:configuration.properties")
    static class Production { }
    
    @Configuration
    @Profile("test")
    @PropertySource("classpath:configuration.properties")
    static class Test { }
}
