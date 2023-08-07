
package EstructuraCondicionalCase03;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
     String nombre;
     int cantidad, tPane;
     double precio=0,mC,desc=0,pNeto;
        System.out.println("SU NOMBRE ES:");
        nombre = sc.nextLine();
        System.out.println("INGRESA LA MARCA DEL PANETON:");
        System.out.println("1)DONOFRIO");
        System.out.println("2)MOTTA");
        System.out.println("3)TODINNO");
        System.out.println("4)NAVAL");
        System.out.println("5)SANTA CLAUS");
        System.out.println("6)DOÑA PEPA");
        tPane = sc.nextInt();
        System.out.println("INGRESA LA CANTIDAD QUE DESEAS COMPRAR:");
        cantidad = sc.nextInt();
        switch(tPane){
            case 1: precio = 20; break;
            case 2: precio = 19; break;
            case 3: precio = 18; break;
            case 4: precio = 9; break;
            case 5: precio = 11; break;
            case 6: precio = 10; break;
        }
        mC = precio * cantidad;
        if(cantidad>20){
            desc = mC*0.1;
        }
        pNeto = mC - desc;
        System.out.println("HOLA "+nombre);
        System.out.println("EL PRECIO X UNIDAD ES: S/" + precio);
        System.out.println("EL MONTO DE COMPRA ES: S/" + mC);
        System.out.println("EL DESCUENTO ES: S/" + desc);
        System.out.println("EL MONTO NETO A PAGAR ES: S/" + pNeto);
    }
}
