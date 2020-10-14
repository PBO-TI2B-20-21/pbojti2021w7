
package TUGAS;

public class Windows extends Laptop {
    public String fitur;
    
    Windows(){
        
    }

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei,String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
   public void tampilWindows(){
       System.out.println("=============== Windows ===============");
       super.tampilLaptop();
       System.out.println("fitur               = "+fitur);
   } 
}
