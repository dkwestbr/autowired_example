package dkwestbr.spring.autowired.example.stringGetter.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import dkwestbr.spring.autowired.example.IStringGetter;

@Component
public class A implements IStringGetter {
	
	@Value("${my.property}")
	private String configValue;
	
	@Override
	public String getItGood() {
		return String.format("I am an A: %s", configValue);
	}

}
