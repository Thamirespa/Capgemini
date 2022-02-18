/*Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

*/

package br.com.capgemini.teste;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String senha = sc.next();
		int tamanho = 0;
		int sub = 0; 
		boolean numero = false;
	    boolean maiuscula = false;
	    boolean minuscula = false;
	    boolean simbolo = false;
		
		
		if(senha.length() < 6) {
			tamanho = (int) senha.length();
			sub = 6 - tamanho;
			System.out.println(sub);
			
			for(int i =0; i< senha.length(); i++) {
	         if (i >= '0' && i <= '9') {
	             numero = true;
	             if(numero == false) {
	            	 System.out.println("Necessita de um número!");
	             }
	         } else if (i >= 'A' && i <= 'Z') {
	             maiuscula = true;
	             if(maiuscula == false) {
	            	 System.out.println("Necessita de uma letra maiuscula!");
	         } else if (i >= 'a' && i <= 'z') {
	             minuscula = true;
	             if(minuscula == false) {
	            	 System.out.println("Necessita de uma letra minuscula!");
	         } else {
	             simbolo = true;
	             if(simbolo == false) {
	            	 System.out.println("Necessita de um símbolo!");
	         }
	    }
	         }
	         }
	}
		}
}
}
