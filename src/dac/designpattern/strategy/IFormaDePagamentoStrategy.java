/*
 * Os exemplos nesse pacote são meramente ilustrativo e foram realizados em sala de aula visando 
 * exemplificar a materializacao do design pattern strategy. 
 */
package dac.designpattern.strategy;

/**
 * Exemplo simples realizado em sala de aula contendo uma interface para o padrao strategy.
 */
public interface IFormaDePagamentoStrategy {

	/**
	 * Metodo executado quando se deve realizar um pagamento
	 * @param valor
	 */
	public void realizarPagamento(int valor);
	
}
