# Resume Versioning Control With Git

## What is Versioning

<aside>
Melakukan sebuah pengaturan versi atau pelacakan perubahan dari setiap kode program. Tujuan dari versioning mengetahu kesalahan dari kode pemrograman yang dibuat, mengetahui yang melakukan perubahan kode pemrograman, apa saja yang diubah.
</aside>

## Git Versioning Control (Git)

<aside>
Salah satu Version Control System (VCS) populer yang digunakan para developer untuk mengembangakan software secara bersama sama. Secara general GIT selain digunakan untuk mengatur versi, mencatat setiap perubahan, juga digunakan untuk berkolaborasi dan bersinkronisasi dengan para developer lainnya dalam 1 proyek yang sama. Ada beberapa layanan versioning control yang jamak digunakan para developer yaitu github, gitlab, bitbucket dan masih banyak lainnya.

Pada tahap instalasi dapat langsung download di website resmi dan install git, untuk di Linux based bisa menggunakan command “sudo apt-get install git”. Setelah instalasi dapat melakukan konfigurasi akun git pada perangkat yang digunakan menggunakan command “git config –global user.name “user name” dan “git config –global user.email “user email”.
</aside>

## Langkah Langkah Menambahkan Proyek yang sudah ada ke Dalam Repository Github

1.  `git init, disini nanti akan membuat satu folder bernama ".git" yang bersifat hidden (tersembunyi). Berikut merupakan contoh folder ".git"
![Image](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/3_Versioning%20Control%20with%20Git/Screenshot/Screenshot%202023-08-18%20144431.png)

1.  git remote add <remote_name> <remote_repo_url>, Untuk mensinkronsasi dengan repository ke visual studio code menggunakan protokol HTTPS dapat melakukan enkripsi didalam data yang dibuat saat pengiriman sehingga dapat meminimalisir data data yang didapat serta dapat dibaca dengan mudah. Berikut untuk mendapat repo url dan contoh penggunaannya
![Image](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/3_Versioning%20Control%20with%20Git/Screenshot/Screenshot%202023-08-18%20150508.png)

-   git remote add origin https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini.git

1.  git push -u <remote_name>, digunakan dalam sistem kontrol versi Git untuk mengirimkan perubahan yang Anda telah lakukan pada repositori lokal Anda ke repositori yang berada di remote server GitHub. Opsi "-u" menghubungkan cabang lokal yang sedang Anda push dengan cabang pada remote repository yang ditentukan. Berikut merupakan contoh penggunaan.

-   git push -u origin main





