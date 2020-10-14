package Tugas.tugas;
public class Test {
    public static void main(String[] args) {
        Mac m = new Mac("aman", "Li'ion", "MacBook2020", "Core I10", 3, 1000);
        m.tampilMac();
        System.out.println("==================================");
        Windows w = new Windows("Banyak", "Bongkar Pasang", "Lenovo", "Core I7", 3, 500);
        w.tampilWindows();
    }
}
