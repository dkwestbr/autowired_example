package dkwestbr.spring.autowired.example.stringGetter.impl;

import org.springframework.stereotype.Component;

import dkwestbr.spring.autowired.example.IStringGetter;

@Component
public class A implements IStringGetter {
	
	@Override
	public String getItGood() {
		return "I am an A";
	}

}
