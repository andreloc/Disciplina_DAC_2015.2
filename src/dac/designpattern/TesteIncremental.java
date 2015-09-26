package dac.designpattern;

/**
 * Created by andrecampos on 9/16/15.
 */
public class TesteIncremental {

	
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
//            Incremental instancia = Incremental.getInstance();
        	Incremental instancia = new Incremental();
            System.out.println(instancia);
        }

    }
}
