package Tugas;

public class Pc extends Komputer{
    int ukuranMonitor;

    Pc(){

    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc(){
        System.out.println("======================PC======================");
        super.tampilDataKomputer();
        System.out.println("Ukuran Monitor         =" + ukuranMonitor + "inch");
        System.out.println();
    }
}
