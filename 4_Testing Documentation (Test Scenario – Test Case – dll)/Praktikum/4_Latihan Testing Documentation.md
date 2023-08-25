# Testing Documentation (Test Scenario – Test Case – dll)

## Soal Testing Documentation

### Soal Prioritas 1
Buatlah Test Case sebanyak mungkin pada fitur login, pilih produk sampai pilih metode pembayaran dari https://www.sepulsa.com/ dengan menggunakan format laporan yang sudah ditentukan. Letakkan kumpulan test case tersebut dalam bentuk file excel.

Jawab:

https://docs.google.com/spreadsheets/d/1smewBa2tN59HRjYGUUniTj3pSEc2HAJhb2l35MO4AL8/edit?usp=sharing 

### Soal Prioritas 2
Buatlah test case untuk aplikasi https://www.sepulsa.com/ untuk fitur register, lihat artikel dan lihat riwayat transaksi dengan menggunakan format laporan yang sudah ditentukan. Letakkan kumpulan test case tersebut dalam bentuk file excel.

Jawab:

https://docs.google.com/spreadsheets/d/1putu8bhvsvtytgZPOVL7m7mWtZ5ViFBXQwiqLSx1qoE/edit?usp=sharing 

### Soal Eksplorasi
1. Lakukan pengujian non fungsional untuk aplikasi https://www.sepulsa.com/ dengan menggunakan Lighthouse. Referensi mengenai Lighthouse dapat dicek di link [berikut](https://developer.chrome.com/docs/lighthouse/overview/). Kriteria untuk pengujian non fungsional adalah sebagai berikut:

    1. Terdapat pengujian non fungsional untuk tampilan di web dan mobile.
    2. Terdapat screenshot hasil pengujian untuk 2 platform (web dan mobile) beserta penjelasan dari hasil pengujian yang telah dilakukan.
    3. Hasil pengujian ditulis dalam google docs.
    4. Contoh hasil pengujian dengan menggunakan Lighthouse adalah sebagai berikut:

    ![Gambar Eksplorasi](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/4_Testing%20Documentation%20(Test%20Scenario%20%E2%80%93%20Test%20Case%20%E2%80%93%20dll)/Screenshot/Soal%20Eksplorasi/221096394-bc61f6ad-c609-4661-8ae5-fb2ab0bb2b70.png)

Jawab:

https://docs.google.com/document/d/1RwI1ZkQ_Dt4LKgGnNMOfatuJOBXr5UE7/edit?usp=sharing&ouid=116269043888314414582&rtpof=true&sd=true

#### Pengujian non fungsional menggunakan Lighthouse berbasis Dekstop pada sepulsa.com

1.  Langkah Langkah

-   Buka situs https://www.sepulsa.com/ di browser Google Chrome.
-   Klik kanan pada halaman web dan pilih "Inspect" dari menu yang muncul atau tekan Ctrl + Shift + I pada keyboard Anda.
-   Setelah panel Inspect terbuka, klik tab "Lighthouse" di bagian atas.
-   Pilih perangkat dekstop yang ingin Anda gunakan untuk simulasi.
-   Setelah Anda memilih perangkat dekstop, halaman web akan secara otomatis di-refresh dan ditampilkan dalam mode simulasi perangkat dekstop.
-   Klik tombol "Analyze page Load" untuk memulai pengujian.
-   Tunggu beberapa saat hingga proses pengujian selesai.
-   Setelah pengujian selesai, Lighthouse akan memberikan laporan hasil pengujian dalam beberapa kategori, seperti performa dan aksesibilitas

2.  Screenshot

![Gambar Dekstop](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/4_Testing%20Documentation%20(Test%20Scenario%20%E2%80%93%20Test%20Case%20%E2%80%93%20dll)/Screenshot/Soal%20Eksplorasi/Screenshot%202023-08-23%20170940.png)

![Gambar Dekstop](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/4_Testing%20Documentation%20(Test%20Scenario%20%E2%80%93%20Test%20Case%20%E2%80%93%20dll)/Screenshot/Soal%20Eksplorasi/Screenshot%202023-08-23%20171120.png)

3.  Penjelasan hasil dari pengujian non fungsional dengan menggunakan Lighthouse berbasis Dekstop

-   Performance score: 83

Menunjukkan bahwa performa sepulsa.com bisa lebih ditingkatkan. Lighthouse memberikan peringkat berdasarkan beberapa metrik kinerja seperti waktu muat, waktu interaktif, ukuran halaman, dan sebagainya. Skor 83 menunjukkan bahwa ada beberapa area yang bisa ditingkatkan untuk mempercepat waktu muat dan waktu interaktif situs sepulsa.com.

