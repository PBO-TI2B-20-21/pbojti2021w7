public class Laptop extends TugasKomputer{
    public String jnsBatrei;
       public Laptop(){

       }
       public Laptop(String jnsProsesor,String merk, int sizeMemory, int kecProsesor, String jnsBatrei){
           this.jnsBatrei = jnsBatrei;
       }
       public void tampilLaptop(){
           super.tampilData();
           System.out.println("jenis batrei       = "+jnsBatrei);
       }
}
