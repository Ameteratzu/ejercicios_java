package EstructuraCondicionalCase01;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int promo;
    String cate="";
        System.out.println("INGRESE SU PROMEDIO:");
        promo = sc.nextInt();
        
        switch(promo){
            case 0,1,2,3,4,5,6,7,8,9,10,11 -> cate = "D";
            case 12,13 -> cate = "C";
            case 14,15,16 -> cate = "B";
            case 17,18,19,20 -> cate = "A";
        }
        
        System.out.println("SU CATEGORIA ES : " + cate);
    }
}
