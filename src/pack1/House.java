package pack1;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPen;
import acm.graphics.*;
import java.awt.*;
import acm.graphics.GPolygon;
import java.awt.Color;

/* websites
 * this is the color wheel to get sick RGB colors
 * https://color.adobe.com/create/color-wheel/
 */




// BASIC HOUSE ART	
public class House extends GraphicsProgram {
	
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
		pen.setSpeed(1);
		
		// Outline of house
		pen.setColor(Color.BLACK);
		
		// Fill in house
		pen.setFillColor(new Color(97, 255, 73));
		
		//Where rectangle will be coordinated in the appletViewer
		pen.startFilledRegion();
		
		// Dimensions of Rectangle
		pen.drawLine(200, 0); // width
		pen.drawLine(0, 200); // Height
		pen.drawLine(-200, 0); // -Width
		pen.drawLine(0, -200); // -Height
		
		pen.endFilledRegion();
		
		// Draw Roof by connecting vertices 
		GPolygon roof = new GPolygon();
		roof.addVertex(500, 100);
		roof.addVertex(300, 100);
		roof.addVertex(400, 0);
		
		
		
		
		
		
		
		
		
		
	}// run
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // Graphics program
