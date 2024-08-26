
package programas;
import java.util.Scanner;
import java.lang.Math;
public class Programa02 {
    public static void main(String[] args){
        //Declarar variables
        double radio,acirculo;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar el radio del círculo:");
        radio=lectura.nextDouble();
        //Proceso de datos
        acirculo=Math.PI*Math.pow(radio, 2);
        //Salida de datos
        System.out.println("El área del círculo es:"+acirculo);
    }
    
}
