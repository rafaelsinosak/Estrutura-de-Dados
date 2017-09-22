package avaliacao1b;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		String menu;
		String imprimir = "";
		double distancia;
		double soma;
		int vazio;
		Ponto[] lista = new Ponto[10];
		do{
			menu = JOptionPane.showInputDialog(
					"1 - Criar array\n"+
							"2 - Imprimir na ordem normal\n"+
							"3 - Imprimir os possuem distância até a origem maior que 4\n"+
							"4 - Imprimir o somatório das distância dos pontos até a origem."
					);
			if( menu != null ){
				switch( menu ){
				case "1" :
					System.out.println("1");
					for (int i = 0; i < 10; i++) {
						lista[i] = new Ponto();
					}
					break;
				case "2" :
					vazio=0;
					for (int k = 0; k < 10; k++) if(lista[k]==null) vazio++;
					if(vazio>0){
						System.out.println("Primeiramente crie um Array.");
						break;
					}
					//-----------------------------CÓDIGO------------------------------
					System.out.println("2");
					imprimir = "Lista: [";
					for (int i = 0; i < 9; i++) {
						imprimir = imprimir + "[" + lista[i].x + ", " + lista[i].y + "], ";
					}
					imprimir = imprimir + "[" + lista[9].x + ", " + lista[9].y + "]]";
					System.out.println(imprimir);
					break;
				case "3" :
					vazio=0;
					for (int k = 0; k < 10; k++) if(lista[k]==null) vazio++;
					if(vazio>0){
						System.out.println("Primeiramente crie um Array.");
						break;
					}
					//-----------------------------CÓDIGO------------------------------
					System.out.println("3");
					/*for (int i = 0; i < 10; i++) {
						if(lista[i].distancia()>4){
							lista[i].imprimir();
						}
					}*/
					imprimir = "";
					for (int i = 0; i < 10; i++) {
						if(lista[i].distancia()>4){
							if(imprimir.equals("")){
								imprimir = "Lista: [" + lista[i].x + ", " + lista[i].y + "]";
							}
							else{
								imprimir = imprimir + ", [" + lista[i].x + ", " + lista[i].y + "]";
							}
						}
					}
					System.out.println(imprimir);
					/*
					for (int i = 0; i < 10; i++) {
						distancia = lista[i].distancia();
						if(distancia>4){
							System.out.println("[" + lista[i].x + ", " + lista[i].y + "] = " + distancia);
						}
					}*/
					break;
				case "4" :
					vazio=0;
					for (int k = 0; k < 10; k++) if(lista[k]==null) vazio++;
					if(vazio>0){
						System.out.println("Primeiramente crie um Array.");
						break;
					}
					//-----------------------------CÓDIGO------------------------------
					System.out.println("4");
					soma = 0.0;
					for (int i = 0; i < 10; i++) {
						distancia = lista[i].distancia();
						//System.out.println("[" + lista[i].x + ", " + lista[i].y + "] = " + distancia);
						soma = soma + distancia;
					}
					System.out.println("Soma: " + soma);
					break;
				}
			}
		}while(menu != null);
	}
}