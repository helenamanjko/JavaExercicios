package PrimeirosCodigos;

import java.util.Scanner;

public class ExerciciosRepeticao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//EXERCICIO 1
		
		/*for(int i=1000; i<=1999 ; i++) {
			if(i%11==5) {
				System.out.println(i);
			}
		}
		
		//EXERCICIO 2
		int numero, numeroPar=0, numeroImpar=0;
		
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite um número");
			numero = ler.nextInt();
				if(numero%2==0){
					numeroPar++;
				}else {
					numeroImpar++;
				}	
		}
		System.out.println("O total de número pares digitados foi " + numeroPar +
				" e o de números ímpares foi "+numeroImpar);
		
		//EXERCICIO 3
				
		int idade=0, idadeAbaixo21=0, idadeMais50=0;
		
		while(idade<99) {
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();
			
				if(idade>0 && idade<21) {
					idadeAbaixo21++;
				}else if(idade>50) {
					idadeMais50++;
				}else {
					System.out.println("Idade não contabilizada, tente outra vez!");
				}
				
			}
		System.out.println("O número de idades informadas abaixo de 21 anos foi "+
				idadeAbaixo21 + " e o número de idades acima de 50 anos foi " +idadeMais50);
		
		//EXERCICIO 4
		
		int pessoas=0, idade, idadeMais40=0, idadeMenos18=0, outrosCalmos=0;
		int  mulheresNervosas=0, homensAgressivos=0, calmos=0, personalidade;
		char sexo;
		
		while(pessoas<=1) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			pessoas++;
			
			System.out.println("Digite sua orientação sexual(F, M ou O - outros): ");
			sexo= ler.next().charAt(0);
			
			System.out.println("Digite 1 - se for calmx;"
								+ " 2 - se for nervosx e"
								+ " 3 - se for agressivx");
			personalidade= ler.nextInt();
			
			if(personalidade ==1) {
				calmos++;
			}else if(sexo == 'F' && personalidade == 2 ){
				mulheresNervosas++;
			}else if(sexo == 'M' && personalidade == 3) {
				homensAgressivos++;
			}else if(sexo == 'O' && personalidade == 1) {
				outrosCalmos++;
			}else if(idade>40 && personalidade == 2) {
				idadeMais40++;
			}else if(idade<=18 && personalidade == 1) {
				idadeMenos18++;
			}
			
		}
		System.out.println("O número de pessoas calmas dessa pesquisa é de "+ calmos+
				", de mulheres nervosas é de "+ mulheresNervosas + ", o de homens "
				+ "agressivos é de "+homensAgressivos+" e o números de Outros calmxs é "+
				outrosCalmos +".\nO números de pessoas nervosas com mais de 40 anos é "+
				idadeMais40 + " e o de pessoas calmas com menos de 18 anos é "+idadeMenos18);
		
		//EXERCICIO 5
		
		int numero, soma=0;
		
		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			soma=soma+numero;
			
		}while(numero!=0);
		
		System.out.println("A soma dos números digitados é de "+soma);
	
		//EXERCICIO 6
		
		int numero, soma=0, contador=0;
		double media;
		do {
			System.out.println("Me diga um número: ");
			numero = ler.nextInt();
				if(numero%3==0){
					contador++;
					soma = soma + numero; 
				}
			
				}while(numero != 0);
	
		media = soma/(contador-1);
		System.out.println("A média dos números múltiplos de 3 é "+media);*/
	}

}
