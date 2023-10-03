# Resume Materi Post Processor & Understanding Jmeter Results

## Post Processor 

Post Processor merupakan salah satu komponen dalam Test Plan pada Apache JMeter yang berfungsi sebagai tindakan yang dijalankan setelah proses pengujian dilakukan, khususnya setelah melakukan sebuah request ke alamat web. Post Processor umumnya digunakan untuk mengekstrak data atau nilai-nilai dari hasil respon yang diterima dari alamat web, seperti data dalam format JSON atau bagian lain dari response. Post Processor dapat digunakan untuk memproses dan mengambil data yang diperlukan dari respon, dan kemudian menyimpannya untuk digunakan dalam langkah-langkah berikutnya dalam skenario pengujian. Post Processor sangat berguna dalam mengambil data dinamis yang dihasilkan oleh aplikasi web, seperti token keamanan atau session ID, yang kemudian dapat digunakan dalam langkah-langkah pengujian berikutnya untuk memvalidasi perilaku aplikasi secara dinamis. 

## JSON Path 

JSON Path merupakan salah satu metode yang digunakan dalam Apache JMeter untuk mengekstrak isi dari respon JSON yang diterima dari server. Beberapa ekspresi umum yang digunakan dalam JSON Path antara lain:

### $ 
  
  Root element dalam JSON response

### . 
  
  Child operator (object) yang digunakan untuk mengakses objek dalam JSON

### [] 
  
  Child operator (array) yang digunakan untuk mengakses elemen dalam array JSON
  
### .. 

  Recursive descent yang digunakan untuk langsung mengakses objek dalam JSON
  
### * 
  
  Wild card (all things) yang digunakan untuk mencocokkan semua elemen dalam JSON
  
### [start:end] 

  Array slice operator borrowed yang digunakan untuk mengakses sebagian dari array JSON, dimana start adalah indeks awal dan end adalah indeks akhir

## JMeter Post Processor

JMeter Post Processor bukanlah inti dari performance testing, tetapi merupakan salah satu komponen yang digunakan dalam Apache JMeter untuk melakukan pengolahan data setelah menerima respon dari server dalam skenario pengujian. Performance testing lebih berkaitan dengan mengukur dan memantau kinerja aplikasi atau sistem dalam menghadapi beban kerja yang tinggi, untuk mengidentifikasi masalah kinerja, dan mengoptimalkan performa aplikasi atau sistem.

Namun, JMeter Post Processor dapat menjadi komponen penting dalam pengujian performa, terutama dalam situasi dimana data yang diterima dari server harus diolah atau diekstrak untuk digunakan dalam langkah-langkah berikutnya dalam skenario pengujian. Misalnya, dalam load testing untuk aplikasi web yang melibatkan respon dalam format JSON, Post Processor dapat digunakan untuk mengekstrak data dari respon JSON, seperti token keamanan atau session ID, yang kemudian dapat digunakan dalam langkah-langkah pengujian berikutnya untuk memvalidasi perilaku aplikasi secara dinamis.

Namun, komponen inti dari performance testing dalam JMeter adalah Thread Groups, Samplers, dan Listeners. Thread Groups digunakan untuk mengatur jumlah thread atau pengguna virtual yang akan menjalankan skenario pengujian, Samplers digunakan untuk mengirimkan permintaan ke server, dan Listeners digunakan untuk merekam dan menganalisis hasil pengujian. Post Processor merupakan komponen tambahan yang membantu dalam pengolahan data setelah respon diterima, tetapi bukan inti dari performance testing.