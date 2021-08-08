package org.tester;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
public static void main(String[] args) {
	List l=new ArrayList<>();
	l.add(12);
	l.add(33);
	l.add(44);
	l.add(55);
	
	
	int a = l.size();
	System.out.println(a);
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));	
	}
	for (Object x : l) {
		System.out.println(x);
		
	}
}
}
