import java.util.Scanner;

public class desviocondicional {

	public static void main(String[] args) {
		//exercicio1();
		exercicio2();
	}
	
	static void exercicio1() {
		Scanner entradaUser = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero1 = entradaUser.nextInt();
		
		if (numero1 % 2 == 0) {
			System.out.println("O número é par.");
		} else { 
			System.out.println("O número é ímpar.");
		}
	}
	
	static void exercicio2() {
		Scanner entradaUser = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero1 = entradaUser.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = entradaUser.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior número é: " + numero1);
		} else if (numero2 > numero1) {
			System.out.println("O maior número é: " + numero2);
			
		} else {
			System.out.println("Os dois números são iguais.");
		}
		
	}

}
