# Fundamental Performance Test & Performance Testing with JMeter

https://docs.google.com/document/d/1arBUO-1Zl-WSquzm_lpsWYPJVVECo-KwogecMi4wUzQ/edit?usp=sharing

## Soal Fundamental Performance Testing

### 1. Jelaskan jenis-jenis dari performance testing

#### Jawab:

#### Load Testing

Load Testing merupakan bagian dari teknik pengujian performance dimana tujuan pengujian ini adalah untuk menentukan target load dari sebuah sistem. Pengujian ini diperlukan saat adanya sebuah event musiman yang menyebabkan lalu lintas (traffic) sistem bertambah seiring berjalannya waktu.

Contohnya pada sebuah aplikasi penjualanan tiket yang traffic-nya perlahan akan bertambah saat sebuah event mulai mendekati. Misalnya acara tahun baru yang terjadi di tanggal 1 Januari, mungkin jauh-jauh hari seiring mendekatnya tahun baru, traffic dari aplikasi penjualanan tiket juga akan bertambah sehingga pengujian ini diperlukan untuk mengetahui ketahanan sistem dengan menaikkan load perlahan-lahan pada setiap skenario-nya, kemudian menganalisis penggunaan resource-nya apakah ada perbedaan yang signifikan atau tidak.

#### Stress Testing

Stress Testing merupakan bagian dari teknik pengujian performance yang dijalankan untuk mengetahui limit atau batas kemampuan dari sebuah sistem dengan cara membanjiri lalu lintas (traffic) sistem sampai sistem tersebut crash. Salah satu alasan utama dilakukannya pengujian ini adalah untuk menghindari terjadinya kegagalan sistem (system down).

Contoh kasus yang paling umum adalah saat sebuah aplikasi e-commerce mengadakan promo besar-besaran, sehingga banyak user yang mengakses aplikasi tersebut di jam tertentu (misalnya ada waktu tertentu untuk menggunakan promo) pada waktu yang bersamaan.
Setelah dilakukannya pengujian ini, diharapkan tim pengembang dapat membangun sebuah sistem yang lebih kebal terhadap kasus traffic yang dibanjiri oleh banyak user.

#### Endurance Testing

Endurance Testing merupakan bagian dari teknik pengujian performance yang dijalankan untuk menganalisis behavior atau performa sistem dengan load yang normal namun dalam jangka waktu yang panjang. Pengujian ini dilakukan untuk menghindari terjadinya kebocoran memori (memory leak). Di beberapa instansi, Endurance Testing tidak menjadi bagian dari tanggung jawab seorang Software Tester/QA melainkan pengujian ini biasanya dilakukan oleh seorang performance engineer, atau role yang lebih ahli di bidang ini.

Contoh penerapan Endurance Testing adalah saat menguji kinerja sebuah aplikasi perbankan yang harus beroperasi 24/7 dalam waktu yang lama tanpa henti. Dalam pengujian ini, sistem diberikan beban kerja konstan selama periode waktu yang panjang untuk memeriksa apakah sistem tetap berfungsi dengan baik dan tidak mengalami penurunan kinerja seiring berjalannya waktu.

#### Spike Testing

Spike Testing merupakan bagian dari teknik pengujian performance yang dijalankan untuk mengetahui jumlah load system apakah sesuai dengan ekspektasi. Spike dan load testing memiliki tujuan yang mirip, bedanya dengan load testing adalah pengujian ini dilakukan dengan mengirim load yang banyak dalam waktu bersamaan.

Contohnya kasus saat mengakses website hasil ujian SBMPTN. Dengan pengujian ini, kita dapat mengetahui user atau load maksimum yang dapat mengakses website tersebut pada waktu yang bersamaan.

#### Soak Testing

