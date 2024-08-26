/*
Escribe un programa en Java que solicite al usuario el radio de un círculo y calcule tanto el área como la circunferencia del círculo.
*/
package programas;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio03 {
    public static void main(String[] args){
        //Declarar variables
        double radio,area,circunferencia;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese el radio del círculo:");
        radio=lectura.nextDouble();
        //Proceso de datos
        area=Math.PI*Math.pow(radio,2);
        circunferencia=2*Math.PI*radio;
        //Salida de datos
        System.out.println("El área del círculo es: "+ area);
        System.out.println("La circunferencia del círculo es: "+ circunferencia);
    }
    
}