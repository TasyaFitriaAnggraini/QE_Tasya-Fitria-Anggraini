# Resume Materi RESTful API Testing with Rest Assured

## Rest Assured

REST API merupakan standar arsitektur komunikasi berbasis web yang umum digunakan dalam pengembangan layanan berbasis web umumnya menggunakan HTTP method sebagai protokol komunikasi data.
REST API berisi aturan atau batasan yang dapat membatasi programmer untuk mengakses atau melakukan tindakan tindakan tertentu pada database.

API atau Application Programming Interface merupakan suatu penghubung yang memungkinkan suatu aplikasi untuk berinteraksi dengan aplikasi lainya untuk berbagi data. 
Tujuan dari penggunaan API adalah untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga developer tidak perlu membuat fitur yang serupa.

Rest Assured adalah library Java yang populer digunakan untuk melakukan pengujian (testing) pada RESTful API. Rest Assured menyediakan DSL (Domain Specific Language) yang sederhana dan mudah dipahami sehingga memudahkan dalam menulis script testing.

### The Features of Rest Assured

- Support for HTTP methods

- Support for BDD/Gherkin (Given, When, Then)

- Use of Hamcrest matches for checks (equalsTo)

- User of Gpath for selecting element from JSON response

### Fundamental API Test Process

- Record

  Tahap ini dimulai dengan mendefinisikan informasi tentang API yang ingin diuji. Informasi tersebut meliputi endpoint URL, parameter permintaan (request), header, dan detail terkait lainnya
  
- Parsing

  Tahap ini melibatkan pengambilan atau perekaman data dari API dan mengekstraksi informasi yang relevan dari data tersebut. Ini dapat melibatkan penguraian (parsing) data respons dalam format JSON atau XML, serta mengekstraksi data terkait dari header respons
  
- Reconstruction

  Tahap ini melibatkan merekonstruksi panggilan API berdasarkan informasi yang telah direkam dan data yang diekstrak. Selanjutnya, panggilan API dikirimkan ke klien simulasi untuk menguji API
  
- Test Validation

  Pada tahap terakhir ini, hasil respons API akan divalidasi dengan memeriksa apakah hasil tersebut sesuai dengan yang diharapkan. Hal ini dapat dilakukan dengan memeriksa kode status respons, isi respons, dan informasi terkait lainnya. Jika hasil tersebut sesuai dengan yang diharapkan, maka pengujian API dianggap berhasil. Jika tidak, maka perlu mengidentifikasi masalah dan mengatasinya sebelum menguji API kembali
  