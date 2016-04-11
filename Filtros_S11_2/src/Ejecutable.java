import processing.core.PApplet;

public class Ejecutable extends PApplet {
	
	Logica log;
	
	public void setup(){
		size(960,624);
		log = new Logica(this);
	}
	public void draw(){
		background(255); 
		log.pintar(this);
	}
}
