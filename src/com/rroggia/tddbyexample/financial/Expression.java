package com.rroggia.tddbyexample.financial;

public interface Expression {

	Money reduce(Bank bank, String to);

}
