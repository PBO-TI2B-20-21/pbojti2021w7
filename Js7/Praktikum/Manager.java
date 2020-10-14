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
public class Manager extends Karyawan{
    public int tunjangan;
    
    public Manager() {
        
    }
    
    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan\t: " + tunjangan);
        System.out.println("Total Gaji\t: " + (super.gaji + tunjangan));
    }
}

