package com.lymda.test;

import java.util.Arrays;
import java.util.List;

public class Java8 {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		values.stream().forEach(System.out::println);
		
	}

}
