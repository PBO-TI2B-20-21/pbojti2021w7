
package TUGAS;

public class Mac extends Laptop {
    public String security;
    
    Mac(){
        
    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security=security;             
    }
    public void tampilMac(){
        System.out.println("================= MAC =================");
        super.tampilLaptop();
        System.out.println("security            = "+security);
    }
}
