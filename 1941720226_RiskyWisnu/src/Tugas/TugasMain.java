/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Risky
 */
public class TugasMain {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        
        l.merk = "Thosiba";
        l.jnsProsesor = "AMD";
        l.kecProsesor = 24;
        l.sizeMemory = 128;
        l.jnsBaterai ="Ni-mh";
        l.tampilLaptop();
        
        PC p = new PC();
        
        p.merk = "Asus";
        p.jnsProsesor="Intel";
        p.kecProsesor = 24;
        p.sizeMemory  = 64;
        p.ukuranMonitor=16;
        p.tampilPC();
        
        Windows w = new Windows("HP", 24, 128, "AMD-RYZEN","NI-mh","Daya baterai lama");
        w.tampilWindows();
        
        Mac m = new Mac("ROG", 24,128 ,"Motorolla","Lithium","ChipT2");
        m.tampilMac();
        
    }
}
