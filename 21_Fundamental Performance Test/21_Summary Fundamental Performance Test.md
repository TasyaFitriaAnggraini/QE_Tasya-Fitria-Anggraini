# Resume Materi Fundamental Performance Test

## Performance Test

Performance Test merupakan teknik non fuctional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah berbagai beban (load) kerja. Performance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan (reliability) dan penggunaan sumber daya.

## Hal yang diukur dari Performance Testing

### Waktu Respons (Response Time)
  
Waktu yang diperlukan oleh sistem atau aplikasi untuk merespons suatu permintaan atau tindakan dari pengguna. Biasanya diukur dalam satuan waktu seperti detik atau milidetik.

### Kapasitas (Capacity)
  
Kemampuan sistem atau aplikasi untuk menangani jumlah pengguna atau beban kerja tertentu dalam satu waktu. Kapasitas dapat diukur dalam berbagai parameter seperti jumlah pengguna bersamaan, transaksi per detik, atau permintaan per detik.

### Ketersediaan (Availability)

Persentase waktu sistem atau aplikasi dapat diakses dan digunakan oleh pengguna tanpa mengalami downtime atau gangguan. Ketersediaan biasanya diukur dalam persentase, misalnya 99,9% yang artinya sistem atau aplikasi hanya mengalami downtime maksimal 0,1% dari waktu pengujian.

### Kestabilan (Stability)
  
Kemampuan sistem atau aplikasi untuk tetap berjalan stabil tanpa adanya crash, error, atau kegagalan lainnya selama periode pengujian.

### Skalabilitas (Scalability)
  
Kemampuan sistem atau aplikasi untuk berkembang dan menyesuaikan diri dengan meningkatnya beban kerja atau pengguna dalam jangka waktu yang lebih panjang.

### Penggunaan Sumber Daya (Resource Utilization)
  
Pengukuran terhadap penggunaan sumber daya seperti CPU, memori, jaringan, dan penyimpanan oleh sistem atau aplikasi selama periode pengujian.

### Performa pada Beban Kerja Ekstrem (Performance under Load)
  
Kemampuan sistem atau aplikasi untuk tetap berkinerja baik saat dihadapkan pada beban kerja yang sangat tinggi atau beban kerja ekstrem.

### Skor Kepuasan Pengguna (User Satisfaction Score)

Pengukuran subjektif yang dapat diperoleh dari pengguna atau pemangku kepentingan terkait pengalaman pengguna dalam menggunakan sistem atau aplikasi selama pengujian.


Pengukuran ini dapat memberikan gambaran komprehensif mengenai kinerja suatu sistem atau aplikasi dalam menghadapi beban kerja yang diberikan, dan dapat membantu identifikasi masalah kinerja yang perlu diperbaiki atau dioptimalkan guna meningkatkan performa secara keseluruhan.
  
## Alasan Performance Testing jarang digunakan 

Performance testing merupakan bagian yang penting dalam siklus pengembangan perangkat lunak. Namun, terdapat beberapa alasan mengapa performance testing jarang digunakan atau kurang diperhatikan:

### Fokus pada Fitur dan Fungsi
  
Dalam pengembangan perangkat lunak, sering kali fokus utama tim pengembang adalah pada pengembangan fitur dan fungsi dari aplikasi, sehingga pengujian kinerja dapat diabaikan atau dianggap sebagai prioritas yang lebih rendah.

### Keterbatasan Sumber Daya
  
Pengujian kinerja memerlukan sumber daya yang cukup, seperti hardware, perangkat lunak pengujian kinerja, dan lingkungan pengujian yang dapat meniru situasi yang sesungguhnya. Terkadang, terdapat keterbatasan sumber daya yang membuat sulit atau mahal untuk melakukan pengujian kinerja yang komprehensif.

### Waktu dan Anggaran yang Terbatas
  
Dalam proyek pengembangan perangkat lunak, sering kali terdapat batasan waktu dan anggaran yang terbatas. Performance testing yang memerlukan waktu dan upaya yang signifikan untuk dilakukan dengan benar dapat diabaikan atau dikurangi untuk menghemat waktu dan anggaran.

### Kurangnya Kesadaran tentang Pentingnya Performance Testing
  
Beberapa tim pengembang atau organisasi mungkin belum sepenuhnya menyadari pentingnya pengujian kinerja dalam menghadapi tantangan dan risiko kinerja sistem atau aplikasi yang buruk. Kurangnya pemahaman tentang manfaat dan nilai dari performance testing dapat membuatnya diabaikan atau kurang diprioritaskan.

### Tidak Diperlukan untuk Semua Jenis Aplikasi
  
Tidak semua jenis aplikasi memerlukan performance testing yang ekstensif. Beberapa aplikasi sederhana atau aplikasi internal yang hanya digunakan oleh sejumlah kecil pengguna mungkin tidak memerlukan pengujian kinerja yang rumit atau intensif.
  

