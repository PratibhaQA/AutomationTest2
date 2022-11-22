package com.java;

public class String_Demo
{

	public static void main(String[] args)
	{
    
		String s1 = "Pratibha";
		System.out.println(s1);
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf('t'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.lastIndexOf('h'));
		
		String s2 = new String("Nilesh");
		System.out.println(s2);
		System.out.println(s2.charAt(4));
		System.out.println(s2.indexOf('e'));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.indexOf('s'));
		System.out.println(s2.startsWith("les"));
		System.out.println(s2.endsWith("lesh"));
		System.out.println(s2.length());
		
		
		s1=s1+s2;
          	
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals(s2));
		
		String s3="pratibha";
		System.out.println(s3);
		System.out.println(s3.equals(s1));
		System.out.println(s3.startsWith(s2));
		System.out.println(s3.replace('p', 'a'));
		System.out.println(s3.equals(s1));
		
		s1=s2.concat(s1);
		System.out.println(s1);
		System.out.println(s3.toLowerCase().equals(s3.trim()));
		System.out.println(s3.length());
		
	}

}
