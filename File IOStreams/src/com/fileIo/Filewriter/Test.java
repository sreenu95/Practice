package com.fileIo.Filewriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * FileWriter fw=new FileWriter("malli.txt",true); fw.write(99);
		 * fw.write("andu\nstudying\nbetech"); fw.write("\n"); char[] ch= {'a','b','c'};
		 * fw.write(ch); fw.write("\n"); fw.flush();
		 */
		FileReader fr=new FileReader("malli.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
	}

}
