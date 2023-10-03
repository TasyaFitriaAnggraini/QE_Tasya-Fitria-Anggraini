# Post Processor & Understanding JMeter Result

https://docs.google.com/document/d/11WwN_wzQmfmF7pZlJNiAPlbVGfR-bCnnUaYht2AIQe8/edit?usp=sharing

## Soal Post Processor & Understanding JMeter Result

Lakukan pengujian performa dengan JMeter pada sebuah aplikasi pemesanan tiket pesawat berikut dengan

https://blazedemo.com/

Kriteria dari pengujian adalah sebagai berikut:

1. Fitur yang diuji adalah fitur pembelian tiket penerbangan.
2. Terapkan penggunaan post processor.
3. Lampirkan screenshot hasil pengujian performa pada fitur pembelian tiket penerbangan. Jelaskan hasil pengujian yang dilakukan.

Jawab :

<img width="1680" alt="28 - View Result Tree" src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/23_Post%20Processor%20%26%20Understanding%20JMeter%20Result/Screenshot/TaksPraktikum/Screenshot%202023-10-03%20143924.png">

Tahapan yang pertama dalam pengujian Post Processor yaitu dengan melakukan beberapa request sesuai dengan kriteria pengujian yang ditetapkan. Pada pengujian menggunakan JMeter kali ini menerapkan kriteria pengujian pada tiket pembelian pesawat terbang yang meliputi 
1. Pemilihan keberangkatan dan tujuan
2. Pilih penerbangan
3. Melakukan pembayaran tiket. 

Pada tahapan ini maka dibuatkan 3 request sesuai dengan kriteria yang diuji sesuai hasil pengujian diatas.

<img width="1680" alt="14 - Debug Sampler_VRT (Response data and body)" src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/23_Post%20Processor%20%26%20Understanding%20JMeter%20Result/Screenshot/TaksPraktikum/Screenshot%202023-10-03%20143950.png">

Setelah request dibuat sesuai dengan kriteria pengujian maka tahapan selanjutnya yaitu dengan membuat debug server. Debug server di sini bertujuan untuk melihat hasil dari request yang dilakukan seperti melihat respon code atau respon body dari request yang didapat sehingga dapat dilakukan tahapan selanjutnya yang berupa assertion untuk melakukan validasi terhadap respon yang diberikan apakah sudah sesuai atau belum.

<img width="1680" alt="30 - Summary Report" src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/23_Post%20Processor%20%26%20Understanding%20JMeter%20Result/Screenshot/TaksPraktikum/Screenshot%202023-10-03%20144014.png">

Selanjutnya, untuk melihat hasil dari assertion yang dilakukan maka kita perlu membuat listener yaitu summary report yang menampilkan hasil dari request yang dilakukan secara detail. Pada summary report ini juga digunakan untuk mengetahui rata rata response time, throughput, persentase error, dan seterusnya. 

<img width="1680" alt="29 - View Result in Table" src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/23_Post%20Processor%20%26%20Understanding%20JMeter%20Result/Screenshot/TaksPraktikum/Screenshot%202023-10-03%20144050.png">

Selain itu cara lain yang dapat dilakukan untuk melihat detail request yang dilakukan yaitu melalui view result in Table. Dalam hal ini berisi hasil request beserta label, status request, dan lain-lain. 

<img width="1680" alt="31 - Aggregate Report" src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/23_Post%20Processor%20%26%20Understanding%20JMeter%20Result/Screenshot/TaksPraktikum/Screenshot%202023-10-03%20144138.png">

Untuk yang terakhir yang digunakan untuk mengetahui performa dari aplikasi atau post processor yang dilakukan yaitu melalui aggregate result. Dalam hal ini hal yang dapat diamati yaitu pada throughput. Sebagai contoh throughput pada choose departure and destination yaitu 1.7/sec hal ini berarti bahwa request dapat ditangani 1.7 request per detik.

Berdasarkan data report dari pengujian menggunakan JMeter, dapat diambil kesimpulan:

Dari hasil pengujian dapat diperoleh informasi mengenai throughput pada setiap tahapan pengujian, misalnya pada tahapan "choose departure and destination" memiliki throughput sebesar 1.7/sec, yang artinya aplikasi mampu menangani 1.7 request per detik dalam tahapan tersebut. Informasi ini dapat digunakan untuk mengevaluasi performa aplikasi atau post processor yang diuji, dan dapat menjadi dasar untuk pengambilan keputusan atau perbaikan dalam pengembangan aplikasi atau post processor yang sedang diuji.