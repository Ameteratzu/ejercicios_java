
package EstructuraCondicionalCase01;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String grat;
    double gratif=0,precio=0,descAfp,iTa,iGrat;
    int trabajo,mes,años;
        System.out.println("ESCOJA SU CONDICION DE TRABAJO:");
        System.out.println("1)OBRERO CONTRATADO");
        System.out.println("2)OBRERO ESTABLE   ");
        trabajo = sc.nextInt();
        System.out.println("INGRESE LAS CANTIDADES DE MESES TRABAJADOS: ");
        mes = sc.nextInt();
        System.out.println("INGRESE LOS AÑOS TRABAJADOS:");
        años = sc.nextInt();
        switch(trabajo){
            case 1 -> precio = 1200;
            case 2 -> precio = 1000;
        }
        switch(mes){
        case 1,2,3,4,5,6,8,9,10,11: ; break;
        case 7,12: grat = "MES DE GRATIFICACION"; 
        System.out.println(grat);
        switch(años){
        case 0,1,2,3,4,5: gratif = precio * 0.6; break;
        case 6,7,8,9,10: gratif = precio * 0.8; break;
        default: gratif = precio * 1;} 
        }
        iGrat = precio + gratif;
        descAfp = iGrat * 0.09;
        iTa = iGrat - descAfp;
        System.out.println("EL SALDO ES: S/" + precio);
        System.out.println("GRATIFICACION: S/" + gratif);
        System.out.println("SALDO + GRATIFICACION: S/"+iGrat);
        System.out.println("DESCUENTO AFP: S/" + descAfp);
        System.out.println("SU SUELDO ES: S/" + iTa);
    }
}
