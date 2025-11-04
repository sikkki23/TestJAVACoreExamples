package com.exception.java;

import java.io.IOException;

public class ChildClass extends SuperClass { 
  
    // method() declaring Checked Exception IOException 
	 void method() // throws IOException 
	    { 
	  
	        // IOException is of type Checked Exception 
	        // so the compiler will give Error 
	  
	        System.out.println("SubClass"); 
	    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass s = new ChildClass(); 
        s.method(); 
    } 
} 