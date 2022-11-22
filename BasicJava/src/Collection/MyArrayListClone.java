// How to copy or clone a ArrayList?


package Collection;

import java.util.ArrayList;

public class MyArrayListClone
{

	public static void main(String[] args) 
	{
       ArrayList<Object> a =new ArrayList<Object>();
       a.add("Pratibha");
       a.add("OmSaiRam");
       a.add("Nilesh");
       a.add(34.44);
       a.add(20);
       a.add(100);
       
       System.out.println("Actual Array List:"+a);
       
      
	ArrayList<Object>copy=(ArrayList<Object>)a.clone();
       System.out.println("Cloned Array List:"+copy);
       

	}

}