Soak Testing adalah jenis pengujian kinerja yang dilakukan untuk menguji ketahanan suatu sistem dalam menghadapi beban kerja yang konstan dalam periode waktu yang lama. Pengujian ini bertujuan untuk mengidentifikasi masalah kinerja yang mungkin muncul seiring berjalannya waktu atau penggunaan yang berkepanjangan.  Beban kerja yang diterapkan dalam Soak Testing biasanya diberikan selama berjam-jam, hari, atau bahkan minggu tergantung pada kebutuhan pengujian dan karakteristik sistem yang diuji.

Contoh penerapan Soak Testing adalah saat menguji kinerja sebuah sistem basis data yang harus beroperasi dalam waktu yang lama dengan beban kerja yang konstan. Dalam pengujian ini, sistem diberikan beban kerja yang konstan dalam periode waktu yang lama untuk memeriksa apakah sistem tetap berfungsi dengan baik, tidak mengalami penurunan kinerja, atau masalah lainnya yang mungkin muncul seiring berjalannya waktu atau penggunaan yang berkepanjangan.

#### Peak Testing 

Peak Testing dilakukan untuk menguji kinerja sistem saat mencapai titik puncak beban kerja dalam waktu singkat. Pengujian ini bertujuan untuk mengukur apakah sistem dapat mengatasi lonjakan beban kerja yang tiba-tiba dan memastikan bahwa sistem tetap berfungsi dengan baik dalam situasi ini. Peak Testing sering dilakukan untuk menguji kinerja sistem saat menghadapi situasi bisnis tertentu, seperti saat ada promosi besar-besaran atau saat ada kejadian khusus yang dapat meningkatkan beban kerja sistem secara signifikan.

Contoh penerapan Peak Testing adalah saat menguji kinerja sebuah aplikasi streaming video saat menghadapi lonjakan pengguna secara tiba-tiba saat acara besar seperti Piala Dunia atau Olimpiade. Dalam pengujian ini, beban kerja yang sangat tinggi diterapkan pada sistem untuk memeriksa apakah sistem dapat menghadapi lonjakan beban kerja yang tiba-tiba dan tetap memberikan pengalaman yang baik kepada pengguna.

#### Smoke Testing

Smoke Testing, juga dikenal sebagai Sanity Testing, dilakukan sebagai pengujian awal untuk memeriksa apakah sistem atau aplikasi berfungsi dengan baik setelah melakukan perubahan atau pembaruan kecil. Pengujian ini biasanya dilakukan dengan skenario pengujian sederhana untuk memastikan bahwa sistem masih berfungsi dengan baik setelah perubahan kecil dilakukan. Jika Smoke Testing gagal, maka pengujian lanjutan seperti pengujian beban atau stres mungkin diperlukan.

Contoh penerapan Smoke Testing adalah saat menguji kinerja sebuah sistem setelah melakukan perubahan kecil, seperti pembaruan perangkat lunak atau konfigurasi sistem. Dalam pengujian ini, sistem diuji dengan skenario pengujian sederhana untuk memastikan bahwa perubahan kecil yang dilakukan tidak mengganggu kinerja sistem secara keseluruhan.

### 2.  Jelaskan berbagai tantangan dalam melakukan performance testing.

Jawab :

Performance testing adalah proses mengukur, menguji, dan memvalidasi performa sebuah aplikasi, sistem, atau komponen dalam berbagai kondisi. Tantangan dalam melakukan performance testing meliputi:

1. **Definisi Tujuan Performa**: Menentukan apa yang harus diuji dan tujuan performa yang harus dicapai adalah tantangan awal. Anda perlu memahami apakah Anda ingin mengukur waktu respons, kapasitas sistem, atau keandalan dalam menghadapi beban tertentu.

1. **Data Realistik**: Menciptakan data yang mewakili situasi nyata adalah sulit. Menggunakan data dummy atau data terbatas dapat menyebabkan hasil yang tidak merepresentasikan situasi di dunia nyata.

1. **Pemilihan Alat**: Ada banyak alat performance testing yang berbeda-beda, seperti JMeter, Gatling, dan LoadRunner. Memilih alat yang sesuai dengan kebutuhan Anda dan memiliki kurva pembelajaran yang cocok bisa menjadi tantangan.

