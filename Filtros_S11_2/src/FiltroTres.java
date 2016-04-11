import processing.core.PApplet;
import processing.core.PImage;

public class FiltroTres {
	
	PApplet app;
	PImage img;
	
	public FiltroTres() {

		
	}
	
	public void pintar(PApplet app){
		app.fill(app.random(255),app.random(255),app.random(255));
		app.ellipse(100, 100, 100, 100);
	}

}
