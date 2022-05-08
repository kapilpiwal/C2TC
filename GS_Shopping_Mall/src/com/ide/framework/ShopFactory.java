package com.ide.framework;

public interface ShopFactory 
{

	public abstract PrimeAccount getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAccount getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges);
}
