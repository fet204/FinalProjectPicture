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

import acm.graphics.*;

public class FinalProject extends GraphicsProgram {
	
	public static final int height = 500; // originally 500
	public static final int width = 1010; // originally 1000
	
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
		Color blockShadow = new Color(34, 49, 70);
		Color shadowTopBlock = new Color(40, 47, 83);
		Color sideWalkSide = new Color(34, 49, 70);
		Color betweenSidewalk = new Color(30, 45, 60);
		Color sideWalkSeperatorSide = new Color(34, 35,37);
		Color horzSideWalkSeperator = new Color(35, 52, 76);
		Color streetCurveDashes = new Color(73, 114, 165);

		
		// The Sky
		Color sky1 = new Color(137, 164, 227);
		pen.setColor(sky1);
		pen.move(-500, -100);
		pen.drawLine(1000,0);
		for (int i = 0; i <= 500; i ++) {
			pen.move(0, 1);
			//the blue sky
			if(i == 20) {
				sky1 = new Color (135, 167, 230);
				pen.setColor(sky1);
			}
			
			if(i == 40) {
				sky1 = new Color (136, 168, 229);
				pen.setColor(sky1);
			}
			
			if(i == 60) {
				sky1 = new Color (138, 169, 229);
				pen.setColor(sky1);
			}
			if(i == 80) {
				sky1 = new Color (140, 171, 229);
				pen.setColor(sky1);
			}
			if(i == 100) {
				sky1 = new Color (142, 173, 228);
				pen.setColor(sky1);
			}		
			
			// Slowly increasing the green
			if(i == 120) {
				sky1 = new Color (139, 176, 228);
				pen.setColor(sky1);
			}
			if(i == 130) {
				sky1 = new Color (137, 179, 227);
				pen.setColor(sky1);
			}
			if(i == 140) {
				sky1 = new Color (138, 182, 226);
				pen.setColor(sky1);
			}		
			if(i == 150) {
				sky1 = new Color (139, 185, 226);
				pen.setColor(sky1);
			}
			//really hitting the green
			if(i == 160) {
				sky1 = new Color (140, 189, 226);
				pen.setColor(sky1);
			}
			if(i == 170) {
				sky1 = new Color (140, 192, 226);
				pen.setColor(sky1);
			}
			if (i == 180) {
				sky1 = new Color (140, 189, 226);
				pen.setColor(sky1);
			}
			if (i == 190) {
				sky1 = new Color(144, 192, 226);
				pen.setColor(sky1);
			}
			
			// switching the green to pink
			if (i == 195) {
				sky1 = new Color(154, 180, 221);
				pen.setColor(sky1);
			}
			if (i == 200) {
				sky1 = new Color(175, 180, 221);
				pen.setColor(sky1);
			}
			if (i == 205) {
				sky1 = new Color(189, 180, 229);
				pen.setColor(sky1);
			}
			if (i == 209) {
				sky1 = new Color(206, 180, 229);
				pen.setColor(sky1);
			}
			
			// HORZ POLES START JUST UNDER  y axis=212 and run to base block y=425

			if(i == 212) {
				sky1 = new Color (47, 70, 103);
				pen.setColor(sky1);
			}
	
			if (i == 300) {
				pen.setColor(street);
			}
			if (i % 2 == 0) {
				pen.drawLine(-1000, 0);
			}
			else
				pen.drawLine(1000, 0);	
		}// first block sky21
		
		// Drawing the background street curve dashes????
		pen.setLocation(520,295);
		pen.startFilledRegion();
		pen.setColor(streetCurveDashes);
		pen.drawLine(-5, 0);
		pen.drawLine(-1, -10);
		pen.drawLine(5, 0);
		pen.drawLine(1, 10);
		pen.endFilledRegion();

		// Second Dash for background street curve
		pen.setLocation(517, 277);
		pen.startFilledRegion();
		pen.setColor(streetCurveDashes);
		pen.drawLine(-5, 0);
		pen.drawLine(0, -10);
		pen.drawLine(5, 0);
		pen.drawLine(0, 10);
		pen.endFilledRegion();
		
		// Third Dash for background street curve
		pen.setLocation(517, 260);
		pen.startFilledRegion();
		pen.setColor(streetCurveDashes);
		pen.drawLine(-5, 0);
		pen.drawLine(1, -16);
		pen.drawLine(5, 0);
		pen.drawLine(-1, 16);
		pen.endFilledRegion();
		
		// Fourth Dash for background street curve 
		pen.setLocation(519, 239);
		pen.startFilledRegion();
		//pen.setColor(Color.RED);
		pen.setColor(streetCurveDashes);
		pen.drawLine(-5, 0);
		pen.drawLine(2, -6);
		pen.drawLine(5, 0);
		pen.drawLine(-2, 6);
		pen.endFilledRegion();
		
