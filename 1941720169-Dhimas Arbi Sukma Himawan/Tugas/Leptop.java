package Tugas;

public class Leptop extends Komputer{
    public String jnsBaterai;

    Leptop(){}

    Leptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLeptop() {
        super.tampilData();
        System.out.println("Jenis Baterai       : "+jnsBaterai);
    }
}
