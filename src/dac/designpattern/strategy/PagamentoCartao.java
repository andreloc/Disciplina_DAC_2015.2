/*
 * Os exemplos nesse pacote sao meramente ilustrativo e foram realizados em sala de aula visando 
 * exemplificar a utilizacao do design pattern strategy. 
 */
package dac.designpattern.strategy;

/**
 * Classe concreta de pagamento com cartao de credito.
 */
public class PagamentoCartao implements IFormaDePagamentoStrategy {

	public void realizarPagamento(int valor) {
		// ... codigo para realizacao do pagamento com cartao de credito aqui
	}

}
