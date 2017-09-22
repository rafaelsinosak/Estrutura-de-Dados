package avaliacao3;

public class Lista {

	No inicio;
	Lista(){
		/* a lista est� vazia */
		inicio = null;
	}

	/* inserir no final da lista */
	void inserir(String nome){
		/* criar um n� */
		No no = new No();
		no.conteudo = nome;
		no.proximo = null; /* este ser� o �ltimo n� da lista */
		/* checa se a lista est� vazia */
		if( inicio == null ){
			inicio = no;
		}
		else{
			/* percorrer a lista at� encontrar o �ltimo n� */
			No ultimo = inicio;
			while( ultimo.proximo != null ){
				ultimo = ultimo.proximo;
			}
			/* alterar o pr�ximo do �ltimo para o endere�o do no */
			ultimo.proximo = no;
		}
	}

	void imprimir(){
		/* checa se a lista est� vazia */
		if( inicio == null ){
			System.out.println("Lista vazia");
		}
		else{
			/* percorrer a lista at� encontrar o �ltimo n� */
			No ultimo = inicio;
			while( ultimo != null ){
				System.out.print( ultimo.conteudo +" ");
				ultimo = ultimo.proximo;
			}
			
			System.out.println(); /* quebra de linha na tela */
		}
	}

	/* retorna a quantidade de elementos da lista */
	int size(){
		int cont = 0;
		/* percorrer a lista at� encontrar o �ltimo n� */
		No ultimo = inicio;
		while( ultimo != null ){
			cont++;
			ultimo = ultimo.proximo;
		}
		return cont;
	}

	/* ordena os elementos da lista */
	void sort(){
		/* programar aqui a ordena��o da lista */
		if(inicio == null) {
			System.out.println("Lista Vazia");
		}
		else {
			No no = inicio;
			String atual="", proxima="", troca="";

		for(int i = 0; i < size(); i++){	
			
			while(no.proximo != null){
				
				atual = no.conteudo;
				proxima = no.proximo.conteudo;
					
				if(atual.toLowerCase().compareTo(proxima.toLowerCase()) > 0){
					troca = no.conteudo;
					no.conteudo = no.proximo.conteudo;
					no.proximo.conteudo = troca;
				}else if(proxima.toLowerCase().compareTo(atual.toLowerCase()) < 0){
					
					troca= no.proximo.conteudo;
					no.proximo.conteudo = no.conteudo;
					no.conteudo = troca;
				}
				no = no.proximo;
			}
			no = inicio;
		}
		}

	}
}