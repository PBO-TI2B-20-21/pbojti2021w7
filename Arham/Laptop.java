public class Laptop extends Komputer{
    public String jnsBatrei;
    
    public Laptop() {
        
    }

    public Laptop(String merk,int kecProsesor,int sizeMemory,
    String jnsProsesor,String jnsBatrei) {
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.jnsBatrei=jnsBatrei;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Baterai             =" + jnsBatrei);
    }
}
