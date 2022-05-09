package br.com.etechoracio.pw2classes.teste;

import br.com.etechoracio.pw2classes.enums.TipoTurmaEnum;
import br.com.etechoracio.pw2classes.model.Turma;

public class TestaTurma {

	public static void main(String[] args) {
		
		Turma turma = new Turma();
		
		turma.periodo = "Tarde";
		turma.sigla = "2B";
		turma.tipo = TipoTurmaEnum.ENSINO_MEDIO;
		
		System.out.println(turma.periodo);
		System.out.println(turma.sigla);
		System.out.println(turma.tipo);
		
		Turma turma2 = new Turma();
		
		turma2.periodo = "Manhã";
		turma2.sigla = "8A";
		turma2.tipo = TipoTurmaEnum.ENSINO_FUNDAMENTAL;
		
		System.out.println("\n" + turma2.periodo);
		System.out.println(turma2.sigla);
		System.out.println(turma2.tipo);
	}
}

