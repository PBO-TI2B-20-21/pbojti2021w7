/**
 * TugasKomputer
 */
public class TugasKomputer {

    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
       public TugasKomputer(){

       }
       public TugasKomputer (String jnsProsesor, String merk, int sizeMemory,int kecProsesor){
           this.jnsProsesor = jnsProsesor;
           this.merk = merk;
           this.sizeMemory = sizeMemory;
           this.kecProsesor = kecProsesor;
       }
       public void tampilData(){
           System.out.println("--------------------- Data Komputer ---------------------");
           System.out.println("jenis prosesor     = "+jnsProsesor);
           System.out.println("merk               = "+merk);
           System.out.println("size memory        = "+sizeMemory);
           System.out.println("kecepatan prosesor = "+kecProsesor);
       }
}