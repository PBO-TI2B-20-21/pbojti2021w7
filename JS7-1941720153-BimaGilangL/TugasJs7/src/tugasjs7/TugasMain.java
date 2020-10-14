
package tugasjs7;
/**
 * BimaGilangLesmana
 */
public class TugasMain {
    public static void main(String[] args){
        Mac m = new Mac();
        m.merk = "Macbook Pro";
        m.kecProsesor = 3;
        m.sizeMemory = 8;
        m.jnsProsesor = "Intel Core i5";
        m.jnsBatrei = "Lithium-polymer";
        m.security = "-";
        m.tampilMac();
        System.out.println("");
        Pc p = new Pc();
        p.merk = "iMac";
        p.jnsProsesor = "Intel Core i5";
        p.kecProsesor = 3;
        p.sizeMemory = 8;
        p.ukMonitor = 21;
        p.tampilPc();
        System.out.println("");
        Windows w = new Windows();
        w.merk = "Lenovo";
        w.kecProsesor = 3;
        w.sizeMemory = 8;
        w.jnsProsesor = "Intel Core i5";
        w.jnsBatrei = "Ideapad YOGA";
        w.fitur = "AMD A9";
        w.tampilWindows();
    }
}
