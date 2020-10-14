/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;
public class Inheritance1 {
    public static void main(String[] args) {
        Manager M=new Manager();
        M.nama="Vivin";
        M.alamat="Jalanin Dulu";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManager();
        
        Staff S=new Staff();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaff();
        
        StaffTetap ST=new StaffTetap("Budi","Malang","LakiLaki",20,2000000,250000,20000,"2A",100000);
        ST.tampilStaffTetap();
        
        StaffHarian SH=new StaffHarian("Indah","Malang","PErempuan",27,10000,1000000,500000,100);
        SH.tampilStaffHarian();
    }

}
