package logica.aulas;

import java.util.Scanner;
public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		System.out.println("sua idade é:" + entrada.nextLine());
		
		entrada.close();
	}
	

}