-   Accessibility score: 97

Menunjukkan bahwa sepulsa.com memenuhi standar aksesibilitas yang cukup tinggi. Skor 97 menunjukkan bahwa sepulsa.com memiliki sedikit masalah aksesibilitas dan dapat diakses oleh banyak orang dengan berbagai kebutuhan dan perangkat.

-   Best Practices score: 92

Menunjukkan bahwa ada beberapa area di sepulsa.com yang bisa ditingkatkan untuk memenuhi standar praktik terbaik dalam pengembangan web. Skor 92 menunjukkan bahwa ada beberapa area yang perlu ditingkatkan dalam hal struktur HTML, penggunaan HTTPS, penggunaan header HTTP, dan sebagainya.

-   SEO score: 100

Menunjukkan bahwa bahwa sepulsa.com memiliki konfigurasi SEO yang baik. Skor 100 menunjukkan bahwa sepulsa.com memiliki URL yang jelas dan mudah dimengerti oleh mesin pencari, metadata yang sesuai, struktur heading yang baik, dan sebagainya. Hal ini dapat membantu sepulsa.com ditemukan dengan mudah oleh mesin pencari dan meningkatkan peringkat SEO sepulsa.com.

#### Pengujian non fungsional menggunakan Lighthouse berbasis Mobile pada sepulsa.com

1. Langkah Langkah

-   Buka situs https://www.sepulsa.com/ di browser Google Chrome.
-   Klik kanan pada halaman web dan pilih "Inspect" dari menu yang muncul atau tekan Ctrl + Shift + I pada keyboard Anda.
-   Setelah panel Inspect terbuka, klik tab "Lighthouse" di bagian atas.
-   Pilih perangkat mobile yang ingin Anda gunakan untuk simulasi.
-   Setelah Anda memilih perangkat mobile, halaman web akan secara otomatis di-refresh dan ditampilkan dalam mode simulasi perangkat mobile.
-   Klik tombol "Analyze page load" untuk memulai pengujian.
-   Tunggu beberapa saat hingga proses pengujian selesai.
-   Setelah pengujian selesai, Lighthouse akan memberikan laporan hasil pengujian dalam beberapa kategori, seperti performa dan aksesibilitas

2.  Screenshot

![Gambar Mobile](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/4_Testing%20Documentation%20(Test%20Scenario%20%E2%80%93%20Test%20Case%20%E2%80%93%20dll)/Screenshot/Soal%20Eksplorasi/Screenshot%202023-08-23%20183356.png)

![Gambar Mobile](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/4_Testing%20Documentation%20(Test%20Scenario%20%E2%80%93%20Test%20Case%20%E2%80%93%20dll)/Screenshot/Soal%20Eksplorasi/Screenshot%202023-08-23%20183452.png)

3.  Penjelasan hasil dari pengujian non fungsional dengan menggunakan Lighthouse berbasis Mobile

-   Performance score: 50

Menunjukkan bahwa performa sepulsa.com memiliki beberapa masalah. Skor ini menunjukkan bahwa sepulsa.com mungkin terasa lambat saat dimuat atau memerlukan waktu lebih lama untuk merespons input dari pengguna. Ada beberapa faktor yang dapat mempengaruhi skor ini, seperti ukuran file gambar yang besar, penggunaan script yang kompleks, atau server yang lambat dalam memberikan respon.

-   Accessibility score: 97

Menunjukkan bahwa sepulsa.com memiliki aksesibilitas yang sangat baik untuk pengguna dengan berbagai kebutuhan khusus. Skor ini menunjukkan bahwa sepulsa.com memiliki fitur aksesibilitas yang lengkap dan mudah diakses oleh pengguna dengan kebutuhan khusus, seperti penggunaan keyboard, tampilan berwarna kontras, atau dukungan untuk pembaca layar.

-   Best Practices score: 92

Menunjukkan bahwa sepulsa.com mengindikasikan bahwa situs sepulsa.com telah mematuhi banyak praktik terbaik dalam pengembangan web. Skor ini menunjukkan bahwa sepulsa.com sepenuhnya mengikuti standar terbaik dalam hal penggunaan teknologi web, struktur kode yang jelas, atau penggunaan alat bantu dalam pengembangan web.

-   SEO score: 100

Menunjukkan bahwa sepulsa.com memiliki kinerja yang sangat baik dalam hal optimasi mesin pencari. Skor ini menunjukkan bahwa sepulsa.com mudah ditemukan dan diindeks oleh mesin pencari seperti Google, Yahoo, dan Bing. Ini dapat membantu meningkatkan jumlah kunjungan ke sepulsa.com dan membantu meningkatkan keuntungan bagi bisnis yang berkaitan.
