package avaliacao2;

public class Sequencia {

	public static int lista [];
	public static int posicao = -1;
	
	public Sequencia(int numero) {
		if(lista == null){
			lista = new int[numero];
			posicao = 0;
		} else {
			resize(numero);
			
		}
	}

	public Sequencia() {
		
	}
	
	static void add(int numero){
		System.out.println("Adicionar na posição : " + posicao);
		
		lista[posicao++] = numero;
	
	}
	
	static void resize(int numero){
		int size[] = new int[lista.length];
		
		for( int i = 0 ; i < size.length ; i ++ ) {
			size[i] = lista [i];
		}
		
		lista = new int[size.length + numero];
		posicao = 0;
		for( int i = 0 ; i < size.length ; i ++ ) {
			System.out.println("Posição: " + posicao + " |  Número: " + size[i]); 
			lista[posicao++] = size [i];
		}
		
	}
	
	
	static String imprimir() {
		String x ="";
		for ( int i = 0 ; i < lista.length ; i ++ ) {
			
			x += lista[i] + " | ";
			
		}
		return x;
	}
	
	
	
}
