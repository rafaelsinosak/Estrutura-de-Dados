package avaliacao2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		String menu;

		do{
			menu = JOptionPane.showInputDialog(
					"1 - Criar sequência\n"+
					"2 - Adicionar valor\n"+
					"3 - Imprimir");

			if( menu != null ) {
				switch( menu ) {
					case "1" : criar(); break;
					case "2" : add(); break;
					case "3" : imprimir(); break;
				}

			}

		} while( menu != null );

	}

	public static void criar(){
		
		Sequencia seq = new Sequencia();
		int qtd =0;
		
		
		if(Sequencia.lista == null){
			
			qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor", JOptionPane.CANCEL_OPTION));
			seq = new Sequencia(qtd);
			
			if(Sequencia.lista != null ) {
				JOptionPane.showMessageDialog(null, "Lista criada \nTamanho : " + Sequencia.lista.length);
			}
			
		}
		
		else {
			Sequencia.lista=null;
			qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor", JOptionPane.CANCEL_OPTION));
			seq = new Sequencia(qtd);
			
			if(Sequencia.lista != null ) {
				JOptionPane.showMessageDialog(null, "Lista criada \nTamanho : " + Sequencia.lista.length);
			}
			
		}
		

	}



	public static void add(){
					
			
			if(Sequencia.posicao == -1){

				JOptionPane.showMessageDialog(null, "Crie uma sequência antes");
			}


			else if (Sequencia.posicao >= 0){
				for(int i = 0; i <= (Sequencia.lista.length-1); i ++) {

					Sequencia.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição [ " + (Sequencia.posicao) + " ] da lista", JOptionPane.CANCEL_OPTION)));

				}
				
				if(Sequencia.lista.length == Sequencia.posicao) {

					JOptionPane.showMessageDialog(null, "Lista cheia");

				}
				
				
			}


		
	}

	public static void imprimir(){
		
		if(Sequencia.posicao == -1){

			JOptionPane.showMessageDialog(null, "Crie uma sequência antes");
		}
		
		else {
		System.out.println(Sequencia.imprimir());
		}

	}


}
