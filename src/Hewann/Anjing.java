package Hewann;

class Anjing extends Hewan implements Herbivora {
    @Override
    public void jenisMakanan(){
        System.out.println("Jenis: Karnivora ");
    }

    @Override
    public void getInfo(){
        System.out.println("Makanan: Daging ");
    }
    @Override
    public void suara(){
        System.out.println("Suara: Wooff\n");
    }
}