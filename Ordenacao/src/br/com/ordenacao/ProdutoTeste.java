package br.com.ordenacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p = new Produto();
		p.setId(1);
		p.setNome("joao");

		p.setId(2);
		p.setNome("maria");

		p.setId(3);
		p.setNome("ana");

		List<Produto> list = new ArrayList<Produto>();
		list.add(p);
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(p));
		}

	}

}
