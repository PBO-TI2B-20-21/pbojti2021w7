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
public class Inheritance1 {
    public static void main(String[] args){
        StaffTetap st = new StaffTetap("Budi", "Malang", "Laki-laki", 20, 2000000, 250000, 200000, "2A", 100000);
        st.tampilStaffTetap();
        
        StaffHarian sh = new StaffHarian("Indah", "Malang", "Perempuan", 27, 100000, 100000, 50000, 100);
        sh.tampilStaffHarian();
        
//        percobaan1

//        Manager m = new Manager();
//        m.nama="Vivin";
//        m.alamat="Jl. Vinolita";
//        m.umur=25;  
//        m.jk="Perempuan";
//        m.gaji=3000000;
//        m.tunjangan=1000000;
//        m.tampilDataManager();
//        
//        Staff s = new Staff();
//        s.nama="Lestari";
//        s.alamat="Malang";
//        s.umur=25;
//        s.jk="Perempuan";
//        s.gaji=2000000;
//        s.lembur=500000;
//        s.potongan=250000;
//        s.tampilDataStaff();
//                
    }
}
