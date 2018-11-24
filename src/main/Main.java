package main;

import java.util.Locale;
import java.util.Scanner;
import hotel.Cadastro;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cadastro[] vect = new Cadastro[10];		
		
		System.out.println("Bem vindo!");
		System.out.print("Quantos quartos serão alugados? ");
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ": ");
			System.out.println();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mai: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Cadastro(name, email);
		}
		
		System.out.println();		
		System.out.println("Quartos ocupados: ");		
		for (int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
