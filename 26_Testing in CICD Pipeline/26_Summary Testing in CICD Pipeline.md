# Resume Materi Testing in CI/CD Pipeline

## Introduction CI/CD

### Continuous Integration (CI)

Continuous Integration (CI) merupakan suatu praktik dalam pengembangan perangkat lunak di mana setiap kali ada perubahan kode, kode tersebut diintegrasikan ke dalam repositori bersama secara otomatis dan dilakukan proses pembangunan (build) serta pengujian (testing) secara otomatis, biasanya beberapa kali sehari. Hal ini bertujuan untuk mengurangi risiko dan mengatasi masalah yang mungkin muncul akibat interaksi antara perubahan kode yang dilakukan oleh anggota tim pengembangan yang berbeda.

Integrasi dengan version control merupakan komponen penting dalam CI, karena version control seperti Git, Mercurial, atau Subversion memungkinkan tim pengembangan bekerja secara kolaboratif pada kode yang sama. Dengan integrasi yang baik antara version kontrol system dan alat CI, setiap kali ada perubahan kode yang di-push ke repositori, alat CI akan secara otomatis membangun dan menguji perubahan tersebut. Hasil dari proses build dan pengujian ini akan memberikan umpan balik (feedback) cepat kepada tim pengembangan tentang status kualitas kode yang baru diintegrasikan. Jika ada masalah atau kesalahan (bug) yang terdeteksi, tim pengembangan dapat segera menanganinya sebelum masalah tersebut menjadi lebih kompleks dan sulit untuk diperbaiki.

Dengan menerapkan CI dengan integrasi yang baik dengan version control system, tim pengembangan dapat mengidentifikasi masalah lebih awal, mengurangi risiko dan kesalahan dalam pengembangan perangkat lunak, serta meningkatkan kualitas dan keandalan produk yang dihasilkan.

### Continuous Delivery/Deployment (CD)

Continuous Delivery (CD) merupakan prinsip pengembangan perangkat lunak dimana perangkat lunak yang telah melewati proses Continuous Integration (CI) dapat dirilis ke produksi kapan saja. Proses ini sering melibatkan otomatisasi dalam mem-push perubahan kode ke sistem staging atau lingkungan produksi yang terisolasi, untuk menjalani pengujian lebih lanjut sebelum diterapkan ke produksi secara resmi. Dalam CD, perangkat lunak yang telah diuji secara otomatis dan dianggap siap dapat segera dirilis ke produksi dengan cepat dan efisien, tanpa hambatan atau penundaan yang signifikan.

Sedangkan Continuous Deployment (CDep) merupakan langkah lebih lanjut dari CD, di mana perubahan kode diterapkan secara otomatis dan langsung ke produksi tanpa melalui tahap staging atau pengujian tambahan. Dalam CDep, setelah perubahan kode dinyatakan siap oleh sistem CI, perubahan tersebut langsung di-deploy ke lingkungan produksi, seringkali dengan menggunakan otomatisasi dan alur kerja yang terstruktur. Proses ini memungkinkan perangkat lunak yang telah melewati pengujian secara otomatis untuk segera merilis perubahan kode ke produksi dengan cepat dan tanpa penundaan.

Kedua prinsip, CD dan CDep bertujuan untuk mempercepat dan mengotomatisasi proses pengiriman perangkat lunak ke produksi, sehingga tim pengembangan dapat merespons dengan cepat terhadap perubahan kebutuhan pengguna atau pemangku kepentingan, serta meminimalkan risiko kesalahan manusia dalam proses pengiriman perangkat lunak. Namun, perbedaan utama antara keduanya terletak pada tahap pengujian dan penerapan perubahan kode ke produksi. CD masih melibatkan tahap pengujian tambahan di lingkungan staging sebelum perangkat lunak diterapkan ke produksi, sedangkan CDep langsung menerapkan perubahan kode ke produksi setelah lulus pengujian otomatis. Kedua prinsip ini harus diterapkan dengan bijaksana, dengan mempertimbangkan risiko, kebijakan pengiriman, dan tingkat kematangan tim pengembangan serta kebutuhan bisnis.

### Perbedaan Delivery vs Deployment

#### Continuous Delivery (CD)

- CD secara otomatis mempersiapkan dan melacak rilis ke produksi, tetapi tidak langsung menerapkannya ke produksi tanpa persetujuan pengembang.

