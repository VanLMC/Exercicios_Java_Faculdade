package Selecao;

/*		Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa.
Caso o aluno não tenha feito a optativa deve ser fornecido o valor –1. Calcular a média do semestre
considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações.
Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame,
de acordo com as informações abaixo:
Aprovado : media >= 6.0
Reprovado: media < 3.0
Exame : media >= 3.0 e < 6.0
*
*/
import java.util.Scanner;

public class Exercicio_2 {
	static Scanner S = new Scanner(System.in);
	private static double Av1 = 0, Av2 = 0 , Av3 = 0, Media;
	
	//calcula média
	public static double Calcularmedia(double av1, double av2, double av3) {
		double media = 0;
		if(av3 > av1) {
			media = (av2 + av3)/2;
		}
		else if(av3 > av2) {
			media = (av1 + av3)/2;
		}
		else {
			media = (av1 + av2)/2;
		}	
		return media;
	}
	//Rotina principal
	public static void main(String[] args){
		System.out.println("Primeira Avaliação: ");
			Av1 = S.nextDouble();
		System.out.println("Segunda Avaliação:");
			Av2 = S.nextDouble();
		System.out.println("Avaliação Optativa:");
			Av3 = S.nextDouble();
			if(Av3 == -1) {
				Av3 = 0;
			}
			Media = Calcularmedia(Av1,Av2,Av3);
		System.out.println("Média: " + Media);
		if(Media >= 6.0)
				System.out.println("Aluno Aprovado");
		else if(Media >= 3.0 && Media < 6.0)
				System.out.println("Aluno em Exame");
		else if(Media < 3) 
				System.out.println("Aluno Reprovado");
	}
}
