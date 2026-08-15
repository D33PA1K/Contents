package com.deepak.spring.springcore.reftypes;

public class Scores {
	@Override
	public String toString() {
		return "Scores [math=" + math + ", sci=" + sci + ", eng=" + eng + "]";
	}
	private double math;
	private double sci;
	private double eng;
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getSci() {
		return sci;
	}
	public void setSci(double sci) {
		this.sci = sci;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	
}
