/**
 * mac
 */
public class mac extends laptop{
    public String security;
    public mac(){

    }
    public mac(String merk,int kecProsesor,int sizeMemory,String jnsProsesor, String jnsBatrei, String security){
        super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBatrei);
        this.security=security;
    }
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security : "+security);
    }
}