public class TugasInheritance {
    public static void main(String[] args) {
        Pc pc = new Pc();
        System.out.println("================Lini PC================");
        pc.merk = "IBM";
        pc.kecProcessor = 1;
        pc.sizeMemory = 4;
        pc.jnsProcessor = "IBM Power 4";
        pc.ukuranMonitor = 17;
        pc.tampilPc();
        System.out.println();
        System.out.println("============Lini Laptop Mac============");
        Mac mac = new Mac();
        mac.merk = "Apple";
        mac.kecProcessor = 2;
        mac.sizeMemory = 8;
        mac.jnsProcessor = "Intel Core I7";
        mac.jnsBatrai = "Lithium-Ion (Li-Ion)";
        mac.security = "Sangat Tinggi";
        mac.tampilMac();
        System.out.println();
        System.out.println("==========Lini Laptop Windows==========");
        Windows win = new Windows();
        win.merk = "Lenovo";
        win.kecProcessor = 2;
        win.sizeMemory = 8;
        win.jnsProcessor = "AMD Ryzen 5";
        win.jnsBatrai = "Lithium-Ion (Li-Ion)";
        win.fitur = "Sensor Sidik Jari";
        win.tampilWindows();
    }
}
