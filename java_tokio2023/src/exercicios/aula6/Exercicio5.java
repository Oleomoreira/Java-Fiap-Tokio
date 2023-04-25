package exercicios.aula6;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("      Calculadora primitiva       ");
		
		System.out.println("Digite um número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro número:");
		double num2 = sc.nextDouble();
		
		System.out.println("      OPERAÇÕES      " +  "\n[+]-SOMA\n" + "[-]-SUBTRAÇÃO\n" + "[/]-DIVISÃO\n" + "[*]-MULTIPLICAÇÃO" + "\nDigite uma operação:");
		char op = sc.next().charAt(0);
		
		if(op=='+') {
			double R= num1 + num2;
			System.out.println("O resultado é:" + R);
			
		}else if(op=='-') {
			double R= num1 - num2;
			System.out.println("O resultado é:" + R);
			
		}else if(op=='/'){
			double R= num1 / num2;
			System.out.println("O resultado é:" + R);
			
		}else if(op=='*') {
			double R= num1 * num2;
			System.out.println("O resultado é:" + R);
		}
	}

}
