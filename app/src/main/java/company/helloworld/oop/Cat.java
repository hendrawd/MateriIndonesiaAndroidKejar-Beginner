package company.helloworld.oop;

/**
 * @author hendrawd on 11/26/17
 */

// ini inheritence(penurunan). Kelas Cat merupakan turunan dari kelas Animal
public class Cat extends Animal {

    // Perbedaan access modifier/specifier pada java
    // private cuma bisa diakses oleh kelas itu sendiri
    private String satu;
    // protected bisa diakses oleh kelas itu sendiri dan turunannya
    protected String dua;
    // public bisa diakses oleh semua kelas
    public String tiga;
    // default(tanpa access modifier) bisa diakses oleh kelas yang sama package
    String empat;

    // Tiap turunan mempunyai property dan method yang sama dengan parent,
    // tapi tetap melihat hak akses masing-masing

    // constructor
    // merupakan block code yang diakses ketika kelas dibuat
    public Cat() {

    }

    public void aMethod(){
        // Cat adalah kelas, kucingMumu adalah object
        Cat kucingMumu = new Cat();
        String satuKucing = kucingMumu.satu;

        KucingAngora kucingAngora = new KucingAngora();
        String dua = kucingAngora.dua;
        String tiga = kucingAngora.tiga;
        String speakSound = kucingAngora.getSpeakSound();
    }

    /**
     * Method yang dioverride dari parent(Animal)
     */
    @Override
    public String getSpeakSound() {
        return "Meow!";
    }
}
