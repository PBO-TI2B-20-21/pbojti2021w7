package Tugas;
public class Windows extends Laptop{
    public String fitur;
    
    public Windows(){
        
    }
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    public void tampilWindows(){
        System.out.println("================Windows=================");
        System.out.println("Merk                ="+merk);
        System.out.println("Jenis Prosesor      ="+jnsProsesor);
        System.out.println("Kecepetan Prosesor  ="+kecProsesor+" Ghz");
        System.out.println("Ukuran memory       ="+sizeMemory+"GB");
        System.out.println("Jenis Baterai       ="+jnsBaterai);
        System.out.println("Fitur               ="+fitur);
        System.out.println("=================================");
    }
}
