package Tugas;
public class Pc extends Komputer {
    public int ukuranMonitor; 
    public Pc(){ 
    
    } 
    public void tampilDataPc(){ 
        super.tampilDataKomputer(); 
        System.out.println("Ukuran Monitor      ="+ukuranMonitor); 
    }
}
