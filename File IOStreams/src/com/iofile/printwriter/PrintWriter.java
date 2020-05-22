package com.iofile.printwriter;
import java.io.*;
public class PrintWriter {

	public static void main(String[] args) throws IOException {
		java.io.PrintWriter pw=new java.io.PrintWriter("read.txt");
		pw.write(12);
		pw.println(234);
		//pw.write("malli");
		pw.println("kaka");
		pw.write('3');
		pw.flush();
		
	}

}
