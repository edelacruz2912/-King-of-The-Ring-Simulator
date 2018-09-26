import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.*;


//This is the View
//Its only job is to display what the user sees
//It performs no calculations, but instead passes
//information entered by the user to whomever needs
//it.



public class fighterView extends JFrame {
	
	private JLabel fighterN = new JLabel("FighterName");
	private BufferedImage fighterImage = null ;
	
	
	public fighterView()
	{
		//Sets up the view and adds the components
		JPanel panel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		
		//adding componets to the Jpanel
		
		panel.add(fighterN);
		
		
		//adding components to the Frame
		this.add(panel);
		
		
		
		
	}
	
	
	
	
	
	

}
