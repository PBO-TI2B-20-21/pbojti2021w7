/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public class MainInheritance1 {

    public static void main(String[] args) {
       
        Stafftetap ST = new Stafftetap("Ella", "Kediri", "Perempuan", 20, 2000000, 250000, 200000, "2A", 100000); 
        ST.tampilStaffTetap(); 
 
        StaffHarian SH = new StaffHarian("Amelia", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100); 
        SH.tampilStaffHarian(); 
    } 


}
