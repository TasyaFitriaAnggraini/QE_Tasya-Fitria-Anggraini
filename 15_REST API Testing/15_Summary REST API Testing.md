# Resume Materi REST API Testing

## API Testing

### Pengertian API Testing 

API Testing merupakan proses untuk memverifikasi dan memvalidasi bahwa API berfunsgi sesuai dengan kebutuhan bisnis dan spesifikasi fungsional yang telah ditetapkan. 
   
Tujuannya adalah untuk memastikan bahwa API memberikan respons yang benar saat menerima permintaan yang valid, dan memberikan pesan error yang tepat saat menerima permintaan yang tidak valid. 
   
Dalam melakukan API Testing, penting untuk memperhatikan jenis tes yang dilakukan, seperti functionality test, load test, dan security test, serta teknik tes yang digunakan, seperti unit testing, integration testing, dan regression testing. Selain itu, perlu juga memperhatikan aspek keamanan seperti autentikasi dan otorisasi, serta melindungi data pengguna dengan baik.

### Jenis API Testing 

1. Functionality
    
   Jenis tes ini digunakan untuk memverifikasi bahwa API berfungsi sesuai dengan kebutuhan bisnis dan spesifikasi fungsional yang telah ditetapkan.
       
2. Load Test
    
   Jenis tes ini digunakan untuk memverifikasi bahwa API dapat menangani beban yang besar dan banyak pengguna secara bersamaan. Tujuan dari tes ini adalah    untuk menguji apakah API mampu menangani lalu lintas yang tinggi tanpa kegagalan atau penurunan kinerja.
       
3. Security 
    
   Jenis tes ini digunakan untuk memverifikasi bahwa API aman dari serangan yang mungkin dilakukan oleh pihak yang tidak berwenang, seperti serangan XSS,    SQL Injection, atau CSRF. Tes keamanan ini juga dapat digunakan untuk memverifikasi bahwa autentikasi dan otorisasi berfungsi dengan baik, dan bahwa      data pengguna dilindungi dengan baik.
       
### Type Bug dalam API Testing

1. Gagal melakukan error handling pada keadaan tertentu

2. Kesulitan untuk terhubung dan mendapat respon API

3. Masalah keamanan, seperti kebocoran data atau celah keamanan pada permintaan API

4. Masalah kinerja atau performance issue yang terkait dengan waktu respons API yang lambat atau overload

5. Error atau warning yang tidak tepat, seperti pesan kesalahan yang tidak jelas atau kurang spesifik

6. Struktur dari data respons tidak benar, seperti format JSON atau XML yang tidak sesuai dengan            spesifikasi atau kesalahan dalam data yang dikirimkan atau diterima

### API Testing Process

1. Specification Review
    
   Proses pertama dalam pengujian API adalah melakukan review terhadap spesifikasi API, baik itu dokumentasi maupun requirements dari pengguna. Pada tahap    ini, tester harus memastikan bahwa spesifikasi API tersebut jelas, terdokumentasi dengan baik, dan dapat dipahami dengan mudah.
       
2. Specification Development
       
   Setelah melakukan review terhadap spesifikasi API, selanjutnya adalah mengembangkan spesifikasi tersebut menjadi sebuah spesifikasi teknis yang            terperinci. Pada tahap ini, tester harus memastikan bahwa spesifikasi teknis tersebut terdokumentasi dengan baik, sesuai dengan kebutuhan pengguna, dan    dapat diimplementasikan dengan mudah.
       
3. Framework Developer
    
   Setelah memiliki spesifikasi teknis yang terperinci, selanjutnya adalah membangun kerangka kerja atau framework yang akan digunakan dalam pengujian        API. Pada tahap ini, tester harus memilih tools dan teknologi yang tepat untuk membangun framework tersebut, serta memastikan bahwa framework tersebut    dapat digunakan untuk menjalankan semua jenis pengujian yang dibutuhkan.
       
4. Test Case Developer
       
   Setelah memiliki framework yang tepat, selanjutnya adalah mengembangkan test case atau skenario pengujian yang akan dilakukan. Pada tahap ini, tester      harus memastikan bahwa test case tersebut mencakup semua jenis pengujian yang dibutuhkan, baik itu untuk memverifikasi fungsionalitas API, integrasi      dengan sistem lain, performa, atau keamanan.
       
5. Execution & Report
       
   Setelah memiliki test case yang lengkap, selanjutnya adalah menjalankan pengujian dan melakukan laporan hasil pengujian. Pada tahap ini, tester harus      memastikan bahwa semua test case dijalankan dengan benar, dan hasil pengujian terdokumentasi dengan baik. Selain itu, tester juga harus                    mengidentifikasi masalah atau bug yang ditemukan selama pengujian, dan memberikan rekomendasi perbaikan yang diperlukan.

### Perbedaan API Test dan Unit Test

1. Unit Test
    
   - Unit test biasanya dilakukan oleh developer, bertujuan untuk memverifikasi kebenaran fungsi-fungsi terpisah dalam kode program. 
       
   - Developer bisa mengakses source code, karena unit test dilakukan pada level kode yang sangat kecil.
       
   - Unit test hanya meliputi dasar fungsionalitas yang diuji dan skala testnya terbatas.
       
   - Unit test dilakukan pada tahap development sebelum melakukan build atau compiling.
       
2. API test
    
   - API test dilakukan oleh tester, bertujuan untuk memverifikasi fungsionalitas dari interface API secara keseluruhan, dan memastikan interaksi antara        client dan server berjalan sesuai dengan kebutuhan bisnis.
       
   - Pada API testing, tester tidak bisa mengakses source code, melainkan hanya berfokus pada fungsi API itu sendiri.
       
   - API test meliputi semua aspek fungsionalitas pada API, termasuk input/output, error handling, respons code, dan integrasi dengan sistem lainnya.
       
   - Skala test pada API testing lebih luas, mencakup semua lapisan dari API.
       
   - API test dilakukan setelah build atau compiling.

### API Testing Tools

1. Postman

2. Jmeter

3. Frisby.js

4. Rest-assured  