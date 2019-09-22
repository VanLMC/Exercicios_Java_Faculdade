package Simples;
import java.util.Scanner;

public class Exercicio_3 {
	static double F=0,C=0;
	static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {	
		System.out.println("Digite a temperatura em Celcius: ");
		C = S.nextDouble();
		F = (C * 9/5) + 32;
		System.out.println("A temperatura em fahrenheit é: " + F);
		
	}

}
