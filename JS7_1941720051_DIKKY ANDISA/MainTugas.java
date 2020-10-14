public class MainTugas {
    public static void main(String[] args) {
        Mac m = new Mac();
        m.merk = "HP";
        m.jnsProsesor = "CORE I3";
        m.jnsBatrei = "HP BATREI";
        m.security = "-";
        m.sizeMemory = 12;
        m.kecProsesor = 7;
        m.tampilMac();
        System.out.println("");

        Pc p = new Pc();
        p.merk = "samsung";
        p.jnsProsesor = "core i9";
        p.kecProsesor = 9;
        p.ukMonitor = 21;
        p.sizeMemory = 16;
        p.tampilPc();
        System.out.println("");

        Windows w = new Windows();
        w.merk = "samsung";
        w.jnsBatrei = "samsung";
        w.jnsProsesor = "core i7";
        w.fitur = "intel";
        w.kecProsesor = 5;
        w.sizeMemory = 12;
        w.tampilWindows();
    }
}
