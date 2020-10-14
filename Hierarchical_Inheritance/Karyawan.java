package Hierarchical_Inheritance;

public class Karyawan {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan() {
    }

    public Karyawan(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.gaji = gaji;
        this.jk = jk;
    }
        
        public void tampilDataKaryawan(){
            System.out.println("Nama    ="+nama);
            System.out.println("Alamat  ="+alamat);
            System.out.println("Jenis Kelamin   ="+jk);
            System.out.println("Umur    ="+umur);
            System.out.println("Gaji    ="+gaji);
        }
}
