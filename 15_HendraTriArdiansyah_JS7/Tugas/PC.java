package Tugas;
public class PC extends Komputer {
    public int ukuranMonitor;
    
    public PC(){
        
    }
    public PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPC(){
        System.out.println("==============PC=================");
        System.out.println("Merk                ="+merk);
        System.out.println("Jenis Prosesor      ="+jnsProsesor);
        System.out.println("Kecepetan Prosesor  ="+kecProsesor+" Ghz");
        System.out.println("Ukuran memory       ="+sizeMemory+"GB");
        System.out.println("Ukuran Monitor      ="+ukuranMonitor+"inch");
        System.out.println("===============================");
    }
}
