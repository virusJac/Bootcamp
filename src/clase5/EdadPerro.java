package clase5;

public class EdadPerro {
        private int edadIngresado;
        private int edadEnperro;
        
    public EdadPerro(int edadIngresado) {
        this.edadIngresado = edadIngresado;
        this.edadEnperro = this.edadIngresado*7;
    }

    public int getEdadIngresado() {
        return edadIngresado;
    }

    public void setEdadIngresado(int edadIngresado) {
        this.edadIngresado = edadIngresado;
    }

    public int getEdadEnperro() {
        return edadEnperro;
    }

    @Override
    public String toString() {
        return "EdadPerro{" + "edadIngresado=" + edadIngresado + ", edadEnperro=" + edadEnperro + '}';
    }

    
}
