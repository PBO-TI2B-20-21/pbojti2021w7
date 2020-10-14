
package percobaan1;

public class Karyawan {
    public String nama;
    public String alamat;
    public int umur;
    public String jk;
    public int gaji;
    
    Karyawan(){
        
    }
    Karyawan(String nama, String alamat, int umur, String jk, int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
        
    }
    public void tampilDataPegawai(){
        System.out.println("Nama                = "+nama);
        System.out.println("Alamat              = "+alamat);
        System.out.println("Jenis Kelamin       = "+jk);
        System.out.println("Umur                = "+umur);
        System.out.println("Gaji                = "+gaji);
    }
}
