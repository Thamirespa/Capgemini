package br.com.capgemini.teste;

import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String anagrama = sc.next();
		int count = 0, count1 = 0, soma = 0;

			
			String[] separacao = anagrama.split(" "); 
			for(int i =0; i< separacao.length; i++) {
				String carac = separacao[i];
				 if(carac == separacao[i]) {
						count++;
				}
			}
			for(int j = separacao.length; j > separacao.length; j--) {
					String carac2 = separacao[j];
					if(carac2 == separacao[j]) {
					 count1++;
					}
	}
			  soma = count + count1;
			  System.out.println(soma);
			
		
			}
	}


	


