/**
 * 
 */
package fighter;

import java.awt.Image;

/**
 * @author Eduardo
 * THis is the figher Model of the Model-View-Controller(MVC) Design pattern 
 */
public class fighterModel {

	private String name;
	private Image fighterImage;
	private int health = 100 ;
	private int strenght;
	
	
	//Constructor
	
	public fighterModel(String name, Image fighterImage , int strength)
	{
		this.name = name;
		this.fighterImage = fighterImage;
		this.strenght = strength;
		
		
	}
	

	public void attack()
	{
		
		
	}
	
	public void defense()
	{
		
		
	}
	
	//return the recent health of the figther
	public int getHealth() 
	{
		return health;
		
	}
	
	
}
