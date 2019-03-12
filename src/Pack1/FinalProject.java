/*
 * File: FinalProject.java
 * Function: This is going to be the picture for my final project. 
 */
package Pack1;

import acm.program.*;
import acm.graphics.*;

public class FinalProject extends GraphicsProgram {
	
	public void run() {
		
		GLabel label1 = new GLabel("Hello world");
		add(label1, 100, 75);
		
		while(true) {
			label1.move(1, 1);
			pause(100);
		}
			
	}
	
	
	public static void main (String[] args) {
		
		
	}

}
