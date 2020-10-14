package Tugas;

public class Windows extends Laptop{
    String fitur;

    Windows(){

    }

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindos(){
        System.out.println("======================LAPTOP OS WINDOWS======================");
        super.tampilLaptop();
        System.out.println("Fitur                  =" + fitur);
        System.out.println();
    }
}
