package com.Mytest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.demo.Account;
@RunWith(Parameterized.class)
public class MyTest {
int a;
int b=22;
int sum=a+b;
int sub=a-b;
	@BeforeClass
	public static void bc() {
		System.out.println("In BC");
	}
	@AfterClass
	public static void ac() {
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
	public void test() {
		System.out.println("test 1");
	}
	
	@Test
	public void sumTestTest() {
		
		Assert.assertNotEquals(sum, Account.add(a, b));
	}
	
	@Test
	public void subtractionTest() {
		
		Assert.assertNotEquals(sub, Account.subtraction(a, b));
	}
	
	public MyTest(int a) {
	      this.a = a;
	    // this.expectedResult = expectedResult;
	   }
	
	 @Parameterized.Parameters
	   public static Collection<Object[]> primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2 },
	         { 6 },
	         { 19 },
	         { 22 },
	         { 23 }
	      });
	   }
	

}
