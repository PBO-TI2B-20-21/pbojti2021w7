public class Mac extends Laptop{
    public String security;

    public Mac(){

    }
    public Mac(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrai, String security){
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBatrai);
        this.security = security;
    }
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security\t\t= " + security);
    }
}
