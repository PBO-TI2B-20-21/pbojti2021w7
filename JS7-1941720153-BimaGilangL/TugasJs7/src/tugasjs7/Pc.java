
package tugasjs7;
/**
 * BimaGilangLesmana
 */
public class Pc extends Komputer {
    public int ukMonitor;
        public Pc(){
            
        }
        public Pc(String merk, String jnsProsesor, 
               int kecProsesor, int sizeMemory, int ukMonitor){
            this.ukMonitor = ukMonitor;
        }
        public void tampilPc(){
            super.tampilData();
            System.out.println("Ukuran Monitor     = "+ukMonitor);
        }
}
