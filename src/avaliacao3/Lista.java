package avaliacao3;

public class Lista {

	No inicio;
	Lista(){
		/* a lista está vazia */
		inicio = null;
	}

	/* inserir no final da lista */
	void inserir(String nome){
		/* criar um nó */
		No no = new No();
		no.conteudo = nome;
		no.proximo = null; /* este será o último nó da lista */
		/* checa se a lista está vazia */
		if( inicio == null ){
			inicio = no;
		}
		else{
			/* percorrer a lista até encontrar o último nó */
			No ultimo = inicio;
			while( ultimo.proximo != null ){
				ultimo = ultimo.proximo;
			}
			/* alterar o próximo do último para o endereço do no */
			ultimo.proximo = no;
		}
	}

	void imprimir(){
		/* checa se a lista está vazia */
		if( inicio == null ){
			System.out.println("Lista vazia");
		}
		else{
			/* percorrer a lista até encontrar o último nó */
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
		/* percorrer a lista até encontrar o último nó */
		No ultimo = inicio;
		while( ultimo != null ){
			cont++;
			ultimo = ultimo.proximo;
		}
		return cont;
	}

	/* ordena os elementos da lista */
	void sort(){
		/* programar aqui a ordenação da lista */
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