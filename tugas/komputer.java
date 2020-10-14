
/**
 * komputer
 */
public class komputer {

    public String merk,jnsProsesor;
    public int kecProsesor, sizeMemory;
    public komputer(){

    }
    public komputer(String merk,int kecProsesor,int sizeMemory,String jnsProsesor){
        this.merk = merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
    }
    public void tampilData(){
        System.out.println("===========================");
        System.out.println("Merk : "+merk);
        System.out.println("Kec Prosesor : "+kecProsesor);
        System.out.println("Size Memory : "+sizeMemory);
        System.out.println("jenis prosesor : "+jnsProsesor);
    }
}