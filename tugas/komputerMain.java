/**
 * komputerMain
 */
public class komputerMain {

    public static void main(String[] args) {
        komputer km = new komputer("lenovo",3,8,"AMD Ryzen 4");
        km.tampilData();
        pc pc1 = new pc("lenovo",3,8,"AMD Ryzen 4",32);
        pc1.tampilPc();
        laptop lpt = new laptop("lenovo",3,8,"AMD Ryzen 4","Li-ion");
        lpt.tampilLaptop();
        mac macos=new mac("Mac book pro",3,8,"ARM cortex","Li-ion","aman booss");
        macos.tampilMac();
        windows ws = new windows("lenovo",3,8,"AMD Ryzen 4","Li-ion","canggih lur");
        ws.tampilWs();
    }
}