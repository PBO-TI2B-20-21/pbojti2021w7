
package TUGAS;

public class Pc extends Komputer{
    public int ukuranMonitor;
    
    Pc(){
        
    }

    public Pc( String merk, int kecProsesor, int sizeMemory, String jnsProsesor,int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("================== PC =================");
        super.tampilData();
        System.out.println("ukuran monitor      = "+ukuranMonitor+" Inch");
    }
}
