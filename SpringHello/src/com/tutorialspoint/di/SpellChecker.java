package com.tutorialspoint.di;

public class SpellChecker {
	private int a;
	/*
	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor. " );
	}
	*/

	public void checkSpelling() {
		System.out.println("Inside checkSpelling." + getA());
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
