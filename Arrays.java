package SegundoCodigo;

import java.util.Scanner;

public class Arrays {
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
		
			//EXERCICIO 1
			
			/*int[] arrayVetor = new int[6];
			int soma;
			
			//a
			arrayVetor[0] = 1;
			arrayVetor[1] = 0;
			arrayVetor[2] = 5;
			arrayVetor[3] = -2;
			arrayVetor[4] = -5;
			arrayVetor[5] = 7;
			
			//b
			soma = arrayVetor[0]+arrayVetor[1]+arrayVetor[5];
			System.out.println("O valor da soma das posições 0, 1 e 5 do vetor é: "+soma);
			
			//c
			arrayVetor[4]=100;
			System.out.println("Alteração do valor da posição 4 para: "+arrayVetor[4]);
			
			//d
			System.out.println("=======Valores do Vetor========");
			for(int i=0; i<arrayVetor.length; i++) {
				System.out.println(arrayVetor[i]);
			}System.out.println();
			
			
			//EXERCICIO 2
			
			int[] soma  = new int[6];
			int[] pares  = new int[6];
			int[] impar = new int[6];
			int i,  somaPares=0, auxImpar=0;
			
			System.out.println("Digite os números: ");
			
			for(i= 0; i<soma.length; i++) { //entrada de dados
				soma[i] = ler.nextInt();
				}
			
			System.out.println("==pares==");
			
			for(i= 0; i<soma.length; i++) {   //pares
					if(soma[i]%2==0){
					pares[i] = soma[i];
					System.out.println(pares[i]);
					somaPares = somaPares + pares[i];
					}
			} 
			System.out.println("O total somado dos números pares é de : " +somaPares);
				
			
			System.out.println("==ímpares==");
			
			for(i= 0; i<soma.length; i++) {   //ímpar
					if(soma[i]%2!=0){
					auxImpar++;
					impar[i] = soma[i];
					System.out.println(impar[i]);
					}
			} 
			System.out.println("O total de números ímpares digitados é de : " +auxImpar);
			
			
			//EXERCICIO 3
			
			
			int[][] valores = new int[3][3];
			int i=0;
			
			valores[0][0]=10;
			valores[0][1]=11;
			valores[0][2]=40;
			
			valores[1][0]=50;
			valores[1][1]=25;
			valores[1][2]=7;
			
			valores[2][0]=6;
			valores[2][1]=0;
			valores[2][2]=15;
			
			for(int l=0; l<valores.length; l++) {
				for(int c=0; c<valores[l].length; c++) {
					if(valores[l][c]>10) {
						i++;
					}
				}
				
			}System.out.println("São "+i+" os valores maiores que 10 dentro do vetor.");
			
			//EXERCICIO 4
			
			int[][] a = new int[2][2];
			int[][] b = new int[2][2];
			int[][] c = new int[2][2];
			int escolha, i, j;
			char constante;
			
			a[0][0]=10;
			a[0][1]=5;
			
			a[1][0]=50;
			a[1][1]=25;
		//----------------	
			b[0][0]=40;
			b[0][1]=30;
			
			b[1][0]=10;
			b[1][1]=70;
			
			
			System.out.println("Digite 1 - somar as duas matrizes; \n"
					+ "2 - subtrair a primeira matriz da segunda; \n"
					+ "3 - adicionar uma constante as duas matrizes;\n"
					+ "4 - imprimir as matrizes");
			escolha = ler.nextInt();					
			
			if(escolha == 1) {
				System.out.println("Soma das matrizes A e B");
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
					}
				}
			} else if(escolha == 2) {
				System.out.println("Subtração da matriz A da matriz B");
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
				c[i][j]=b[i][j]-a[i][j];
				System.out.println(c[i][j]);
					}
				}
				
			} else if(escolha == 3) {
				
				System.out.println("Adicione uma constante aos valores das duas matrizes");
				System.out.println("Digite o valor: ");
				constante = ler.next().charAt(0);
				
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						System.out.println(a[i][j]+" "+constante);
						}
					}System.out.println();
					
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						System.out.println(b[i][j]+" "+constante);
						}
					}System.out.println();
				
								
			} else if(escolha == 4) {
				System.out.println("==== Impressão da matriz A ====");
				
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
				System.out.println(a[i][j]);
				
					} 
				}System.out.println("==== Impressão da matriz B ====");
					
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
				System.out.println(b[i][j]);
				}
				
			}
		}*/
	}
}