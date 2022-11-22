package com.java;

public class UserDefinedArray 
{
  
	int sno;
    String sname;
    
	public UserDefinedArray(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	public static void main(String[] args)
	{
      
		UserDefinedArray s = new UserDefinedArray(10, "Pratibha");
		System.out.println(s.sno);
		System.out.println(s.sname);
		
	}

}
//incomplete