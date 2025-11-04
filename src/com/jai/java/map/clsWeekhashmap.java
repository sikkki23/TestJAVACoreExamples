package com.jai.java.map;

import java.util.Map;
import java.util.WeakHashMap;

import test.com.Aclass;

import java.util.HashMap;

public class clsWeekhashmap {

	public static void main(String[] args) throws InterruptedException {
		
		Map wm = new WeakHashMap<String,String>();
//		Aclass a = new Aclass();
//		Aclass a1 = new Aclass();
//		Aclass a3 = new Aclass();
		String key1= "key1";
		String key2= "key2";
		String v1= "v1";
		String v2= "v2";
		wm.put(key1, v1);
		wm.put(key2, v2);
		key1=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(wm.get(key1));
		
		
		Map wm1 = new HashMap<String,String>();
		wm1.put(key1, v1);
		wm1.put(key2, v2);
		key1=null;
		System.gc();
		Thread.sleep(4000);
		System.out.println(wm1.get(key1));
	}

}
