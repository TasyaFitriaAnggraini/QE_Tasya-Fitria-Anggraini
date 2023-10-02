# Summary Resume Materi Introduction JMeter and Tutorial Record with JMeter

## Apache JMeter

Apache JMeter adalah perangkat lunak open-source yang sepenuhnya berbasis aplikasi desktop Java, yang awalnya dirancang untuk load testing aplikasi web dan pengukuran kinerja situs web. Namun, seiring berjalannya waktu, Apache JMeter telah diperluas untuk mendukung fungsi pengujian lainnya seperti pengujian API, pengujian database, pengujian aplikasi desktop, dan banyak lagi. JMeter menyediakan antarmuka pengguna berbasis GUI yang dapat digunakan untuk membuat skenario pengujian yang kompleks, serta fitur-fitur pemantauan kinerja, analisis hasil pengujian, dan kemampuan untuk memvalidasi perilaku fungsional aplikasi web.

## Pros of JMeter

### Open source
  
  JMeter merupakan perangkat lunak sumber terbuka, sehingga pengguna dapat mengakses dan memeriksa kode sumbernya. Jika terdapat masalah, pengguna dapat melihat sendiri bagian mana yang menjadi permasalahan, dan dapat melakukan modifikasi atau perbaikan jika diperlukan.
  
### Easy to use with GUI or Non GUI

  JMeter menyediakan antarmuka pengguna berbasis grafis (GUI) yang mudah digunakan, sehingga pengguna dapat membuat, mengkonfigurasi, dan menjalankan pengujian kinerja dengan pendekatan visual. Selain itu, JMeter juga dapat digunakan dalam mode tanpa GUI (non-GUI), yang memungkinkan otomatisasi dan integrasi dengan sistem atau alat lain.

## Components of JMeter Script

### Test Plan 
  
  Test Plan merupakan rencana utama yang akan dijalankan dalam JMeter sebagai induk dari seluruh skrip tes. Test Plan digunakan untuk mengatur pengaturan global, mengatur thread groups, dan menyediakan konfigurasi umum untuk seluruh skenario tes.
  
### Thread Groups

  Thread Groups merupakan kelompok thread atau pengguna yang akan dijalankan dalam skenario tes. Setiap thread group dapat memiliki pengaturan sendiri untuk mengatur jumlah pengguna (thread), interval waktu antara pengguna, dan durasi pengujian.
  
### Samplers

  Sampler merupakan komponen yang digunakan untuk mengirimkan request ke server yang sedang diuji. Samplers dapat berupa HTTP request, FTP request, JDBC request, atau request ke protokol lainnya, tergantung pada jenis tes yang akan dilakukan.

### Config Elements

  Config Elements merupakan komponen yang digunakan untuk mengatur konfigurasi atau modifikasi pada request yang dikirimkan ke server. Contohnya, HTTP Header Manager untuk mengatur header dalam request HTTP, atau JDBC Connection Configuration untuk mengatur koneksi ke database.
  
### Listeners
  
  Listeners merupakan komponen untuk merekam data atau hasil dari tes yang telah dilakukan. Listeners dapat digunakan untuk memantau, mengumpulkan, dan menganalisis hasil tes dalam berbagai format, seperti tabel, grafik, atau laporan.

### Timers 
  
  Timers merupakan fitur untuk mengatur interval waktu antara eksekusi request dalam skenario tes. Timers dapat digunakan untuk mengatur jeda waktu antara pengiriman request, mengatur waktu delay sebelum eksekusi tes, atau mengatur waktu timeout.

### Assertions
  
  Assertions merupakan komponen untuk melakukan verifikasi atau pengecekan pada response yang diterima dari server. Assertions digunakan untuk memastikan bahwa response yang diterima sesuai dengan kriteria yang telah ditentukan, seperti memeriksa keberadaan elemen atau nilai dalam response, atau memeriksa kode status HTTP.

### Pre-post Processors
  
  Pre-post Processors merupakan fitur untuk memproses data response sebelum atau sesudah eksekusi tes. Pre-processors dapat digunakan untuk melakukan modifikasi pada request yang akan dikirimkan ke server, seperti mengganti nilai parameter, melakukan ekstraksi data dari response, atau melakukan operasi lainnya sebelum request dikirimkan. Post-processors juga dapat digunakan untuk memproses data response yang diterima dari server, seperti melakukan ekstraksi data, melakukan validasi, atau melakukan operasi lainnya setelah response diterima.

## Tools

### Apache JMeter
  
  Apache JMeter merupakan salah satu load testing tools yang populer dan open-source. JMeter mendukung berbagai protokol seperti HTTP, HTTPS, FTP, JDBC, JMS, dan lainnya. JMeter menyediakan antarmuka pengguna berbasis GUI yang mudah digunakan dan dapat digunakan untuk membuat skenario pengujian yang kompleks.
  
### K6.io

  K6.io merupakan load testing tools yang modern dan open-source yang ditulis dalam bahasa pemrograman Go. K6.io menyediakan script pengujian yang mudah digunakan dengan sintaks yang sederhana dan dapat digunakan untuk menguji aplikasi berbasis web, API, atau protokol lainnya.

### Locust

  Locust merupakan load testing tools open-source yang ditulis dalam bahasa pemrograman Python. Locust menggunakan pendekatan berbasis skenario yang dapat didefinisikan dalam kode Python, sehingga pengguna dapat membuat skenario pengujian yang fleksibel dan dapat disesuaikan sesuai dengan kebutuhan.

### BlazeMeter
  
  BlazeMeter merupakan load testing tools yang menawarkan solusi load testing yang terkelola. BlazeMeter menyediakan fitur-fitur seperti pengujian skala besar, pemantauan kinerja secara real-time, dan integrasi dengan load testing tools open-source seperti JMeter dan Gatling.
  
### LoadNinja

  LoadNinja merupakan load testing tools yang berbasis cloud yang menyediakan load testing dengan antarmuka pengguna berbasis web yang mudah digunakan. LoadNinja memungkinkan pengguna untuk merekam skenario pengujian menggunakan browser web, dan menyediakan fitur pemantauan kinerja secara real-time serta analisis hasil pengujian yang komprehensif.