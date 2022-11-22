package Collection;

import java.util.ArrayList;

public class BasicArrayList
{

	public static void main(String[] args)
	{
      
		ArrayList<Object> a =new ArrayList<Object>();
		a.add(10);
		a.add("Pratibha");
		a.add("Nilesh");
		a.add(20);
		a.add(30);
		a.add("Pranil");
		
		System.out.println(a);
		a.add(500);
		System.out.println(a);
		System.out.println(a.contains("Nilesh"));
		System.out.println(a.get(4));
		System.out.println(a.indexOf("Pranil"));
	    System.out.println(a.hashCode());
	    System.out.println(a.size());
	    a.remove(3);
	    System.out.println(a);
	    a.add("Dhage");
	    System.out.println(a);
	}
	

}
