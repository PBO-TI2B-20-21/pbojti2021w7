
package tugasjs7;
/**
 * BimaGilangLesmana
 */
public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
        public Komputer(){
            
        }
        public Komputer (String merk, String jnsProsesor, 
               int kecProsesor, int sizeMemory){
            this.merk = merk;
            this.jnsProsesor = jnsProsesor;
            this.kecProsesor = kecProsesor;
            this.sizeMemory = sizeMemory;
        }
        public void tampilData(){
            System.out.println("xxxxxxxxxxxxxxxxx Data Komputer xxxxxxxxxxxxxx");
            System.out.println("Merk               = "+merk);
            System.out.println("Kecepatan Prosesor = "+kecProsesor);
            System.out.println("Size Memory        = "+sizeMemory);
            System.out.println("Jenis Prosesor     = "+jnsProsesor);
        }
}
