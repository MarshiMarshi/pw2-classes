package br.com.etechoracio.pw2classes.model;
import java.time.LocalDate;

import br.com.etechoracio.pw2classes.enums.TipoCartaoEnum;

public class Cartao {

	public int num;
	public LocalDate dtValidade;
	public TipoCartaoEnum tipo;
	public Cliente cliente;
}
