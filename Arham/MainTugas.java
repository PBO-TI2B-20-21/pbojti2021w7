public class MainTugas {
    public static void main(String[] args) {

        Mac mc= new Mac("ROG",2,3000,"AMD RADEON R3","Nickel cadmium","Security");
        mc.tampilMac();

        Windows w= new Windows("HP",3,4000,"intel","Lithium-Ion","microsoft edge");
        w.tampilWindows();

        Pc pc = new Pc("ASUS",4,2000,"Pentium 4",300);
        pc.tampilPc();

    }
}
