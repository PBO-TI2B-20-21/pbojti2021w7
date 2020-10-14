public class Pc extends TugasKomputer{
    public int ukMonitor;
       public Pc(){

       }
       public Pc(String jnsProsesor,String merk, int sizeMemory, int kecProsesor, String jnsBatrei,int ukMonitor){
        this.ukMonitor = ukMonitor;
       }
       public void tampilPc(){
           super.tampilData();
           System.out.println("ukuran monitor      = "+ukMonitor);
       }    
}
