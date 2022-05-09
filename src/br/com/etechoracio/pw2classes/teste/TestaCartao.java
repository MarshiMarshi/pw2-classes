package br.com.etechoracio.pw2classes.teste;
import java.time.LocalDate;

import br.com.etechoracio.pw2classes.enums.StatusClienteEnum;
import br.com.etechoracio.pw2classes.enums.TipoCartaoEnum;
import br.com.etechoracio.pw2classes.model.Cartao;
import br.com.etechoracio.pw2classes.model.Cliente;

public class TestaCartao {

	public static void main(String[] args) {
		
		Cliente clie = new Cliente();
		
		clie.nome = "Natanael";
		clie.cod = 3;
		clie.status = StatusClienteEnum.ATIVO;
		
		Cartao cartao = new Cartao();
		
		cartao.num = 123456789;
		cartao.dtValidade = LocalDate.of(2022, 06, 18);
		cartao.tipo = TipoCartaoEnum.CREDITO;
		cartao.cliente = clie;
	}
}
