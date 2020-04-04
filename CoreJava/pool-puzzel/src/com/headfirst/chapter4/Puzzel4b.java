package com.headfirst.chapter4;

public class Puzzel4b {
	int ivar ;
	public int doStuff(int factor) {			//________ ______ doStuff(int _________) {
	if (ivar > 100) {
	return ivar * factor;						//_________________________
	} else {
	return ivar * (5 - factor);					//_________________________
	}
	}
}