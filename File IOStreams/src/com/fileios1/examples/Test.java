package com.fileios1.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
			PrintWriter pw=new PrintWriter("file2.txt");
			FileReader fr=new FileReader("input1.txt");
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null)
			{
				//System.out.println(line);
				pw.println(line);
				line=br.readLine();
			}
			 fr=new FileReader("input2.txt");
			 br=new BufferedReader(fr);
			 line=br.readLine();
			while(line!=null)
			{
			//	System.out.println(line1);
				pw.println(line);
				line=br.readLine();
			}
			pw.flush();
			br.close();
			
	}

}
