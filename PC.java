package Tugas.tugas;
public class PC extends Komputer{
    public int ukuranMonitor;

    public PC() {
    }

    public PC(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPC(){
        super.tampilDataKomputer();
        System.out.println("Ukuran Monitor \t : "+ukuranMonitor);
    }
}
