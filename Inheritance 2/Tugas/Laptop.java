public class Laptop extends Komputer{
    public String jnsBatrai;

    public Laptop(){

    }
    public Laptop(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrai){
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBatrai = jnsBatrai;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Batrai\t\t= " + jnsBatrai);
    }
}
