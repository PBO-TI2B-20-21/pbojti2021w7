package Tugas;

public class Pc extends Komputer {
    public int ukuranMonitor;

    Pc(){}

    Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPC() {
        super.tampilData();
        System.out.println("Ukuran monitor      : "+ukuranMonitor);
    }
}
