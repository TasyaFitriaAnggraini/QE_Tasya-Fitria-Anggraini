# 9 - From Manual to Automation Testing & BDD

## Soal From Manual to Automation Testing

https://docs.google.com/document/d/14JBsVyk1yTr1Q68aq9bbCPAodljU8qYB/edit?usp=sharing&ouid=116269043888314414582&rtpof=true&sd=true

### Jelaskan jenis-jenis dari performance testing (minimal: 3)

Jawab:

Performance testing merupakan teknik pengujian perangkat lunak non-fungsional yang menentukan bagaimana stabilitas, kecepatan, skalabilitas, dan           daya tanggap aplikasi bertahan di bawah beban kerja yang diberikan.
Terdapat lima jenis pengujian kinerja, yaitu sebagai berikut:

#### Load Testing

Load testing merupakan pengujian yang bertujuan untuk menentukan seberapa besar beban penggunaan sistem yang dapat diatasi sebelum performa sistem         menurun. Beban dapat berasal dari jumlah pengguna yang menggunakan sistem, data yang diproses oleh sistem, atau seberapa sering pengguna mengakses         sistem. Hasil dari load testing akan membantu pengembang dalam menentukan jumlah maksimal penggunaan sistem yang dapat diatasi sebelum terjadi             penurunan performa.

#### Stress Testing
  
Stress testing merupakan pengujian yang bertujuan untuk menentukan seberapa besar beban yang dapat ditangani oleh sistem sebelum sistem mengalami           kegagalan. Beban yang diberikan dalam stress testing biasanya melebihi batas maksimal dari beban yang seharusnya dapat ditangani oleh sistem. Hasil         dari stress testing dapat membantu pengembang dalam menentukan batasan-batasan maksimal yang harus diterapkan pada sistem agar tidak mengalami             kegagalan.

#### Soak Testing
  
Soak testing merupakan pengujian yang bertujuan untuk menentukan apakah sistem dapat menangani beban penggunaan dalam jangka waktu yang lama. Soak         testing dapat dilakukan dalam waktu yang lama, mulai dari beberapa jam hingga beberapa hari, untuk mengetahui apakah sistem dapat menangani beban           dalam jangka waktu yang panjang tanpa mengalami penurunan performa atau kegagalan. Hasil dari soak testing akan membantu pengembang dalam menentukan       apakah sistem dapat digunakan dalam jangka waktu yang lama tanpa mengalami penurunan performa.

#### Endurance Testing
  
Endurance Testing merupakan jenis pengujian kinerja yang bertujuan untuk menguji kemampuan sistem dalam menangani beban dalam jangka waktu yang lama.       Pengujian ini dilakukan dengan memberikan beban pada sistem selama jangka waktu yang lama, untuk memeriksa apakah sistem mampu menangani beban dengan       konsisten dan memberikan respons yang tepat dalam jangka waktu yang lama. Hasil dari pengujian Endurance Testing akan memberikan informasi seberapa         baik sistem dapat menangani beban dalam jangka waktu yang lama, apakah sistem mampu mempertahankan kinerjanya, serta mengetahui apakah ada efek yang       terjadi pada sistem setelah menangani beban dalam jangka waktu yang lama.

#### Spike Testing
  
Spike Testing merupakan jenis pengujian kinerja yang bertujuan untuk menguji kemampuan sistem dalam menangani beban yang tiba-tiba naik atau turun         secara signifikan dalam waktu singkat. Pengujian ini dilakukan dengan memberikan beban yang tiba-tiba naik atau turun pada sistem dalam waktu singkat,     untuk memeriksa apakah sistem mampu menangani perubahan beban secara cepat dan stabil, serta memberikan respons yang tepat. Hasil dari pengujian Spike     Testing akan memberikan informasi seberapa cepat sistem dapat menyesuaikan diri dengan perubahan beban dan apakah sistem mampu menangani lonjakan lalu     lintas yang tiba-tiba.

### Sebutkan dan jelaskan tools yang dapat digunakan untuk melakukan performance testing (minimal: 3)

Jawab: 

#### JMeter
  
JMeter merupakan tool open-source yang digunakan untuk melakukan pengujian kinerja pada aplikasi web. Tool ini dapat menghasilkan beban pengguna           dengan cara merekam skenario pengujian atau membuat skenario pengujian secara manual. Selain itu, JMeter juga memiliki fitur untuk mengukur waktu           respon, throughput, dan CPU utilization dari aplikasi web yang diuji.

#### Frisby.js
  
Frisby.js merupakan tool open-source yang digunakan untuk melakukan pengujian kinerja pada API. Tool ini menggunakan bahasa pemrograman JavaScript         dan menyediakan fitur untuk mengirim request HTTP, melakukan asserstion pada response, serta memeriksa waktu respon. Frisby.js juga dapat                   diintegrasikan dengan tool testing seperti Jasmine atau Mocha.

#### Serenity 
  
Serenity merupakan tool open-source yang digunakan untuk melakukan pengujian kinerja pada aplikasi web dan API. Tool ini menggunakan bahasa                 pemrograman Java dan menyediakan fitur untuk mengirim request HTTP, melakukan asserstion pada response, serta memeriksa waktu respon. Selain itu,           Serenity juga memiliki fitur untuk membuat laporan pengujian yang interaktif dan mudah dibaca. Tool ini dapat diintegrasikan dengan tool testing           seperti JBehave atau Cucumber.

#### LoadRunner
  
LoadRunner merupakan tool komersial yang digunakan untuk melakukan pengujian kinerja pada berbagai jenis aplikasi, termasuk aplikasi web, mobile,           desktop, dan lain-lain. Tool ini menyediakan fitur untuk merekam dan memutar ulang skenario pengujian, memonitor kinerja sistem, serta menganalisis         hasil pengujian. LoadRunner juga dapat menangani pengujian pada beban tinggi, simulasi pengguna secara real-time, dan pengujian pada lingkungan yang       kompleks.

#### Postman
  
Postman merupakan tool komersial yang digunakan untuk melakukan pengujian kinerja pada API. Tool ini menyediakan fitur untuk mengirim request HTTP,         melakukan asserstion pada response, serta memeriksa waktu respon. Selain itu, Postman juga memiliki fitur untuk menguji keamanan API, memonitor             kinerja API, dan menganalisis hasil pengujian.

#### Gatling
  
Gatling merupakan tool open-source yang digunakan untuk melakukan pengujian kinerja pada aplikasi web. Tool ini dapat menghasilkan beban pengguna           dengan cara merekam skenario pengujian atau membuat skenario pengujian secara manual, serta mengukur waktu respon, throughput, dan CPU utilization         dari aplikasi web yang diuji. Selain itu, Gatling juga memiliki fitur untuk memvisualisasikan hasil pengujian dengan grafik yang mudah dipahami. Tool       ini juga dapat diintegrasikan dengan CI/CD untuk melakukan pengujian secara otomatis.

#### Rest-Assured
  
Rest-Assured merupakan library open-source yang digunakan untuk melakukan pengujian kinerja pada API dengan menggunakan bahasa pemrograman Java. Tool       ini menyediakan fitur untuk mengirim request HTTP, melakukan asserstion pada response, serta memeriksa waktu respon. Rest-Assured juga dapat               diintegrasikan dengan tool testing seperti TestNG atau JUnit.	