package com.sapient.service;

public class NokiaLumia extends Nokia1100 {

	public void captureImage()
	{
		doConverse();
		sendSms();
		System.out.println("capture image");
	}
	public void browseNet(){
		System.out.println("browse net");
	}
	@Override										//Object class method
	public void doConverse() {
		System.out.println("do converse 4g");
	}
	public void doConverse2g(){
		super.doConverse();
	}
}
