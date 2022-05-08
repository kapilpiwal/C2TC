package com.ide.framework;

public  class NormalAccount extends ShopAccount
{

	protected static float deliveryCharge=50;
	
	
	
	public NormalAccount(int accNo, String accNm, float charges, float deliveryCharge)
	{
		super(accNo, accNm, charges);
		NormalAccount.deliveryCharge = deliveryCharge;
	}
	public void bookProduct(float deliveryCharge)
	{
		System.out.println("Charges are:"+deliveryCharge);
	}
	@Override
	public String toString() {
		return "NormalAccount [deliveryCharge=" + deliveryCharge + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges="
				+ getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	public float getDeliveryCharge()
	{
		return deliveryCharge;
	}
	
	
}