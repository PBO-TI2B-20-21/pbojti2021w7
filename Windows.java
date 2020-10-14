package Tugas.tugas;
public class Windows extends Laptop{
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBaterai, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur \t\t\t : "+fitur);
    }
}
