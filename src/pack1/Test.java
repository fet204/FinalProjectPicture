/*
 * File: FinalProject.java
 * Function: This is going to be the picture for my final project. 
 * 
 * WEBSITES THAT HELP 
 * https://imagecolorpicker.com/
 * https://color.adobe.com/create/color-wheel/
 * 
 */
package pack1;

import acm.program.GraphicsProgram;
import acm.graphics.GPen;
import java.awt.*;

public class Test extends GraphicsProgram {
	
	public static final int height = 500; // originally 500
	public static final int width = 1500; // originally 1000
	
	public void init() {
		
		setSize(width, height);
		
	} // init
	
	public void run() {
		
		// Start coordinate of where GPen will be and start
		GPen pen = new GPen(500, 100); // orignially x is 500 and y is 100
		add(pen);
		
		//1 means code will instantly show art, and 0 would be the slowest 
		pen.setSpeed(1); //0.7);
		
		// Outline of house
		//pen.setColor(Color.BLACK);
		
		// Fill in house
		//pen.setFillColor(new Color(97, 255, 73));
		
		//Where rectangle will be coordinated in the appletViewer
		//pen.startFilledRegion();
		
		// The Sky
		Color sky1 = new Color(137, 164, 227);
		pen.setColor(sky1);
		pen.move(-500, -100);
		pen.drawLine(1000,0);
		for (int i = 2; i <= 500; i ++) {
			pen.move(0, 1);
			if(i == 25) {
				sky1 = new Color (144, 185, 226);
				pen.setColor(sky1);
			}
			if(i == 50) {
				sky1 = new Color (145, 189, 226);
				pen.setColor(sky1);
			}
			if(i == 75) {
				sky1 = new Color (147, 193, 226);
				pen.setColor(sky1);
			}
			if(i == 100) {
				sky1 = new Color (148, 197, 226);
				pen.setColor(sky1);
			}
			if(i == 125) {
				sky1 = new Color (150, 201, 226);
				pen.setColor(sky1);
			}			
			if(i == 150) {
				sky1 = new Color (151, 205, 226);
				pen.setColor(sky1);
			}
			if(i == 175) {
				sky1 = new Color (153, 209, 226);
				pen.setColor(sky1);
			}		
			if(i == 200) {
				sky1 = new Color (154, 213, 226);
				pen.setColor(sky1);
			}
			if(i == 225) {
				sky1 = new Color (156, 217, 226);
				pen.setColor(sky1);
			}
			if(i == 250) {
				sky1 = new Color (157, 221, 226);
				pen.setColor(sky1);
			}
			if(i == 275) {
				sky1 = new Color (159, 226, 226);
				pen.setColor(sky1);
			}
			if(i == 300) {
				sky1 = new Color (162, 226, 226);
				pen.setColor(sky1);
			}
			if (i == 301) {
				sky1 = new Color(166, 226, 226);
				pen.setColor(sky1);
			}
			
			
			
			
			if (i % 2 == 0) {
				pen.drawLine(-1000, 0);
			}
			else
				pen.drawLine(1000, 0);	
		}// first block sky21
		
		Color sky2 = new Color(137, 164, 227);
		pen.setColor(sky2);
		pen.move(-5, 83);
		//pen.move(0,500);
		double y = 0;
		for (int i = 2; i <= 284; i ++) {
			
			if (i % 2 == 0) {
				y = ((i*i)/80);
				System.out.println(y);
			}
			
			pen.drawLine(y, 0);
			pen.move(-y, -1);
			
		}// first block for the side and bottom
		
		
		
		
		
		
		
		
		
		
		
		
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
