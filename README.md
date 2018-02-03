# Materi:
* Belajar tentang penggunaan dasar dari Android Studio
* Belajar struktur project dari aplikasi Android
* Belajar cara mencari dan download plugin di Android Studio
  * Masuk ke "Preferences"/"Settings"
  * Masuk ke "Plugins"
* Belajar cara membuat emulator di Android Studio
  * Klik pada tombol "AVD Manager" di bagian Toolbar Android Studio, sehingga window baru akan muncul
  ![avd manager location](https://user-images.githubusercontent.com/9481791/35210217-eeb23d8c-ff83-11e7-8016-0a750be958aa.png)
  * Klik tombol "Create Virtual Device..." pada bagian bawah window tersebut
  * Ikuti langkah-langkah selanjutnya dari window tersebut dan sesuaikan dengan pengaturan yang diinginkan
* Belajar cara mengaktifkan "Developer options"/"Opsi pengembang"
  * Masuk ke "Settings"/"Setelan"
  * Masuk ke "About phone"/"Tentang ponsel"
  * Klik 7x di "Build number"/"Nomor bentukan"
  * Kemungkinan letak menu tidak selalu sama di tiap perangkat
* Belajar cara mengaktifkan "USB debugging"/"Android debugging" di device Android
  * Masuk ke "Settings"/"Setelan"
  * Masuk ke "Developer Options"/"Opsi Pengembang"
  * Klik ke "USB debugging"/"Android debugging"
  * Kemungkinan letak menu tidak selalu sama di tiap perangkat
* Belajar perbedaan ViewGroup dan View
  * ViewGroup adalah komponen yang merupakan penampung dari View
  * View adalah komponen terdepan untuk menampilkan apa yang kita inginkan ke pengguna
* Belajar macam-macam ViewGroup yang sering dipakai, antara lain:
  * [FrameLayout](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_frame_layout.xml) adalah ViewGroup yang dapat memposisikan View di dalamnya relatif terhadap FrameLayout itu sendiri.
  * [LinearLayout](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_vertical_linear_layout.xml) adalah ViewGroup yang dapat memposisikan View di dalamnya secara urut baik vertical ataupun horizontal.
  * [RelativeLayout](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_relative_layout.xml) adalah ViewGroup yang dapat memposisikan View di dalamnya relatif terhadap RelativeLayout itu sendiri maupun terhadap View yang lain.
* Belajar macam-macam View yang sering dipakai, antara lain:
  * [TextView](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_main.xml#L21) adalah View yang digunakan untuk menampilkan text.
  * [ImageView](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_image_view.xml) adalah View yang digunakan untuk menampilkan gambar.
  * [Button](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_main.xml#L39) adalah View yang digunakan untuk menampilkan tombol.
  * [EditText](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_main.xml#L95) adalah View yang digunakan untuk menerima input dari user berupa text, termasuk angka dan karakter.
* Belajar penggunaan [ScrollView](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_main.xml#L2), supaya layout yang dibuat dapat discroll
* Belajar cara meng-extract string ke [strings.xml](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/values/strings.xml) dan dimension ke [dimens.xml](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/values/dimens.xml) dan menggunakannya di layout
* Mencoba untuk membuat layout user profile sendiri
* Pengenalan Object Oriented Programming menggunakan bahasa pemrograman Java([how](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/tree/master/app/src/main/java/company/helloworld/oop))
* Belajar cara untuk membuat interaksi ketika Button diklik dari file XML([how](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/res/layout/activity_main.xml#L42))
* Belajar cara untuk menangani interaksi Button click di file Java([how](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L25))
* Belajar cara untuk import external library([how](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/build.gradle#L28))
* Belajar cara untuk menampilkan pesan di Android device menggunakan [Toast](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L32), [AlertDialog](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L43), [Snackbar](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L37)
* Belajar cara membuat Activity baru di Android Studio(File->New->Activity)
* Belajar cara menjalankan Activity baru([how](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L48))
* Belajar cara menjalankan Activity baru dengan membawa data dari Activity sebelumnya([how](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/java/company/helloworld/MainActivity.java#L55))
* Belajar cara mendapatkan data yang dipassing dari Activity sebelumnya([how](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/app/src/main/java/company/helloworld/DetailActivity.java#L21))
* Belajar cara membuat file apk versi debug([how](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/learn/HowToBuildDebugAPK.md))
* ~~Belajar nyayi dan joget Baby Shark~~

Pastikan kamu mempunyai koneksi internet yang stabil untuk menjalankan proyek ini. Android Studio akan butuh untuk mendownload build tool, Android SDK atau mungkin dependency yang lain melalui internet.

Ada masalah? [Cekidot](https://github.com/hendrawd/MateriIndonesiaAndroidKejar-Beginner/blob/master/learn/Problem.md) gan.