- Hasil yang diinginkan dari CD adalah memastikan bahwa siapa pun yang memiliki cukup hak akses dapat melakukan rilis baru ke produksi kapan saja hanya dengan beberapa klik. Proses ini mengeliminasi hampir semua tugas manual dalam pengiriman perangkat lunak, yang dapat meningkatkan produktivitas pengembang.

- Sebelum rilis baru diterapkan ke produksi, biasanya perubahan kode tersebut melewati tahap pengujian tambahan di lingkungan staging atau lingkungan pengujian yang terisolasi, untuk memastikan bahwa perubahan tersebut telah diuji dan memenuhi standar kualitas yang telah ditetapkan.

#### Continuous Deployment (CDep)

- CDep merupakan langkah lebih maju dari CD, di mana setiap perubahan dalam kode sumber langsung diterapkan ke produksi secara otomatis, tanpa persetujuan eksplisit dari pengembang.

- Asalkan perubahan kode tersebut lolos dari kontrol kualitas yang telah ditetapkan, seperti pengujian otomatis dan metrik kualitas lainnya, perubahan tersebut akan langsung diterapkan ke lingkungan produksi.

- Proses ini dapat dilakukan secara otomatis dengan menggunakan alur kerja yang terstruktur dan otomatisasi yang canggih, sehingga perubahan kode dapat segera diimplementasikan ke produksi tanpa campur tangan manusia.

### Characteristics Good Continuous Integration (CI) and Continuous Delivery (CD)

#### Continuous Integration (CI)

- Decoupled Stages 
  
  Setiap langkah dalam pipeline CI seharusnya memiliki tugas yang fokus pada satu hal. Ini berarti, setiap tahapan dalam pipeline CI, seperti pembuatan, pengujian, dan implementasi, harus dirancang   untuk melakukan satu tugas secara terisolasi dan mandiri. Dengan demikian, setiap tahapan dapat     berjalan dengan optimal, dan jika terjadi masalah, dapat ditemukan dengan mudah dan diperbaiki tanpa mempengaruhi tahapan lain dalam CI pipeline.

- Repeatable
  
  CI harus diotomatisasi dalam cara yang dapat diulang secara konsisten. Ini berarti, bahwa setiap kali CI pipeline dijalankan, harus menghasilkan hasil yang sama jika tindakan yang sama diulang.   Hal ini penting untuk memastikan bahwa CI pipeline dapat diandalkan dan menghasilkan hasil yang     konsisten, sehingga dapat menjadi alat yang efektif untuk mendeteksi dan mencegah masalah pada setiap perubahan kode yang diintegrasikan.

- Fail Fast
  
  Pipeline CI harus didesain untuk gagal cepat. Ini berarti, jika ada masalah seperti kegagalan pembuatan atau pengujian, masalah tersebut harus terdeteksi dan dilaporkan secepat mungkin dalam pipeline CI. Hal ini memungkinkan identifikasi dan penyelesaian masalah dengan cepat,               meminimalkan dampak dan biaya dari kegagalan dalam pembuatan atau pengujian.

#### Continuous Delivery (CD)

- Design with System in Mind
  
  CD melibatkan pemikiran holistik tentang seluruh sistem yang akan dideploy, termasuk aplikasi, infrastruktur, konfigurasi, dan data. Dalam CD, perubahan pada satu bagian sistem harus dipertimbangkan dalam konteks keseluruhan sistem, untuk memastikan keselarasan dan keseluruhan sistem yang dapat diandalkan saat dideploy.
  
- Pipiline
  
  CD melibatkan penggunaan pipeline atau alur kerja untuk mengelola perubahan perangkat lunak. Pipiling ini digunakan untuk mengotomatiskan berbagai tahapan, seperti pengujian, integrasi, pengujian fungsional, pengujian performa, hingga rilis ke produksi. Setiap tahap dalam pipeline bertujuan untuk meningkatkan kepercayaan terhadap perangkat lunak yang dikembangkan seiring bergerak menuju lingkungan produksi.
  
- Globally Unique Version
  
  CD memastikan bahwa setiap perubahan kode atau konfigurasi yang diterapkan ke sistem diberi label versi unik secara global. Hal ini memungkinkan tim pengembang dan operasi untuk mengetahui status sistem pada setiap saat dan dapat dengan mudah memantau perbedaan antara status sistem saat ini dengan status yang diharapkan di masa depan.
  
