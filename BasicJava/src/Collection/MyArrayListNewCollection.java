
//How to add all elements of a list to ArrayList?
//by using the addAll method

package Collection;

import java.util.ArrayList;

public class MyArrayListNewCollection 
{

	public static void main(String[] args)
	{
	    ArrayList<Object> arraylist=new ArrayList<Object>();
	    arraylist.add(10);
	    arraylist.add("Pratibha");
	    arraylist.add(34.44);
	    arraylist.add(50);
	    arraylist.add("Nilesh");
	    
	    System.out.println("Before Adding Arraylist New Collection is :" + arraylist);
         
	    ArrayList<Object> list=new ArrayList<Object>();
	    list.add("Pranil");
	    list.add("Dhage");
	    list.add(20);
	    
	    arraylist.addAll(list);
	    System.out.println("After copying to all List Items in ArrayList: "+arraylist);
	}

}
