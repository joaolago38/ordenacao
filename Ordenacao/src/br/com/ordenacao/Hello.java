package br.com.ordenacao;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		int[] vetorUm = { 2, 3, 1, 7, 9, 8, 10, 6, 5 };
		System.out.println("Atual:");
		for (int valor : vetorUm) {
			System.out.println(valor);
		}
		Arrays.sort(vetorUm);
		System.out.println("Ordenado:");
		for (int valor : vetorUm) {
			System.out.println(valor);
		}

	}

}
