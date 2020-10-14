
package js7;
/**
 * BimaGilangL
 */
public class Inheritance1 {
    public static void main (String[] args){
        Manager M = new Manager();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();
        System.out.println("xxxxxxxxxxxxxxx");
        
        Staff s = new Staff();
        s.nama = "Lestari";
        s.alamat = "Malang";
        s.umur = 25;
        s.jk = "Perempuan";
        s.gaji = 2000000;
        s.lembur = 500000;
        s.potongan = 250000;
        s.tampilDataStaff();
        
        StaffTetap st = new StaffTetap(
        "budi", "Malang", "Laki-Laki",
         20, 2000000, 250000, 200000, "2A", 10000
        );
        st.tampilStaffTetap();
        
        StaffHarian sh = new StaffHarian(
        "indah", "Malang", "Perempuan",
         27, 10000, 100000, 50000,100
        );
        sh.tampilStaffHarian();
    }
}
