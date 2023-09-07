# Resume Materi Iterable & Map Data Structure

## Iterable Data Structure

### Pengertian Iterable Data Structure

Iterable Data Structure merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan ke dirinya sendiri. 
    
### Implementasi Interface

- Set

  Set adalah koleksi objek unik tanpa urutan tertentu. Dalam implementasi interface pada Set, method __iter__() akan mengembalikan iterator yang diperoleh dari method iter() pada objek set. 
  
- List

  List adalah koleksi objek yang dipesan dengan indeks yang dapat diakses. Dalam implementasi interface pada List, method __iter__() akan mengembalikan iterator yang diperoleh dari method iter() pada objek list. 
  
- Queue

  Deque adalah koleksi objek yang dipesan dengan kemampuan memperluas dan mempersempit elemen pada kedua ujungnya. Dalam implementasi interface pada Deque, method __iter__() akan mengembalikan iterator yang diperoleh dari method iter() pada objek deque.

## Map Data Structure

### Pengertian Map Data Structure

Map Data Structure adalah struktur data yang ada di bahasa pemrograman Java yang dapat digunakan untuk menyimpan banyak data didalamnya, data - data yang tersimpan di dalam map teridentifikasi menggunakan key, dan setiap key mempunyai datanya sendiri yang disebut value.

### Bentuk - bentuk Map pada Bahasa Java

- HashMap

  HashMap adalah implementasi dari interface Map pada Bahasa Java yang menggunakan struktur hash table untuk menyimpan dan mengakses data. HashMap menyimpan data dalam bentuk key-value pairs dan tidak menjamin urutan penyimpanannya. HashMap juga tidak dapat memiliki key dengan nilai null (hanya satu   key null yang diperbolehkan) dan dapat memiliki multiple values untuk satu key yang sama. HashMap juga merupakan koleksi yang tidak bersifat thread-safe, sehingga tidak aman untuk digunakan dalam lingkungan multithreading.

- WeakHashMap

  WeakHashMap adalah sub-class dari HashMap yang menggunakan referensi lemah (weak reference) pada key. Dalam WeakHashMap, key yang tidak lagi di-referensi pada program akan dihapus secara otomatis oleh garbage collector, sehingga WeakHashMap cocok digunakan untuk menyimpan data temporary yang tidak perlu disimpan secara permanen.

- IdentityHashMap

  IdentityHashMap adalah implementasi dari interface Map pada Bahasa Java yang menggunakan operator == (identitas) untuk membandingkan key. Hal ini berbeda dengan HashMap yang menggunakan method equals() dan hashCode() untuk membandingkan key. Dalam IdentityHashMap, dua key dianggap sama jika key tersebut memiliki identitas yang sama (objek yang sama pada memori).

- LinkedHashMap

  LinkedHashMap adalah sub-class dari HashMap yang menyimpan urutan data dengan mempertahankan urutan saat data dimasukkan ke dalam Map. LinkedHashMap menyimpan data dalam bentuk key-value pairs, dan menyimpan urutan data dalam linked list yang diatur berdasarkan waktu dimasukkannya data ke dalam Map. LinkedHashMap juga mendukung mode akses untuk mengakses data berdasarkan urutan akses (access order) atau urutan penyisipan (insertion order).

- ImmutableMap

  ImmutableMap adalah implementasi dari interface Map pada Bahasa Java yang tidak dapat diubah setelah objek dibuat. ImmutableMap tidak memiliki method untuk menambah atau menghapus elemen pada map setelah objek dibuat. ImmutableMap sangat berguna dalam lingkungan multithreading dan memastikan keamanan data, karena tidak dapat diubah oleh thread lain setelah dibuat. Untuk menambah atau menghapus elemen pada ImmutableMap, dibutuhkan pembuatan objek baru dengan menambahkan atau menghapus elemen pada objek ImmutableMap yang ada.

### SortedMap 

  SortedMap adalah map yang dapat diurutkan baik secara Ascending atau Descending. SortedMap ini mempunyai cara pengurutan senidiri. 

### NaviableMap

  NaviableMap merupakan salah satu SortedMap tetapi dengan method-method yang lebih lengkap.