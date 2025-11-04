package com.java.design.pattern.singleton;

public class NewSingletonwithThreadSafe {
	
	private static volatile NewSingletonwithThreadSafe instance;
	
	private NewSingletonwithThreadSafe() {}
	
	
	public static NewSingletonwithThreadSafe getinstance()
	{
		if (instance == null)
		{
			synchronized(NewSingletonwithThreadSafe.class)
			{
				if (instance == null)
				{
					instance = new NewSingletonwithThreadSafe();
				}
			}
		}
		
		return instance;
	}
	

}
