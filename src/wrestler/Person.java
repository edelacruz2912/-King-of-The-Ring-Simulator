package wrestler;

import java.awt.Image;

//Models - models represent knowledge. A model could be a single object, or it could be some structure of objects.

public class Person {

	private String name;
	private int overall ;
	private int health = 100;
	private Image wrestlerImage;
	
	
	public Person(String name, int overall )
	{
		
		this.name = name;
		this.overall = overall;
		
		
		
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
	
	public void kick()
	{
		
	}
	
	public void punch() 
	{
		
		
		
	}
	
	public void run()
	{
		
	}
	
	
	
	
}
