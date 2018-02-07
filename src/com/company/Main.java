package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("iNGRESE SU ALTURA");
        int alto = scan.nextInt();
        System.out.println("INGRESE SU BASE");
        int bas = scan.nextInt();
        Rectangulo rec = new Rectangulo(alto,bas);
        System.out.println("El AREA ES"+rec.area());
        System.out.println("SU PERIMETRO ES"+rec.perimetro());





    }
}
