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

## ☞ Error ketika Run/menjalankan project

Silakan refresh gradle projects yang ada di
![screen shot 2018 01 22 at 13 52 37](https://user-images.githubusercontent.com/9481791/35208686-23a3b000-ff7c-11e7-8e3c-2a1c203cee65.png)

Kalau ada masalah lain, silakan buat issue baru di sini atau email saya secara langsung di hendraz_88@yahoo.co.id