package com.ide.application;

import com.ide.framework.NormalAccount;
import com.ide.framework.PrimeAccount;
import com.ide.framework.ShopAccount;
import com.ide.framework.ShopFactory;

public class GSShopFactory implements ShopFactory 
{

	@Override
	public GSPrimeAccount getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAccount gsprime = new GSPrimeAccount();
		return gsprime;
	}

	@Override
	public GSNormalAccount getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAccount gsnormal = new GSNormalAccount(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}
	
		
}