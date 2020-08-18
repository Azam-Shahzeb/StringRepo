package com.cg.abstracts.beans;

import java.util.HashSet;
import java.util.Set;

public class normal{


	public static void main(String args[]){
		
	String s1="FLP";
	String s2= new String("FLP");
	Set setObj= new HashSet();
	setObj.add(s1);
	setObj.add(s2);
	System.out.println(setObj.size());
}
}