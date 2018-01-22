# Materi:
* Belajar tentang penggunaan dasar dari Android Studio
* Belajar struktur project dari aplikasi Android
* Belajar cara mencari dan download plugin di Android Studio
  * Masuk ke "Preferences"/"Settings"
  * Masuk ke "Plugins"
* Belajar cara membuat emulator di Android Studio
  * Klik pada tombol "AVD Manager" di bagian Toolbar Android Studio, sehingga window baru akan muncul
  * Klik tombol "Create Virtual Device..." pada bagian bawah window tersebut
  * Ikuti langkah-langkah selanjutnya dari window tersebut dan sesuaikan dengan pengaturan yang diinginkan
* Belajar cara mengaktifkan "Developer options"/"Opsi pengembang"
  * Masuk ke "Settings"/"Setelan"
  * Masuk ke "About phone"/"Tentang ponsel"
  * Klik 7x di "Build number"/"Nomor bentukan"
  * Kemungkinan letak menu tidak selalu sama di tiap perangkat
* Belajar cara mengaktifkan "Android debugging" di device Android
  * Masuk ke "Settings"/"Setelan"
  * Masuk ke "Developer Options"/"Opsi Pengembang"
  * Klik ke "Android debugging"
  * Kemungkinan letak menu tidak selalu sama di tiap perangkat
* Belajar perbedaan ViewGroup dan View
  * ViewGroup adalah komponen yang merupakan penampung dari View
  * View adalah komponen terdepan untuk menampilkan apa yang kita inginkan ke pengguna
* Belajar macam-macam ViewGroup, antara lain:
  * [FrameLayout](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_frame_layout.xml)
  * [LinearLayout](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_linear_layout.xml)
  * [RelativeLayout](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_relative_layout.xml)
* Belajar macam-macam View, antara lain:
  * [TextView](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_profile.xml#L21)
  * [ImageView](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_image_view.xml)
  * [Button](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_profile.xml#L39)
  * [EditText](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_profile.xml#L71)
* Belajar penggunaan [ScrollView](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_profile.xml#L2), supaya layout yang dibuat dapat discroll
* Belajar cara meng-extract string ke [strings.xml](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/values/strings.xml) dan dimension ke [dimens.xml](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/values/dimens.xml) dan menggunakannya di layout
* Mencoba untuk membuat layout user profile sendiri
* Pengenalan Object Oriented Programming menggunakan bahasa pemrograman Java
* Belajar cara untuk membuat interaksi ketika Button diklik dari file XML([how](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/res/layout/activity_profile.xml#L42))
* Belajar cara untuk menangani interaksi Button click di file Java([how](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L25))
* Belajar cara untuk import external library([how](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/build.gradle#L28))
* Belajar cara untuk menampilkan pesan di Android device menggunakan [Toast](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L32), [AlertDialog](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L43), [Snackbar](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L37)
* Belajar cara membuat Activity baru di Android Studio(File->New->Activity)
* Belajar cara pindah Activity([how](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L48))
* Belajar cara pindah Activity dengan membawa data dari Activity sebelumnya([how](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L55))
* Belajar cara mendapatkan data yang dipassing dari Activity sebelumnya([how](https://github.com/hendrawd/iak3.3_beginner_pertemuan1/blob/master/app/src/main/java/company/helloworld/DetailActivity.java#L15))
* ~~Belajar nyayi dan joget Baby Shark~~

Pastikan kamu mempunyai koneksi internet yang stabil untuk menjalankan proyek ini. Android Studio akan butuh untuk mendownload build tool, Android SDK atau mungkin dependency yang lain melalui internet.

# Masalah yang mungkin terjadi:

## ☞ Error 216:

Pesan error akan seperti: `Error:CreateProcess error=216, This version of %1 is not compatible with the version of Windows you're running. Check your computer's system information and then contact the software publisher`

Solusi:

* Silakan download JDK8 versi terbaru yang sesuai dengan Sistem Operasi yang kamu pakai di http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* Install JDK tersebut ke komputer kamu
* Buka proyek ini dengan Android Studio
* Buka File>Project Structure>SDK Location

![screen shot 2016-12-05 at 12 15 58 pm](https://cloud.githubusercontent.com/assets/9481791/20874547/83b71e14-bae5-11e6-944b-b7f4677a0cf2.png)

* Hapus centang "Use embedded JDK (recommended)"

![screen shot 2016-12-05 at 12 34 47 pm](https://cloud.githubusercontent.com/assets/9481791/20874695/e1fd774c-bae6-11e6-9122-a05792e23ad9.png)

* Isi box di bawahnya dengan path utama JDK yang telah kamu install, biasanya di `C:\Program Files\Java\jdk1.8.x`

## ☞ Unable to start the daemon process:

Pesan error akan seperti:
```
Error:Unable to start the daemon process.
This problem might be caused by incorrect configuration of the daemon.
For example, an unrecognized jvm option is used.
Please refer to the user guide chapter on the daemon at http://gradle.org/docs/1.12/userguide/gradle_daemon.html
-----------------------
Error occurred during initialization of VM
Could not reserve enough space for 1572864KB object heap
Java HotSpot(TM) Client VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
```

Solusi:

* Buka Project structure>Android>Gradle Scripts>gradle.properties
* Temukan `org.gradle.jvmargs=-Xmx1536m` dan coba untuk mengurangi nilainya, seperti `org.gradle.jvmargs=-Xmx256m`

![screen shot 2016-12-05 at 12 15 35 pm](https://cloud.githubusercontent.com/assets/9481791/20874546/81556d06-bae5-11e6-8aca-6e6dda331079.png)

Kalau ada masalah lain, silakan buat issue baru di sini atau email saya secara langsung di hendraz_88@yahoo.co.id

## ☞ Error ketika Run/menjalankan project

Silakan refresh gradle projects yang ada di
![screen shot 2018 01 22 at 13 52 37](https://user-images.githubusercontent.com/9481791/35208686-23a3b000-ff7c-11e7-8e3c-2a1c203cee65.png)
