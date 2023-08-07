
package Ejercicio4;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,e;
        String c="";
        System.out.println("BIENVENIDO");
        System.out.println("====================");
        System.out.println("Ingrese su sexo: ");
        System.out.println("1)Femenino");
        System.out.println("2)Masculino");
        s = sc.nextInt();
        System.out.println("Ingrese su edad: ");
        e = sc.nextInt();
        
        if(s == 1)
            if(e<23)
                c = "FA";
            else
                c = "FB";
        else if (s==2)
            if(e<25)
                c = "MA";
            else
                c = "MB";
        
        System.out.println("Su categoria es: " + c);
    }
}
