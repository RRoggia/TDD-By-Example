package com.rroggia.tddbyexample.financial;

public abstract class Money {
	protected int amount;
	protected String currency;

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return this.amount == money.amount && this.getClass().equals(money.getClass());
	}

	public static Money dollar(int amount) {
		return new Dollar(amount);
	}

	public String currency() {
		return currency;
	}

	public abstract Money times(int i);

	public static Money franc(int amount) {
		return new Franc(amount);
	}

}
