package Loop_do_while;

import java.util.Scanner;

public class SomaPositivo {

	public static void main(String[] args) {
		
		int num, soma=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Programa para somar números inteiros positivos\n****************************************************");
		System.out.println("No final, será mostrando o resultado da soma de todos os números positivos que você digitar!\n*********************************************************************");
		
		do {
			System.out.print("Digite um número (Digite 0 paea sair): ");
			num = scan.nextInt();
			
			if(num > 0) {
				soma += num;
			}
			
		}while(num!=0);
		
		System.out.println("\nFinalizando.....");
		
		System.out.println("\nA soma de todos os números positivos digitados é: " + soma);
	}

}
