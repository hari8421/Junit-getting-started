package com.Mytest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class Assignment12Test {

	String strOne;
	String strTwo;
	int[] testArray= {20,23,22,11};
	@Test
	public void stringTest() {
		assertTrue("String not equal", strOne.equals(strTwo));
	}
	
	@Test
	public void intTest() {
		for(int i=0;i<testArray.length;i++) {
			assertTrue("Integer less than 20", testArray[i]<20);
		}
		
	}
	
	public Assignment12Test(String strOne,String strTwo) {
	      this.strOne = strOne;
	      this.strTwo=strTwo;
	    
	   }
	 @Parameterized.Parameters
	   public static Collection<Object[]> stringValue() {
	      return Arrays.asList(new Object[][] {
	         { "one","one" },
	         { "two","TWO" },
	         
	      });
	   }
}
