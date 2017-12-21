package com.sapient.service;

public class Emp {
private int stuId;
private String stuName;
private double eng,maths,sci,lang,social;
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public void setEng(double eng) {
	this.eng = eng;
}
public void setMaths(double maths) {
	this.maths = maths;
}
public void setSci(double sci) {
	this.sci = sci;
}
public void setLang(double lang) {
	this.lang = lang;
}
public void setSocial(double social) {
	this.social = social;
}
private double total(){
	return eng+maths+sci+lang+social;
}
private double avg(){
	return (eng+maths+sci+lang+social)/5;
}
public void display(){
	System.out.printf("%10d%10s%10.2f%10.2f",stuId,stuName,total(),avg());
}
}
