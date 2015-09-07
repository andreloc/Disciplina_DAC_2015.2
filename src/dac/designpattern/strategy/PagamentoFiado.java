/*
 * Os exemplos nesse pacote sao meramente ilustrativo e foram realizados em sala de aula visando 
 * exemplificar a utilizacao do design pattern strategy. 
 */
package dac.designpattern.strategy;

/**
 * Classe concreta de pagamento "fiado".
 */
public class PagamentoFiado implements IFormaDePagamentoStrategy {

	public void pendura(int valor) {
		// metodo especifico pendura, o qual contem a implementacao de pagamento fiado.  
	}

	@Override
	public void realizarPagamento(int valor) {
		// o metodo realizarPagamento obedece a interface IFormaDePagamentoStrategy
		// o metodo simplesmente chama o metodo interno pendura. 
		// Dessa forma, podemos notar que o pladrao strategy 
		pendura(valor);
		
	}

}
