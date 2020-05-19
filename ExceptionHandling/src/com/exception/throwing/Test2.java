package com.exception.throwing;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test2 {

	public static void main(String[] args)  {
		try
		{
			PrintWriter pw=new PrintWriter("abc.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
