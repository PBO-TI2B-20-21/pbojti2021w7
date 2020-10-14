public class Staf extends karyawan{
	public int lembur;
	public int potongan;
	
	public Staf() {}
	
	public Staf(String nama, String alamat, int umur, String jk, int gaji, int lembur, int potongan) {
		super(nama, alamat, jk, umur, gaji);
		this.lembur = lembur;
		this.potongan = potongan;
	}
	
	public void tampilDataStaff() {
        super.tampilDataPegawai();
		System.out.println("Lembur        : " + lembur);
		System.out.println("Potongan      : " + potongan);
		System.out.println("Total Gaji    : " + (gaji+lembur-potongan));
	}
}
