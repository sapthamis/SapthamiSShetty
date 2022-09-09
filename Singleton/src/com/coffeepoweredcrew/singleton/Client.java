package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
		
		EagerRegistry registry=EagerRegistry.getInstance();
		EagerRegistry registry1=EagerRegistry.getInstance();
		System.out.println(registry==registry1);
		
		LazyRegistryWithDCL reg=LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL reg1=LazyRegistryWithDCL.getInstance();
		System.out.println(reg==reg1);
		
		
		LazyRegistryIODH singleton;
		
		
		singleton = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
		System.out.println(singleton == singleton2);
	}

}
