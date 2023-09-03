public class SoalPrioritas1_NO1 {
    public static void main(String[] args){
        //segitiga
        float alas = 20;
        float tinggi = 25;

        //hitung luas segitiga
        float luasSegitiga = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga : " + luasSegitiga);

        //persegi panjang
        float panjang = 40;
        float lebar = 6;

        //hitung luas persegi panjang
        float luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);

        //lingkaran
        double jari2 = 7;

        //hitung luas lingkaran
        double phi = 3.14;
        double luasLingkaran = phi * jari2 * jari2;
        System.out.println("Luas Lingkaran : " + luasLingkaran);
    }
}
