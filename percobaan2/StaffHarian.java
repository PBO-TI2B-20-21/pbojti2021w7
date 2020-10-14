
package percobaan2;

public class StaffHarian extends Staff {
    public int jmlJamKerja;
    
    StaffHarian(){
        
    }

    public StaffHarian(String nm, String almt, String jk, int umur, int lembur, int potongan, int gj,int jmlJamKerja) {
        super(lembur, potongan, nm, almt, umur, jk, gj);
        this.jmlJamKerja = jmlJamKerja;
    }
    public void tampilStaffHarian(){
        System.out.println("================Data Staff Harian================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja    ="+jmlJamKerja);
        System.out.println("Gaji Bersih         ="+(gaji*jmlJamKerja+lembur-potongan));
    }
}
