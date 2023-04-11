package Giriş;

import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int heat;

        System.out.println( "Lüften hava sıcaklığını yazın: ");
        heat=input.nextInt();


        if (heat < 5) {
            System.out.println("Kayak yapabilirsin");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinema yapabilirsin");
        } else if (heat > 15 && heat <= 25) {
            System.out.println("Piknik yapabilirsin");
        } else {
            System.out.println("Yüzme yapabilirsin");
        }


    }
}
