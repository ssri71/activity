package com.sapient.client;
import com.sapient.service.*;
public class NokiaClient {

	public static void main(String[] args) {
		Nokia1100 mobile=new NokiaLumia();			//superclass can hold subclass instance
		mobile.doConverse();
		mobile.sendSms();
		//mobile.captureImage();		// method mot available in superclass
		//mobile.browseNet();
	}

}