		// Fifth dash for background street curve 
		pen.setLocation(519, 229);
		pen.setColor(streetCurveDashes);
		pen.startFilledRegion();
		pen.drawLine(5, 0);
		pen.drawLine(6, -10);
		pen.drawLine(-5, 0);
		pen.drawLine(-6, 10);
		pen.endFilledRegion();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		
		
		
		
		///*
		// POLESSSSSSSSSSSSSSSSSssssssssssssssssssssssssssssssssssssssssssssssssssssss
		
		// vertical rail way poles
		pen.setLocation(0,325);
		pen.setColor(pole);
		for (int i = 0; i < 4; i++ ) {
		pen.move(190, 0);
		pen.startFilledRegion();
		pen.drawLine(0, -100);
		pen.drawLine(10, 0);
		pen.drawLine(0, 100);
		pen.endFilledRegion();
		}
		
		//horizontal grip poles
		pen.setLocation(0,225);
		pen.setColor(pole);
		for (int i = 0; i < 3; i++) { 
		pen.startFilledRegion();
		pen.drawLine(1000, 0);
		pen.drawLine(0, -10);
		pen.drawLine(-1000, 0);
		pen.drawLine(0, 10);
		pen.endFilledRegion();
		pen.move(0, 30);
		}
		
		
		// Top shadow for the horz grip bar 
		pen.setLocation(0, 216);
		pen.startFilledRegion();
		pen.setColor(shadowTopBlock);
		pen.drawLine(1000, 0);
		pen.drawLine(0, -3);
		pen.drawLine(-1000, 0);
		pen.drawLine(0, 3);
		pen.endFilledRegion();
		
		
		// Quick shadow for bars
		pen.setLocation(0,330);
		pen.setColor(blockShadow);
		pen.startFilledRegion();
		pen.drawLine(1000, 0);
		pen.drawLine(0, 10);
		pen.drawLine(-1000, 0);
		pen.endFilledRegion();
		
		//POLESSSSSSSSSssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
		//*/
		
		
		// Sidewalk side shadow definition
		pen.setColor(sideWalkSide);
		pen.setLocation(0, 425);
		pen.startFilledRegion();
		pen.drawLine(1000, 0);
		pen.drawLine(0, 10);
		pen.drawLine(-1000, 0);
		pen.endFilledRegion();
		
		// sidewalk separator betweenSidewalk
		pen.setLocation(225,329);

		for (int i = 0; i < 4; i++) {
			pen.setColor(blockShadow);
			int x = -50;
			pen.drawLine(x, 95);
			pen.setColor(sideWalkSeperatorSide);
			pen.drawLine(0, 10);
			pen.move(275, -105);
		}

		// horzSideWalkSeperator shadow 
		
		pen.setLocation(0, 415);
		pen.setColor(horzSideWalkSeperator);
		pen.drawLine(1000, 0);
		
		
		// Creating Skateboard 
		GOval backWheel = new GOval(100, 380, 20, 20);
		add(backWheel);
		backWheel.setFilled(true);
		backWheel.setColor(Color.YELLOW);
		
		GOval frontWheel = new GOval(180, 380, 20, 20);
		add(frontWheel);
		frontWheel.setFilled(true);
		frontWheel.setColor(Color.YELLOW);
		
		GPolygon board = new GPolygon();
		add(board);
		board.addVertex(50, 370);
		board.addVertex(80, 380);
		board.addVertex(220, 380);
		board.addVertex(250, 370);
		board.setFilled(true);
		board.setColor(Color.GREEN);
		
		// Creating the rider for the board 
		GOval head = new GOval(140, 170, 40, 40);
		add(head);
		head.setFilled(true);
		head.setColor(Color.RED);
		
		GPolygon leftArm = new GPolygon();
		add(leftArm);
		leftArm.addVertex(140, 210);
		leftArm.addVertex(150, 210);
		leftArm.addVertex(100, 250);
		leftArm.addVertex(80, 290);
		leftArm.addVertex(70, 290);
		leftArm.addVertex(90, 250);
		leftArm.setFilled(true);
		leftArm.setColor(Color.ORANGE);
		
		GRect body = new GRect(150, 210, 20, 80);
		add(body);
		body.setFilled(true);
		body.setColor(Color.GRAY);
		
		GPolygon leftLeg = new GPolygon();
		add(leftLeg);
		leftLeg.addVertex(150, 290);
		leftLeg.addVertex(120, 325);
		leftLeg.addVertex(110, 375);
		leftLeg.addVertex(120, 375);
		leftLeg.addVertex(130, 330);
		leftLeg.addVertex(160, 310);//--
		leftLeg.addVertex(180, 330);
		leftLeg.addVertex(190, 375);
		leftLeg.addVertex(200, 375);
		leftLeg.addVertex(190, 330);
		leftLeg.addVertex(170, 290);

		leftLeg.setFilled(true);
		leftLeg.setColor(Color.CYAN);
		
		
		
		
		
		
		
		
		
		
		
		
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
