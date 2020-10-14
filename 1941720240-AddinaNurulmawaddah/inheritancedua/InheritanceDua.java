package inheritancedua;

public class InheritanceDua {

    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama ="vivin";
        M.alamat ="Jl. Vinolia";
        M.umur =25;
        M.jk ="perempuan";
        M.gaji =3000000;
        M.tunjangan =1000000;
        M.tampilDataManager();
        
        Staff s = new Staff();
        s.nama = "Lestari";
        s.alamat = "Malang";
        s.umur = 25;
        s.jk = "perempuan";
        s.gaji = 2000000;
        s.lembur = 500000;
        s.potongan = 250000;
        s.tampilSataStaff();
        
    }
}
