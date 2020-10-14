package inheritancedua;

public class Percobaan2 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("2A",100000,250000,200000, "Budi", "Malang", "Laki-Laki", 20, 2000000);
        ST.tampilStaffTetap();
        
        StaffHarian SH = new StaffHarian(100,100000,50000,"Indah", "Malang","Perempuan",27,10000);
        SH.tampilStaffHarian();
    }
}
