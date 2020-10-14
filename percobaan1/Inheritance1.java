
package percobaan1;

public class Inheritance1 {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama = "Shafriza";
        M.alamat = "Nganjuk";
        M.umur= 20;
        M.jk = "Laki-laki";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();
        
        Staff S = new Staff();
        S.nama = "Budi";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Laki-laki";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff();
    }
}
