public class Mac extends Laptop{
    public String security;
       public Mac(){

       }
       public Pc(String jnsProsesor,String merk, int sizeMemory, int kecProsesor, String jnsBatrei,String security){
        this.security = security;
       }
       public void tampilMac(){
           super.tampilLaptop();
           System.out.println("security        = "+security);
       }
}
