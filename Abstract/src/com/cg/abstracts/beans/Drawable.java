package com.cg.abstracts.beans;

public interface Drawable {
	
	void draw();
	
	default void run()
    {
        System.out.println("this is the default concrete method ");
    }

 

     static int cube(int x)
     {
         return x*x*x;
     }

}
