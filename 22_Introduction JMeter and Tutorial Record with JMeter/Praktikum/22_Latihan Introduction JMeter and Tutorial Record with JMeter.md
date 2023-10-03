# 12 - Fundamental Performance Test & Performance Testing with JMeter

https://docs.google.com/document/d/1HlNnCAobmi1N7zE01Y3iV-jk6NOisM-A_Q0oQX58rLs/edit?usp=sharing

## Soal Introduction & Tutorial Record with JMeter

Lakukan pengujian performa dengan JMeter pada sebuah aplikasi pemesanan tiket pesawat berikut dengan

https://blazedemo.com/ 

Fitur yang diuji adalah sebagai berikut:

1. Mencari Jadwal Penerbangan
2. Memilih Jadwal Penerbangan
3. Membeli Tiket

Jawab:

<img width="1680" alt="30 - Aggregate Report" src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/22_Introduction%20JMeter%20and%20Tutorial%20Record%20with%20JMeter/Screenshot/TaksPraktikum/Screenshot%202023-10-03%20132915.png">

Hasil result record menggunakan View Result Tabel pada JMeter yang terdiri dari tiga label masing-masing adalah Reserve, Purchase, dan Confirmation. Pengujian pada ketiga label tersebut dinyatakan berhasil (“Passed") dengan waktu sampel yang beragam, yaitu 599 ms untuk "Reserve", 374 ms untuk "Purchase", dan 430 ms untuk "Confirmation". Jumlah bytes yang diterima dan dikirimkan, latency, serta waktu koneksi juga terekam untuk setiap label. Informasi ini dapat digunakan untuk mengevaluasi kinerja ketiga label dalam pengujian dan memastikan bahwa hasilnya sesuai dengan ekspektasi.

<img width="1680" alt="30 - Aggregate Report" src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/22_Introduction%20JMeter%20and%20Tutorial%20Record%20with%20JMeter/Screenshot/TaksPraktikum/Screenshot%202023-10-03%20133806.png">

Hasil record menggunakan Summary Report dengan JMeter menunjukkan tiga label yaitu "Reserve", "Purchase", dan "Confirmation". Data yang tercatat meliputi rata-rata waktu respon (average), waktu respon minimum (min), waktu respon maksimum (max), standar deviasi (std.dev), persentase error (error %), throughput (jumlah transaksi per detik), rate penerimaan data (received KB/sec), rate pengiriman data (sent KB/sec), serta rata-rata bytes yang diterima (avg.bytes). Seluruh label menunjukkan error rate 0% dan menunjukkan performa yang baik dalam menghadapi beban uji, dengan throughput tertinggi pada label "Purchase" sebesar 2.7 transaksi per detik.

<img width="1680" alt="30 - Aggregate Report" src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/22_Introduction%20JMeter%20and%20Tutorial%20Record%20with%20JMeter/Screenshot/TaksPraktikum/Screenshot%202023-10-03%20134130.png">

Hasil record menggunakan Aggregate Report dengan JMeter menunjukkan tiga label yaitu "Reserve", "Purchase", dan "Confirmation". Data yang tercatat meliputi rata-rata waktu respon (average), waktu respon median (median), waktu respon pada persentil ke-90% (90% line), waktu respon pada persentil ke-95% (95% line), waktu respon pada persentil ke-99% (99% line), waktu respon minimum (min), waktu respon maksimum (max), persentase error (error %), throughput (jumlah transaksi per detik), rate penerimaan data (received KB/sec), dan rate pengiriman data (sent KB/sec). Seluruh label menunjukkan error rate 0% dan throughput tertinggi pada label "Purchase" sebesar 2.3 transaksi per detik, menunjukkan performa yang baik dalam menghadapi beban uji.

Berdasarkan data report dari pengujian menggunakan JMeter diatas dapat diambil beberapa kesimpulan secara umum, antara lain: 

1. Ketiga label pengujian, yaitu "Reserve", "Purchase", dan "Confirmation" dinyatakan berhasil ("Passed") dalam pengujian dengan waktu sampel yang beragam.    Waktu respon tercepat terdapat pada label "Purchase" sebesar 374 ms, diikuti oleh "Confirmation" sebesar 430 ms, dan "Reserve" sebesar 599 ms.
2. Seluruh label pengujian menunjukkan error rate sebesar 0%, yang menunjukkan bahwa tidak ada kesalahan dalam proses pengujian, dan sistem bekerja dengan    baik dalam menghadapi beban uji.
3. Dilihat dari throughput, label "Purchase" memiliki nilai throughput tertinggi, yaitu sebesar 2.7 transaksi per detik pada Summary Report dan 2.3            transaksi per detik pada Aggregate Report, menunjukkan bahwa label "Purchase" memiliki performa yang baik dalam menghadapi beban uji.
4. Data lainnya yang tercatat dalam report, seperti jumlah bytes yang diterima dan dikirimkan, latency, waktu koneksi, rata-rata waktu respon, waktu respon    minimum dan maksimum, serta persentase error, dapat digunakan untuk mengevaluasi kinerja ketiga label pengujian dan memastikan bahwa hasilnya sesuai        dengan ekspektasi. 

Berdasarkan kesimpulan tersebut, dapat disimpulkan bahwa pengujian menggunakan JMeter menunjukkan bahwa sistem dalam kondisi baik dan mampu menghadapi beban uji dengan performa yang memuaskan pada ketiga label pengujian, namun label "Purchase" menunjukkan nilai throughput yang lebih tinggi dibandingkan dengan label lainnya. Oleh karena itu, dapat diperhatikan area yang memerlukan perbaikan untuk label "Reserve" dan "Confirmation" guna meningkatkan performa keseluruhan sistem. 