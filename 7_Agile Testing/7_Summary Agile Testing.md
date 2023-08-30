# Resume Materi Agile Testing

## Apa Itu Software Development Life Cycle (SDLC) ?

Proses yang digunakan industi software untuk mendesain, mendevelop, dan menguji software berkualitas tinggi dengan tujuan menyediakan alur terstruktur dalam membantu organisasi menghasilkan software berkualitas tinggi yang diselesaikan dengan waktu yang singkat dan biaya yang lebih rendah namun tetap memenuhi kebutuhan dari user. Dalam prakteknya akan dimulai dengan evaluasi sistem yang ada untuk mengidentifikasi persyaratan pada sistem yang baru. SDLC dapat mengantisipasi kemungkinan adanya kesalahan sehingga dapat mengurangi pekerjaan ulang. 

## Fungsi Software Development Life Cycle (SDLC)

1.  Sebagai sarana komunikasi diantara team developer dengan pemegang kepentingan 
1.  Membagi peranan dan bertanggung jawab yang jelas antara developer, designer, bisnis analisis dan manager proyek
1.  Dapat memberikan gambaran input dan output yang jelas dari satu tahap menuju tahap selanjutnya  

## Tahapan Tahapan Software Development Life Cycle (SDLC)

1.  Requirements Gathering

<aside?>
Pada tahap ini, sistem akan dianalisis sebagaimana akan dijalankan. Hasil analisis berupa kelebihan dan kekurangan sistem, fungsi sistem hingga pembaharuan yang yang dapat diterapkan. Bagian ini termasuk dalam bagian perencanaan, bagian lain antara lain alokasi sumber daya, perencanaan kapasitas, estimasi biaya dan penetapan. Hasil dari tahap ini ialah rencana proyek, jadwal estimasi biaya, dan ketentuan.
</aside>

2.  Design

<aside>
Tahap dimana membuat model cara kerja aplikasi atau software, ada beberapa aspek yang diperhatikan dalam tahap ini antara lain komunikasi, programming, arsitektur, user interface, platform dan security. 
</aside>

3.  Development (Code)

<aside>
Pada tahap ini, dimana program code ditulis. Proses coding tidak hanya dilakukan sebatas menyusun code agar aplikasi tetepa berjalan tetapi mencakup banyak tugas lainnya misalnya menemukan dan memperbaiki eror atau glits yang ditemukan serta menuliskan dokuemntasi seperti panduan penggunaan untuk masalah teknis 
</aside>

4.  Testing

<aside>
Sesudah sistem dikembangkan, sistem harus melalui pengujian sebelum di publish. Pada tahap ini ada beberapa hal yang harus diperhatikan seperti kemudahan sistem pencapaian tujuan dari sistem yang sudah disusun sejak perancangan sistem dilakukan. Tahap ini sangat penting dalam pembuatan sistem ataupun software.
</aside>

5.  Deployment

<aside>
Pada tahap ini aplikasi sudah tersedia pada user untuk digunakan. Pada tahap ini bisa jadi hal terumit karena harus mengganti database yang baru serta pembaharuan dari komentar user dan ingin diperbaiki sesuai keinginan user.
</aside>

6.  Maintenance

<aside>
Pada tahap ini, aplikasi sudah bisa dapat digunakan secara baik dan benar oleh user namun tahapan ini masih dianggap penting sebab pengguna bisa menemukan bug yang tidak ditemukan selama pengujian sehingga kesalahan harus diatasi.
</aside>

## Agile Testing Manifesto

### Agile testing manifesto menekankan pada kerja sama tim dan fokus pada kualitas perangkat lunak yang dihasilkan. Oleh karena itu, hal-hal yang jauh dari prinsip-prinsip manifesto tersebut, antara lain

- Testing is always behind
  
  Agile testing menekankan pentingnya melibatkan tim QE sejak awal pengembangan perangkat lunak untuk mengidentifikasi masalah dan memberikan umpan balik secara terus-menerus. Jika testing selalu tertinggal, maka dapat menyebabkan keterlambatan dalam pengiriman produk dan masalah kualitas yang tidak terdeteksi.

- Automation is even further behind that
 
  Agile testing mengutamakan otomatisasi tes, karena dapat membantu meningkatkan efisiensi dan efektivitas pengujian. Jika otomatisasi tes tertinggal, maka tim QE harus bekerja lebih keras dan memerlukan waktu lebih lama untuk menguji produk.

- Testers can't work until development is done

  Agile testing menekankan pentingnya kolaborasi antara pengembang dan tester untuk memastikan produk yang dihasilkan berkualitas tinggi. Jika tester harus menunggu pengembangan selesai, maka dapat menghambat pengiriman produk.

- There is pressure at the end of a sprint
  
  Agile testing menekankan pada pengujian secara terus-menerus selama siklus sprint, sehingga meminimalkan tekanan di akhir sprint. Jika tekanan terjadi di akhir sprint, dapat menyebabkan tester mempercepat pengujian dan mengorbankan kualitas produk.

- There is blame around bugs (it's his fault, etc.)
  
  Agile testing menekankan pada pengambilan tanggung jawab bersama dalam mencari solusi untuk masalah dan menemukan akar permasalahan. Jika ada saling menyalahkan dalam tim, maka dapat merusak kolaborasi dan semangat tim dalam mencapai tujuan bersama.
  
### 5 Kunci dalam Agile Testing Manifesto
  
  - Testing is an activity not a phase 
  
  - Prevent bugs rather than finding bugs 

  - Don't be a checker, be a tester
  
  - Don't try to break the system, instead help build the best possible system 

  - The whole team is responsible for quality, not just the tester 
  
### Testing Pyramid
  
  - UI -> Service -> Unit Test 
  
  Testing Pyramid ini merupakan pendekatan tipikal untuk menguji aplikasi di mana UI berada di bagian atas piramida, dan pengujian unit berada di bagian     bawah. Dalam pendekatan ini, pengujian UI berfokus pada antarmuka pengguna aplikasi, sedangkan pengujian layanan memverifikasi bahwa layanan aplikasi       bekerja dengan benar. Tes unit, di sisi lain, menguji unit individu atau fungsi kode.
  
  - UI -> Integration -> Unit Test
  
  Testing Pyramid ini merupakan pendekatan lain untuk menguji aplikasi di mana UI berada di atas, dan pengujian unit berada di bawah. Namun, dalam           pendekatan ini, tes integrasi berada di tengah. Tes integrasi memverifikasi bahwa berbagai bagian aplikasi dapat bekerja bersama dengan benar. Pengujian   ini dapat mencakup pengujian API, database, atau dependensi eksternal lain yang diandalkan oleh aplikasi. Tes unit masih menguji unit individu atau fungsi kode.