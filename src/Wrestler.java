import java.awt.Image;

//The model performs all the calculations needed
// and that is it. It doesnt know the view
// exists



public class Wrestler {
	
	private String figtherName = null;
	private Image figtherImage = null;
	private int health = 100;	
	
	public Wrestler(String figtherName, Image fighterImage)
	{
		this.figtherName = figtherName;
		this.figtherImage = fighterImage;
		
	}

	public String getFigtherName() {
		return figtherName;
	}

	public void setFigtherName(String figtherName) {
		this.figtherName = figtherName;
	}

	public Image getFigherImage() {
		return figtherImage;
	}

	public void setFigherImage(Image figherImage) {
		this.figtherImage = figherImage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	

}
