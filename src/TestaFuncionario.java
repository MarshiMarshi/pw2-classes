
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario();
		
		fun.cargo = "Professor";
		fun.salario = 2500.30;
		
		System.out.println(fun.cargo);
		System.out.println(fun.salario);
		
		Funcionario fun2 = new Funcionario();
		
		fun2.cargo = "Diretor";
		fun2.salario = 3500.69;
		
		System.out.println("\n" + fun2.cargo);
		System.out.println(fun2.salario);
	}
}
