package com.demo.app;

import java.util.ArrayList;
import java.util.List;

public class StockApp {
	public  List<String> pList=new ArrayList<String>();
	public  int amount;
	public  int[] price;
	public  List<String> addProdName(String pName) {
	    pList.add(pName);
	    return pList;
	}

	public List<String> deleteProduct(String pName) {
		
		     pList.remove(pName);
	
		      return pList;
	}
	public int[] addPrice(int[] priceArry) {
		price=priceArry;
		return price;
	    
	}
	public int addAmount(int amountCheck) {
		amount=amountCheck;
	    return amount;
	}

}
