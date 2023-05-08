package exercicios.aula6;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a quantidade total em KW/h utilizado;");
		double kw = sc.nextDouble();
	
		System.out.println("Informe seu tipo:\n[1]Residência\n[2]comércio\n[3]industria");
		String tipo = sc.nextLine();
		
		double residencia = kw/0.60;
		double comercio = kw/0.48;
		double industria = kw/1.29;
		
		switch (tipo ) {
		case "1":
			System.out.println("sua conta de luz esta no valor:" + residencia);
		break;
		case "2":
			System.out.println("sua conta de luz esta no valor:" + comercio);
		break;
		case "3":
			System.out.println("sua conta de luz esta no valor:" + industria);
			
		}
		
		sc.close();

	}

}
