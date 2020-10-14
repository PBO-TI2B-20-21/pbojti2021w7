package aula.inheritance2.percobaan1;

/**
 *
 * @author Aulafz
 */
public class Manager extends Karyawan {

    public int tunjangan;

    public Manager() {
    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       = " + tunjangan);
        System.out.println("Total Gaji      = " + (super.gaji + tunjangan));
    }
}
