package pack1;

import acm.graphics.GLabel;
import acm.program.*;
import acm.graphics.*;
import java.util.*;

public class Test extends GraphicsProgram  {
	
	GCanvas canvas;
	
	void setup() {
		this.setSize(500, 500);
		this.setVisible(true);
		this.setTitle("My Picture"); 
		
		canvas = new GCanvas();
		this.add(canvas);
	}
	
	
	
	
	
	public void run() {
		GLabel label1 = new GLabel("Hello world");
		add(label1, 100, 75);
		//GPen testPen(5,5);
		
		for (int i = 0; i < 20; i++) {
			label1.move(1, 1);
			pause(100);
	
		} // the while loop
		
	} // run
	
}//Test class
