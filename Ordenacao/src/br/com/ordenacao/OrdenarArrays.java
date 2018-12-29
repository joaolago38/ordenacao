package br.com.ordenacao;

import java.util.Arrays;
import java.util.Collections;

public class OrdenarArrays {

	public static void main(String[] args) {
		// ordem crescente
		String[] nomes = { "joao", "gustavo", "luiza", "jose", "Ana" };
		System.out.println("nome nao ordenados");
		for (String valores : nomes) {
			System.out.println(valores);
		}
		System.out.println("nome ordenados");
		Arrays.sort(nomes);
		for (String valores : nomes) {
			System.out.println(valores);
		}
		System.out.println("nome ordenados de forma decrescentea");
		Arrays.sort(nomes, Collections.reverseOrder());
		for (String valores : nomes) {
			System.out.println(valores);
		}
		System.out.println("=======Com numeros ==================");
		
		int numeros[] = { 20, 2, 8, 19, 100, 5, 1, 6, 13 };

		System.out.println("numeros nao ordenados");
		for (int valores : numeros) {
			System.out.println(valores);
		}
		Arrays.sort(numeros);
		
		System.out.println("numeros  ordenados");
		for (int valores : numeros) {
			System.out.println(valores);
		}
		
		System.out.println("numeros ordenados de forma decrescente");
		Arrays.sort(numeros);

	}

}
