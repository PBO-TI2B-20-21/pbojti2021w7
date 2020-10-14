package tugas;

public class Laptop extends Komputer{
    public String jnsBattery;

    public Laptop() {
    }

    public Laptop(String jnsBattery, String merk, int kecProsessor, int sizeMemory, String jnsProsessor) {
        super(merk, kecProsessor, sizeMemory, jnsProsessor);
        this.jnsBattery = jnsBattery;
    }
    
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Battery   ="+jnsBattery);
    }
}
