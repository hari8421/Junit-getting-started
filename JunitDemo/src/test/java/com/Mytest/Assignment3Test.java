package com.Mytest;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Assignment3Test {
    int a=2;
    int b=3;
	@Test
	public void test1() {
		System.out.println("I am Test1");
		assertFalse("Test 1 Failed", a-b<0);
	}
	
	@Test
	public void test2() {
		System.out.println("I am Test2");
		assertFalse("Test 2 Failed", a>b);
	}
	
	@Test
	public void test3() {
		System.out.println("I am Test3");
		assertFalse("Test 3 Failed", a+b>0);
	}

}
