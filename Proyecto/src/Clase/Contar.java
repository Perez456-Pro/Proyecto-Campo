package Clase;


public class Contar {
    private int cantidadPerros;

    public Contar() {
        cantidadPerros = 0;
    }

    public void ingresarPerro() {
        cantidadPerros++;
    }

    public boolean retirarPerro() {
        if (cantidadPerros > 0) {
            cantidadPerros--;
            return true; 
        }
        return false; 
    }
    

	public void reiniciar() {
		cantidadPerros = 0;
	}

    public int getCantidad() {
        return cantidadPerros;
    }
}
