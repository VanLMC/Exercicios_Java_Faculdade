package Simples;
import java.util.Scanner;

public class Exercicio_2 {
	static double F=0,C=0;
	static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Digite a temperatura em Fahrenheit: ");
		F = S.nextDouble();
		C = ((F - 32) * 5 )/9; 
		System.out.println("Temperatura em Graus Celcius: " + C);
	}

}
