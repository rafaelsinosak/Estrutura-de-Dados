package avaliacao1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		String menu;
		int[] lista = new int[10];
		String imprimir = "";
		int vazio = 0;
		int cont=0;
		do{
			menu = JOptionPane.showInputDialog(
					"1 - Criar array\n"+
							"2 - Imprimir na ordem normal\n"+
							"3 - Imprimir na ordem invertida\n"+
							"4 - Imprimir os elementos em posições pares\n"+
							"5 - Imprimir os elementos pares\n"+
							"6 - Imprimir o somatório"
					);
			if( menu != null ){
				switch( menu ){
				case "1" :
					System.out.println("1");
					//int[] myIntArray = new int[3];
					//int[] myIntArray = {1,2,3};
					//int[] myIntArray = new int[]{1,2,3};
					Random aleatorio = new Random();
					for (int i = 0; i < 10; i++) {
				    	lista[i] = aleatorio.nextInt(100);
					 }
					if (cont>0) {
						System.out.println("Array recriado");
					}
					else {
						cont=cont+1;
						System.out.println("Array criado");
					}
					break;
				case "2" :
					vazio=0;
					for (int k = 0; k < 10; k++) {
						vazio = vazio + lista[k];
					 }
					if(vazio==0){
						System.out.println("Primeiramente crie um Array.");
						break;
					}
					//-----------------------------CÓDIGO------------------------------
					System.out.println("2");
					imprimir = "Lista: ";
					for (int i = 0; i < 10; i++) {
						imprimir = imprimir + lista[i] + " ";
						//System.out.println(imprimir);
					 }
					System.out.println(imprimir);
					break;
				case "3" :
					vazio=0;
					for (int k = 0; k < 10; k++) {
						vazio = vazio + lista[k];
					 }
					if(vazio==0){
						System.out.println("Primeiramente crie um Array.");
						break;
					}
					//-----------------------------CÓDIGO------------------------------
					System.out.println("3");
					imprimir = "";
					for (int i = 0; i < 10; i++) {
						imprimir = lista[i] + " " + imprimir;
						//System.out.println(imprimir);
					 }
					System.out.println("Ordem invertida: " + imprimir);
					break;
				case "4" :
					vazio=0;
					for (int k = 0; k < 10; k++) {
						vazio = vazio + lista[k];
					 }
					if(vazio==0){
						System.out.println("Primeiramente crie um Array.");
						break;
					}
					//-----------------------------CÓDIGO------------------------------
					System.out.println("4");
					imprimir = "Números em posições pares: ";
					for (int i = 0; i < 10; i=i+2) {
						imprimir = imprimir + lista[i] + " ";
						}
					System.out.println(imprimir);
					break;
				case "5" :
					vazio=0;
					for (int k = 0; k < 10; k++) {
						vazio = vazio + lista[k];
					 }
					if(vazio==0){
						System.out.println("Primeiramente crie um Array.");
						break;
					}
					//-----------------------------CÓDIGO------------------------------
					System.out.println("5");
					imprimir = "Números pares: ";
					for (int i = 0; i < 10; i++) {
						if ((lista[i] % 2) == 0){
							imprimir = imprimir + lista[i] + " ";
						}
					 }
					System.out.println(imprimir);
					break;
				case "6" :
					vazio=0;
					for (int k = 0; k < 10; k++) {
						vazio = vazio + lista[k];
					 }
					if(vazio==0){
						System.out.println("Primeiramente crie um Array.");
						break;
					}
					//-----------------------------CÓDIGO------------------------------
					System.out.println("6");
					int soma=0;
					for (int i = 0; i < 10; i++) {
						soma = soma + lista[i];
					 }
					System.out.println("Soma: " + soma);
					break;
				}
			}
		}while(menu != null);
	}
}