- Ability to Demonstrate the Difference between Current and Future States
  
  CD memungkinkan tim untuk dapat mendemonstrasikan perbedaan antara status sistem saat ini dan status yang diharapkan di masa depan. Hal ini dapat dilakukan melalui mekanisme seperti pengujian A/B, pemantauan performa, atau fitur pengguliran mundur (rollback) yang memungkinkan tim untuk memantau dan memahami efek dari perubahan yang diterapkan ke sistem.  

### CI/CD Process

Commit - Build - Test - Deploy

- Commit
  
  Tahap ini melibatkan pengiriman kode oleh pengembang ke sistem kontrol versi, seperti Git. Setiap perubahan kode yang di-commit akan menjadi titik awal untuk memulai proses CI/CD.

- Build
  
  Setelah ada perubahan kode yang di commit, tahap ini melibatkan pembangunan (build) otomatis dari   kode menjadi paket atau artefak yang dapat dijalankan. Proses build ini dapat melibatkan kompilasi kode, pengemasan, atau konfigurasi yang diperlukan untuk menghasilkan artefak yang siap untuk diuji dan diimplementasi.

- Test
  
  Setelah proses build selesai, tahap ini melibatkan pengujian otomatis untuk memastikan kualitas perangkat lunak. Pengujian dapat meliputi pengujian unit, pengujian integrasi, pengujian fungsional, pengujian performa, atau pengujian keamanan, sesuai dengan kebijakan pengujian yang telah ditentukan.

- Deploy
  
  Setelah pengujian selesai dan perangkat lunak telah lulus pengujian, tahap ini melibatkan implementasi (deploy) perangkat lunak ke lingkungan produksi, atau lingkungan lain yang ditentukan. Implementasi dapat dilakukan secara otomatis atau dengan persetujuan manusia, tergantung pada kebijakan dan kebutuhan tim pengembangan.

### Benefit of Implementation Continuous Integration (CI) and Continuous Delivery (CD)

#### Continuous Integration (CI)

- Detecting Bug in Early Stage
  
  Dengan CI, setiap perubahan kode yang di-commit akan segera diuji secara otomatis, sehingga       memungkinkan deteksi bug atau kesalahan pada tahap awal pengembangan. Hal ini memungkinkan tim     pengembangan untuk segera memperbaiki bug sebelum diperkenalkan ke tahap berikutnya dalam siklus   pengembangan, mengurangi potensi bug yang masuk ke produksi.
  
- Reduces Bug Count
  
  Dengan pengujian otomatis yang dilakukan secara berkelanjutan, CI dapat membantu                   mengidentifikasi dan memperbaiki bug dengan cepat. Hal ini dapat mengurangi jumlah bug yang       terjadi dalam perangkat lunak, meningkatkan kualitas dan kehandalan sistem.
  
- Development Process more Transparent
  
  CI memungkinkan setiap perubahan kode yang di-commit untuk diuji secara otomatis dan               menghasilkan laporan hasil pengujian. Hal ini membuat proses pengembangan menjadi lebih           transparan, memudahkan tim pengembangan untuk melihat dan memahami hasil pengujian, serta         mengidentifikasi dan memperbaiki masalah dengan cepat.
  
- Efficient
  
  Dengan CI, proses pengujian dan pembangunan dapat dilakukan secara otomatis, mengurangi waktu     dan upaya yang diperlukan untuk menguji dan membangun perangkat lunak. Hal ini dapat               meningkatkan efisiensi tim pengembangan dan mengurangi waktu penyelesaian kesalahan dalam         pengembangan.
  
#### Continuous Delivery (CD)

- Reduce the Risk
  
  CD memungkinkan tim pengembangan untuk secara otomatis mengimplementasikan perubahan kode ke       lingkungan produksi atau lingkungan lain yang ditentukan dengan cepat. Dengan pengiriman           perubahan kode yang sering dan otomatis, risiko kesalahan atau masalah yang terjadi pada           implementasi dapat dikurangi, karena setiap perubahan kode telah melalui tahap pengujian yang     ketat sebelum diimplementasikan.
  
- Painless Deployment
  
  CD memfasilitasi implementasi perangkat lunak ke lingkungan produksi atau lingkungan lain yang     ditentukan secara otomatis dan transparan. Hal ini mengurangi beban kerja dan risiko kesalahan     pada tim operasi, serta memastikan implementasi dapat dilakukan dengan cepat dan tanpa hambatan.
  
