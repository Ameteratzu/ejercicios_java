package EstructuraCondicionalCase02;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int tipo,edad,cantidad;
    double  precio=0,costo,aumento=0,iTt;
        System.out.println("INGRESE EL NUMERO DE PACIENTES: ");
        tipo = sc.nextInt();
        System.out.println("INGRESE LOS DIAS INTERNADOS EN EL HOSPITAL :");
        cantidad = sc.nextInt();
        System.out.println("ESCOJA SU EDAD?:");
        System.out.println("1)1-13 AÑOS");
        System.out.println("2)14-22 AÑOS");
        System.out.println("3)MÁS DE 22 AÑOS");
        edad = sc.nextInt();
        switch(tipo){
            case 0: precio = 25.00; break; 
            case 1: precio = 16.00; break; 
            case 2: precio = 20.00; break; 
            case 3: precio = 32.00; break; 
        }
        costo = precio * cantidad;
        switch(edad){
            case 2: aumento = costo * 0.10;
                    System.out.println("COSTO ADICIONAL: S/" + aumento)
                    ; break;
            default : 
                    System.out.println("NO TIENE COSTO ADICIONAL");
        }   
        iTt = costo + aumento;
        System.out.println("EL PRECIO POR DIA ES: S/" + precio);
        System.out.println("EL COSTO QUE USTED REPRESENTA COMO CLIENTE ES: S/" + iTt);
    }       
}
