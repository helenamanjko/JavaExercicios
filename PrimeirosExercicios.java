package ExerciciosJava;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeirosExercicios {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//EXERCICIO 1
		
		/*int numero1, numero2, numero3, apoio = 0;
		
		System.out.println("Me diga o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.println("Me diga o primeiro número: ");
		numero2 = ler.nextInt();
		System.out.println("Me diga o primeiro número: ");
		numero3 = ler.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO maior valor dos números é: " + numero1);
		}else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("\nO maior valor dos números é: " + numero2);
		}else {
			System.out.println("\nO maior valor dos números é: " + numero3);
		}
		
		//EXERCICIO 2
		
		
		     int[] array = new int[3]; 
		      
		     for (int i = 0; i < array.length; i++) { 
		          Scanner values = new Scanner(System.in);    
		           System.out.println("Digite um valor: ");
		          
		          array[i] = values.nextInt();
		      }
		      
		      Arrays.sort(array);
		      System.out.println("Os números ordandos são: " + Arrays.toString(array));
		
		//EXERCICIO 3
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("\nCategoria Infantil - " + idade);
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("\nCategoria Juvenil - " + idade);
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("\nCategoria Adulto - " + idade);
		}else {
			System.out.println("Idade não correspondente ao programa!");
		} */
		
		
		//EXERCICIO 4
		
		double numero, aux, aux2;
		
		System.out.println("Digite um número: ");
		numero = ler.nextDouble();
		
		aux = (numero)%2;
		
		if(aux == 0.0) {
			aux2 = Math.sqrt(numero);
			System.out.println("\n O número informado é par e sua raiz quadrada é: " + aux2);
		}else {
			aux2 = Math.pow(numero,2);
			System.out.println("\n O número informado é ímpar e ele elevado ao quadrado é: " + aux2);
		}


		
		
		
		
		
		

	}

}
