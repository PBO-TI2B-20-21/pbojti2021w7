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
public class StaffTetap extends Staff{
    public String golongan;
    public int asuransi;
    
    public StaffTetap() {
        
    }
    
    public StaffTetap(String nama, String alamat, String jk, int umur,
        int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetap() {
        System.out.println("============ Data Staff Tetap ============");
        super.tampilDasarStaff();
        System.out.println("Golongan\t\t= " + golongan);
        System.out.println("jumlah Asuransi\t\t= " + asuransi);
        System.out.println("Gaji Bersih\t\t= " + (gaji+lembur-potongan-asuransi));
    }
}
