import processing.core.PApplet;

public class Logica {

	public FiltroUno fUno;
	public FiltroTres fTres;
	
	public Logica(PApplet app){
		fUno = new FiltroUno(app);
		fTres=new FiltroTres();
	}
	
	public void pintar(PApplet app) {
		switch (app.key){
		
		case '0':
			app.fill(0);
			app.textSize(30);
			app.text("Presione teclas del 1 al 4 para ver filtros", 170, 300);
			break;
		
		case '1':
			fUno.pintar(app);
			break;
			
		case '2':
			
			break;
			
		case '3':
			fTres.pintar(app);
			break;
		}
	}
}
