package Hewann;
class Beruang extends Hewan implements Herbivora,Karnivora {
    @Override
    public void jenisMakanan(){
        System.out.println("Jenis: Karnivora + Herbivora ");
    }

    @Override
    public void getInfo(){
        System.out.println("Makanan: Daging + Tumbuhan ");
    }
    @Override
    public void suara(){
        System.out.println("Suara: hhmmmmmmm\n");
    }
}