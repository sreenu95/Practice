package com.exception.first;
/*
 * create three packages for
 * checked exceptions
 * un-checked exceptions
 * user defined exceptions
 * in that create classes for try catch,finally those combinations
 * using throws
 * 
 * */

public class ExceptionBlocks {

	public static void main(String[] args) {
		try
		{
			System.out.println("try block executed");
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("catch block executed");
		}
		finally
		{
			System.out.println("finally block execeted");
		}
	}

}
