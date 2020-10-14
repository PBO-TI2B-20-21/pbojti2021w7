
package percobaan1;

public class Manager extends Karyawan{
    public int tunjangan;
    
    Manager(){
        
    }
    public void tampilDataManager(){
        super.tampilDataPegawai();
        System.out.println("Tunjangan           = "+tunjangan);
        System.out.println("Total Gaji          = "+(gaji+tunjangan)+"\n");
    }
}
