package com.java;

public class MultiDimensionalArray1
{

	public static void main(String[] args)
	{
       int [][]a= {
    		   			{10,20,30,40},
    		   			{50,60,70},
    		   			{80,90,11,12,13,14},
    		   
                   };
       //for rows
		for(int i=0;i<a.length;i++)
		{
			
			//for columns
			for(int j=0;j<a[i].length;j++)//a[i].length means a[i] imdicates the rows
				
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("__________________________________________");
		
		for(int [] p:a)
		{
			for(int q:p)
			{
				System.out.print(q+"   ");
			}
			System.out.println();
		}
		
	}

}
