import java.util.Scanner;

public class desviocondicional {

	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		exercicio3();
		//exercicio4();
		//exercicio5();
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
	
	static void exercicio3() {
		Scanner entradaUser = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int numero1 = entradaUser.nextInt();
		
		if (numero1 > 0) {
			System.out.println("Seu número é positivo.");
		} if (numero1 < 0) {
			System.out.println("Seu número é negativo. ");
		} else {
			System.out.println("O valor do seu número é 0.");
		}
	}
	
	static void exercicio4() {
		Scanner entradaUser = new Scanner(System.in);
		System.out.print("Digite sua nota: ");
		int nota = entradaUser.nextInt();
		
		if (nota > 6) {
			System.out.println("Parabéns, você foi APROVADO!");
		} if (nota < 6) {
			System.out.println("Desculpe, você foi REPROVADO.");
		}
	}
	
	static void exercicio5() {
		Scanner entradaUser = new Scanner(System.in);
		System.out.print("Por favor, digite sua idade: ");
		int idade = entradaUser.nextInt();
		
		if (idade >= 16) {
			System.out.println("Você ESTÁ está apto a votar.");
		} else {
			System.out.println("Você NÃO apto a votar!");
		}
	}

}
