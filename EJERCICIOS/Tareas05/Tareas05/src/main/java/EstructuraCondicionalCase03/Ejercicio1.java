package EstructuraCondicionalCase03;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int edi,tC;
    double compra,desc=0,iTo;
    String tE="";
        System.out.println("INGRESE EL IMPORTE DE COMPRA:");
        compra = sc.nextDouble();
        System.out.println("INGRESE LA OPCION DE EDITORIAL: ");
        edi = sc.nextInt();
        System.out.println("INGRESE EL TIPO DE COMPRADOR: ");
        System.out.println("1)ESTUDIANTE");
        System.out.println("2)PUBLICO EN GENERAL");
        tC = sc.nextInt();
      
        switch(edi){
            case 1: 
            switch(tC){
            case 1 -> desc = compra * 0.25;
            case 2 -> desc = compra * 0.1;}
            tE = "SAN MARCOS"; break;
              
            case 2: 
            switch(tC){
            case 1 -> desc = compra * 0.30;
            case 2 -> desc = compra * 0.13;}
            tE = "COVEÑAS";break;
              
            case 3: 
            switch(tC){
            case 1 -> desc = compra * 0.35;
            case 2 -> desc = compra * 0.16;}
            tE = "OTROS"; break;
         }
        iTo = compra - desc;
        System.out.println("LA EDITORIAL ES: " + tE);
        System.out.println("EL TIPO DE COMPRADOR ES: " + tC );
        System.out.println("EL MONTO DE LA COMPRA ES: S/" + compra );
        System.out.println("EL DESCUENTO ES: S/" + desc);
        System.out.println("EL TOTAL A PAGAR ES: S/" + iTo);
    }
}
