# Section 1 | Sotfware Testing Fundamental

## Soal Software Testing Fundamental

### Soal Prioritas 1
#### 1. Sebutkan dan jelaskan berbagai automation testing tool yang dapat digunakan (minimal 3)!

Jawab:
##### Appium
Appium merupakan sotfware testing otomatis serta bersifat terbuka (opensource). Appium menggunakan protokol kabel JSON seluler, yang memungkinkan pengguna menulis pengujian UI otomatis cocok digunakan untuk native web app, aplikasi hibrid, dan seluler untuk iOS maupun Android. Bahasa pemrograman yang didukung pada appium meliputi Java, C#, Python, JavaScript, Ruby, PHP, Perl. Kelemahan Appium adalah tahap awal integrasi dengan ekosistem CI/CD. Sama halnya dengan Selenium, pengguna Appium memerlukan pengetahuan lebih lanjut tentang kerangka kerja pengujian untuk konfigurasi dan penerapan. Dengan hal tersebut Appium sangat cocok untuk tim yang sudah memiliki pemahaman mendalam tentang kerangka kerja dan alat CI ini di industri.

##### Postman
Postman dianggap sebagai alat pengujian API utama oleh 20.000 pengembang yang menggunakannya. Tools ini menciptakan server API tiruan sehingga pengembang front-end dan back-end dapat bekerja secara bersamaan, dan antarmuka yang ramah pengguna menyertakan tempat khusus untuk semua skrip, pengujian, dan code snippets untuk memudahkan akses. Postman dapat diinstal sebagai add-on browser atau sebagai aplikasi desktop di semua sistem operasi. Tools ini tidak hanya menguji API tetapi juga kinerja dan perilaku, dan mendukung pengujian otomatis dan eksplorasi. Memiliki kelemahan tidak mudah untuk memantau kasus pengujian.

##### Katalon Studio
Katalon Studio adalah tools yang memberikan gratis dan ramah pengguna serta mudah dikonfigurasi. Tools ini menawarkan solusi automation testing yang komprehensif untuk aplikasi API, web, dan seluler dan secara eksplisit dirancang untuk membuat dan menerapkan skrip UI tanpa perlu menulis kode. Katalon mendukung semua sistem operasi serta memanfaatkan tools Selenium dan Appium. Pada bulan Maret 2019, perusahaan ini dinobatkan sebagai Gartner Peer Insights Customers Choice for Software Test Automation. Kelemahan pada Katalon Studio adalah tools ini hanya menggunakan bahasa skrip Groovy dan memiliki closed source code, sehingga komunitas pengembang Katalon agak kecil serta membingungkan.

##### Selenium
Tools Pengujian Selenium adalah standar industri dalam hal perangkat lunak dan tools load testing. Selenium bersifat Open-Source dan dikembangkan melalui komponen WebDriver dan IDE- adalah kerangka kerja inti untuk beberapa tools automation testing lainnya, termasuk Katalon, Watir, dan Robot Framework. Selenium berjalan pada sistem operasi Windows, Linux, dan OS X dan kompatibel dengan sebagian besar browser, termasuk Internet Explorer, Chrome, Firefox, dan Headless. Versi terbarunya juga menawarkan fitur untuk merekam dan memutar ulang. Mungkin yang terbaik dari semuanya yaitu programmer dapat menulis tes dalam bahasa umum seperti Java, C#, Perl, Python, JavaScript, Ruby, Groovy, dan PHP. Selenium ialah serangkaian perangkat lunak yang dibagi menjadi 4 jenis, antara lain:  
- Selenium IDE (Integrated Development Environment)
- Selenium RC (Remote Control)
- WebDriver
- Selenium Grid

##### Test Complete
TestComplete mudah diatur dan tidak memerlukan pengetahuan pemrograman. (Namun, mereka membantu untuk skrip pengujian lanjutan.). tools ini berjalan pada JavaScript, Python, VBScript, JScript, Delphi, C++, dan C#. Tools ini berfungsi di Web, seluler, dan desktop. Tools ini juga dilengkapi pengujian GUI, fungsional, dan regresif; kemampuan untuk menskalakan tes UI dan mengaturnya untuk pengujian di masa mendatang; pembuatan skrip uji modular yang dapat terus digunakan kembali oleh pengembang; dan integrasi yang baik dengan produk Perangkat Lunak SmartBear lainnya. Memiliki kelemahan biaya perangkat lunak TestComplete mulai dari $ 2,399 per pengguna, per tahun, dan hanya berjalan di Windows.

#### 2. Sebutkan dan jelaskan urgensi / pentingnya proses pengujian pada perangkat lunak! (minimal 3 poin)

Jawab: 
<aside>
1. Menjaga Kualitas Produk dan Keamanan

