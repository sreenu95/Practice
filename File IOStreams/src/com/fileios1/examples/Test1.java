package com.fileios1.examples;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test1 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("file3.txt");
		BufferedReader br=new BufferedReader(new FileReader("input1.txt"));
		BufferedReader br1=new BufferedReader(new FileReader("input2.txt"));
		String line=br.readLine();
		String line1=br1.readLine();
		while(line!=null || line1!=null)
		{
			pw.println(line);
			pw.println(line1);
			line=br.readLine();
			line1=br1.readLine();
		}
		pw.flush();
	}

}