1. **Simulasi Beban Realistik**: Menentukan beban uji yang realistis adalah sulit. Mengukur berapa banyak pengguna yang sebenarnya akan mengakses aplikasi Anda dan bagaimana mereka akan berinteraksi dengan sistem.

1. **Infrastruktur Pengujian**: Memiliki infrastruktur yang dapat menangani beban uji yang diinginkan merupakan tantangan tersendiri. Terkadang, memerlukan perangkat keras dan perangkat lunak yang kuat untuk melakukan performance testing.

1. **Kontrol Variabel Eksternal**: Mengontrol variabel eksternal yang dapat memengaruhi performa sistem, seperti kualitas koneksi internet atau beban jaringan, bisa sulit.

1. **Monitoring dan Pengumpulan Data**: Mengumpulkan data performa dengan benar dan memantau sistem selama pengujian bisa rumit. Anda perlu memahami metrik yang relevan dan bagaimana cara mengukurnya.

1. **Analisis Hasil**: Menganalisis hasil pengujian dan menentukan penyebab masalah performa adalah tantangan. Seringkali, masalahnya kompleks dan perlu pemahaman yang mendalam tentang sistem.

1. **Skalabilitas**: Mengukur skalabilitas sistem, yaitu kemampuannya untuk menangani beban yang lebih besar, bisa menantang. Ini melibatkan mengukur titik jenuh (saturation point) di mana sistem mencapai batas kinerjanya.

1. **Isolasi Masalah**: Ketika Anda menemui masalah performa, isolasi penyebab masalah bisa sulit. Masalah tersebut bisa berasal dari berbagai faktor, seperti basis data, infrastruktur, atau kode aplikasi.

1. **Konsistensi Hasil**: Memastikan bahwa hasil pengujian konsisten dan dapat direproduksi adalah tantangan. Beberapa faktor, seperti variasi lingkungan, bisa memengaruhi hasil pengujian.

1. **Sumber Daya Terbatas**: Terkadang, sumber daya untuk melakukan performance testing terbatas, baik dalam hal anggaran, waktu, atau personil.

1. **Keterbatasan Akses ke Lingkungan Produksi**: Seringkali, akses ke lingkungan produksi untuk melakukan pengujian performa tidak selalu tersedia, sehingga mengharuskan penggunaan lingkungan pengujian yang setidaknya mendekati lingkungan produksi.

1. **Kecepatan Perubahan**: Lingkungan pengembangan dan infrastruktur dapat berubah dengan cepat. Mempertahankan konsistensi pengujian di lingkungan yang selalu berubah bisa menjadi tantangan.

1. **Kesinambungan Performa**: Performance testing bukanlah tugas sekali-sekali. Aplikasi perlu diuji secara berkala untuk memastikan performa tetap baik seiring waktu.

1. **Mengelola Hasil dan Pelaporan**: Mengelola hasil performa dan melaporkannya kepada stakeholder dengan cara yang informatif dan mudah dimengerti adalah tantangan tersendiri.

Melakukan performance testing yang efektif melibatkan merencanakan, merancang, dan melaksanakan pengujian dengan cermat serta mengatasi tantangan yang mungkin muncul di sepanjang proses tersebut. Dengan demikian, Anda dapat memastikan bahwa aplikasi atau sistem Anda berkinerja baik di bawah beban yang diberikan oleh pengguna atau lingkungan produksi yang nyata.

## Refrence

1.  https://one.alterra.academy/courses/be-a-top-search-quality-engineer/lessons/fundamental-performance-test/topic/materi-fundamental-performance-test/

2.  https://sysctl.id/jenis-performance-test/

3.  https://medium.com/dot-intern/jenis-jenis-software-testing-a5bf2345c79d

4. http://eprints.dinus.ac.id/14448/1/[Materi]_Egia_Rosi_Subhiyakto%2C_M.Kom%2C_M.CS_-_12._Pengujian_Aplikasi_Web_-_Rekayasa_Perangkat_Lunak_Lanjut_-_Teknik_Informatika_S1.pdf