- Reduces Costs
 
  Dengan implementasi CD, pengujian dan implementasi perangkat lunak dapat dilakukan secara         otomatis dan berulang, mengurangi biaya yang terkait dengan pengujian manual dan implementasi     yang kompleks. Hal ini dapat mengurangi biaya pengembangan perangkat lunak secara keseluruhan.
  
- Automated and Transparent Process
  
  CD memungkinkan tim pengembangan untuk mengotomatiskan proses pengujian, build, dan implementasi   perangkat lunak, serta menghasilkan laporan dan dokumentasi yang transparan. Hal ini memudahkan   tim pengembangan untuk melacak status perubahan kode, mengelola proses pengiriman, serta           memudahkan audit dan pemantauan keseluruhan proses pengiriman.
  
- Releases more Frequently
  
  Dengan CD, perubahan kode dapat diimplementasikan secara otomatis dan cepat ke lingkungan         produksi atau lingkungan lain yang ditentukan. Hal ini memungkinkan tim pengembangan untuk         merilis perubahan kode lebih sering, meningkatkan kecepatan dan ketepatan dalam merespon           kebutuhan pelanggan atau pasar, serta mempercepat inovasi dan pengiriman fitur baru ke pengguna.

### Continuous Integration (CI) and Continuous Delivery (CD) Costs

#### Continuous Integration (CI)

- Write Autometed Test
  
  Menulis tes otomatis untuk menguji perubahan kode secara otomatis memerlukan waktu dan sumber     daya dari tim pengembangan. Tes otomatis yang baik harus mencakup berbagai kasus pengujian yang   komprehensif untuk memastikan kualitas perubahan kode yang diintegrasikan.
  
- Server for Autometed Test
  
  Memiliki server yang mampu menjalankan tes otomatis secara otomatis memerlukan investasi dalam     infrastruktur, perangkat keras, perangkat lunak, dan konfigurasi server. Biaya operasional dan     pemeliharaan server juga perlu diperhitungkan.
  
- Merge the Code as Often as Possible
  
  Menggabungkan perubahan kode secara teratur dan sering memerlukan koordinasi dan waktu dari tim   pengembangan. Proses penggabungan kode yang efisien dan efektif memerlukan pengaturan,             pelatihan, dan pemantauan untuk memastikan integritas kode yang terintegrasi.
  
#### Continuous Delivery (CD)

- Strong Foundations in CI
  
  Sebelum mengimplementasikan Continuous Delivery, perlu memastikan terlebih dahulu bahwa proses     Continuous Integration sudah berjalan dengan baik. Ini melibatkan biaya untuk memastikan bahwa     tes otomatis sudah ada, infrastruktur server untuk tes otomatis sudah siap, dan tim pengembangan   sudah terlatih dalam proses CI.
  
- Need Highhest Quality of Test
  
  Implementasi CD memerlukan tes yang sangat baik untuk memastikan kualitas perangkat lunak yang     akan diimplementasikan secara otomatis ke lingkungan produksi. Hal ini bisa memerlukan waktu dan   sumber daya tambahan untuk memperbarui dan memelihara tes otomatis yang berkualitas tinggi.
  
- Documentation Needs to be Updated Frequently
  
  Proses CD yang melibatkan pengiriman perangkat lunak secara otomatis dan berulang ke lingkungan   produksi memerlukan dokumentasi yang diperbarui secara teratur. Hal ini bisa memerlukan waktu     dan sumber daya tambahan untuk memastikan dokumentasi tetap akurat, up-to-date, dan sesuai         dengan perubahan yang diimplementasikan.

Perlu diingat bahwa biaya implementasi CI dan CD dapat bervariasi tergantung pada kompleksitas proyek, ukuran tim pengembangan, infrastruktur yang digunakan, dan tingkat kedewasaan proses pengembangan perangkat lunak. Namun, investasi ini dapat sebanding dengan manfaat yang diperoleh, seperti peningkatan kualitas perangkat lunak, pengurangan risiko kesalahan, dan peningkatan efisiensi dalam proses pengiriman perangkat lunak.

### CI/CD Tools

- Jenkins
- Atlassian Bamboo
- Circle CI
- AWS CodeBuild
- Azure DevOps
- Travis CI
- Github Actions
- Gitlab CI