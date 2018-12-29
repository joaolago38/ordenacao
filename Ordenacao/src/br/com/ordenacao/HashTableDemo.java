package br.com.ordenacao;

import java.util.Arrays;
import java.util.Collections;

public class HashTableDemo {

	public static void main(String[] args) {
		String company[] = { "yahoo", "vodafone", "samsung" };
		System.out.println("Exemplo de Ordenacao crescente em java");
		System.out.println("Array de string ordenadas");
		Arrays.sort(company);
		companiePrint(company);		
		System.out.println("Exemplo de ordenacao decrescente em java");
		Arrays.sort(company,Collections.reverseOrder());
		System.out.println("Array de String ordenado em ordem decrescente");
		companiePrint(company);
		
		// classificando parte de um array
		
		int [] numeros = {1,3,5,4,8,9,10};
		Arrays.sort(numeros,0,3);
		for(int valores: numeros) {
			System.out.println(valores);
		}
		

	}

	public static void companiePrint(String[] companies) {
		for (String company : companies) {
			System.out.println(company);
		}
	}

}
