package pacote;

import java.util.Scanner;

public class CategoriaLutador {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome;
		double peso;
		System.out.println("Informe o seu nome: ");
		nome=sc.nextLine();
		
		System.out.println("Informe seu peso: ");
		peso=sc.nextDouble();

		if (peso<65) {
			System.out.printf("O lutador %s pesa %.2f e se enquadra na categoria Pena",nome,peso);
		}
		
		else if (peso>=65 && peso<72) {
			System.out.printf("O lutador %s pesa %.2f e se enquadra na categoria Leve",nome,peso);
		}
		
		else if (peso>=72 && peso<79) {
			System.out.printf("O lutador %s pesa %.2f e se enquadra na categoria Ligeiro",nome,peso);
		}
		
		else if (peso>=79 && peso<86) {
			System.out.printf("O lutador %s pesa %.2f e se enquadra na categoria Meio-médio",nome,peso);
		}
		
		else if (peso>=86 && peso<93) {
			System.out.printf("O lutador %s pesa %.2f e se enquadra na categoria Médio",nome,peso);	
		}
		
		else if (peso>=93 && peso<100) {
			System.out.printf("O lutador %s pesa %.2f e se enquadra na categoria Meio-pesado",nome,peso);
		}
		
		else {
			System.out.printf("O lutador %s pesa %.2f e se enquadra na categoria Pesado",nome,peso);
		}
	}
}
