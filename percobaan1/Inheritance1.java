public class Inheritance1 {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama = "Andika";
        M.alamat = "GPI";
        M.umur = 19;
        M.jk= "Laki - Laki";
        M.gaji= 5000000;
        M.tunjangan = 1000000;
        M.tampilDdataManager();

        Staf s = new Staf();
        s.nama = "Hilmi";
        s.alamat = "Mojokerto";
        s.umur = 25;
        s.jk = "Laki - Laki";
        s.gaji = 3000000;
        s.lembur = 500000;
        s.potongan= 150000;
        s.tampilDataStaff();
    }
}
