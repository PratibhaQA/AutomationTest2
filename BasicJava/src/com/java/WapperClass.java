package com.java;
import java.util.ArrayList;
public class WapperClass {

	public static void main(String[] args) {
		int a= 10;
		/*
		 * //System.out.println(a); //Integer b= 20; //System.out.println(b); Integer
		 * ob= Integer.valueOf(a); System.out.println(ob);
		 * 
		 * float b = 45.89f; Float ob1 = Float.valueOf(b); System.out.println(ob1);
		 */
		
		String b = "nilesh";
		Integer obj = a;
		if (obj instanceof Integer) {
			System.out.println("Integer value : "+a);
			obj = 20;
			System.out.println("Integer value : "+obj);
		}
		
		//ArrayList<Integer> list = new ArrayList<Integer>();
		//list.add(obj);
        
	}

}
