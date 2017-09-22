package avaliacao1;

public class Ponto {
	int x, y;
	Ponto(){
		/* random() retorna um valor no intervalo [0,1[ */
		this.x = (int) (Math.random()*10+1);
		this.y = (int) (Math.random()*10+1);
	}
	double distancia(){
		double dx = Math.pow(x,2);
		double dy = Math.pow(y,2);
		return Math.sqrt(dx + dy);
	}
	void imprimir(){
		System.out.println( "(" + x +", "+ y +")" );
	}
}