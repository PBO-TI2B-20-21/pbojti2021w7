package Tugas;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    Komputer(){}

    Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merk                : "+merk);
        System.out.println("Kecepatan prosesor  : "+kecProsesor);
        System.out.println("Size memory         : "+sizeMemory);
        System.out.println("Jenis Prosesos      : "+jnsProsesor);
    }
}
