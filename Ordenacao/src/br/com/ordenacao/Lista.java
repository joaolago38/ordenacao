package br.com.ordenacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> pessoa = new ArrayList();
		pessoa.add(" joao     - numero 1 ");
		pessoa.add(" ze maria - numero 2 ");
		pessoa.add(" ana      - numero 3 ");

		// percorrendo o a lista
		System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
		int n = pessoa.size();
		int i;
		for (i = 0; i < n; i++) {
			System.out.printf("  %s\n  " , pessoa.get(i));
		}

	}

}
