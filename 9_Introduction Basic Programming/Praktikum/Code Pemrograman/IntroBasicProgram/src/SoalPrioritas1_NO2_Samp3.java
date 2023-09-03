public class SoalPrioritas1_NO2_Samp3 {
    public static void main(String[] args) {
        int hargaBeli = 12000;
        int hargaJual = 12000;

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
