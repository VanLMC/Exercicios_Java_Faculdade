package Simples;
import java.util.Scanner;

/*4) Escreva um programa para calcular e imprimir o n�mero de l�mpadas necess�rias para iluminar um
determinado c�modo de uma resid�ncia. Dados de entrada: a pot�ncia da l�mpada utilizada (em
watts), as dimens�es (largura e comprimento, em metros) do c�modo. Considere que a pot�ncia
necess�ria � de 18 watts por metro quadrado.*/

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
