
package Ejercicio3;
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double impven,suelbas,comi,bonif,suelbru=0,desc,suelnet=0;
        int hijos;
        System.out.println("===========================");
        System.out.println("     INGRESA TU SUELDO     ");
        impven = sc.nextDouble();
        System.out.println("     INGRESA CUANTOS HIJOS TIENES:    ");
        hijos = sc.nextInt();
        suelbas = 600;
        if (impven > 15000 )
            comi = 0.07 * impven;
            else   {
            comi = 0.05 * impven;
            }
        if  (hijos < 5 ){
            bonif = 25 * hijos;}
        else    {
            bonif = 22 * hijos;
        suelbru = suelbas + comi + bonif;}
        if (suelbru > 3500 ){
            desc = 0.15 * suelbru;
            }
        else {
            desc = 0.11 * suelbru;
        suelnet = suelbru - desc;}
            
        System.out.println("SUELDO BASICO: S/. "+ suelbas + " n") ;
        System.out.println("COMISION     : S/. "+ comi + " n") ;
        System.out.println("BONIFICACION : S/. "+ bonif + " n") ;
        System.out.println("SUELDO BRUTO : S/. "+ suelbru + " n") ;
        System.out.println("DESCUENTO    : S/. "+ desc + " n") ;
        System.out.println("SUELDO NETO  : S/. "+ suelnet + " n") ;
    }
}
