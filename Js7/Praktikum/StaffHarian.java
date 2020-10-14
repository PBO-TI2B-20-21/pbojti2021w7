/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author WINDOWS 10
 */
public class StaffHarian extends Staff{
    public int jmlJamKerja;
    
    public StaffHarian() {
        
    }
    
    public StaffHarian(String nama, String alamat, String jk, int umur,
        int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarian() {
        System.out.println("============ Data Staff Tetap ============");
        super.tampilDasarStaff();
        System.out.println("Jumlah Jam Kerja\t= " + jmlJamKerja);
        System.out.println("Gaji Bersih\t\t= " + (gaji*jmlJamKerja+lembur-potongan));
    }
}