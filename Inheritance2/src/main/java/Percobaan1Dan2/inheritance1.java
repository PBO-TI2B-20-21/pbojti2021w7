/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1Dan2;

/**
 *
 * @author hp
 */
public class inheritance1 {
    public static void main(String[] args) {
    //TODO code application logic here
    StaffTetap ST = new StaffTetap();
    ST.nama="Budi";
    ST.alamat="Malang";
    ST.umur=25;
    ST.jk="Laki-laki";
    ST.gaji=2000000;
    ST.lembur=200000;
    ST.potongan=250000;
    ST.totalGaji=1950000;
    ST.golongan="2A";
    ST.asuransi=100000;
    ST.gajiBersih=1850000;
    ST.tampilStaffTetap();
    
    StaffHarian SH = new StaffHarian();
    SH.nama="Indah";
    SH.alamat="Malang";
    SH.umur=27;
    SH.jk="Perempuan";
    SH.gaji=10000;
    SH.lembur=100000;
    SH.potongan=50000;
    SH.totalGaji=60000;
    SH.jumlahJamKerja=100;
    SH.gajiBersih=1050000;
    SH.tampilStaffHarian();
    }
}