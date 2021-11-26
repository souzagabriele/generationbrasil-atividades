package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int i, idade, sexo, emocional, calmos = 0, mulherNervosa = 0, homemAgressivo = 0,
			outrosCalmos = 0, nervososMaiores40 = 0, calmosMenos18 = 0; i = 0;
			
		while (i <=150)
		{
			System.out.println("Entre com a sua idade: ");
			idade = scan.nextInt();
			
			System.out.println("Sexo: (1- Feminino; 2- Masculino 3- Outros): ");
			sexo = scan.nextInt();
			
			System.out.println("Emocional: (1- Calmo 2- Nervoso 3- Agressivo): ");
			emocional = scan.nextInt();
			
			if ( emocional == 1)
			{
				calmos++;
			}
			if ( sexo == 1 && emocional == 2)
			{
				mulherNervosa++;
			}
			if (sexo == 2 && emocional == 3)
			{
				homemAgressivo++;
			}
			if (sexo == 3 && emocional == 1)
			{
				outrosCalmos++;
			}
			if (idade >= 40 && emocional == 2)
			{
				nervososMaiores40++;
			}
			if (idade<=18 && emocional==1)
			{
				calmosMenos18++;
			}
			i++;
				
		}
		System.out.println("Pessoas calmas: "+ calmos +
				"\nMulheres nervosas: "+ mulherNervosa +
				"\nHomens agressivos: "+ homemAgressivo +
				"\nOutros calmos: "+ outrosCalmos +
				"\nNervosos com mais de 40: "+ nervososMaiores40 +
				"\nCalmos com menos de 18: "+ calmosMenos18);
		scan.close();
	}
	

	}
