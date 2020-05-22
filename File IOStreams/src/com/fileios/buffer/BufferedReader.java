package com.fileios.buffer;
import java.io.*;
public class BufferedReader {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("malli43.txt");
		java.io.BufferedReader br=new java.io.BufferedReader(fr);
		//BufferedReader cannot communicate with file directely it can communicate through the Reader Object
		String line=br.readLine();
		//it used for read the data line by line
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		
	}

}
