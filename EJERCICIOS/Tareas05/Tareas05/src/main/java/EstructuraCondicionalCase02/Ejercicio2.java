package EstructuraCondicionalCase02;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int tipo,edad,lentes,alco,enfermedad;
    double precio=0,aumen,aumenL,aumenF,aumenE=0,iT;
        System.out.println("INGRESE SU TIPO DE POLIZA :");
        System.out.println("1)COBERTURA AMPLIA (A)");
        System.out.println("2)DAÑOS DE TERCEROS(B)");
        tipo = sc.nextInt();
        System.out.println("INGRESE SU EDAD:");
        edad = sc.nextInt();
        System.out.println("USTED CONSUME ALCOHOL?");
        System.out.println("1)SI");
        System.out.println("2)NO");
        alco = sc.nextInt();
        System.out.println("Usas lentes?");
        System.out.println("1)SI");
        System.out.println("2)NO");
        lentes = sc.nextInt();
        System.out.println("PADECE DE ALGUNA ENFERMEDAD ?");
        System.out.println("1)SI");
        System.out.println("2)NO");
        enfermedad = sc.nextInt();   

        switch(tipo){
            case 1: precio = 1200; break; 
            case 2: precio = 950; break; 
        }
        switch(alco){
            case 1: aumen = precio * 0.1; break;
            default: aumen = precio * 0;
        }
        switch(lentes){
            case 1: aumenL = precio * 0.05; break;
            default: aumenL = precio * 0;
        }
        switch(enfermedad){
            case 1: aumenF = precio * 0.05; break;
            default: aumenF= precio * 0;
    }
       if(edad>1 && edad<=40){
           aumenE = precio * 0.10;
       }else if(edad>40){
           aumenE = precio * 0.20;
       }
        iT = precio + aumen + aumenL + aumenF + aumenE;
        
        System.out.println("EL PRECIO BASE ES: S/"+ precio);
        System.out.println("AUMENTO POR CONSUMO DE ALCOHOL: S/" + aumen);
        System.out.println("SU AUMENTO POR USO DE LENTES ES: S/" + aumenL);
        System.out.println("SU AUMENTO POR PADECER ALGUNA ENFERMEDAD ES: S/" + aumenF);
        System.out.println("EL AUMENTO POR EDAD MAYORES A 40 AÑOS ES: S/" + aumenE);
        System.out.println("EL COSTO FINAL PARA CONTRATAR UNA POLIZA ES: S/" + iT);
}
}
