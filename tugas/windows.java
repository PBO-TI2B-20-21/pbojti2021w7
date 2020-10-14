/**
 * windows
 */
public class windows extends laptop {
    public String fitur;
    public windows(){

    }
    public windows(String merk,int kecProsesor,int sizeMemory,String jnsProsesor, String jnsBatrei, String fitur){
        super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBatrei);
        this.fitur=fitur;
    }
    public void tampilWs(){
        super.tampilLaptop();
        System.out.println("Security : "+fitur);
    }
    
}