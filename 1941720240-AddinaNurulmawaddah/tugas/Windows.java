package tugas;

public class Windows extends Laptop{
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBattery, String merk, int kecProsessor, int sizeMemory, String jnsProsessor) {
        super(jnsBattery, merk, kecProsessor, sizeMemory, jnsProsessor);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        System.out.println("==================Data Windows=================");
        super.tampilLaptop();
        System.out.println("Fitur   ="+fitur);
    }
}
