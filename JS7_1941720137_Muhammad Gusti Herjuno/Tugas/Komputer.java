package Tugas;

public class Komputer {
    String merk, jnsProsesor;
    int kecProsesor, sizeMemory;

    Komputer(){

    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor =jnsProsesor;
    }

    public void tampilDataKomputer(){
        System.out.println("Merk                   =" + merk);
        System.out.println("Kecepatan Prosesor     =" + kecProsesor + "MHz");
        System.out.println("Ukuran Memory          =" + sizeMemory);
        System.out.println("Jenis Prosesor         =" + jnsProsesor);
    }

}
