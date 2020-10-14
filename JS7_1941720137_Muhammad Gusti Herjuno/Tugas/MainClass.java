package Tugas;

public class MainClass {
    public static void main(String[] args) {
        Pc pc = new Pc();
        pc.merk = "Asus";
        pc.kecProsesor = 3000;
        pc.sizeMemory = 16;
        pc.jnsProsesor = "Intel";
        pc.ukuranMonitor = 30;
        pc.tampilPc();

        Mac mac = new Mac("Apple", 4000, 8, "ARM", "Lithium", "Apple ID");
        mac.tampilMac();

        Windows windows = new Windows("Lenovo", 5000, 16, "AMD", "Lithium", "Cortana");
        windows.tampilWindos();
    }
}
