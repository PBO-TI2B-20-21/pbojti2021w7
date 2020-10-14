package tugas;

public class PC extends Komputer{
    public int ukuranMonitor;

    public PC() {
    }

    public PC(int ukuranMonitor, String merk, int kecProsessor, int sizeMemory, String jnsProsessor) {
        super(merk, kecProsessor, sizeMemory, jnsProsessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        System.out.println("==================Data PC=================");
        super.tampilData();
        System.out.println("Ukuran Monitor   ="+ukuranMonitor);
    }
}
