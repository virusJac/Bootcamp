package clase7;

import java.util.Scanner;

/*
 * 1.- Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
 * 
 * 2.- Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
 * 
 * 3.- Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5,
 *     ya que el usuario agregó 5 números.
 * 
 * @author Jarol Aviles (VirusJac) @version 1.0
 */

public class Arreglo {
    int [] numeros = new int[5];

    public Arreglo() {} // constructor vacio 

    public void ingresarNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese sus números");
        for(int i =0; i < numeros.length; i++){
            numeros[i]=teclado.nextInt();
        }
        teclado.close();
    }

    public void mostrarNumeros() {
        System.out.println("Los numeros ingresados son: ");
        for (int i = 0; i<numeros.length;i++){
            System.out.print(numeros[i]);
            System.out.print(" ");
        }
        System.out.println();
       }

    public int numeroMayor(){
        int numMayor = numeros[0];
        for (int i : numeros) {
            if(i > numMayor){
                numMayor = i;
            }
        }
        return numMayor;
    }       

    public int numeroMenor(){
        int numMenor = numeros[0];
        for (int i : numeros) {
            if(i < numMenor){
                numMenor = i;
            }
        }
        return numMenor;
    }

    public double promedio(){
        double suma = 0;
        for (int i : numeros) {
            suma += i;
        }
        double promedio= suma/numeros.length;
        return promedio ;
    }
}

