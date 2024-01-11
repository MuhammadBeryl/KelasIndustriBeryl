import java.util.Scanner;

import javax.sound.midi.Soundbank;

/**
 * KategoriBMI
 */
import java.util.Scanner;

public class KategoriBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Tinggi: ");
        double tinggi = input.nextDouble();
        System.out.println("Masukkan Berat: ");
        double berat = input.nextDouble();

        String Kategori = null;
        double BMI = berat/(tinggi*tinggi);

        if(BMI <17) {
            Kategori="Kurus Berat";
        }else if (BMI >=17 && BMI <=18.4){
            Kategori="Kurus Ringan";
        }else if (BMI >=18.5 && BMI <=25.0){
            Kategori ="Normal";
        }else if (BMI >=25.1 && BMI <=27.0){
            Kategori="Gemuk Ringan";
        }else if (BMI >=27){
            Kategori="Gemuk Berat";
        }

        System.out.println("Menghitung BMI=");
        System.out.println(nama);
        System.out.println(BMI);
        System.out.println(Kategori);
    }
}