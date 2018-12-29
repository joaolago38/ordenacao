package br.com.ordenacao;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1l);
		pessoa.setNome("joao");
		System.out.println("id : " + pessoa.getId());
		System.out.println("nome : " + pessoa.getNome());

	}

}
