package tugas;

public class Windows extends Laptop {
    public String fitur;
    
    public Windows(){
        
    }
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur=fitur;
    }
    public void tampilWindows(){
        System.out.println("========== Windows ==========");
        super.tampilLaptop();
        System.out.println("Fitur\t\t\t\t: "+fitur);
    }
}
