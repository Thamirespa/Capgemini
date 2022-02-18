/*D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
Possui no m�nimo 6 caracteres.
Cont�m no m�nimo 1 digito.
Cont�m no m�nimo 1 letra em min�sculo.
Cont�m no m�nimo 1 letra em mai�sculo.
Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte. 
Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

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
	            	 System.out.println("Necessita de um n�mero!");
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
	            	 System.out.println("Necessita de um s�mbolo!");
	         }
	    }
	         }
	         }
	}
		}
}
}
