package uap.mains;

import uap.models.Torus;
import uap.models.Sphere;

import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP"); // Ganti dengan nama lengkap Anda
        System.out.println("NIM"); // Ganti dengan NIM Anda
        System.out.println("=============================================");

        // Donat dengan lubang (Torus)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double majorRadiusTorus = input.nextDouble(); // Input 7
        System.out.print("Isikan radius   : ");
        double minorRadiusTorus = input.nextDouble(); // Input 3.5
        System.out.println("=============================================");

        Torus torus = new Torus(majorRadiusTorus, minorRadiusTorus);
        torus.printInfo();
        System.out.println("Massa dalam kg  : " + torus.gramToKilogram());
        System.out.printf("Biaya kirim     : Rp%.0f%n", torus.calculateCost()); // Format rupiah, tanpa desimal
        System.out.println("=============================================");

        // Donat tanpa lubang (Sphere)
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radiusSphere = input.nextDouble(); // Input 21
        System.out.println("=============================================");

        Sphere sphere = new Sphere(radiusSphere);
        sphere.printInfo();
        System.out.println("Massa dalam kg  : " + sphere.gramToKilogram());
        System.out.printf("Biaya kirim     : Rp%.0f%n", sphere.calculateCost()); // Format rupiah, tanpa desimal
        System.out.println("=============================================");

        input.close();
    }
}