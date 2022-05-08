package com.ide.framework;

public class PrimeAccount extends ShopAccount
{

	
	public static boolean isPrime;
	
	public PrimeAccount(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	public void bookProduct(float charges)
	{
		System.out.println("Charges are: "+charges);
	}
	@Override
	public String toString() {
		return "PrimeAccount [isPrime=" + isPrime() + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
}