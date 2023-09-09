# Resume Materi Pengenalan RESTful API

## Basic of API Testing

### API & REST API

API (Application Programming Interface) merupakan sebuah mekanisme yang digunakan untuk memungkinkan aplikasi atau sistem yang berbeda berkomunikasi dan bertukar data. API memungkinkan pengembang untuk membuat aplikasi yang dapat terintegrasi dengan sistem lain tanpa harus mengetahui detail internal       dari sistem tersebut. 
    
REST (Representational State Transfer) merupakan sebuah arsitektur untuk membangun aplikasi web yang terdiri dari client dan server. REST menggunakan protocol HTTP untuk mentransfer data antara client dan server. REST juga memperkenalkan konsep representasi, yaitu representasi data dalam format tertentu seperti JSON atau XML. 
    
HTTP Method merupakan metode yang digunakan untuk berkomunikasi antara client dan server dalam arsitektur REST, diantaranya:
    
1. GET : digunakan untuk membaca data dari server

2. POST : digunakan untuk mengirim data baru ke server

3. PUT : digunakan untuk memperbarui data yang sudah ada pada server

4. DELETE : digunakan untuk menghapus data pada server
    
### Komponen REST API

Terdapat METHOD + URL (Base URL + Path) + HEADER + BODY
    
1. Endpoint atau URL
   
   Endpoint atau URL (Uniform Resource Locator) merupakan alamat yang digunakan untuk mengakses layanan pada server. Setiap endpoint memiliki nama dan        lokasi yang berbeda. 
   
2. HTTP Method
   
   HTTP Method digunakan untuk menentukan aksi apa yang akan dilakukan layanan yang diakses. Terdapat 4 HTTP Method utama yang digunakan pada REST API,      yaitu GET, POST, PUT, dan DELETE.
   
3. Parameter
   
   Parameter merupakan informasi tambahan yang dikirimkan melalui URL untuk menentukan tindakan yang spesifik pada server. Parameter dapat digunakan untuk    mengatur pencarian, filtering, sorting, dsb. 
   
4. Header

   Header merupakan informasi tambahan yang dikirimkan pada setiap permintaan ke server, seperti jenis konten, authorization token, dsb. Header dapat        digunakan untuk memberikan informasi tambahan dan memastikan keamanan pada permintaan API. 
   
5. Body
   
   Body merupakan bagian dari permintaan yang mengandung data yang akan dikirim ke server. Body biasanya menggunakan format JSON atau XML untuk membawa      informasi yang lebih kompleks. 

### HTTP Response Code

HTTP Response Code merupakan kode status yang digunakan oleh server untuk memberikan respons atas permintaan yang diterima dari client, diantaranya:
    
1. 200 OK
    
   HTTP Response Code 200 OK menunjukkan bahwa permintaan client telah berhasil diproses oleh server dan telah memberikan respons yang diharapkan. Respons    ini umumnya diberikan pada permintaan GET atau POST yang berhasil.
      
2. 201 Create
      
   HTTP Response Code 201 Create menunjukkan bahwa server telah berhasil membuat sumber daya baru yang diminta client. Response ini umumnya diberikan pada    permintaan POST atau PUT yang berhasil membuat sumber daya baru. 
      
3. 400 Bad Request
      
   HTTP Response Code 404 Bad Request menunjukkan bahwa server tidak dapat memproses permintaan yang dikirim oleh klien karena adanya kesalahan dalam        format atau struktur permintaan tersebut. Response ini umumnya diberikan pada permintaan yang tidak sesuai dengan spesifikasi API. 
      
4. 404 Not Found
    
   HTTP Response Code 404 Not Found menunjukkan bahwa server tidak dapat menemukan sumber daya yang diminta oleh client pada lokasi yang diberikan.          Respons ini umumnya diberikan pada permintaan GET atau DELETE yang mencoba mengakses sumber daya yang tidak ada. 
      
5. 401 Unauthorized
      
   HTTP Response Code 401 Unauthorized menunjukkan bahwa client tidak memiliki akses yang dizinkan untuk mengakses sumber daya yang diminta. Respons ini      umumnya diberikan pada permintaan yang memerlukan autentikasi tetapi client tidak memberikan informasi yang cukup. 
      
6. 405 Method Not Allowed
    
   HTTP Response Code 405 Method Not Allowed menunjukkan bahwa metode HTTP yang digunakan pada permintaan tidak diizinkan pada sumber daya yang diminta.      Respon ini umumnya diberikan pada permintaan dengan metode HTTP yang tidak diizinkan pada sumber daya tertentu. 
    
7. 500 Internal Server Error
    
   HTTP Response Code 500 Internal Server Error menunjukkan bahwa terjadi kesalahan pada server saat memproses permintaan dari client. Respons ini umumnya    diberikan pada situasi dimana server mengalami masalah teknis atau tidak dapat mengambil data yang diperlukan untuk memproses permintaan.