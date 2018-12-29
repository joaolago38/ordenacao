package br.com.ordenacao;

import java.util.Arrays;

public class ArrayOrdenado {

	public static void main(String[] args) {
		int [] listaNumero= {9,3,10,15,12,11,4,1,2};
		Arrays.sort(listaNumero);
		for(int valores: listaNumero){
			System.out.println(valores);;
		}

	}

}
