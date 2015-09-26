package dac.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrecampos on 9/23/15.
 */
public class SistemaDeAlarme {

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public void registrarFuncionario(Funcionario funcionario) {
    	funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
    	funcionarios.remove(funcionario);
    }

    public void chamaTodoMundo(){

        for(int i = 0; i<funcionarios.size(); i++) {
            funcionarios.get(i).horarioDeAlmoco();
        }

    }

}
