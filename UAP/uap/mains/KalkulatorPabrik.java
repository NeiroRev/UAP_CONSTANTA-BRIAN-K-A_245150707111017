package uap.mains;

import uap.models.Torus;
import uap.models.Sphere;

import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("CONStANTA BRIAN KRISNA ARIENTA"); 
        System.out.println("245150707111017"); 
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double majorRadiusTorus = input.nextDouble(); 
        System.out.print("Isikan radius   : ");
        double minorRadiusTorus = input.nextDouble(); 
        System.out.println("=============================================");

        Torus torus = new Torus(majorRadiusTorus, minorRadiusTorus);
        torus.printInfo();
        System.out.println("Massa dalam kg  : " + torus.gramToKilogram());
        System.out.printf("Biaya kirim     : Rp%.0f%n", torus.calculateCost()); 
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radiusSphere = input.nextDouble(); 
        System.out.println("=============================================");

        Sphere sphere = new Sphere(radiusSphere);
        sphere.printInfo();
        System.out.println("Massa dalam kg  : " + sphere.gramToKilogram());
        System.out.printf("Biaya kirim     : Rp%.0f%n", sphere.calculateCost()); 
        System.out.println("=============================================");

        input.close();
    }
}