Namun, penting untuk diingat bahwa performance testing merupakan bagian yang penting dalam memastikan kualitas dan kinerja optimal dari sebuah sistem atau aplikasi. Dalam beberapa kasus, kerugian akibat performance testing yang tidak terdeteksi dapat jauh lebih besar daripada biaya dan upaya yang dikeluarkan untuk melakukan pengujian kinerja dengan benar. Oleh karena itu, penting untuk mempertimbangkan dan melibatkan performance testing dalam proses pengembangan perangkat lunak untuk menghindari masalah kinerja yang berpotensi merugikan. 

## Hal yang perlu diperhatikan dalam melakukan Performance Testing

Tentu, Throughput dan Response Time adalah dua metrik utama yang perlu diperhatikan dalam performance testing, 

### Throughput
  
Throughput merupakan jumlah permintaan atau transaksi yang dapat dihasilkan oleh sistem dalam satuan waktu tertentu. Metrik ini mengukur seberapa efisien sistem dalam mengelola beban kerja yang diberikan. Biasanya diukur dalam transaksi per detik (transactions per second/tps) atau permintaan per detik (requests per second/rps). Semakin tinggi throughput, semakin baik kinerja sistem dalam menghadapi beban kerja yang tinggi.

### Response Time
  
Response time atau waktu respons merupakan waktu yang diperlukan untuk sistem memberikan respons terhadap permintaan yang diberikan. Metrik ini mengukur seberapa cepat sistem memberikan hasil tanggapan kepada pengguna setelah permintaan diterima. Biasanya diukur dalam milidetik atau mikrodetik. Semakin rendah response time, semakin cepat sistem memberikan respons kepada pengguna, dan semakin baik pengalaman pengguna.

## Jenis Performance Testing

### Load Testing
  
Jenis pengujian ini melibatkan pemberian beban atau volume pengguna atau transaksi yang sudah ditentukan ke sistem untuk mengevaluasi kinerjanya dalam kondisi beban yang diharapkan atau puncak. Tujuannya adalah untuk mengetahui seberapa baik sistem menangani beban yang diharapkan dan apakah memenuhi persyaratan kinerja.

### Stress Testing
  
Pengujian ini melibatkan pemberian beban atau volume pengguna atau transaksi yang berlebihan ke sistem untuk mengevaluasi kinerjanya melebihi kapasitas normalnya. Tujuannya adalah untuk mengidentifikasi titik batas sistem, mengukur stabilitas dan kemampuan pemulihan, serta menentukan bagaimana sistem berperilaku dalam kondisi beban yang ekstrem.
  
### Endurance Testing
  
Pengujian akan ketahanan melibatkan pemberian beban atau volume pengguna atau transaksi yang berkelanjutan ke sistem selama periode waktu yang lama untuk mengevaluasi kinerjanya dan stabilitasnya dalam kondisi beban yang berlangsung terus-menerus. Tujuannya adalah untuk mengidentifikasi degradasi kinerja atau masalah yang mungkin terjadi seiring berjalannya waktu, seperti kebocoran memori atau kehabisan sumber daya.  

### Spike Testing
  
Pengujian ini melibatkan perubahan tiba-tiba dan ekstrem dalam beban atau volume pada sistem untuk mengevaluasi kinerjanya dan skalabilitasnya dalam menghadapi lonjakan tak terduga dalam lalu lintas pengguna atau beban kerja. Tujuannya adalah untuk menentukan seberapa baik sistem dapat menghadapi perubahan beban yang tiba-tiba dan drastis, serta seberapa cepat sistem pulih ke tingkat kinerja normal.
  
### Soak Testing
  
Pengujian ini melibatkan pemberian beban atau volume pengguna atau transaksi yang konstan ke sistem selama periode waktu yang lama untuk mengevaluasi kinerjanya dan stabilitasnya dalam kondisi beban yang berlangsung lama. Tujuannya adalah untuk mengidentifikasi degradasi kinerja atau masalah yang mungkin terjadi seiring berjalannya waktu, seperti kebocoran memori atau kehabisan sumber daya.  
  
### Scalability Testing
  
Pengujian ini melibatkan evaluasi kemampuan sistem untuk dapat berkembang atau mengecil dalam menghadapi peningkatan atau penurunan beban atau volume pengguna atau transaksi. Tujuannya adalah untuk menentukan batasan kinerja sistem dan kemampuannya dalam menghadapi berbagai tingkatan beban tanpa degradasi kinerja yang signifikan.
  
### Configuration Testing
  
Pengujian ini melibatkan evaluasi kinerja sistem dalam konfigurasi yang berbeda, seperti konfigurasi perangkat keras, jaringan, atau perang  