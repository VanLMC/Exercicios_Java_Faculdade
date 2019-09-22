package Simples;
import java.util.Scanner;

/*4) Escreva um programa para calcular e imprimir o número de lâmpadas necessárias para iluminar um
determinado cômodo de uma residência. Dados de entrada: a potência da lâmpada utilizada (em
watts), as dimensões (largura e comprimento, em metros) do cômodo. Considere que a potência
necessária é de 18 watts por metro quadrado.*/

public class Exercicio_4 {
	static double pot=0,lar=0,com=0,qtd=0;
	static Scanner S = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Digite a potencia da lampada: ");
		pot = S.nextDouble();
		System.out.println("Digite a largura do comodo: ");
		lar = S.nextDouble();
		System.out.println("Digite o comprimento do comodo: ");
		com = S.nextDouble();
		qtd = (18/pot) * (lar * com); 
		System.out.println("Quantidade de larguras para o comodo: " + qtd);
	}
}
