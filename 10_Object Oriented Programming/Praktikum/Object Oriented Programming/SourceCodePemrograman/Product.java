class Product {
    private String nama;
    private String deskripsi;
    private double harga;
    private int jumlah_stok;

    public Product(String nama, String deskripsi, double harga, int jumlah_stok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlah_stok = jumlah_stok;
    }

    // Getter (Non-Void)
    public String getNama() {
        return nama;
    }

    // Setter (Void)
    public void setName(String nama) {
        this.nama = nama;
    }

    // Getter (Non-Void)
    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlahStok() {
        return jumlah_stok;
    }

    public void setJumlahStok(int jumlah_stok) {
        this.jumlah_stok = jumlah_stok;
    }

    public void getInfo() {
        System.out.println("=====");
        System.out.println("INFO PRODUK");
        System.out.println("Nama produk: " + nama);
        System.out.println("Deskripsi produk: " + deskripsi);
        System.out.println("Harga produk: " + harga);
        System.out.println("Jumlah Stok: " + jumlah_stok);
        System.out.println("=====");
    }

    public static void main(String[] args) {
        Product product = new Product("coffee", "this is coffee", 15000, 10);
        product.getInfo();
        Product product2 = new Product("milk", "this is fresh milk", 25000, 10);
        product2.getInfo();
        Product product3 = new Product("apple juice", "this is juice", 18000, 20);
        product3.getInfo();
    }
}
