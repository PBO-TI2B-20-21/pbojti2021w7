package tugas;

public class MainTugas {
    public static void main(String[] args) {
        PC pc = new PC(12,"Lenovo",100,250,"Intel i5");
        pc.tampilPc();
        
        Mac mc = new Mac("smadav", "15000mAh", "macBook", 100, 500, "motorolla");
        mc.tampilMac();
        
        Windows wn = new Windows("bluetooth", "nickel", "Asus", 50, 300, "intel i3");
        wn.tampilWindows();
    }
}
