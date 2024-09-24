package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		
	
	
	Set <Integer>s=new HashSet<Integer>();//random Order
	s.add(12);
	s.add(34);
	s.add(123);
	s.add(23);
	s.add(12);
	s.add(null);
	System.out.println(s);
	
	Set <Integer>s1=new LinkedHashSet<Integer>(); //Insertion Order
	s1.add(12);
	s1.add(34);
	s1.add(123);
	s1.add(23);
	s1.add(12);
	s1.add(null);
	System.out.println(s1);
	
	Set <Integer>s2=new TreeSet<Integer>();//Ascending Order
	s2.add(12);
	s2.add(34);
	s2.add(123);
	s2.add(24);
	s2.add(11);
	s2.add(0);
	System.out.println(s2);
	
	s1.retainAll(s2);
	System.out.println(s1);
	
	s1.remove(0);
	System.out.println(s1);
	s1.add(100);
	System.out.println(s1);
	
	int f=s1.size();
	System.out.println(f);
	int f1=s.size();
	System.out.println(f1);
	
	
	}
}
