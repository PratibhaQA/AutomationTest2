package com.java;

public class TypeCasting {

	public static void main(String[] args) {
		// byte-1,short -2 ,int 4, long -8, float-4, double-8, char- 2
	 /* byte b=20;
	  int j=b;
	  short s=21;
	  //int i=76;
	  long l=98;
	  char c ='p';
	  
	  boolean bb=true;
	  float f=56.66f;
	  double d=45.44; 
	  System.out.println(b);
	  System.out.println(s);
	  System.out.println(j);
	  System.out.println(l);
	  System.out.println(c);
	  System.out.println(bb);
	  System.out.println(f);
	  System.out.println(d);*/
		
		// typecasting from one  primitive to another primitive type of class
		int x1 =10;
		System.out.println(x1);
		
		double x2=x1;
		System.out.println(x2);
		
		
		double a= 30.89;
		System.out.println(a);
		int b= (int)a;            // here is not data loss
		System.out.println(b);
		
		
		long l = 80;
		System.out.println(l);
		int p = (int)l;
	    System.out.println(p);
		
	    
	    float f = 45.5f;
	    System.out.println(f);
	    float c = (float)f;
	    System.out.println(c);
	    
	    int d = 65;
	    char s = (char)d;
	    System.out.println(s);
	    
	    
		//Typecasting from one Primitive to another Wrapper class type
		
		int u= 32;
		//Integer a1=u;
		Integer a1 = Integer.valueOf(u); // both ways we can define
		System.out.println(a1);
		
		float k =45.44f;
		Float f1 = Float.valueOf(k);
		System.out.println(f1);
		
		double aa = 567;
		Double dd = Double.valueOf(aa);
		System.out.println(dd);
		
		//Typecasting from one wrapper class to another primitive class type
		
		Integer b1 =30;
		System.out.println(b1);
		//int m = b1;
		int m = (int)b1;
		System.out.println(m);
		
		
		
		
		//Typecasting from one Wrapper class to another Wrapper class type
		
		String ss = "100";
		String tt ="220";
		System.out.println(ss + tt);
		
		Integer p1 = Integer.valueOf(ss);
		Integer p2 = Integer.valueOf(tt);
		
		System.out.println(p1+p2);
		
		Float  k1 =Float.valueOf(ss);
		Float k2 = Float.valueOf(tt);
		System.out.println(k1+k2);
		
		
		
	}

}
