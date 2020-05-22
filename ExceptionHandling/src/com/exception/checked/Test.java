package com.exception.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException  {
		FileWriter fw=new FileWriter(new File("malli23.txt"),false);
		fw.write("malli");
		fw.flush();
		FileReader fr=new FileReader("malli23.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
	}
}
