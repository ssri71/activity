package com.sapient.txt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader fr=new FileReader("sap.txt");
		String str=null;
		BufferedReader br=new BufferedReader(fr,2*1024*1024);
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
		fr.close();

	}

}
