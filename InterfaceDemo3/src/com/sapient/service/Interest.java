package com.sapient.service;

public interface Interest extends Basic {
double calcSI(double amt,int years,float rate);
double calcCI(double amt,int years,float rate);
}
