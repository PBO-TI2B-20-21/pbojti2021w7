package tugas;

public class Komputer {
    public String merk;
    public int kecProsessor;
    public int sizeMemory;
    public String jnsProsessor;

    public Komputer() {
    }

    public Komputer(String merk, int kecProsessor, int sizeMemory, String jnsProsessor) {
        this.merk = merk;
        this.kecProsessor = kecProsessor;
        this.sizeMemory = sizeMemory;
        this.jnsProsessor = jnsProsessor;
    }
    
    public void tampilData(){
        System.out.println("Merek                   =" + merk);
        System.out.println("Kecepatan Prosesssor    =" + kecProsessor);
        System.out.println("size Memory             =" + sizeMemory);
        System.out.println("Jenis Prosessor         =" + jnsProsessor);
    }
}
