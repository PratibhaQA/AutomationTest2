package com.java;

public class MuktiDimensionalArray
{

	public static void main(String[] args)
	{
      int [][]a= {
    		  
    		  {10,20,30,40,50},
    		  {60,70,80,90,10},
    		  {11,12,13,14,15},
    		  
    		  
      };
      //for rows
      for(int i= 0;i<3;i++) 
      
      {
    	  //for columns
    	  for(int j=0;j<5;j++)
    	  {
    		  System.out.print(a[i][j]+" ");
    	  }
    	  
    	  System.out.println();
    	  
      }
     
	}

}
