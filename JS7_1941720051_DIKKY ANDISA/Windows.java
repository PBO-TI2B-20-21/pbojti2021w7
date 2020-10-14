public class Windows extends Laptop{
    public String fitur;
       public Windows(){

    }
       public Laptop(String jnsProsesor,String merk, int sizeMemory, int kecProsesor, String jnsBatrei,String fitur){
        this.fitur = fitur;
    }
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("fitur              = "+fitur);
    }
}
