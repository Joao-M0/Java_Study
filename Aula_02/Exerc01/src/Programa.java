import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		/*
		 * Fazer a entrada de dados das seguintes informa��es:
		 * Nome,
		 * Idade,
		 * Se possui Plano de Sa�de,
		 * Estado Civil.
		 * Depois imprima esses valores.*/
		
		System.out.println("Digite seu nome completo: ");
		String nome = new Scanner(System.in).nextLine();
		System.out.println("Digite sua idade: ");
		int idade = new Scanner(System.in).nextInt();
		System.out.println("Voc� possui algum plano de sa�do? ");
		String planoSaude = new Scanner(System.in).next();
		System.out.println("Estado civil");
		String estadoCivil = new Scanner(System.in).next();
		
		
		System.out.println("\nConfirme os dados preenchidos");
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Possui plano de sa�do: "+planoSaude);
		System.out.println("Estado civil: "+estadoCivil);
		 
		
		
	}
}
