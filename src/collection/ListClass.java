package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
	
	public static void main(String[] args) {
		
	
	List l=new ArrayList();
	l.add(1);
	l.add(10.05);
	l.add(-123);
	l.add("neelu");
	
	System.out.println(l);
  
	
	List <Integer> ex=new LinkedList<Integer>();
	ex.add(34);
	ex.add(45);
	ex.add(56);
	ex.add(123);
	System.out.println(ex);
	int i=ex.size();//length of the method
	System.out.println(i);
    int j=ex.get(3);//get the particular value of index
    System.out.println(j);
    for(int k=0;k<ex.size();k++) {
    	System.out.println(ex.get(k));
    }
    for(int x:ex) {
    	System.out.println(x);
    }
    ex.remove(2);//remove the value from the index
    System.out.println(ex);
    ex.add(2,200);
    System.out.println(ex);
    ex.set(1, 77); //replace the value from the index
    System.out.println(ex);
    
    boolean b=ex.contains(200);// check the value present or not
    System.out.println(b);
    
    //ex.clear();// clear the all value from the list
    //System.out.println(ex);
    
    int c=ex.indexOf(200); //get the index of particular value
    System.out.println(c);
    
    List ex1=new ArrayList();
    ex1.add(45);
    ex1.add(18);
    ex1.add(200);
    ex1.add(77);
    //all all the value from the list
    System.out.println(ex1);
    ex1.addAll(ex);
    System.out.println(ex1);
    
//    ex1.removeAll(ex);//remove the value from the index
//    System.out.println(ex1);
//    ex1.clear();
//    System.out.println(ex1);
    ex1.retainAll(ex); // compare both value and print the common value
    System.out.println(ex1);
    
    
    
    
    
    
}
}
