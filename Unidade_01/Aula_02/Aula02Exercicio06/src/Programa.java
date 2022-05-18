import java.util.Locale;
import java.util.Scanner;
public class Programa {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		/*
		 * Receba 5 mil dados do usu�rio do tipo inteiro.
		 * Imprima na sa�da padr�o a m�dia dos valores, quantos valores s�o pares e quantos s�o �mpares*/
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		int []nums = new int[4];//Apenas para teste. S� alterar o valor para 5000.
		double media = 0;
		int soma = 0;
		int impares = 0;
		int pares = 0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Digite um n�mero: ");
			nums[i] = entrada.nextInt();
			
			soma += nums[i];
			media = soma/nums.length;
			
			if(nums[i]% 2 == 0) {
				++pares;
			}else {
				++impares;
			}
		}
		System.out.printf("A m�dia �: %.1f", media);
		System.out.println("\nA quantidade de n�meros pares �: "+pares);
		System.out.println("A quantidade de n�meros impares �: "+impares);
	}
}
