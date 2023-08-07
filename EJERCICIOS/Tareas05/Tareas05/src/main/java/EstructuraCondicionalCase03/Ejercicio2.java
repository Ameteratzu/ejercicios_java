package EstructuraCondicionalCase03;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int carrera;
    double matric=0,mensu=0,mTo;
    String nombre,facultad=null;
        System.out.println("INGRESA TU NOMBRE:");
        nombre = sc.nextLine();
        System.out.println("QUE FACULTAD PERTENECES:");
        System.out.println("1)INGENIERIA");
        System.out.println("2)DERECHO");
        System.out.println("3)INGENIERIA NAVIERA");
        System.out.println("4)INGENIERIA PESQUERA");
        System.out.println("5) Contabilidad");
        carrera = sc.nextInt();
        switch(carrera){
             case 1 -> {
                 facultad = "INGENIERIA";matric = 350;
                 mensu = 590;}
             case 2 -> {
                 facultad = "DERECHO";matric = 300;
                 mensu = 550;}
             case 3 -> {
                 facultad = "INGENIERIA NAVIERA ";matric = 300;   
                 mensu = 500;}
             case 4 -> {
                 facultad = "INGENIERIA PESQUERA";matric = 310;
                 mensu = 550;}
             case 5 -> {
                 facultad = "CONTABILIDAD";matric = 280;
                 mensu = 490;}
        }
        mTo = matric + mensu;
        System.out.println("NOMBRE DEL POSTULANTE: " + nombre);
        System.out.println("LA CARRERA ESCOGIDA ES: " + facultad);
        System.out.println("EL IMPORTE DE LA MATRICULA ES: S/" + matric);
        System.out.println("LA MENSUALIDAD ES: S/" + mensu);
        System.out.println("EL MONTO TOTAL ES: S/" + mTo);
    }
}
