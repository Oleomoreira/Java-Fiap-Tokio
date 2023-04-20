package exercicios.aula6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double num2 = sc.nextDouble();
		
		if(num1>num2)
			
		System.out.println("O" + num1 + "é maior do que o" + num2);
		
		else if(num1<num2) {
			
			System.out.println("O" + num2 + "é maior do que o" + num1);
			
		}else if(num1 == num2) {
			System.out.println("Os numeros são iguais");
		}
		
		
	}

}
