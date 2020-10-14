package aula.inheritance2.tugas;

/**
 *
 * @author Aulafz
 */
public class MainClass {

    public static void main(String[] args) {
        Pc p = new Pc("HP", 2, 4, "Intel Core i3", 21);
        p.tampilPc();

        Mac m = new Mac("Apple", 1, 8, "Intel Core i3 Dual-core", "Lithium-polymer", "Apple T2 Security");
        m.tampilMac();

        Windows w = new Windows("Dell", 2, 4, "Intel Core i3", "Lithium-Ion", "Touchscreen");
        w.tampilWindows();

    }
}
