package com.sapient.txt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Koala.jpg");
		FileOutputStream fos = new FileOutputStream("sapImage.jpg");
		byte[] data=new byte[fis.available()];			//length of fis stream
		fis.read(data);
		fos.write(data);
		fos.close();
		fis.close();

	}

}
