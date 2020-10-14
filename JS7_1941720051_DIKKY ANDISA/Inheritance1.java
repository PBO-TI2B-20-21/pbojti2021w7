public class Inheritance1 {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();
        System.out.println("xxxxxxxxxxxxxxx");

        Staff S = new Staff();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff();

        StaffTetap st = new StaffTetap(
            "budi","malang","laki-laki",
            20,2000000,250000,200000,"2a",10000);

            st.tampilStaffTetap();

            StaffHarian sh = new StaffHarian(
                "indah","malang","perempuan",
                27,10000,100000,50000,100);

            sh.tampilStaffHarian();    
        
    }
}
