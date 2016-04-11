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
				if(app.brightness(won.pixels[uno]) > thres){
					imgUno.pixels[uno] = app.color(255);
				} else {
					imgUno.pixels[uno] = app.color(255,0,0);
				}
			}
		}
		imgUno.updatePixels();
		app.image(imgUno, 0, 0);
	}
}
