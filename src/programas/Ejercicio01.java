/*
Escribe un programa en Java que permita al usuario ingresar dos n�meros y calcule la ra�z cuadrada de la suma de ambos n�meros.
 */
package programas;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio01 {
    public static void main(String[] args){
        //Declarar variables
        double num1,num2,suma,raizCuadrada;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese el primer n�mero:");
        num1=lectura.nextDouble();
        System.out.print("Ingrese el segundo n�mero:");
        num2=lectura.nextDouble();
        //Proceso de datos
        suma=num1+num2;
        raizCuadrada=Math.sqrt(suma);
        //Salida de datos
        System.out.println("La ra�z cuadrada de la suma es: "+ raizCuadrada);
    }
    
}