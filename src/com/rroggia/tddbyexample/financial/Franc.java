package com.rroggia.tddbyexample.financial;

public class Franc extends Money {

	public Franc(int amount, String currency) {
		this.amount = amount;
		this.currency = "CHF";
	}

	public Money times(int multiplier) {
		return new Franc(this.amount * multiplier);
	}

}
