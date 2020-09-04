package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class JunitAnnotationTets {
	
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
	void test() {
		System.out.println("test 1");
	}
	
	@Test
	void test1() {
		System.out.println("test 2");
	}
	
	@Test(timeout = 500)
	void test2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test 3");
	}

}
