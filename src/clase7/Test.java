package clase7;

public class Test {
    public static void main(String[] args) {
        Arreglo test = new Arreglo();
        test.ingresarNumeros(); //Sol: Ejercicio 1 --- Ingresar numeros
        test.mostrarNumeros();  //Sol: Ejercicio 1 --- Mostrar los numeros
        System.out.println("El numero mayor es: " + test.numeroMayor()); //Sol: Ejercicio 2 Numero Mayor
        System.out.println("El numero menor es: " + test.numeroMenor()); //Sol: Ejercicio 2 Numero Menor
        System.out.println("El promedio es: " + test.promedio()); // Sol: Ejercicio 3 Promedio
    }
}