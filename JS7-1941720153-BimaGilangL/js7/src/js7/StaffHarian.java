
package js7;
/**
 * BimaGilangL
 */
public class StaffHarian extends Staff {
    public int jmlJamKerja;
        public StaffHarian(){
            
        }
        public StaffHarian(String nama, String alamat, String jk,
                int umur,int gaji, int lembur, int potongan, int jmlJamKerja){
            super(nama,alamat,jk,gaji,umur,lembur,potongan);
            this.jmlJamKerja =  jmlJamKerja;
        }
        public void tampilStaffHarian(){
            System.out.println("xxxxxxxxxxxxxxx Data Staff Harian xxxxxxxxxxxxx");
            super.tampilDataStaff();
            System.out.println("Jumlah Jam Kerja      = " +jmlJamKerja);
            System.out.println("Gaji Bersih           = " +(gaji+lembur+jmlJamKerja-potongan));
        }
}
