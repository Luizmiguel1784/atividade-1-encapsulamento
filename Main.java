package aula3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		Pessoa pe = new Pessoa("nome", 0);
		
		System.out.printf("Qual seu nome \nQual sua idade \n");
		pe.setNome(sc.next());
		pe.setIdade(sc.nextInt());;
		
		if(pe.getIdade() < 0) {
			System.out.println("Essa idade não é valida");
		}else {
			System.out.println("Sua idade é valida");
		}
		
		
		sc.close();
	}

}

