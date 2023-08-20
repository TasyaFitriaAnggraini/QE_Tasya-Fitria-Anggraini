# Resume Versioning Control With Git

## What is Versioning

<aside>
Melakukan sebuah pengaturan versi atau pelacakan perubahan dari setiap kode program. Tujuan dari versioning mengetahui kesalahan dari kode pemrograman yang dibuat, mengetahui yang melakukan perubahan kode pemrograman, apa saja yang diubah.
</aside>

## Git Versioning Control (Git)

<aside>
Salah satu Version Control System (VCS) populer yang digunakan para developer untuk mengembangakan software secara bersama sama. Secara general GIT selain digunakan untuk mengatur versi, mencatat setiap perubahan, juga digunakan untuk berkolaborasi dan bersinkronisasi dengan para developer lainnya dalam 1 proyek yang sama. Ada beberapa layanan versioning control yang jamak digunakan para developer yaitu github, gitlab, bitbucket dan masih banyak lainnya.

Pada tahap instalasi dapat langsung download di website resmi dan install git, untuk di Linux based bisa menggunakan command “sudo apt-get install git”. Setelah instalasi dapat melakukan konfigurasi akun git pada perangkat yang digunakan menggunakan command “git config –global user.name “user name” dan “git config –global user.email “user email”.
</aside>

## Langkah Langkah Menambahkan Proyek yang sudah ada ke Dalam Repository Github

**1.  `git init**, disini nanti akan membuat satu folder bernama ".git" yang bersifat hidden (tersembunyi). Berikut merupakan contoh folder ".git"
![Image](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/3_Versioning%20Control%20with%20Git/Screenshot/Screenshot%202023-08-18%20144431.png)

**2.  git remote add <remote_name> <remote_repo_url>**, Untuk mensinkronsasi dengan repository ke visual studio code menggunakan protokol HTTPS dapat melakukan enkripsi didalam data yang dibuat saat pengiriman sehingga dapat meminimalisir data data yang didapat serta dapat dibaca dengan mudah. Berikut untuk mendapat repo url dan contoh penggunaannya
![Image](https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/3_Versioning%20Control%20with%20Git/Screenshot/Screenshot%202023-08-18%20150508.png)

-   git remote add origin https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini.git

**3.  git push -u <remote_name>**, digunakan dalam sistem kontrol versi Git untuk mengirimkan perubahan yang Anda telah lakukan pada repositori lokal Anda ke repositori yang berada di remote server GitHub. Opsi "-u" menghubungkan cabang lokal yang sedang Anda push dengan cabang pada remote repository yang ditentukan. Berikut merupakan contoh penggunaan.

-   git push -u origin main

<aside>
Untuk melakukan klon repository ke pada komputer lokal menggunakan command:

`git clone url repository`
</aside>

## Fungsi Command Git

1.  Git status : untuk menampilkan status git branch yang sedang digunakan sekarang 
1.  Git add    : untuk menambahkan file ke dalam antrean/stagged area untuk dikomit, dapat juga menggunakan “git add .” untuk menambahkan seluruh file ke dalam antrean.
1.  Commit     : untuk melakukan komit dan sudah siap untuk dilakukan push, biasanya ditambah dengan “-m” untuk ditambahkan message commit. “Git commit -m ‘first commit’”.
1.  Git reset  : untuk reset perubahan yang ada pada branch yang sudah dicommit sebelumnya.

## SYNC 

Untuk melakukan sinkronisasi proyek yang sudah update oleh developer lain menggunakan command `git fetch`, `git pull origin origin master`. Untuk melakukan push/upload pekerjaan yang sudah kita buat setelah melakukan command commit maka dilakukan command `git push origin <branch_name>`.

## BRANCH

1. Membuat branch baru         : `git branch <nama branch>` 
1. Hapus branch                : `git branch -D <nama branch>` 
1. Menampilkan branch remote   : `git branch -a` 
1. Pindah branch               : `git checkout <nama branch>` 
1. Menyatukan branch           : `git merge <nama branch>`



