import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		/*Leia 500 valores inteiros e positivos e:
		 *Encontre o maior.
		 *Encontre o menor valor
		 *Calcule a m�dia dos n�meros lidos*/
		Scanner entrada = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
		int soma = 0;
		int quantidade = 5;
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Digite um n�mero: ");
			int numero = entrada.nextInt();
			
			soma += numero;
			
			if (numero > maior) {
				maior = numero;
			}
			//Recebe o primeiro n�mero.
			if(menor == 0) {
				menor = numero;
			}
			/*Se o n�mero que foi digitado for menor,
			 *ent�o a variavel menor receber esse n�mero.*/ 
			if(numero < menor) {
				menor = numero;
			}
			

			
		}
	
		System.out.println("O maior n�mero �: "+maior);
		System.out.println("O menor n�mero �: "+menor);
		System.out.println("A m�dia �: "+(soma/quantidade));
			
	}	
}
