/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author DEBORA
 */
public class StaffHarian extends Staff {
    public int jmlhJamKerja;
    
    public StaffHarian(){
        
    }
    
    public StaffHarian(String nama, String alamat, String jk, int umur, 
            int gaji, int lembur, int potongan, int jmlhJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlhJamKerja=jmlhJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("=========Data Staff Harian=========");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja    : "+jmlhJamKerja);
        System.out.println("Gaji Bersih         : "+(gaji*jmlhJamKerja+lembur-potongan));                
    }
}
