
package percobaan2;
public class Staff extends Karyawan {
  public int lembur;
  public int potongan;
  
  Staff(){
      
  }

  Staff(int lembur, int potongan, String nm, String almt, int umur, String jk, int gj) {
        super(nm, almt, umur, jk, gj);
        this.lembur = lembur;
        this.potongan = potongan;
    }
  public void tampilDataStaff(){
      super.tampilDataPegawai();
  }
}
