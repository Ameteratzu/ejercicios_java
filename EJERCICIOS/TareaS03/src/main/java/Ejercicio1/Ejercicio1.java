
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int docenas; 
        double importe,precio,des=0,pf=0,obsequio=0;
        System.out.println("===========================");
        System.out.println("          BIENVENIDO       ");
        System.out.println("===========================");
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO :");
        precio = sc.nextDouble();
        System.out.println("INGRESE LAS DOCENAS QUE DESEA COMPRAR DE ESTE PRODUCTO:");
        docenas = sc.nextInt();
        importe = precio * docenas;
        if (docenas>=10){
            des = importe * 0.15;
                pf = importe - des;
        } else if (docenas<10){
            des = importe * 0.11;
            pf = importe - des;
        }
        
        if (pf>=200){
            obsequio = 2 * docenas;}
        else if (pf<200){
            System.out.println("NO HAY OBSEQUIOS :(");}
      
        System.out.println("EL PRECIO ES: S/" + precio);
        System.out.println("LAS DOCENAS SON: " + docenas);
        System.out.println("EL IMPORTE ES: S/" + importe);
        System.out.println("EL DESCUENTO ES: S/" + des);
        System.out.println("EL IMPORTE A PAGAR ES: S/" + pf);
        System.out.println("EL OBSEQUIO ES: " + obsequio + " LAPICEROS");
        
    }
}