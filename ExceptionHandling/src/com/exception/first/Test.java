package com.exception.first;

public class Test {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println(10/2);
			
			/*
			 * e.printStackTrace(); e.getCause();
			 */
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
