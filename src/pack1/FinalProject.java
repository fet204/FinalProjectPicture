/*
 * File: FinalProject.java
 * Function: This is going to be the picture for my final project. 
 */
package pack1;

import acm.program.GraphicsProgram;
import acm.graphics.GPen;
import java.awt.*;

public class FinalProject extends GraphicsProgram {
	
	public static final int height = 500; 
	public static final int width = 1000;
	
	public void init() {
		
		setSize(width, height);
		
	} // init
	
	public void run() {
		
		// Start coordinate of where GPen will be and start
		GPen pen = new GPen(500, 100);
		add(pen);
		
		//1 means code will instantly show art, and 0 would be the slowest 
		pen.setSpeed(1); //0.7);
		
		// Outline of house
		pen.setColor(Color.BLACK);
		
		// Fill in house
		pen.setFillColor(new Color(97, 255, 73));
		
		//Where rectangle will be coordinated in the appletViewer
		//pen.startFilledRegion();
		
		int sky1 = 137;
		int sky2 = 164;
		int sky3 = 227;
		
		Color sky = new Color(sky1, sky2, sky3);
		pen.setColor(sky);
		pen.move(-500, -100);
		pen.drawLine(1000,0);
		for (int i = 2; i < 200; i ++) {
			pen.move(0, 1);
			if (i % 5 == 0) {
				sky = new Color(sky1 + 1, sky2 + 2, sky3 + 1);
			}
			if (i % 2 == 0) {
				pen.drawLine(-1000, 0);
			}
			else
				pen.drawLine(1000, 0);
			
		}

		
		/*
		// Dimensions of Rectangle
		pen.drawLine(200, 0); // width
		pen.drawLine(0, 200); // Height
		pen.drawLine(-200, 0); // -Width
		pen.drawLine(0, -200); // -Height
		
		pen.endFilledRegion();
		
		*/
	
	}

} // FinalProject
