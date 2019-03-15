/*
 * File: FinalProject.java
 * Function: This is going to be the picture for my final project. 
 * 
 * WEBSITES THAT HELP 
 * https://www.colorcodepicker.com/
 * https://html-color-codes.info/colors-from-image/
 * https://color.adobe.com/create/color-wheel/
 * 
 */
package pack1;

import acm.program.GraphicsProgram;
import acm.graphics.GPen;
import java.awt.*;

public class FinalProject extends GraphicsProgram {
	
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
		
		//colors 
		Color water = new Color(51,127,57);    //(0, 142, 190);
		Color brownWood = new Color(0, 142, 190);    //(87, 74, 67);
		Color leafGreen1 = new Color(0, 99, 0);
		Color leafGreen2 = new Color(0, 111, 0);
		Color sand = new Color(0, 142, 190);  //(247, 239, 215);
		
		//street colors
		Color street = new Color(36, 56, 84);
		Color pole = new Color(33, 39, 55);
		Color shadow = new Color(34, 49, 70);
		Color shadowTopBlock = new Color(40, 47, 83);
		Color sideWalkSide = new Color(34, 49, 70);
		Color betweenSidewalk = new Color(34, 49, 70);

		
		// The Sky
		Color sky1 = new Color(137, 164, 227);
		pen.setColor(sky1);
		pen.move(-500, -100);
		pen.drawLine(1000,0);
		for (int i = 0; i <= 500; i ++) {
			pen.move(0, 1);
			if(i == 25) {
				sky1 = new Color (131, 167, 228);
				pen.setColor(sky1);
			}
			if(i == 50) {
				sky1 = new Color (136, 168, 228);
				pen.setColor(sky1);
			}
			if(i == 75) {
				sky1 = new Color (136, 168, 229);
				pen.setColor(sky1);
			}
			if(i == 100) {
				sky1 = new Color (139, 169, 229);
				pen.setColor(sky1);
			}
			
			/*
			if(i == 125) {
				sky1 = new Color (139, 169, 228);
				pen.setColor(sky1);
			}			
			if(i == 150) {
				sky1 = new Color (139, 170, 228);
				pen.setColor(sky1);
			}
			if(i == 175) {
				sky1 = new Color (137, 174, 227);
				pen.setColor(sky1);
			}		
			if(i == 200) {
				sky1 = new Color (140, 176, 226);
				pen.setColor(sky1);
			}
			if(i == 225) {
				sky1 = new Color (142, 179, 224);
				pen.setColor(sky1);
			}
			if(i == 250) {
				sky1 = new Color (144, 181, 226);
				pen.setColor(sky1);
			}
			if(i == 275) {
				sky1 = new Color (146, 183, 228);
				pen.setColor(sky1);
			}
			if(i == 300) {
				sky1 = new Color (144, 185, 226);
				pen.setColor(sky1);
			}
			
			*/
			if (i == 300) {
				pen.setColor(street);
			}
			
			
			if (i % 2 == 0) {
				pen.drawLine(-1000, 0);
			}
			else
				pen.drawLine(1000, 0);	
		}// first block sky21
		
		pen.setLocation(0,325);
		pen.setColor(pole);
		
		// rail way poles
		for (int i = 0; i < 4; i++ ) {
		pen.move(190, 0);
		pen.startFilledRegion();
		pen.drawLine(0, -100);
		pen.drawLine(10, 0);
		pen.drawLine(0, 100);
		pen.endFilledRegion();
		}
		
		pen.setLocation(0,225);
		
		//side poles
		for (int i = 0; i < 3; i++) { 
		pen.startFilledRegion();
		pen.drawLine(1000, 0);
		pen.drawLine(0, -10);
		pen.drawLine(-1000, 0);
		pen.drawLine(0, 10);
		pen.endFilledRegion();
		
		pen.move(0, 30);
		}
		
		//base block holding poles
		pen.setColor(pole);
		pen.setLocation(0,300);
		pen.startFilledRegion();
		pen.drawLine(1000, 0);
		pen.drawLine(0, 30);
		pen.drawLine(-1000, 0);
		pen.endFilledRegion();
		
		//base pole shadow top
		pen.setColor(shadowTopBlock);
		pen.setLocation(0,300);
		pen.startFilledRegion();
		pen.drawLine(1000, 0);
		pen.drawLine(0, 10);
		pen.drawLine(-1000, 0);
		pen.endFilledRegion();
		
		// Quick shadow for bars
		pen.setLocation(0,330);
		pen.setColor(shadow);
		pen.startFilledRegion();
		pen.drawLine(1000, 0);
		pen.drawLine(0, 10);
		pen.drawLine(-1000, 0);
		pen.endFilledRegion();
		
		// Sidewalk side shadow definition
		pen.setColor(sideWalkSide);
		pen.setLocation(0, 425);
		pen.startFilledRegion();
		pen.drawLine(1000, 0);
		pen.drawLine(0, 10);
		pen.drawLine(-1000, 0);
		pen.endFilledRegion();
		
		// sidewalk seperator betweenSidewalk
		pen.setLocation(225,330);
		pen.setColor(betweenSidewalk);
		pen.drawLine(-20, 200);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		// Left side parabola
		pen.setColor(water);
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
			
		}// Left side blue thing
		
		
		// this is going to be the tree trunk
		pen.setColor(Color.black);
		pen.move(1005, 0);
		pen.move(-70, 40);
		
		for(int i = 0; i <= 250; i ++) {
			int var1 = 0;
			if(i % 2 == 0) {
				pen.setColor(brownWood);
				pen.drawLine(25, 0);
				pen.move(0, -1);
				pen.drawLine(-25, 0);
			}
		}
		
		// leaf 1
		pen.setColor(leafGreen1);
		pen.startFilledRegion();
		pen.drawLine(-50, -25);
		pen.drawLine(-20, 0);
		pen.drawLine(-20, 20);
		pen.drawLine(0, 15);
		pen.drawLine(10, -15);
		pen.drawLine(20, -5);
		pen.endFilledRegion();
		
		// leaf2 
		pen.move(60, 10);
		pen.setColor(leafGreen2);
		pen.startFilledRegion();
		pen.drawLine(-25, -50);
		pen.drawLine(-25, 10);
		pen.drawLine(-10, 50);
		pen.drawLine(10, -10);
		pen.drawLine(10, -25);
		pen.drawLine(42, 40);
		pen.endFilledRegion();
		*/
	
	}

} // FinalProject
