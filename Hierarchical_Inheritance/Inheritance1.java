package Hierarchical_Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
    
    Manager M = new Manager();
    M.nama="Laskar";
    M.alamat="Jl.Flamboyan";
    M.umur=20;
    M.jk="Perempuan";
    M.gaji=5000000;
    M.tunjangan=4500000;
    M.tampilDataManager();
    
    Staff S = new Staff();
    S.nama="Lestari";
    S.alamat="Jalan Juanda";
    S.umur= 27;
    S.jk= "Perempuan";
    S.gaji=4500000;
    S.lembur=4000000;
    S.potongan=3000000;
    S.tampilDataStaff();
    }
    
}
