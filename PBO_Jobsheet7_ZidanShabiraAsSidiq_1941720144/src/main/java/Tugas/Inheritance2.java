/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class Inheritance2 {
    public static void main(String[] args) {
        Laptop L=new Laptop();
        L.merk="HP";
        L.kecProsesor=5;
        L.sizeMemory=8;
        L.jnsProsesor="AMD Ryzen 5";
        L.jnsBatrai="Li-Ion";
        L.tampilDataLaptop();
        
        PC P=new PC();
        P.merk="ASUS Computer Stick QM1";
        P.kecProsesor=3;
        P.sizeMemory=12;
        P.jnsProsesor="Intel Core i7";
        P.ukuranMonitor=18;
        P.tampilDataPC();
        
        Mac M=new Mac("Macbook Air",3,8,"Intel Core i9","Li-Ion","Chip Apple T2");
        M.tampilDataMac();
        
        Windows W=new Windows("Windows 10",5,16,"Intel Core i7","Li-Ion","Windows Sandbox");
        W.tampilDataWindows();
    }
}
