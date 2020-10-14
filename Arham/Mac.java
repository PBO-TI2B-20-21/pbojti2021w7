public class Mac extends Laptop{
    public String security;

    public Mac(){

    }

    public Mac(String merk,int kecProsesor,int sizeMemory,String jnsProsesor,
    String jnsBatrei,String security){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.jnsBatrei=jnsBatrei;
        this.security=security;
    }

    public void tampilMac() {
        System.out.println("=================LAPTOP MAC==================");
        super.tampilLaptop();
        System.out.println("Mac                 ="+ security);
    }
}
