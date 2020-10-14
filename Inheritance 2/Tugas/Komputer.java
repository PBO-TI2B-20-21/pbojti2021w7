public class Komputer {
    public String merk, jnsProcessor;
    public int kecProcessor, sizeMemory;

    public Komputer(){
        
    }
    public Komputer(String merk, int kecProcessor, int sizeMemory, String jString){
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }
    public void tampilData(){
        System.out.println("Merk\t\t\t= " + merk);
        System.out.println("Kecepatan Processor\t= " + kecProcessor + "GHz");
        System.out.println("Size Memory\t\t= " + sizeMemory + "GB");
        System.out.println("Jenis Processor\t\t= " + jnsProcessor);
    }
}
