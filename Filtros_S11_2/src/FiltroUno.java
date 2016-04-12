import processing.core.PApplet;
import processing.core.PImage;

public class FiltroUno {

	private PImage won, imgUno;
	
	public FiltroUno(PApplet app){
		won = app.loadImage("../data/won.jpg");
	}
	
	public void pintar(PApplet app){
		
		imgUno = app.createImage(won.width, won.height, app.RGB);
		float thres = 130; 
		imgUno.loadPixels();
		
		for (int i = 0; i < imgUno.width; i++) {
			for (int j = 0; j < imgUno.height; j++) {
				int uno = i + (j*won.width);
				if(PApplet.dist(app.mouseX, app.mouseY, i, j)<80) {
					
				if(app.brightness(won.pixels[uno]) > thres){
					imgUno.pixels[uno] = app.color(255);
				} else {
					imgUno.pixels[uno] = app.color(255,0,0);
				}
				
				} else {
					imgUno.pixels[uno] = won.pixels[uno];
				}
			}
		}
		imgUno.updatePixels();
		app.image(won, 0, 0);
		app.image(imgUno, 0, 0);
	}
}
