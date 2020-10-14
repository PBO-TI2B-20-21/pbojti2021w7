
package TUGAS;

public class MainTugas {
    public static void main(String[] args) {
            Mac mc1 = new Mac("Intel", 3, 8, "intel core i5 10300H ", "Lion", "AVG");
            mc1.tampilMac();
            
            Windows w1 = new Windows("AMD", 4, 12, "AMD Ryzen 5 4600H", "nickle", "fingerprint");
            w1.tampilWindows();
            
            Pc p1 = new Pc("Intel", 4, 12, "Intel core i5 9400f", 24);
            p1.tampilPc();
    }
}
