package dac.designpattern;

/**
 * 
 * Created by andrecampos on 9/16/15.
 */
public class Incremental {
	
	public static int count;
	
	private static Incremental minhaInstancia;
	
	private int numero;
	
    private Incremental() {
        numero = ++count;
    }

    public String toString() {
        return "Instancia " + numero;
    }

	public static Incremental getInstance() {
		if(minhaInstancia == null) {
			minhaInstancia = new Incremental();
		}
		return minhaInstancia;
	}

}
