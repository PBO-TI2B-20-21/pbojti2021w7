
package tugasjs7;
/**
 * BimaGilangLesmana
 */
public class Mac extends Leptop{
    public String security;
        public Mac(){
            
        }
        public Mac(String merk, int kecProsesor, String jnsProsesor,
                int sizeMemory, String jnsBatrei, String security){
            this.security = security;
        }
        public void tampilMac(){
            super.tampilLeptop();
            System.out.println("Security           = "+security);
        }
}
