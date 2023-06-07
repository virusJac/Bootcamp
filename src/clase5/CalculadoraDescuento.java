package clase5;

public class CalculadoraDescuento {
    private double precioOriginal, porcentajeDesc,precioFinal;

    public CalculadoraDescuento(double precioOriginal, double porcentajeDesc) {
        this.precioOriginal = precioOriginal;
        this.porcentajeDesc = porcentajeDesc;
        precioFinal= this.precioOriginal-(this.precioOriginal*this.porcentajeDesc/100); 
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public double getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(double porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
}
