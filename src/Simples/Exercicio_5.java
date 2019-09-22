/* Escreva um programa para ler as dimensões de uma cozinha retangular (comprimento, largura e
altura), calcular e escrever a quantidade de caixas de azulejos para se colocar em todas as suas
paredes (considere que não será descontada a área ocupada por portas e janelas). Cada caixa de
azulejos possui 1,5 m2*/
package Simples;
import java.util.Scanner;
public class Exercicio_5 {
	static double com = 0,lar = 0 ,alt = 0,caixas = 0;
	static Scanner S = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o Comprimento: ");
		com = S.nextDouble();
		System.out.println("Digite a Largura: ");
		lar = S.nextDouble();
		System.out.println("Digite a altura: ");
		alt = S.nextDouble();
		caixas = ((lar*alt)+(com*alt))/1.5;
		System.out.println("Quantidade de caixas: "+ caixas);
	}
}
