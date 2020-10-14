public class StaffHarian extends Staff {
    public int jmlJamKerja;
    public StaffHarian(){

    }
    public StaffHarian(String nama,String alamat,String jk,int umur,int gaji,int lembur,int potongan,int jmlJamKerja){
         super(nama,alamat,jk,umur,gaji,potongan,lembur);
         this.jmlJamKerja = jmlJamKerja;
    }
    public void tampilStaffHarian(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxx Data Staff Harian xxxxxxxxxxxxxxxxxxxxxx");
        super.tampilDataStaff();
        System.out.println("Jumlah jam kerja           = "+jmlJamKerja);
        System.out.println("Gaji Bersih                ="+ (gaji+lembur+jmlJamKerja-potongan));
    }
}
