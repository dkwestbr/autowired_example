package dkwestbr.spring.autowired.example.stringGetter.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import dkwestbr.spring.autowired.example.IStringGetter;

@Component
public class A implements IStringGetter {

	@Bean
	public IStringGetter getTheThing() {
		return new A();
	}
	
	@Override
	public String getItGood() {
		return "I am an A";
	}

}
