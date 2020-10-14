public class Windows extends Laptop{
    public String fitur;

    public Windows(){

    }

    public Windows(String merk,int kecProsesor,
    int sizeMemory,String jnsProsesor,String jnsBatrei,String fitur) {
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.jnsBatrei=jnsBatrei;
        this.fitur=fitur;
    }

    public void tampilWindows() {
        System.out.println("\n==================Laptop Windows============");
        super.tampilLaptop();
        System.out.println("Fiturnya            = "+fitur);
    }
}
