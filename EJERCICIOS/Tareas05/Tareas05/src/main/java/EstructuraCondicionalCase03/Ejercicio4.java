
package EstructuraCondicionalCase03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int dist;
    String clasif=null;
        System.out.println("INGRESA LA CANTIDAD RECORRIDA:");
        System.out.println("1) 100M");
        System.out.println("2) 1500M");
        System.out.println("3) 3000M");
        System.out.println("4) 20kms");
        System.out.println("5) 40kms");
        dist = sc.nextInt();
        
        switch(dist){
            case 1 -> clasif = "CORTA";
            case 2 -> clasif = "MILLA";
            case 3 -> clasif = "3000 METROS";
            case 4 -> clasif = "SEMI FONDO";
            case 5 -> clasif = "FONDISTA";
        }
        System.out.println("SU CLASIFICACION ES: " + clasif);
        
    }
 
}
