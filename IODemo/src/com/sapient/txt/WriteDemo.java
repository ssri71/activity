package com.sapient.txt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("sap.txt");
		BufferedWriter bw=new BufferedWriter(fw);		//uses buffer and flushes data to the underlying fileWriter stream
		bw.write("hello thi is shikhar\n");
		bw.write("I am currently in Sapient\n");
		bw.close();
		fw.close();
		System.out.println("File created");
	}

}
