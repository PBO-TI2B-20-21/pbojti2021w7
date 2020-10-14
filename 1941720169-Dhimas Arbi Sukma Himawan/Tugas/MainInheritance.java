package Tugas;

public class MainInheritance {
    public static void main(String[] args) {
        Pc pc = new Pc("Apple iMac", 3, 8, "Intel i5", 21);
        pc.tampilPC();

        Mac m = new Mac("Apple Macbook Pro", 4, 8, "Core i7 6-core","Li-ion","Fingerprint");
        m.tampilMac();

        Windows w = new Windows("Asus Zephyrus M", 5, 16, "Core i7 9-core","Li-ion", "Armoury Crate");
        w.tampilWindows();
    }
}
