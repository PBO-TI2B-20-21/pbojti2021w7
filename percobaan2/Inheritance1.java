public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap staffTetap = new StaffTetap("Odading", "Malang", "Perempuan", 20, 2000000, 200000, 250000, "2B", 100000);
		staffTetap.tampilStaffTetap();
        StaffHarian staffHarian = new StaffHarian("Mang Oleh", "Malang", "Laki - Laki", 25, 10000, 100000, 50000, 100);
		staffHarian.tampilStaffHarian();

    }
}
