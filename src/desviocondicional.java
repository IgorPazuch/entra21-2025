import java.util.Scanner;

public class desviocondicional {

	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		//exercicio6();
		//exercicio7();
		//exercicio8();
		//exercicio9();
		exercicio10();
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
		} else if (numero1 < 0) {
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
	
	static void exercicio6() {
		Scanner entradaUser = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int numero1 = entradaUser.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = entradaUser.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int numero3 = entradaUser.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O maior número é: " + numero1);
		} else if (numero2 >= numero1 && numero2 >= numero1) {
			System.out.println("O maior número é: " + numero2);
		} else {
			System.out.println("O maior número é: " + numero3);
		}
	}
	
	static void exercicio7() {
		Scanner entradaUser = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		int nota = entradaUser.nextInt();
		
		if (nota <= 4) {
			System.out.println("Insuficiente.");
		} else if (nota <= 6) {
			System.out.println("Regular.");
		} else if (nota <= 8) {
			System.out.println("Bom.");
		} else {
			System.out.println("Excelente.");
		}
	}
	
	static void exercicio8() {
		Scanner entradaUser = new Scanner(System.in);
		
		System.out.println("Digite o valor do primerio lado: ");
		int lado1 = entradaUser.nextInt();
		
		System.out.println("Digite o valor do segundo lado: ");
		int lado2 = entradaUser.nextInt();
		
		System.out.println("Digite o valor do terceiro lado: ");
		int lado3 = entradaUser.nextInt();
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			System.out.println("Forma um triângulo!");
		} else { 
			System.out.println("Não forma um triângulo.");
			
		}
	}
	
	static void exercicio9() {
		Scanner entradaUser = new Scanner(System.in);
		
		 System.out.print("Digite o primeiro lado: ");
	        int lado1 = entradaUser.nextInt();
	        
	     System.out.print("Digite o segundo lado: ");
	        int lado2 = entradaUser.nextInt();
	        
	     System.out.print("Digite o terceiro lado: ");
	        int lado3 = entradaUser.nextInt();
	        
	        if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

	}
	
	static void exercicio10() {
		Scanner entradaUser = new Scanner(System.in);
		
		String adminCorreto = "admin";
		String senhaCorreta = "1234";
		
		System.out.print("Qual o usuário? ");
		String admin = entradaUser.next();
		
		System.out.print("Qual a senha?" );
		String senha = entradaUser.next();
		
		if (admin.equals(adminCorreto) && senha.equals(senhaCorreta)) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso NEGADO");
		}
	}

}
