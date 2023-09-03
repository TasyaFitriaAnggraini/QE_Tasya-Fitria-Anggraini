import java.util.Scanner;

public class SoalPrioritas1_NO1_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Pilihan");
        System.out.println("1. Hitung Luas Segitiga");
        System.out.println("2. Hitung Luas Persegi Panjang");
        System.out.println("3. Hitung Luas Lingkaran");


        System.out.print("Pilihan Anda : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan alas segitiga: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.print("Luas segitiga adalah " + luasSegitiga);
                break;
            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                System.out.print("Luas persegi panjang adalah " + luasPersegiPanjang);
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                double luasLingkaran = 3.14 * jariJari * jariJari;
                System.out.print("Luas lingkaran adalah " + luasLingkaran);
                break;
            default:
                System.out.print("Pilihan tidak valid");
        }
        input.close();
    }
}
