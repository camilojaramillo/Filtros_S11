import processing.core.PApplet;

public class Ejecutable extends PApplet {
	
	Logica log;
	
	public void setup(){
		size(1000,700);
		log = new Logica();
	}
	public void draw(){
		background(255); //Aiuda
		fill(255,8,100);
		ellipse(100, 100, 100, 100);
	}
}
