package dac.oo.exemplosbasicos.trab1;

import java.util.List;

public class ContaCorrente {

	private String numero;
	private double saldo;
	/**
	 * Conta pode ser especial convencional
	 */
	private boolean isEspecial;
	
	/**
	 * Status
	 */
	private boolean isAtivo; 
	
	private List<Movimentacao> movimentacoes;
	
	private final Usuario usuario;

	public ContaCorrente(Usuario usuarioParametro) {

		usuario = usuarioParametro;
	}

	/**
	 * Adiciona movimentacao a minha conta corrente 
	 * @param movimentacao
	 */
	public void addMovimentacao(Movimentacao movimentacao) {
		movimentacoes.add(movimentacao);
		saldo += movimentacao.getValorMovimentado();
	}



	public String toString(){
		return "Valor "+saldo;
	}










	public static void main(String[] args) {



		Usuario aline = new PF();
		aline.setNome("Aline Araujo de Souza");
		aline.setSexo('F');

		ContaCorrente contaAline
				= new ContaCorrente(aline);

		Movimentacao deposito
				= new Movimentacao(10000.00);

		contaAline.addMovimentacao(deposito);


		System.out.println(contaAline);
	}




}
