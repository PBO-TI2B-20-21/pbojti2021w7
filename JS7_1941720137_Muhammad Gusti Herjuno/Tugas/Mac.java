package Tugas;

public class Mac extends Laptop{
    String security;

    Mac(){

    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMac(){
        System.out.println("======================LAPTOP OS MAC======================");
        super.tampilLaptop();
        System.out.println("Keamanan               =" + security);
        System.out.println();
    }
}
