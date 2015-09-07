package dac.oo.exemplosbasicos.produtos;

public class ProdutoEletronico implements IProduto {

	private IDBWrapper wrapper;
	private int preco;

	@Override
	public void setIDBWrapper(IDBWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	public void modificarPreco(int preco) {
		this.preco = preco;
		wrapper.salvar(this);
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public void setWrapper(IDBWrapper wrapper) {
		this.wrapper = wrapper;
	}
	
}
