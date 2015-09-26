package dac.designpattern.observer;

/**
 * Created by andrecampos on 9/23/15.
 */
public class SistemaDeControle {

    public static void main(String[] args) {

        SistemaDeAlarme alarme = new SistemaDeAlarme();

        Gerente allan = new Gerente();
        Gerente regis = new Gerente();


        Pedreiro andre = new Pedreiro();

        alarme.registrarFuncionario(allan);
        alarme.registrarFuncionario(regis);

        alarme.registrarFuncionario(andre);
        
        alarme.removerFuncionario(allan);


        // hora do almoco

        alarme.chamaTodoMundo();;

    }
}
