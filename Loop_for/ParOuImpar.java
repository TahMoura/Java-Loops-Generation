package Loop_for;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		int num, i, par=0, impar=0;
		
		System.out.println("Par ou Impar?");
		
		System.out.println("Vamos digitar alguns números e verificar quantos são Pares e quantos são Ímpares!\n******************************");
		
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Tota de Números Pares: " + par);
		System.out.println("Total de Núemros Ímpares: " + impar);

	}

}
