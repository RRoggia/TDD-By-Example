package com.rroggia.tddbyexample.financial;

import java.util.Currency;

public class Bank {

	public Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

}