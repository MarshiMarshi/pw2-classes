import java.time.LocalDate;

public class TestaCartao {

	public static void main(String[] args) {
		
		Cliente clie = new Cliente();
		
		clie.nome = "Natanael";
		clie.cod = 3;
		clie.status = StatusCliente.ATIVO;
		
		Cartao cartao = new Cartao();
		
		cartao.num = 123456789;
		cartao.dtValidade = LocalDate.of(2022, 06, 18);
		cartao.tipo = TipoCartao.CREDITO;
		cartao.cliente = clie;
	}
}
