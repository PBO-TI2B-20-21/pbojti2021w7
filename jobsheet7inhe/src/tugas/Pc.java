package tugas;

public class Pc extends Komputer{
    public int ukuranMonitor;
    
    public Pc(){
        
    }
    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("========== Pc ==========");
        super.tampilData();
        System.out.println("Ukuran Monitor\t\t: "+ukuranMonitor);
    }
}
