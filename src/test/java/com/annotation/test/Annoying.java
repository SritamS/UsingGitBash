package com.annotation.test;

import org.testng.annotations.Test;

public class Annoying extends AnnotationTest {
	
	@Test
	public void differentClass() {
		System.out.println("this is executed in a differnt class");
	}

}
