/* Para que a divis�o entre 2 n�meros possa ser realizada, o divisor n�o pode ser nulo (zero). Escreva
um programa para ler 2 valores e imprimir o resultado da divis�o do primeiro pelo segundo. OBS: O
programa deve validar a leitura do segundo valor (que n�o deve ser nulo). Enquanto for fornecido
um valor nulo a leitura deve ser repetida. Utilize a estrutura Repita/At� na constru��o da repeti��o
de valida��o*/

package Repeticao;
import java.util.Scanner;

public class Exercicio_1 {
	static double v1 = 0,v2 = 0;
	static Scanner S = new Scanner(System.in);
	public static void main(String args[]) {
		do {
			System.out.println("Digite o primeiro valor: ");
			v1 = S.nextDouble();
			System.out.println("Digite o segundo valor: ");
			v2 = S.nextDouble();
		}
		while(v2 == 0);
		System.out.println("Divis�o: " + v1/v2);
	}
}
