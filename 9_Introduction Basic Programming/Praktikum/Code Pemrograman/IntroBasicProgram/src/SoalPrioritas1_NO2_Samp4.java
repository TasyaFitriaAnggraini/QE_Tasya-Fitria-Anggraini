import java.util.Scanner;

public class SoalPrioritas1_NO2_Samp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan harga beli: ");
        int hargaBeli = scanner.nextInt();
        System.out.print("Masukkan harga jual: ");
        int hargaJual = scanner.nextInt();

        // cek apakah hasil penjumlahan mengalami keuntungan / kerugian
        if (hargaJual > hargaBeli) {
            int keuntungan = hargaJual - hargaBeli;
            System.out.println("Untung sebesar: " + keuntungan);
        } else if (hargaJual < hargaBeli) {
            int rugi = hargaBeli - hargaJual;
            System.out.println("Rugi sebesar: " + rugi);
        } else {
            System.out.println("Sama saja");
        }
    }
}
