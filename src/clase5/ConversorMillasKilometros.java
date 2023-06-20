package clase5;

/*
    @author VirusJac 
    @version 1
    
*/

public class ConversorMillasKilometros {
    private double distaciaMillas, distanciaKilometros;

    public ConversorMillasKilometros(double distaciaMillas) {
        this.distaciaMillas = distaciaMillas;
        distanciaKilometros = this.distaciaMillas*1.60934;
    }

    public double getDistaciaMillas() {
        return distaciaMillas;
    }

    public void setDistaciaMillas(double distaciaMillas) {
        this.distaciaMillas = distaciaMillas;
    }

    public double getDistanciaKilometros() {
        return distanciaKilometros;
    }

    @Override
    public String toString() {
        return "ConversorMillasKilometros{" + "distaciaMillas=" + distaciaMillas + ", distanciaKilometros=" + distanciaKilometros + '}';
    }
    
    
}