Pengujian perangkat lunak bertujuan untuk mengidentifikasi kesalahan (bug) dan masalah lainnya dalam perangkat lunak sebelum perilisan ke publik. Dengan menguji perangkat lunak secara menyeluruh, tim pengembangan dapat menemukan dan memperbaiki bug, kerentanan keamanan, dan masalah kinerja yang dapat mempengaruhi pengalaman pengguna. Pengujian yang komprehensif membantu memastikan bahwa perangkat lunak berjalan sesuai dengan harapan, meminimalkan risiko kegagalan, dan meningkatkan kepercayaan pengguna terhadap produk.
</aside>

<aside>
2. Menghemat Biaya

Jika bug dan masalah lainnya tidak terdeteksi dan diperbaiki sebelum perilisan, mereka mungkin akan muncul setelah perangkat lunak digunakan oleh pengguna. Perbaikan pasca rilis umumnya lebih mahal dan rumit daripada memperbaiki masalah pada tahap pengembangan awal. Pengujian yang efektif dapat membantu mengidentifikasi dan memperbaiki masalah sejak dini, mengurangi risiko perbaikan yang mahal dan menjaga reputasi produk yang baik.
</aside>

<aside>
3. Menjaga Kepuasaan Customer

Pengujian perangkat lunak membantu memastikan bahwa perangkat lunak memenuhi kebutuhan dan harapan pengguna. Dengan menguji fungsionalitas, kinerja, dan keseluruhan pengalaman pengguna, tim pengembangan dapat memastikan bahwa perangkat lunak bekerja sesuai yang diharapkan oleh pengguna. Hal ini berkontribusi pada kepuasan pengguna, loyalitas, dan kemungkinan adopsi produk yang lebih tinggi.
</aside>

### Soal Prioritas 2
#### 1. Tuliskan secara lengkap kesimpulan dari hasil pengujian berikut!
![Image](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/1_Software%20Testing%20Fundamental/Screenshot/Screenshot%20from%202023-01-02%2007-37-07.png)

Jawab: 
Kesimpulan dari hasil pengujian diatas, yaitu:
-   Pada gambar diatas, bahwa TesAdd_1 dan TestSubstract_1 diketahui passed artinya Pengujian ini berhasil dengan waktu eksekusi 0.0ms. Ini mengindikasikan bahwa operasi penambahan yang diuji dalam kasus ini berjalan dengan baik dan sesuai harapan sehingga menghasilkan icon ceklis atau berhasil.
-   Sedangkan pada TestAdd_2 dan TestSubstract_2 terlihat failed ketika dilakukan testing dikarenakan komponen yang diuji tidak konsisten atau mengalami bug sehingga menghasilkan icon silang atau gagal.

### Soal Eksplorasi
#### 1. Tulis kesimpulan dari hasil pengujian berikut.
![Image](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/1_Software%20Testing%20Fundamental/Screenshot/eksplorasi_qe_01.png)\

Jawab:
Kesimpulan dari hasil pengujian diatas, yaitu:
-   Pada baris ke-1 bahwa kode pengujian sudah berhasil dijalankan dengan durasi waktu pengujian selama 21,7 detik. Hal tersebut total waktu yang diperlukan untuk menjalankan test case tertentu. Waktu pengujian penting untuk memahami berapa lama sistem dapat mempertahankan beban. 
-   Pada baris ke-2 dan ke-3 menunjukkan 2 skenario (first_scenario dan second_scenario) pengujian yang telah berjalan.
    - **first_scenario**
    <aside>
    Skenario yang dijalankan oleh 5 Virtual User (VU), dengan rata-rata waktu respon untuk permintaan dalam skenario ini adalah 504.59ms. Persentil waktu respon (p90)adalah sekitar 540.54ms. Dengan begitu "first_scenario" berhasil dijalankan oleh 5 VU dengan rata-rata waktu respon sekitar 500ms. Skenario ini tampaknya berjalan lancar tanpa kegagalan.
    </aside>

    - **second_scenario**
    <aside>
    Skenario ini dijalankan oleh berbagai jumlah VU, mungkin terdapat variasi selama pengujian. Dengan rata-rata waktu respon, persentil, dan statistik lainnya mungkin bervariasi sesuai dengan jumlah VU yang digunakan.Dengan begitu "second_scenario" menghasilkan hasil yang bervariasi, termasuk beberapa iterasi yang gagal. Hasil ini mungkin dapat dijelaskan lebih lanjut dengan menganalisis data lebih mendalam untuk setiap kasus gagal dan berhasil.
    </aside>
-   Pada baris ke-4 skenario yang diuji berhasil dengan baik dan sistem merespons permintaan dengan sukses (kode status 200).
-   Dari hasil menampilan pengujian didapatkan response code 200 diantaranya menampilkan checks, data_received, data_sent, http_req_blocked, dsb. 



## REFRENSI
1. https://appkey.id/pembuatan-aplikasi/mobile-programming/testing-tools/ 
1. https://dosenit.com/tekno/automation-testing-tools-terbaik 
1. https://se.ittelkom-pwt.ac.id/2017/10/25/pentingnya-melakukan-pengujian-perangkat-lunak-software-testing/
1. https://one.alterra.academy/courses/be-a-top-search-quality-engineer/lessons/software-testing-fundamental-3/topic/materi-software-testing-fundamental/ 