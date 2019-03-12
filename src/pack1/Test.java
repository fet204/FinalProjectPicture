package pack1;

import acm.graphics.GLabel;
import acm.program.*;
import acm.graphics.*;

import java.awt.Color;
import java.util.*;

// https://www.youtube.com/watch?v=oW2apwWxetI
// learning from this vid

public class Test extends GraphicsProgram  {
	
	GCanvas canvas;
	
	void setup() {
		this.setSize(1000, 500);
		this.setVisible(true);
		this.setTitle("My Picture"); 
		
		canvas = new GCanvas();
		this.add(canvas);
		
		this.drawHouse();
		
		canvas.revalidate();
	}// setup calls drawhouse
	
	void drawHouse() {
		// Colors for the house
		Color lightBlue = new Color(183, 234, 237);
		
		// Draw the body of house
		GRect body = new GRect(200,200);
		canvas.add(body, 150, 250);
		body.setColor(Color.green);
		body.setFilled(true);
		
		this.drawRoof();
		this.drawDoor();
		
		// window
		GRect window = new GRect(50 , 50);
		canvas.add(window, 280, 350);
		window.setColor(lightBlue);
		window.setFilled(true);
	} // drawHouse
	
	void drawRoof() {
		// Draws the roof
		//GLine leftRoof = new GLine(150, 250, 250, 150);
		//canvas.add(leftRoof);
		//GLine rightRoof = new GLine(350, 250, 250, 150);
		//canvas.add(rightRoof);
		
		GPolygon roof = new GPolygon();
		roof.addVertex(0, 0);
		roof.addVertex(100, -100);
		roof.addVertex(200, 0);
		roof.setColor(Color.red);
		roof.setFilled(true);
		roof.scale(1.0, 0.75);
		canvas.add(roof, 150, 250);
		
	}// draw roof
	
	void drawDoor() {
		
	} // draw Door
	
	
	
	
	public void run() {
		GLabel label1 = new GLabel("Hello world");
		add(label1, 100, 75);
		//GPen testPen(5,5);
		setup();
		
		for (int i = 0; i < 20; i++) {
			label1.move(1, 1);
			pause(100);
	
		} // the while loop
		
	} // run
	
}//Test class
