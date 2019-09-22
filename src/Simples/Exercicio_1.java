package Simples;
import java.util.Scanner;


public class Exercicio_1 {
	
	static double raio = 0 ,area = 0;
	
	static Scanner S = new Scanner(System.in);   
	
	public static void main(String[] args){
		
		System.out.println("Digite o raio do círculo: ");
		raio = S.nextDouble();
		area = 3.14 * (raio * raio);
		System.out.println("O valor da Area é: " + area);
	}
}
