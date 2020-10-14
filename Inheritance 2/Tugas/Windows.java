public class Windows extends Laptop{
    public String fitur;

    public Windows(){

    }
    public Windows(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrai, String fitur){
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBatrai);
        this.fitur = fitur;
    }
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur\t\t\t= " + fitur);
    }
}
