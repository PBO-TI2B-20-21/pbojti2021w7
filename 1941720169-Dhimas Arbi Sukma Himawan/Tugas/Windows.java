package Tugas;

public class Windows extends Leptop{
    public String fitur;

    Windows(){}

    Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        System.out.println();
        super.tampilLeptop();
        System.out.println("Fitur               : "+fitur);
    }
}
