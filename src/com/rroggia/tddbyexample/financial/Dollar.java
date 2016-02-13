package com.rroggia.tddbyexample.financial;

public class Dollar extends Money {

	private String currency;

	public Dollar(int amount) {
		this.amount = amount;
		this.currency = "USD";
	}

	public Money times(int multiplier) {
		return new Dollar(this.amount * multiplier);
	}

	@Override
	public String currency() {
		return currency;
	}

}
