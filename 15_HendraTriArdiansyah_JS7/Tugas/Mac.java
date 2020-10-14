package Tugas;
public class Mac extends Laptop {
    public String security;
    
    public Mac(){
        
    }
    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai,String security){
        super(merk,kecProsesor, sizeMemory,jnsProsesor,jnsBaterai);
        this.security=security;
    }
    public void tampilMac(){
        System.out.println("=============MAC=================");
        System.out.println("Merk                ="+merk);
        System.out.println("Jenis Prosesor      ="+jnsProsesor);
        System.out.println("Kecepetan Prosesor  ="+kecProsesor+" Ghz");
        System.out.println("Ukuran memory       ="+sizeMemory+"GB");
        System.out.println("Jenis Baterai       ="+jnsBaterai);
        System.out.println("Keamanan            ="+security);
        System.out.println("===============================");
}
}
