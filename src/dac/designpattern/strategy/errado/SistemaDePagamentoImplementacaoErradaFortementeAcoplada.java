/*
 * Os exemplos nesse pacote sao meramente ilustrativo e foram realizados em sala de aula visando 
 * exemplificar a utilizacao do design pattern strategy. 
 */
package dac.designpattern.strategy.errado;

import dac.designpattern.strategy.SistemaDePagamentoContext;

/**
 * O codigo abaixo exemplifica uma implementacao errada fortemente acoplada, a qual pode 
 * ser refeita utilizando-se o padrao Strategy para aumentar reutilizacao e a coesao de codigo. 
 * O exemplo no codigo {@link SistemaDePagamentoContext} 
 * @author andrecampos
 */
public class SistemaDePagamentoImplementacaoErradaFortementeAcoplada {

	public void executarPagamento(String formaDePagamento, int valor) { 
		// Note que a classe esta' fortemente acoplada as implementacoes especificas. 
		if(formaDePagamento.equals("cheque")) { 
			new PagamentoEmCheque().realizarPagamento(valor);
		} else if(formaDePagamento.equals("cartao")) { 
			new PagamentoCartao().realizarPagamento(valor);
		} else if(formaDePagamento.equals("fiado")) {
			// o pagamento fiado contem um metodo especifico que sequer tem o mesmo nome em comum 
			// "realizarPagamento" como nas outras classes
			new PagamentoFiado().pendura(valor); 
		}
		
	}
}
