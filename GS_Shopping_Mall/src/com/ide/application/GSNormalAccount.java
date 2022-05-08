package com.ide.application;

import com.ide.framework.NormalAccount;

public class GSNormalAccount extends NormalAccount
{

	public GSNormalAccount(int accNo, String accNm, float charges, float deliveryCharge)
	{
		super(accNo, accNm, charges, deliveryCharge);
		
	}
	
	public GSNormalAccount()
	{
		super(accNo, accNm, deliveryCharge, deliveryCharge);
		
	}

	public void bookProduct(float charges)
	{
		System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: "+deliveryCharge);
	}

	@Override
	public String toString()
	{
		return "GSNormalAccount [accNo=" + getAccNo() + ", charges=" + getCharges() + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}