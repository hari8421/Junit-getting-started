package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
public class JUTest {
	
	@BeforeClass
	public void bc() {
		System.out.println("In BC");
	}
	@AfterClass
	public void ac() {
		System.out.println("in ac");
	}
	@Before
	public void before() {
		System.out.println("Testing pre conditions");
	}
	
	@After
	public void after() {
		System.out.println("Testing post conditions");
	}
	
	@Test
	@Order(1)
	public void signIn() {
		System.out.println("Junit demo3");
		//fail("Not yet implemented");
	}
	
	@Test
	@Order(2)
	public void compose() {
		System.out.println("Junit demo2");
		//fail("Not yet implemented");
	}
	@Test(timeout=500)
	@Order(0)
	public void signOut() {
		System.out.println("Junit demo1");
		//fail("Not yet implemented");
	}

}
