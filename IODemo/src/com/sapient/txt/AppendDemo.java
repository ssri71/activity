package com.sapient.txt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {

	public static void main(String[] args)throws IOException {
		FileWriter fw=new FileWriter("sap.txt",true); 		//false creates new file everytime while true appends
		BufferedWriter bw=new BufferedWriter(fw);		//uses buffer and flushes data to the underlying fileWriter stream
		bw.write("christmas is here\n");
		bw.write("so merry christmas\n");
		bw.close();
		fw.close();
		System.out.println("File created");

	}

}
