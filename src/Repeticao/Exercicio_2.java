/*Altere a solu��o do exerc�cio anterior para que seja impressa a mensagem Valor inv�lido! caso o
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
				System.out.println("Valor Inv�lido!");
			}
		}
		while(v2 == 0);
		System.out.println("Divis�o: " + v1/v2);
	}
}
