package Hewann;

public class Main {
    public static void main(String[] args) {
        Kucing cat = new Kucing();
        System.out.println("Hewan: Kucing" );
        cat.jenisMakanan();
        cat.getInfo();
        cat.suara();

        Beruang beruang = new Beruang();
        System.out.println("Hewan: Beruang" );
        beruang.jenisMakanan();
        beruang.getInfo();
        beruang.suara();

        Anjing gokay = new Anjing();
        System.out.println("Hewan: Anjing" );
        gokay.jenisMakanan();
        gokay.getInfo();
        gokay.suara();

        Kuda tuk = new Kuda();
        System.out.println("Hewan: Kuda" );
        tuk.jenisMakanan();
        tuk.getInfo();
        tuk.suara();
    }
}