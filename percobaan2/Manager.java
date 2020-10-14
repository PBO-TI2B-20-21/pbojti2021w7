/**
 * Manager
 */
public class Manager extends karyawan {

    public int tunjangan;

	public Manager() {}
	
	public void tampilDdataManager() {
        super.tampilDataPegawai();
		System.out.println("Tunjangan     : " + tunjangan);
		System.out.println("Total Gaji    : " + (super.gaji+tunjangan));
	}

}