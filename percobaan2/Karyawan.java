
package percobaan2;

public class Karyawan {
    public String nama;
    public String alamat;
    public int umur;
    public String jk;
    public int gaji;
    
    Karyawan(){
        
    }
    Karyawan(String nm, String almt, int umur,String jk, int gj){
       this.nama = nm;
       this.alamat = almt;
       this.umur = umur;
       this.jk = jk;
       this.gaji = gj;
    }
    public void tampilDataPegawai(){
        System.out.println("nama                :"+this.nama);
        System.out.println("alamat              :"+this.alamat);
        System.out.println("umur                :"+this.umur);
        System.out.println("jeni kelamin        :"+this.jk);
        System.out.println("gaji                :"+this.gaji);
        
    }
}
