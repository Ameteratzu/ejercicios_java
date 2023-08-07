package EstructuraCondicionalCase02;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int cat,edad;
    double desc=0,monto,iT;
    String categoria="";
        System.out.println("INGRESE EL COSTO DE ENTRADA:");
        monto = sc.nextDouble();
        System.out.println("INGRESE SU CATEGORIA:");
        cat = sc.nextInt();
        System.out.println("INGRESE SU EDAD:");
        edad = sc.nextInt();
        switch(cat){
            case 1 -> categoria = "1"; 
            case 2 -> categoria = "2";
            case 3 -> categoria = "3";
            case 4 -> categoria = "4";
            case 6 -> categoria = "6";    
        }
        if(edad>=1 && edad<=4){
            System.out.println("NO PUEDE INGRESAR"); 
        }else if(edad>=5 && edad<=14){
            desc = monto * 0.35;
        }  if(edad>=15 && edad<=19){
            desc = monto * 0.25;
        }  if(edad>=20 && edad<=45){
            desc = monto * 0.1;
        }  if(edad>=46 && edad<=65){
            desc = monto * 0.25;
        }  if(edad>=66){
            desc = monto * 0.35;
        }
        iT = monto - desc;
        System.out.println("SU CATEGORIA ES: " + categoria);
        System.out.println("LA CANTIDAD DE DINERO ES QUE DEJA DE PERCIBIR EL TEATRO ES: S/" + desc);
        System.out.println("El total a pagar es:S/" + iT);
        
    }
}
