package logica.aula5;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		
		float preco = 10.99f;
		float preco2 =(float) 12.90;
		
		System.out.println("Float 1:" + preco);
		System.out.println("Float 2:" + preco2);
		
		int precoInteiro = (int) 2.50;
		System.out.println("Vslor inteiro: "+ precoInteiro);
		
		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println("");
		System.out.println(numeroX);
		System.out.println(numeroXDouble);
		
		Scanner sc = new Scanner(System.in);
				int numeroIn = (int) sc.nextDouble();
		
		System.out.println(numeroIn);
		
		
		
		


	}

}
