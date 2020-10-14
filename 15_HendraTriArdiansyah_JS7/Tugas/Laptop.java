package Tugas;
public class Laptop extends Komputer {
    public String jnsBaterai;
    
    public Laptop(){
        
    }
    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai){
        this.jnsBaterai=jnsBaterai;
    }
    public void tampilLaptop(){
        System.out.println("===============Laptop==================");
        System.out.println("Merk                ="+merk);
        System.out.println("Jenis Prosesor      ="+jnsProsesor);
        System.out.println("Kecepetan Prosesor  ="+kecProsesor+" Ghz");
        System.out.println("Ukuran memory       ="+sizeMemory+"GB");
        System.out.println("Jenis Baterai       ="+jnsBaterai);
        System.out.println("=================================");
    }
}
