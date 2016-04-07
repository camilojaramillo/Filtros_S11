import processing.core.PApplet;

public class Ejecutable extends PApplet {
	
	Logica log;
	float posX=100;
	float posY;
	float grav;
	float speed;
	
	public void setup(){
		size(1000,700);
		log = new Logica();
		grav= (float) 0.2;
	}
	public void draw(){
		background(255); //Aiuda
		fill(255,8,100);
		ellipse(posX, posY, 100, 100);
		
		posY=posY+speed;
		speed=speed+grav;
		
		if (posY>height) {
			
		}
	}
}
