import processing.core.PApplet;
import processing.core.PImage;

public class FiltroDos {

	private PImage sup, imgSup;
	
	public FiltroDos(PApplet app){
		sup = app.loadImage("../data/sup.jpg");
	}
	
	public void pintar(PApplet app){
		imgSup = app.createImage(sup.width, sup.height, app.RGB);
		imgSup.loadPixels();
		
		for (int i = 0; i < imgSup.width; i++) {
			for (int j = 0; j < imgSup.height; j++) {
				int sm = i + (j*sup.width);
			}
		}
		imgSup.updatePixels();
		app.image(sup, 0, 0);
	}
}
