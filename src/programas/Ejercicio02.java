/*
Escribe un programa que permita al usuario ingresar tres n�meros y determine el valor absoluto de cada uno.
Luego determine el mayor valor absoluto.
*/
package programas;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio02 {
    public static void main(String[] args){
        //Declarar variables
        double num1,num2,num3;
        int absNum1,absNum2,absNum3,maxAbs;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese el primer n�mero:");
        num1=lectura.nextDouble();
        System.out.print("Ingrese el segundo n�mero:");
        num2=lectura.nextDouble();
        System.out.print("Ingrese el tercer n�mero:");
        num3=lectura.nextDouble();
        //Proceso de datos
        absNum1=(int) Math.abs(num1);
        absNum2=(int) Math.abs(num2);
        absNum3=(int) Math.abs(num3);
        
        maxAbs=Math.max(absNum1,Math.max(absNum2, absNum3));
        //Salida de datos
        System.out.println("El valor absoluto del primer n�mero es: "+ absNum1);
        System.out.println("El valor absoluto del segundo n�mero es: "+ absNum2);
        System.out.println("El valor absoluto del tercer n�mero es: "+ absNum3);
        System.out.println("El valor absoluto m�ximo es: "+maxAbs);
    }
    
}