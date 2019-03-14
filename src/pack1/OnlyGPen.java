package pack1;

import acm.program.GraphicsProgram;
import acm.graphics.GPen;
import java.awt.*;

import java.awt.Color;

/* websites
 * this is the color wheel to get sick RGB colors
 * https://color.adobe.com/create/color-wheel/
 */

// BASIC HOUSE ART	
public class OnlyGPen extends GraphicsProgram {
	
	// Size set of the art
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
		pen.setSpeed(0.1);
		
		// Outline of house
		Color lime = new Color(97, 255, 73);
		pen.setColor(lime);
		
		// Fill in house
		//Color lime = new Color(97, 255, 73);
		pen.setFillColor(new Color(97, 255, 73));
		
		//Where rectangle will be coordinated in the appletViewer
		pen.startFilledRegion();
		
		// Dimensions of Rectangle
		pen.drawLine(200, 0); // width
		pen.drawLine(0, 200); // Height
		pen.drawLine(-200, 0); // -Width
		pen.drawLine(0, -200); // -Height
		
		pen.endFilledRegion();
		
		
		
		
		
		
		
		
		/*
		// Draw Roof by connecting vertices 
		GPolygon roof = new GPolygon();
		roof.addVertex(500, 100);
		roof.addVertex(300, 100);
		roof.addVertex(400, 0);
		roof.setColor(Color.red);
		roof.setFilled(true);
		add(roof, 200, 0);
		
		//Draw Door
		GRect door = new GRect(60, 100);
		Color doorColor = new Color(196, 35, 94);
		add(door, 570, 200);
		door.setColor(doorColor);
		door.setFilled(true);
		
		// Windows 
		Color lightBlue = new Color(181, 242, 255);
		GRect window = new GRect(50, 50);
		window.setColor(lightBlue);
		window.setFilled(true);
		add(window, 630, 130);
		
		// Second window
		GRect window2 = new GRect(50, 50);
		window2.setColor(lightBlue);
		window2.setFilled(true);
		add(window2, 520, 130);
		
		// Setting the color for the tree
		Color brown = new Color(105, 74, 78);
		Color darkGreen = new Color(36, 138, 60);
		
		// Drawing the trunk on the tree
		GRect trunk = new GRect(10, 150); // the size of the shape
		trunk.setColor(brown);
		trunk.setFilled(true);
		add(trunk, 300, 150);
		
		// leaves on top
		GOval leaves = new GOval(100,75);
		leaves.setColor(darkGreen);
		leaves.setFilled(true);
		add(leaves, 255, 100);
		
		// Draw Sun
		GOval sun = new GOval(50,50);
		sun.setColor(Color.yellow);
		sun.setFilled(true);
		add(sun, 100, 0);
		*/		
		
	}// run
	

	
} // Graphics program
