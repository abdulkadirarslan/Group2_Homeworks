package day11;

import java.util.Scanner;

public class Dortgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Karenin kenarı : ");
        int kenar = input.nextInt();
        System.out.print("Dikdörtgenin Kısa kenarı : ");
        int kisaKenar = input.nextInt();
        System.out.print("Dikdörtgenin Uzun kenarı : ");
        int uzunKenar = input.nextInt();

        int kareninAlani = alanHesapla(kenar, kenar);
        int kareninCevresi = cevreHesapla(kenar, kenar);

        int dikdortgeninAlani = alanHesapla(kisaKenar, uzunKenar);
        int dikdortgeninCevresi = cevreHesapla(kisaKenar, uzunKenar);

        int alanlarınToplami = kareninAlani + dikdortgeninAlani;
        int cevrelerinToplami = kareninCevresi + dikdortgeninCevresi;

        System.out.println("Alanların Toplamı = " + alanlarınToplami);
        System.out.println("Çevrelerin Toplamı = " + cevrelerinToplami);


    }

    public static int alanHesapla(int k1, int k2) {
        return k1 * k2;
    }

    public static int cevreHesapla(int k1, int k2) {
        return 2 * (k1 + k2);
    }

}
