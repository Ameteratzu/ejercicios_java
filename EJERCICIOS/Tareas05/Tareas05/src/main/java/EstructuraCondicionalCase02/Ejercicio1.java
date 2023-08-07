package EstructuraCondicionalCase02;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String arti;
    int clave;
    double precio,desc,pf;
            System.out.println("INGRESE EL NOMBRE DEL OBJETO:");
        arti = sc.nextLine();
        System.out.println("INGRESE EL DIGITO DE LA CLAVE:");
        clave = sc.nextInt();
        System.out.println("INGRSE EL PRECIO DEL OBJETO:");
        precio = sc.nextDouble();
        
        switch(clave){
            case 1: desc = precio * 0; break;
            case 2: desc = precio * 0.2; break;
            case 3: desc = precio * 0.3; break;
            default: desc = precio * 0.01; break;
        }
        pf = precio - desc;
        System.out.println("EL NOMBRE DEL ARTICULO ES: " + arti);
        System.out.println("LA CLAVE ES: " + clave);
        System.out.println("EL PRECIO ORIGINAL ES: S/" + precio);
        System.out.println("EL PRECIO CON DESCUENTO ES: S/"+ pf);
    }
}
