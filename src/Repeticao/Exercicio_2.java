/*Altere a solução do exercício anterior para que seja impressa a mensagem Valor inválido! caso o
segundo valor informado seja zero.*/
package Repeticao;
import java.util.Scanner;

public class Exercicio_2 {
	static double v1 = 0,v2 = 0;
	static Scanner S = new Scanner(System.in);
	
	public static void main(String args[]) {
		do {
			System.out.println("Digite o primeiro valor: ");
			v1 = S.nextDouble();
			System.out.println("Digite o segundo valor: ");
			v2 = S.nextDouble();
			if(v2==0) {
				System.out.println("Valor Inválido!");
			}
		}
		while(v2 == 0);
		System.out.println("Divisão: " + v1/v2);
	}
}
