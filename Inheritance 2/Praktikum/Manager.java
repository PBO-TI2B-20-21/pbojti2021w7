public class Manager extends Karyawan{
    public int tunjangan;
    public Manager(){

    }
    public void tampilDataKaryawan(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan\t= " + tunjangan);
        System.out.println("Total Gaji\t= " + (super.gaji + tunjangan));
    }
}
