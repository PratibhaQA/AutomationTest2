package com.java;

public class MultipeTableMultiplication
{

	public static void main(String[] args)
	{
		//lines strats from 1
	    // numbers start from 2
		
		for (int lines=1;lines<=10;lines++)
		{
			for(int number=1;number<=5;number++) 
			
			{
				System.out.printf("%2d\t",number*lines);
				//System.out.println(number*lines+"%2d);
				
				
			}
			System.out.println("\t\t");
		}
		
		
	}

}
