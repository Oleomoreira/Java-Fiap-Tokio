package logica.aula5;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {
		
		double salario =1400.50;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salarioStr.getClass());
		
		System.out.println("");
		String idade = "25";
		
		int idade1 =Integer.parseInt(idade);
		System.out.println(idade1);
		
		System.out.print(""); //pulando uma linha 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preco do produto");
		String preco = sc.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		System.out.println(precoFloat);
		
	}

}
