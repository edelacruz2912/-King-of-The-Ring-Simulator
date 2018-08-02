package wrestler;

import java.awt.Image;

public class Person {

	private String name;
	private int overall ;
	private int health = 100;
	private Image wrestlerImage;
	
	
	public Person(String name, int overall, Image wrestlerImage )
	{
		
		this.name = name;
		this.overall = overall;
		this.wrestlerImage = wrestlerImage;
		
		
	}
	
	public String getName()
	{
		
		return name;
	}
	
	public int getOverall()
	{
		
		return overall;
	}
	
	public Image getImage()
	{
		
		return wrestlerImage;
	}
	
	
}
