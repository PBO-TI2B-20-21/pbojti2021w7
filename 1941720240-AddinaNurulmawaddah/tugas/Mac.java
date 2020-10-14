package tugas;

public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBattery, String merk, int kecProsessor, int sizeMemory, String jnsProsessor) {
        super(jnsBattery, merk, kecProsessor, sizeMemory, jnsProsessor);
        this.security = security;
    }
    
    public void tampilMac(){
        System.out.println("==================Data MAC=================");
        super.tampilLaptop();
        System.out.println("Scurity   ="+security);
    }
}
