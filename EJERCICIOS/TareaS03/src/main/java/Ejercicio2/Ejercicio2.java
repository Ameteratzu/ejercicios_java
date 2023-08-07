
package Ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int turno,cant,obsequio=0;
    double precio=0,importe,des=0,pf;
        System.out.println("===========================");
        System.out.println("          BIENVENIDO       ");
        System.out.println("===========================");
        System.out.println("INGRESE EL TURNO:");
        System.out.println("1)MAÑANA = S/37.5");
        System.out.println("2)NOCHE = S/45");
        turno = sc.nextInt();
        System.out.println("Ingrese la cantidad de pasajes que desea comprar: ");
        cant = sc.nextInt();
        if(turno==1){
            precio = 37.5; 
        } else if(turno==2){
            precio = 45;
        }
        importe = precio * cant;  
        if(cant>=15){
            des = importe * 0.08;
        }else if(cant<15){
            des = importe * 0.05;
        }
        if(importe>200){
            obsequio = 2 * cant;}
        else if(importe<200){
            System.out.println("No hay obsequio:(");}
        pf = importe - des;
        
        System.out.println("El precio es: S/" + precio );
        System.out.println("La cantidad de pasajes es: " + cant + " unidades");
        System.out.println("El importe es: S/" + importe);
        System.out.println("El descuento es: S/" + des);
        System.out.println("El importe final a pagar es: S/" + pf);
        System.out.println("La cantidad de caramelos de obsequio es: " + obsequio + " unidades");

    }
}