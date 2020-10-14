package tugas;

public class Main {
    public static void main(String[] args) {

        Mac m=new Mac("MacBook Pro", 200, 8000, "Intel Core i7", "lithium-polymer", "Avast");
        m.tampilMac();
        System.out.println();
        Windows w=new Windows("Lenovo", 150, 4000, "Intel Core i3", "Li-ion", "Finger Print");
        w.tampilWindows();
        System.out.println();
        Pc p=new Pc("Dell", 200, 8000, "Intel Core i5", 16);
        p.tampilPc();
    }
}
