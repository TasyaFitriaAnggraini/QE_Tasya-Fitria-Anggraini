# Resume Materi Behaviour Driven Development (BDD)

## Behaviour Driven Development (BDD)

- Proses pengembangan perangkat lunak yang fokus pada definisi dan implementasi kebutuhan perangkat lunak berdasarkan perilaku sistem yang diinginkan

- Menekankan kolaborasi dan komunikasi antara pengembang, asuransi kualitas, dan perwakilan pelanggan

- Menggunakan sintaks "Given-When-Then" (GWT) untuk mendefinisikan perilaku sistem yang diharapkan

- Membantu memastikan perangkat lunak yang dikembangkan sejalan dengan kebutuhan pelanggan dan menghindari kesalahan umum dalam pengembangan perangkat       lunak

## Format Behaviour Driven Development (BDD)

User story -> As X I want Y, so that Z -> Scenario -> Given, When, Then

Keterangan:

- User Story

  Deskripsi dari perspektif pengguna tentang bagaimana perangkat lunak akan digunakan dan tujuan dari penggunaannya. Formatnya adalah "Sebagai [role],       saya ingin [tindakan], sehingga [tujuan]"
  
- Scenario

  Contoh kasus yang menjelaskan cara penggunaan perangkat lunak dalam situasi tertentu
  
- Given

  Kondisi awal atau prasyarat yang harus terpenuhi sebelum melakukan tindakan
  
- When
  
  Tindakan atau aktivitas yang dilakukan oleh pengguna
  
- Then
  
  Hasil yang diharapkan setelah tindakan dilakukan

## Gherkin

- Bahasa pemrograman ringan yang digunakan dalam pengembangan perangkat lunak dan umumnya digunakan dalam proses pengembangan perangkat lunak yang           berorientasi pada BDD

- Dirancang untuk memfasilitasi komunikasi antara pemangku kepentingan bisnis dan tim pengembangan dalam mengidentifikasi dan memahami kebutuhan bisnis dan   persyaratan fungsional untuk fitur perangkat lunak.

## Cucumber 

- Alat perangkat lunak yang mendukung pengembangan berbasis perilaku (BDD)

- Fitur utamanya adalah parser bahasa sehari-hari yang disebut Gherkin

- Memungkinkan perilaku perangkat lunak yang diharapkan dijelaskan dalam bahasa logis yang mudah dipahami oleh pelanggan

- Memfasilitasi kolaborasi antara tim pengembangan dalam menjelaskan persyaratan dan perilaku perangkat lunak yang diharapkan

- Menggunakan skenario Gherkin sebagai masukan untuk menghasilkan tes otomatis untuk memvalidasi perilaku perangkat lunak

## Serenity 

- Kerangka pengujian sumber terbuka yang digunakan untuk mengotomatisasi dan melaporkan pengujian pada proyek yang dibangun menggunakan BDD dan TDD

- Memungkinkan pengembang dan asuransi kualitas untuk menulis skenario pengujian dalam bahasa Gherkin yang mudah dibaca dan dipahami

- Menjalankan skenario pengujian sebagai tes otomatis, menghasilkan laporan tes yang sangat informatif dan mudah dipahami

- Laporan tes mencakup informasi rinci tentang keberhasilan dan kegagalan tes, termasuk tangkapan layar yang menjelaskan masalah, log yang dihasilkan         selama pengujian, dan diagram Gantt dan diagram lingkaran