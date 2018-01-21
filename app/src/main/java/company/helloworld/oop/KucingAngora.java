package company.helloworld.oop;

/**
 * @author hendrawd on 11/26/17
 */

// Kelas KucingAngora adalah turunan dari kelas Cat
public class KucingAngora extends Cat {
    // terdapat 2 macam variable di java berdasarkan jenisnya, yaitu

    // PRIMITIVE VARIABLE:
    // primitive variable yang digunakan untuk menyimpan angka:
    byte aByte = 1;
    short aShort = 1;
    int anInt = 1;
    long aLong = 1;
    float aFloat = 1;
    double aDouble = 1;

    // primitive variable yang digunakan untuk menyimpan value benar atau salah
    boolean aBoolean = true;

    // primitive variable yang digunakan untuk menyimpan value karakter
    char aChar = '1';

    // OBJECT VARIABLE:
    String kalimat = "Budi pergi ke pasar";
    Cat kucingJalanan = new Cat();
    String kalimatLain = new String("Ini ibu Budi");

    @Override
    public String getSpeakSound() {
        return "meoooooooowwwww";
    }
}
