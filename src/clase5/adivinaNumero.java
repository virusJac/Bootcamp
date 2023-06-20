package clase5;

/*
    @author VirusJac 
    @version 1
    
*/

import java.util.Random;

public class adivinaNumero {

    private Random numeroAleatorio;
    private int auxAleatorio;
    private int intentos;

    public adivinaNumero() {
        numeroAleatorio = new Random();
        auxAleatorio=numeroAleatorio.nextInt(1, 101);
        intentos = 0;
    }

    public String adivinarNumero(int numero) {
        intentos++;
        if (numero==auxAleatorio) {
            return "¡Has adivinado el numero en " + intentos + " intentos!";
        }else if (numero<auxAleatorio){
            return "El numero es mayor que " + numero + " .";
        }else{
            return "El numero es menor que " + numero + " .";
        }
        
    }
}
