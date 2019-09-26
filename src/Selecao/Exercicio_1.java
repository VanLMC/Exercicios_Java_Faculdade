package Selecao;

import java.util.Scanner;
public class Exercicio_1 {
	private static int Cod;
	static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {	
		System.out.println("Insira o Código do produto: ");
		Cod = S.nextInt();
		if(Cod == 1){
			System.out.println("A Região do produto é Sul");
		}
		else if(Cod == 2){
			System.out.println("A Região do produto é Norte");
		}
		else if(Cod == 3){
			System.out.println("A Região do produto é Leste");
		}
		else if(Cod == 4){
			System.out.println("A Região do produto é Oeste");
		}
		
		else if((Cod == 5) || (Cod == 6)){
			System.out.println("A Região do produto é Nordeste");
		}
		else if((Cod == 7) || (Cod == 8) || (Cod == 9)){
			System.out.println("A Região do produto é Centro-Oeste");
		}
		else if(Cod == 11){
			System.out.println("A Região do produto é Noroeste");
		}
	}
}
