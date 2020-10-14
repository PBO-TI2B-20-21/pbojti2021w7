
package percobaan2;

public class StaffTetap extends Staff {
    public String golongan;
    public int asuransi;
    
    StaffTetap(){
        
    }
    public StaffTetap(String nm, String almt,String jk,int umur, int gj,int lembur, int potongan, String golongan, int asuransi) {
        super(lembur, potongan, nm, almt, umur, jk, gj);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetap(){
        System.out.println("===============Data Staff Tetap===============");
        super.tampilDataStaff();
        System.out.println("Golongan            ="+golongan);
        System.out.println("Jumlah Asuransi     ="+asuransi);
        System.out.println("Gaji Bersih         ="+(gaji+lembur-potongan-asuransi));
    }
}
