package com.iostreams.File;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\","malli.txt");
		//System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}

}
