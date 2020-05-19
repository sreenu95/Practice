package com.exception.throwing;

public class Test {

	public static void main(String[] args) {
		//System.out.println(10/0);
		throw new ArithmeticException("divided by zero");
	}

}
