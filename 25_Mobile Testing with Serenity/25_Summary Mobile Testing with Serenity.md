# Resume Materi Mobile Testing

## Mobile Automation Testing with Appium

### Appium Intro

Appium merupakan sebuah frameworks mobile automation untuk menjalankan test mobile automation. Appium dapat support terhadap banyak bahasa pemograman seperti java, python, javascript, ruby, dll. Selain itu Appium juga support terhadapa berbagai platform seperti Android,iOS, dan Windows. Library yang dimiliki Appium dibuat diatas library selenium.

### Appium High Level Achitecture

Client - Appium Server - XCUITest - UIAutomator2/Espreso - WinAppDriver

### Appium Components

- Appium Server
  
  Appium Server merupakan jembatan antara perangkat yang akan diuji dan perintah yang dikirim dari Appium Client. Appium Server bertanggung jawab untuk mengatur dan mengelola pengujian aplikasi pada perangkat fisik atau emulator/simulator. Appium Server mendukung pengujian aplikasi berbasis Android dan iOS, serta menyediakan API yang digunakan oleh Appium Client untuk mengirim perintah ke perangkat yang akan diuji.

- Appium Client 
  
  Appium Client merupakan library yang ditulis dalam beberapa bahasa pemrograman (seperti Java, Python, Ruby, dan lain-lain) yang digunakan untuk membuat skrip pengujian. Appium Client menyediakan metode dan fungsi yang dapat digunakan untuk mengirim perintah ke Appium Server, seperti mengatur pengaturan perangkat, mengakses elemen UI, melakukan tindakan (seperti klik, swipe, input teks, dll.), dan memeriksa status aplikasi atau perangkat. 

### Beberapa hal yang diperlukan dalam menggunakan Appium

- Java Development Kit (JDK)
  
  Appium menggunakan Java untuk menjalankan beberapa fungsionalitasnya. Pastikan Anda telah menginstal JDK versi 8 atau 11, dan mengatur JAVA_HOME pada variabel lingkungan sistem Anda. Anda juga perlu memastikan bahwa JDK telah dikonfigurasi dengan benar pada sistem Anda.

- Android SDK Platform Tools & Command-line Tools
  
  Appium memerlukan Android SDK Platform Tools dan Command-line Tools untuk berinteraksi dengan perangkat Android atau emulator. Anda perlu menginstal Android SDK dan memastikan bahwa Platform Tools (seperti ADB dan Fastboot) serta Command-line Tools (seperti Android SDK Build Tools) telah diinstal dan dapat diakses dari baris perintah.

- Node.js
  
  Appium ditulis dalam bahasa JavaScript dan menggunakan Node.js sebagai runtime environment. Oleh karena itu, Anda perlu menginstal Node.js pada sistem Anda. Anda dapat mengunduh dan menginstal Node.js dari situs resminya (https://nodejs.org/).

- Appium Doctor
  
  Appium Doctor adalah alat yang membantu memeriksa ketersediaan dan konfigurasi komponen yang diperlukan untuk menjalankan Appium secara lokal. Anda dapat menginstal Appium Doctor sebagai paket npm (Node Package Manager) dan menjalankannya untuk memastikan bahwa Anda telah menginstal semua dependensi yang diperlukan dengan benar dan konfigurasi sistem Anda telah siap untuk menggunakan Appium.