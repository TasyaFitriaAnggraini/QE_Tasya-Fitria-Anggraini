public class SoalPrioritas1_NO2_Samp1 {
    public static void main(String[] args) {
        int hargaBeli = 15000;
        int hargaJual = 30000;

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
