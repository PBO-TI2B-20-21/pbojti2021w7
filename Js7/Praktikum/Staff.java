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
public class Staff extends Karyawan {
    public int lembur, potongan;
    
    public Staff() {
        
    }
    
    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama,alamat,jk,umur,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDasarStaff() {
        super.tampilDataKaryawan();
        System.out.println("Lembur\t\t\t= " + lembur);
        System.out.println("Potongan\t\t= " + potongan);
        System.out.println("Total Gaji\t\t= " + (gaji+lembur+potongan));
    }
}
