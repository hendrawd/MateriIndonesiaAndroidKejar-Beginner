package company.helloworld;

/**
 * @author hendrawd on 11/26/17
 */

// ini inheritence(penurunan)
public class Cat extends Animal {

    private String satu;
    protected String dua;
    public String tiga;
    String speak = "U u a a";

    public static void main(String[] args) {
        Cat kucingMumu = new Cat();
        String satuKucing = kucingMumu.satu;

        KucingAngora kucingAngora = new KucingAngora();
        String dua = kucingAngora.dua;
        String tiga = kucingAngora.tiga;
        String speak = kucingAngora.speak;
        System.out.println(kucingMumu.speak);
    }
}
