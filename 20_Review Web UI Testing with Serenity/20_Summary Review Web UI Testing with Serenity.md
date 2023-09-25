# Resume Materi Review Web UI Testing with Serenity

## Web Automation Testing

Web Automation Testing merupakan suatu cara yang digunakan untuk melakukan testing terhadap web yang dibuat dengan cara seperti layaknya manusia yang melakukan kegiatan di dalam website tersebut, di sini QA memastikan apa yang dikerjakan Software Engineer sudah benar dan tidak ada lagi permaslahan dalam website tersebut. Web automation ini terpisah dari unit test yang ada.

## Serenity

Serenity merupakan sebuah framework open source yang digunakan untuk melakukan pengujian perangkat lunak secara otomatis yang terstruktur dengan baik.

### Serenity BDD Architecture

#### Requirements
  
  Spesifikasi tingkat tinggi untuk perangkat lunak yang dikembangkan atau diuji. Kebutuhan biasanya ditulis dalam   bahasa alami dan digunakan untuk memandu proses pengembangan dan pengujian.

#### Tests
  
  Skrip pengujian otomatis yang memverifikasi bahwa perangkat lunak memenuhi kebutuhan. Pengujian dalam Serenity     BDD ditulis dalam bahasa Gherkin, bahasa domain-specific untuk menggambarkan perilaku.

#### Steps
  
  Setiap langkah sesuai dengan tindakan yang perlu dilakukan selama pengujian, seperti mengklik tombol atau         memasukkan teks ke dalam formulir.
  
#### Pages
  
  Mewakili halaman atau layar yang berbeda dari aplikasi yang diuji. Halaman diimplementasikan sebagai Page         Objects, yang mengenkapsulasi perilaku dan status setiap halaman.
  
#### Reports
  
  Serenity BDD menghasilkan laporan terperinci dan dapat disesuaikan yang menunjukkan pengujian mana yang berhasil   dan gagal, serta informasi tentang lingkungan pengujian, data pengujian, dan kesalahan yang terjadi. 
  
## BDD Framework with Cucumber

#### Write Story 

  Menggunakan sintaks Gherkin, menuliskan story dalam format "Feature" dan "Scenario" yang menggambarkan perilaku   yang diharapkan dari aplikasi.

#### Configure Stories
  
  Mengimplementasikan step-step pada skenario yang telah ditulis, dan menambahkan kode untuk mengkonfigurasi         environment yang dibutuhkan untuk menjalankan skenario tersebut.

#### Browser Interaction
  
  Mendeskripsikan step-step pada skenario untuk berinteraksi dengan browser, seperti membuka halaman web, mengisi   form, atau mengklik tombol.

#### Run Story
  
  Menjalankan skenario dengan menjalankan file test yang sudah dibuat sebelumnya.

#### View Report
  
  Melihat hasil dari test yang sudah dilakukan, yang biasanya terdiri dari narasi, screenshot, dan informasi         detail tentang hasil test. Report ini dapat digunakan untuk membantu memperbaiki bugs dan meningkatkan kualitas   aplikasi secara keseluruhan.

## Preparation Tool

#### Maven
  
  Alat manajemen proyek yang dapat membantu dalam mengelola dependensi dan membangun proyek secara otomatis. Dalam   proyek Serenity BDD, Maven digunakan untuk mengatur dependensi dan menghasilkan laporan.
  
#### Homebrew
  
  Manajer paket untuk MacOS yang memungkinkan instalasi perangkat lunak dan pustaka pihak ketiga dengan mudah.       Homebrew dapat digunakan untuk menginstal Chrome dan alat-alat lain yang diperlukan untuk mengembangkan aplikasi   web.

#### Chrome
  
  Browser web yang sering digunakan untuk menguji aplikasi web. Dalam proyek Serenity BDD, Chrome digunakan         sebagai browser default untuk menjalankan pengujian otomatis.

#### Intellij IDEA
  
  Pengembangan terintegrasi (IDE) yang dapat digunakan untuk mengembangkan aplikasi Java dan Serenity BDD.           IntelliJ IDEA menyediakan fitur-fitur seperti debugging, autocompletion, dan integrasi dengan Maven untuk         memudahkan pengembangan proyek Serenity BDD.