package Loop_while;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		int totalMenores=0, totalMaiores=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-Vinde ao sistema de verifição de Idades!\n******************************************************");
		System.out.println("Este programa vai verificar a quantidade de pessoas menores de 21 anos e maiores de 50 anos");
		
		
		
		while(true) {
			System.out.print("Digite a Idade (Digite ''-1'' para cancelar): ");
			int idade = scan.nextInt();
			
			if(idade == -1)
				break;
			
			if(idade < 21) {
				totalMenores++;
			}
			else if(idade > 50) {
				totalMaiores++;
			}
		}	
		
		System.out.println("\nFinalizando....\n*************************************************");
		System.out.println("Total de pessoas menores de 21 anos: " + totalMenores);
		System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiores);
	}

}
