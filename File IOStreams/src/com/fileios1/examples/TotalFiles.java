package com.fileios1.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TotalFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir=new File("D:\\io streams");
		PrintWriter pw=new PrintWriter("malli.txt");
		String[] fileNames=dir.list();
		for(String fileName:fileNames)
		{
			System.out.println("Reading from"+fileName);
			File f=new File(dir,fileName);
			BufferedReader br=new BufferedReader(new FileReader(f));
			pw.println("content of the file"+fileName);
			String line=br.readLine();
			while(line!=null)
			{
				pw.println(line);
				line=br.readLine();
			}
			pw.flush();
			
		}
		System.out.println("Reading all files"+dir.getName());

	}

}
