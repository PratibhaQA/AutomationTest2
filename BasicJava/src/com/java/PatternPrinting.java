package com.java;

public class PatternPrinting 
{
     public static void PatternPrinting(int no)
		{
      //int [][]a = new int[][];
		for(int i=0;i<no;i++)
			
		{
			
			System.out.print("  ");
		
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		}
		public static void main(String[] args)
		{
			int no= 5;
			PatternPrinting(no);
			
			
		}

}
