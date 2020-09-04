package com.Mytest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.demo.app.StockApp;

public class StockTest {

	StockApp sa=new StockApp();
	int[] priceArry= {1,2,3,4,5};
	int amount=20;
	
	List<String> sampleProdList=Arrays.asList("Mango","Orange","Tomato");
	@Test
	public void addProductTest() {
		for(String s:sampleProdList) {
			sa.addProdName(s);
		}
		assertArrayEquals(sa.pList.toArray(), sampleProdList.toArray());
	}
	
	@Test
	public void deleteProductTest() {
		String delProd="Mango";
		for(String s:sampleProdList) {
			sa.addProdName(s);
		}
		sa.deleteProduct(delProd);
		assertFalse("Product not deleted", sa.pList.contains(delProd));
	}
	
	@Test
	public void addPriceTest() {
		
		assertArrayEquals(priceArry, sa.addPrice(priceArry));
	}
	
	@Test
	public void addAmount() {
		
		assertEquals(amount, sa.addAmount(amount));
	}

}
