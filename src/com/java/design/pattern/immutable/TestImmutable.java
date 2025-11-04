package com.java.design.pattern.immutable;
//No need for synchronization because data never changes  
//final class + fields
//No setters
//Defensive copies for mutable fields

//If you need frequent updates or large mutable objects, immutability can create many new objects → more memory usage.

public final class TestImmutable {
	
	private final String name;
	public TestImmutable(String name)
	{
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
