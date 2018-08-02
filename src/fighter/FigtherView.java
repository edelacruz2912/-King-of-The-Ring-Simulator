package fighter;

import java.awt.Canvas;

import javax.swing.JFrame;

//This is the Fighter View of the MVC



public class FigtherView {

	
	
	
	
	
	public FigtherView()
	{
		//creating a canvas for the figthers
		
		
		//Create a JFrame object, which is the window that will contain the canvas.
		JFrame frame = new JFrame("King of The Ring Simulator");
		
		//Create a Drawing object(which is the canvas) , set its width and height, and add it to the frame.
		Canvas canvas = new Canvas();
		canvas.setSize(500, 500);
		frame.add(canvas);
		frame.pack();
		frame.pack();
		frame.setVisible(true);
		
		
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
