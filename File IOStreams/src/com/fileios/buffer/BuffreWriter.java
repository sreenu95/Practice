package com.fileios.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//Write the character data into the file
public class BuffreWriter {

	public static void main(String[] args) throws IOException {
		BufferedWriter br=new BufferedWriter(new FileWriter("malli43.txt"));
		br.write("malligoud");
		br.newLine();//replace of \n in the fileWriter ex fw.write("\n")
		br.write(43);
		br.newLine();
		br.write("null");
		br.newLine();
		char[] ch= {'a','b'};
		br.write(ch);
		br.flush();
		br.close();
	}

}
