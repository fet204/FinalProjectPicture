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
//import acm.graphics.GPen;
import java.awt.*;

import acm.graphics.*;

public class FinalProject extends GraphicsProgram {
	
	public static final int height = 500; // originally 500
	public static final int width = 1000; // originally 1000
	
	// Constants 
	final int WHEEL_WIDTH = 20;
	final int HEAD_WIDTH = 40;
	
	public void init() {
		
		setSize(width, height);
		
	} 
	
	public void run() {

		
		
/*
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
		
		
		
		
		
		// POLESSSSSSSSSSSSSSSSSsssssssssssssssssss
		
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
		
		//POLESSSSSSSSSssssssssssssssssssss

		
		
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
*/
		
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  JAVA 2 SECTION 
		// Java 2 Colors 
		Color thatWhite = new Color (61, 95, 132);
		Color colorBoard = new Color(26, 40, 53);
		Color pants = new Color (37, 50, 82);
		Color shirt = new Color (24, 33, 56);//63, 45, 59);
		Color skin = new Color (120, 104, 105);
		Color colorhat = new Color (67, 75, 97);
		
		// importing the background image
		GImage img1 = new GImage("Background.png");
		add(img1, 0, 0);
		
		// Creating the board 
		GOval backWheel = new GOval(100, 380, WHEEL_WIDTH, WHEEL_WIDTH);
		add(backWheel);
		backWheel.setFilled(true);
		backWheel.setColor(thatWhite);
		
		GOval frontWheel = new GOval(180, 380, WHEEL_WIDTH, WHEEL_WIDTH);
		add(frontWheel);
		frontWheel.setFilled(true);
		frontWheel.setColor(thatWhite);
		
		GPolygon board = new GPolygon();
		add(board);
		board.addVertex(50, 370);
		board.addVertex(80, 380);
		board.addVertex(220, 380);
		board.addVertex(250, 370);
		board.setFilled(true);
		board.setColor(colorBoard);
		
		// Creating the rider for the board 
		GOval head = new GOval(140, 170, HEAD_WIDTH, HEAD_WIDTH);
		add(head);
		head.setFilled(true);
		head.setColor(skin);
		
		GRect body = new GRect(150, 210, 20, 80);
		add(body);
		body.setFilled(true);
		body.setColor(shirt);
		
		GPolygon rightArm = new GPolygon();
		add(rightArm);
		rightArm.addVertex(140, 210);
		rightArm.addVertex(120, 245);
		rightArm.addVertex(110, 295);
		rightArm.addVertex(120, 295);
		rightArm.addVertex(130, 250);		
		rightArm.addVertex(150, 220);
		rightArm.addVertex(170, 220);//--
		rightArm.addVertex(180, 250);
		rightArm.addVertex(190, 295);
		rightArm.addVertex(200, 295);
		rightArm.addVertex(190, 250);
		rightArm.addVertex(180, 210);
		rightArm.addVertex(170, 210);
		rightArm.setFilled(true);
		rightArm.setColor(shirt);
		
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
		leftLeg.setColor(pants);
		
		// Hat of the rider
		GArc hat = new GArc(135, 165, 50, 50, 0, 170);
		add(hat);
		hat.setFilled(true);
		hat.setColor(colorhat);
		
		GOval rim = new GOval(115, 180, 50, 10);
		add(rim);
		rim.setFilled(true);
		rim.setColor(colorhat);
		
		
		
		
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		// Animation
		while(true) {
			
			backWheel.move(3, 0);
			frontWheel.move(3, 0);
			board.move(3, 0);
			head.move(3, 0);
			body.move(3, 0);
			leftLeg.move(3, 0);
			rightArm.move(3, 0);
			hat.move(3, 0);
			rim.move(3, 0);
			
			pause(10);
			
			if (backWheel.getX() > width + 100) {
				
				backWheel.setLocation(-100, backWheel.getY());
				frontWheel.setLocation(-20, frontWheel.getY());
				board.setLocation(-200, board.getY());
				head.setLocation(-60, head.getY());
				body.setLocation(-50, body.getY());
				leftLeg.setLocation(-200, leftLeg.getY());
				rightArm.setLocation(-200, rightArm.getY());
				hat.setLocation(-65, hat.getY());
				rim.setLocation(-85, rim.getY());
			}
		}
		
		
		
		
		
		
		
		
		
		

	
	}

} // FinalProject
