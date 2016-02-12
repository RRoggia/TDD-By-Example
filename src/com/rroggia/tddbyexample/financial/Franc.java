package com.rroggia.tddbyexample.financial;

public class Franc extends Money{

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplier) {
		return new Franc(this.amount * multiplier);
	}

	@Override
	public boolean equals(Object obj) {
		Money franc = (Franc) obj;
		return this.amount == franc.amount;
	}

}
