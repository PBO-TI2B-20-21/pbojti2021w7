package Praktikum;

public class Karyawan {
    public String nama, alamat, jk;
    public int umur, gaji;

    Karyawan(){

    }

    Karyawan(String nama, String alamat, String jk, int umur, int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilDataKaryawan(){
        System.out.println("Nama            =" + nama);
        System.out.println("Alamat          =" + alamat);
        System.out.println("Jenis Kelamin   =" + jk);
        System.out.println("umur            =" + umur);
        System.out.println("gaji            =" + gaji);
    }

}
