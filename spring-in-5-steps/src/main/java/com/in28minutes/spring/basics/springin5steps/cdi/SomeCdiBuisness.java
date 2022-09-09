package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBuisness {
	@Inject
	SomeCdiDao somecdidao;

	public SomeCdiDao getSomecdidao() {
		return somecdidao;
	}

	public void setSomecdidao(SomeCdiDao somecdidao) {
		this.somecdidao = somecdidao;
	}
	

}
