package Tugas;
public class main {
    public static void main(String[] args) {
        Laptop L = new Laptop();
        L.merk = "Asus";
        L.kecProsesor = 4;
        L.jnsProsesor="AMD A9";
        L.sizeMemory=8;
        L.jnsBaterai="ABC";
        L.tampilLaptop();
        
        PC P = new PC();
        P.merk="wearness";
        P.kecProsesor=2;
        P.jnsProsesor="Intel Inside";
        P.sizeMemory=4;
        P.ukuranMonitor=14;
        P.tampilPC();
        
        Mac M = new Mac();
        M.merk="Apple";
        M.kecProsesor=5;
        M.jnsProsesor="IOS 20";
        M.sizeMemory=12;
        M.security="SMADAV";
        M.tampilMac();
    }
}
