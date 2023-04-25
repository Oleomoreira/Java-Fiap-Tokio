package exercicios.aula6;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a 1°nota do aluno: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Insira a 2°nota do aluno: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Insira a 3°nota do aluno: ");
		float n3 = sc.nextFloat();
		
		System.out.println("Insira a 4°nota do aluno: ");
		float n4 = sc.nextFloat();
		
		float media= (n1+ n2 + n3 + n4)/4 ;
		
		if(media >=7) 
			System.out.println("Aprovado!");
			
		else if(media > 5 && media < 7) {
				System.out.println("Recuperação");
			}
				
		else if(media <5) {
			System.out.println("Reprovado!");
		}
			
		

	}

}
