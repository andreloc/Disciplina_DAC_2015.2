package dac.designpattern.strategy;

/**
 * Simplesmente fazer uma validação básica 
 * e validar se o pagamento está ok 
 * e realizar o pagamento
 * @author andrecampos
 */
public class SistemaDePagamentoContext {

	private IFormaDePagamentoStrategy formaDePagamento;
	
	public SistemaDePagamentoContext(IFormaDePagamentoStrategy formaDePagamento) {
		super();
		this.formaDePagamento = formaDePagamento;
	}

	public void executarPagamento(int valor) { 
		formaDePagamento.realizarPagamento(valor);
	}
}
