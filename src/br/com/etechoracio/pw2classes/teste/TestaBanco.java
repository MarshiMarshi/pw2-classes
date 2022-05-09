package br.com.etechoracio.pw2classes.teste;

import br.com.etechoracio.pw2classes.model.Agencia;
import br.com.etechoracio.pw2classes.model.Banco;
import br.com.etechoracio.pw2classes.model.Conta;

public class TestaBanco {

	public static void main(String[] args) {
		
		Agencia agencia = new Agencia();
		
		agencia.num = 2;
		
		Conta conta = new Conta();
		
		conta.num = 50;
		conta.saldo = 10.99;
		conta.limite = 69;
		
		Banco banco = new Banco();
		
		banco.agencia = agencia;
		banco.conta = conta;
	}
}
