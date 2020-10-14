package Praktikum;

public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Laki-laki", 20, 2000000, 250000, 2000000, "2A", 1000000 );
        ST.tampilStaffTetap();

        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 10000, 1000000, 50000,100);
        SH.tampilStaffHarian();

    }
}
