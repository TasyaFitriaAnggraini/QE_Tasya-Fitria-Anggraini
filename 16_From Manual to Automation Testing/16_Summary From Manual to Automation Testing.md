# Resume Materi From Manual to Automation Testing

### Pengertian Manual Testing dan Automation Testing

1. Manual Testing atau pengujian manual 

   Langkah atau kegiatan yang dilakukan tester untuk mencari bug atau cacat pada perangkat lunak. Penguji akan melakukan pengecekan secara manual tanpa menggunakan bantuan dari tools atau scripts, dengan tujuan untuk memastikan software yang di uji bebas cacad dan software dapat dijalankan sesuai dengan apa yang diharapkan.

2. Automation testing

   Langkah atau kegiatan testing yang membutuhkan automation tools untuk menjalankan test case yang dibuat, untuk melakukan automation testing QA perlu untuk membuat code atau script testing. Automation testing bergantung pada script test yang berjalan secara otomatis fungsinya tidak lain untuk membandingkan hasil yang diharapkan dengan hasil yang sebenrnya.

### Alasan Menggunakan Manual Testing

1. Exploratory
   
   Pengujian manual memungkinkan penguji menjelajahi aplikasi perangkat lunak dan mengidentifikasi cacat yang mungkin tidak terdeteksi oleh pengujian otomatis. Pengujian eksplorasi melibatkan teknik pengujian kreatif dan ad-hoc yang dapat mengidentifikasi potensi masalah yang mungkin terlewatkan oleh pengujian otomatis.

2. Velocity
   
   Meskipun pengujian otomatis efektif dalam memastikan kualitas dan konsistensi, namun penyiapan dan pemeliharaannya juga memakan waktu. Pengujian manual dapat dilakukan lebih cepat dan dengan lebih sedikit overhead, memungkinkan tim pengembangan untuk menguji dan melakukan iterasi lebih cepat.
   
3. Usability

   Pengujian manual sangat berguna saat menguji aspek kegunaan dan pengalaman pengguna dari aplikasi perangkat lunak. Ini termasuk menguji aliran pengguna, desain antarmuka, dan kemudahan penggunaan secara keseluruhan. Pengujian manual memberikan gambaran yang lebih lengkap tentang bagaimana pengguna akan berinteraksi dengan aplikasi perangkat lunak.

### Alasan Menggunakan Automation Testing

1. Flexibility
   
   Pengujian otomasi memungkinkan penguji menjalankan pengujian dengan cepat dan berulang kali, memberikan fleksibilitas untuk menguji berbagai skenario tanpa perlu campur tangan manusia. Ini sangat berguna ketika berhadapan dengan aplikasi perangkat lunak yang besar dan kompleks yang memerlukan pengujian ekstensif.
   
2. Velocity
   
   Tes otomatis dapat dijalankan lebih cepat daripada tes manual, memungkinkan tim pengembangan untuk menguji dan melakukan iterasi lebih cepat. Ini meningkatkan kecepatan siklus pengembangan dan memungkinkan tim mengirimkan aplikasi perangkat lunak lebih cepat.
   
3. Coverage
   
   Pengujian otomasi memungkinkan cakupan pengujian aplikasi perangkat lunak yang luas, sehingga memungkinkan untuk menguji basis kode besar dengan ribuan kasus pengujian. Ini memastikan bahwa semua bagian aplikasi diuji secara menyeluruh, mengurangi risiko cacat, dan meningkatkan kualitas secara keseluruhan.
   
4. Error-Avoidance
   
   Pengujian otomatis dapat membantu menghindari kesalahan yang mungkin terjadi karena kesalahan manusia selama pengujian manual. Tes otomatis konsisten dan akurat, mengurangi risiko cacat dan meningkatkan keandalan aplikasi perangkat lunak secara keseluruhan.

### Automate Testing Process

1. Test tool selection
   
   Langkah pertama adalah memilih alat pengujian otomasi yang sesuai berdasarkan persyaratan dan anggaran proyek. Ada beberapa alat pengujian yang tersedia di pasaran yang mendukung berbagai bahasa pemrograman, kerangka kerja, dan jenis pengujian.

2. Define scope of automation
   
   Tentukan ruang lingkup proses otomasi dan identifikasi kasus uji mana yang dapat diotomatisasi. Identifikasi kasus pengujian yang paling kritis dan berulang yang dapat memanfaatkan otomatisasi, sambil juga mempertimbangkan faktor-faktor seperti ROI, upaya pengujian, dan batasan waktu.
   
3. Planning, design, and development
   
   Kembangkan rencana untuk pengujian otomasi, termasuk kerangka kerja, pembuatan skrip, dan kasus pengujian. Merancang dan mengembangkan kasus uji menggunakan alat otomasi dan bahasa pengkodean yang dipilih, mengikuti standar pengkodean dan praktik terbaik. Kembangkan kerangka kerja yang dapat digunakan kembali untuk pengujian di masa mendatang.
   
4. Test execution
   
   Jalankan kasus pengujian otomatis dan laporkan hasil pengujian. Meninjau dan menganalisis hasil pengujian untuk mengidentifikasi cacat dan memverifikasi hasil yang diharapkan. Integrasikan pengujian otomatis ke dalam pipeline continuous integration/continuous delivery (CI/CD) untuk memastikan pengujian berjalan secara teratur.
   
5. Maintenance
   
   Seiring berkembangnya aplikasi perangkat lunak, skrip dan kerangka kerja pengujian otomatis mungkin memerlukan pembaruan untuk memastikan bahwa mereka terus memberikan hasil pengujian yang akurat dan relevan. Pertahankan pengujian otomatis dengan memperbaruinya sesuai kebutuhan, melakukan tinjauan kode secara teratur, dan memastikan bahwa pengujian terus memenuhi tujuan pengujian.

### Test Tool Selection

1. Usability
   
   Alat tersebut harus user friendly dan intuitive, memungkinkan penguji untuk membuat dan menjalankan pengujian dengan cepat dan mudah. Alat tersebut juga harus memberikan laporan yang jelas dan komprehensif, sehingga memudahkan penguji untuk menginterpretasikan hasil pengujian.
   
2. Simplicity
   
   Alat tersebut harus mudah diinstal dan dikonfigurasikan, dengan penyiapan minimal yang diperlukan. Alat tersebut juga harus mudah digunakan, dengan antarmuka yang sederhana dan dokumentasi yang jelas. Penguji harus dapat membuat dan menjalankan kasus uji dengan pengkodean atau skrip minimal.
   
3. Cost

   Alat tersebut harus terjangkau dan memberikan nilai untuk uang yang diinvestasikan. Biaya alat harus dibandingkan dengan manfaat potensial yang diperoleh dari penggunaannya, termasuk peningkatan produktivitas, pengurangan waktu pengujian, dan peningkatan cakupan pengujian.
   
4. Integration

   Alat tersebut harus berintegrasi dengan alat pengujian dan teknologi lain yang digunakan dalam proses pengembangan, seperti alat CI/CD, alat pelacakan cacat, dan sistem kontrol sumber.
   
5. Scalability
   
   Alat tersebut harus dapat diskalakan, memungkinkan penguji untuk membuat dan menjalankan pengujian pada aplikasi perangkat lunak yang besar dan kompleks.
   
6. Support

   Alat tersebut harus memberikan dukungan teknis dan layanan pelanggan yang andal, termasuk dokumentasi, pelatihan, dan online resource.