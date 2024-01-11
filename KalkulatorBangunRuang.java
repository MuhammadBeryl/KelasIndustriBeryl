import java.util.Scanner;

public class KalkulatorBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjang, lebar, tinggi, volume, luas;

        System.out.print("Masukkan panjang balok: ");
        panjang = input.nextDouble();
        System.out.print("Masukkkan lebar balok: ");
        lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = input.nextDouble();

        volume = panjang * lebar * tinggi;
        luas = 2 * (panjang * lebar * lebar * tinggi * panjang * tinggi);

        System.out.println("Volume = " + volume + "cm3");
        System.out.println("Luas = " + luas + "cm2");
    }
}