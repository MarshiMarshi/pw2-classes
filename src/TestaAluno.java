import java.time.LocalDate;

public class TestaAluno {
	
	public static void main(String[] args) {
		
		Turma turma = new Turma();
		
		turma.periodo = "Tarde";
		turma.sigla = "2B";
		turma.tipo = TipoTurma.ENSINO_MEDIO;
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Rodrigo";
		aluno.rg = "12345678";
		aluno.dtNascimento = LocalDate.of(2005, 4, 27);
		aluno.turma = turma;
		
		System.out.println(aluno.nome);
		System.out.println(aluno.rg);
		System.out.println(aluno.dtNascimento);
		System.out.println(aluno.turma.periodo);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "Savriera";
		aluno2.rg = "88888888";
		aluno2.dtNascimento = LocalDate.of(2004, 9, 14);
		
		System.out.println("\n" + aluno2.nome);
		System.out.println(aluno2.rg);
		System.out.println(aluno2.dtNascimento);
	}
}
