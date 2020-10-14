package Tugas.tugas;
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBaterai, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security \t\t : "+security);
    }
    
}
