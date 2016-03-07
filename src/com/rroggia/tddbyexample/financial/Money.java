package com.rroggia.tddbyexample.financial;

public class Money {
	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return this.amount == money.amount && this.currency.equals(money.currency());
	}

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public String currency() {
		return currency;
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	public String toString() {
		return amount + " " + currency;
	}

}
