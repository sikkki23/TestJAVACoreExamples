package com.jai.hp;

import java.util.ArrayList;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(4);
		ls.add(8);
		ls.add(9);
		ls.add(10);
		ls.add(11);
		ls.add(12);
		ls.add(13);
		ls.add(14);
		ls.add(15);
		ls.add(4);
		ls.add(16);
		ls.add(16);
		ls.add(16);
		ls.add(16);
		ArrayList<Integer> indexlist = new ArrayList<Integer>();
		for(int i=0 ; i<ls.size();i++)
		{
			if(ls.get(i)==4) {
				indexlist.add(i);
				
			}
		}
		System.out.println("index setting");;
		for(int index:indexlist)
		{
			ls.set(index, 50);
		}
		System.out.println("ls printed");;
		for(int num:ls)
		{
			System.out.println(num);;
		}
		ls.trimToSize();
		System.out.println(ls.size());
		
		//////////////////////////////////////////
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
