package Hewann;
class Kuda extends Hewan implements Herbivora {
    @Override
    public void jenisMakanan(){
        System.out.println("Jenis: Herbivora ");
    }

    @Override
    public void getInfo(){
        System.out.println("Makanan: Tumbuhan ");
    }
    @Override
    public void suara(){
        System.out.println("Suara: hihihhihi\n");
    }
}