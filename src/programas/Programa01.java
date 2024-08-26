
package programas;

/**
 *
 * @author jomi2
 */
import java.util.Scanner;
import java.lang.Math;
public class Programa01 {
    //método de la clase
    public static void main(String[] args){
        //declarar variables
        int num1,num2,maximo,minimo;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar número 1:");
        num1=lectura.nextInt();
        System.out.print("Ingresar número 2:");
        num2=lectura.nextInt();
        //proceso de datos
        maximo=Math.max(num1, num2);
        minimo=Math.min(num1, num2);
        //Salida de datos
        System.out.println("El máximo número es:"+maximo);
        System.out.println("El mínimo número es:"+minimo);
    }
}
