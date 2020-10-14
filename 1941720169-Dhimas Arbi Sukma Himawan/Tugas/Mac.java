package Tugas;

public class Mac extends Leptop{
    public String security;

    Mac(){}

    Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        System.out.println();
        super.tampilLeptop();
        System.out.println("Keamanan            : "+security);
    }
}
