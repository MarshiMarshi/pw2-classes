
public class TestaTurma {

	public static void main(String[] args) {
		
		Turma turma = new Turma();
		
		turma.periodo = "Tarde";
		turma.sigla = "2B";
		turma.tipo = TipoTurma.ENSINO_MEDIO;
		
		System.out.println(turma.periodo);
		System.out.println(turma.sigla);
		System.out.println(turma.tipo);
		
		Turma turma2 = new Turma();
		
		turma2.periodo = "Manhã";
		turma2.sigla = "8A";
		turma2.tipo = TipoTurma.ENSINO_FUNDAMENTAL;
		
		System.out.println("\n" + turma2.periodo);
		System.out.println(turma2.sigla);
		System.out.println(turma2.tipo);
	}
}

