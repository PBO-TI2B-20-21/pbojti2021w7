
package tugasjs7;
/**
 * BimaGilangLesmana
 */
public class Windows extends Leptop{
    public String fitur;
        public Windows(){
            
        }
        public Windows(String merk, String jnsProsesor, String jnsBatrei, 
                String fitur, int sizeMemory, int kecProsesor){
            this.fitur = fitur;
        }
        public void tampilWindows(){
            super.tampilLeptop();
            System.out.println("Fitur              = "+fitur);
        }
}
