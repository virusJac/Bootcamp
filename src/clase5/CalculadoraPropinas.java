package clase5;

/*
    @author VirusJac 
    @version 1
    
*/

public class CalculadoraPropinas {
    private double totalCuenta, porcentajePropina, montoPropina;

    public CalculadoraPropinas(double totalCuenta, double porcentajePropina) {
        this.totalCuenta = totalCuenta;
        this.porcentajePropina = porcentajePropina;
        montoPropina=this.totalCuenta*(this.porcentajePropina/100);
    }

    public double getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(double totalCuenta) {
        this.totalCuenta = totalCuenta;
    }

    public double getPorcentajePropina() {
        return porcentajePropina;
    }

    public void setPorcentajePropina(double porcentajePropina) {
        this.porcentajePropina = porcentajePropina;
    }

    public double getMontoPropina() {
        return montoPropina;
    }
    
}
