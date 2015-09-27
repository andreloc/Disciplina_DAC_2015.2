package dac.designpattern.singleton;

import java.util.List;

import dac.oo.exemplosbasicos.trab1.ContaCorrente;

/**
 * Created by andrecampos on 9/9/15.
 */
public class SistemaDoBancoParaControlarContas {

    private static  SistemaDoBancoParaControlarContas minhaUnicaInstancia;
    private List<ContaCorrente> contasCadastradas; 

    private SistemaDoBancoParaControlarContas() {
    }

    public static SistemaDoBancoParaControlarContas getInstance(){
        if(minhaUnicaInstancia == null) {
            minhaUnicaInstancia = new SistemaDoBancoParaControlarContas();
        }
        return minhaUnicaInstancia;
    }

	public void addConta() {
		// TODO Auto-generated method stub
		
	}

}
