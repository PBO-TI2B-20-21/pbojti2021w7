
package tugasjs7;
/**
 * BimaGilangLesmana
 */
public class Leptop extends Komputer {
    public String jnsBatrei;
        public Leptop(){
            
        }
        public Leptop(String merk, int kecProsesor, String jnsProsesor,
                int sizeMemory, String jnsBatrei){
            this.jnsBatrei = jnsBatrei;
        }
        public void tampilLeptop(){
            super.tampilData();
            System.out.println("Jenis Batrei       = "+jnsBatrei);
        }
}
