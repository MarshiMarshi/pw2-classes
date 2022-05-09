package br.com.etechoracio.pw2classes.teste;

import br.com.etechoracio.pw2classes.model.Endereco;
import br.com.etechoracio.pw2classes.model.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		
		endereco.logradouro = "Não sei";
		endereco.num = 432;
		endereco.bairro = "Bituca";
		endereco.cidade = "São Paulo";
		endereco.estado = "SP";
		
		Funcionario fun = new Funcionario();
		
		fun.cargo = "Professor";
		fun.salario = 2500.30;
		fun.endereco = endereco;
		
		System.out.println(fun.cargo);
		System.out.println(fun.salario);
		System.out.println(fun.endereco.cidade);
		
		Funcionario fun2 = new Funcionario();
		
		fun2.cargo = "Diretor";
		fun2.salario = 3500.69;
		
		System.out.println("\n" + fun2.cargo);
		System.out.println(fun2.salario);
	}
}
