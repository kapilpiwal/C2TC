package com.ide.client;

import com.ide.application.GSNormalAccount;
import com.ide.application.GSPrimeAccount;
import com.ide.application.GSShopFactory;


public class Client 
{
	public static void main(String[] args) 
	{
		// 
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(121, "Kapil", 10000, true);
		gssfactory.getNewNormalAccount(122, "Hitesh", 5000, 80);
		
		
		// 
		GSPrimeAccount gsprime = new GSPrimeAccount();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		
		//
		gsprime.bookProduct(1000);
		
		//
		gsprime.toString();
		
		//
		GSNormalAccount gsnormal = new GSNormalAccount(); 
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();
		
		//
		gsnormal.bookProduct(1000);
		
		//
		gsnormal.toString();
	
		
	}

}