package com.ide.application;

import com.ide.framework.PrimeAccount;

public class GSPrimeAccount extends PrimeAccount
{

	private static final float charges=0; 
	
	
	public float getCharges()
	{
		return charges;
	}

	public GSPrimeAccount() 
	{
		super(accNo, accNm, charges, isPrime);
		
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}

	
	
	@Override
	public String toString()
	{
		return "GSPrimeAccount []";
	}
	

}