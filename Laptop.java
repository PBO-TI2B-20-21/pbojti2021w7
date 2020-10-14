package Tugas.tugas;
public class Laptop extends Komputer{
    public String jnsBaterai;

    public Laptop() {
    }

    public Laptop(String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }
    
   public void tampilLaptop(){
       super.tampilDataKomputer();
       System.out.println("Jenis Baterai \t\t : "+jnsBaterai);
   }
}   
