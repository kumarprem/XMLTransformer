package com.homedepot;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
public class Test{

	static{
		   int x=5;
	   }
	int x=10;
	Test(){
		display();
	
	}
	public void display(){
	
		System.out.println("diaplsy is called ");
	}
	
   public static void main(String args[]) {
      // create a hash set
	   { System.out.println("in block");}
	  
	   Hashtable hst = new Hashtable<>();
	   hst.put("hello Ji", "Kumar");
	   hst.put("hello", "John");
	  // hst.put(null, null);
	   
	   hst.forEach((k,v)-> 
	   System.out.println("Hashtable - "+ k+ " " +v )
			   );
	   int a[][] = new int[3][];
	         a[1] = new int[]{1,2,3};
	          a[2] = new int[]{4,5};
	       System.out.print(a[1][1]);
		       
		       
	   Class<List> releftction = java.util.List.class;
	System.out.println(" all List constructors : " + releftction.getMethods());
	   new Test();
      HashSet hs = new HashSet();
      HashMap hm = new HashMap();
      ConcurrentHashMap chm = new  ConcurrentHashMap();
      hm.put(null, null);
      hm.put(11, null);
      hm.put(2, "Ji");
      hm.put(1, "ram");
      
      hm.put(3, "ram");
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("F");
      hs.add("C");
      hs.add("F");
      System.out.println(hs);
      System.out.println(hm);
      Runnable runable = new A();
      runable.run();
	   
   }

}
class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread run method");
	}
	
}