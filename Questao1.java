/*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * 
  e espa�os. A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o 
  deve conter nenhum espa�o.
*/

package br.com.capgemini.teste;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	String carac = "";

	for(int i = 1; i<= n; i++) {
		carac += "*";
		System.out.println(carac);
	}

	}

}
