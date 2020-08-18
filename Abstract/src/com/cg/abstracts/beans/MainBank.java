package com.cg.abstracts.beans;

public class MainBank {

	public static void main(String[] args) {
		 
		RBIBank rb = new SBI();
		RBIBank rbb = new Canara();
		rb.getRateofInterest();
		rbb.getRateofInterest();

	}

}
