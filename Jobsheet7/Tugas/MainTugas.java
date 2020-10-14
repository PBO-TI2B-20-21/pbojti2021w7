/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7.Tugas;

/**
 *
 * @author DEBORA
 */
public class MainTugas {
    public static void main(String[]args){
        PC pc = new PC();
        pc.merk = "Dell";
        pc.kecProsessor = 5;
        pc.sizeMemory = 512;
        pc.jnsProsessor = "Intel-3";
        pc.ukuranMonitor = 30;
        pc.tampilDataPC();
        
        Mac m = new Mac("Macbook Pro", 4000, 1024, "AMD", "Lithium-ion", "Apple ID");
        m.tampilDataMac();
        
        Windows w = new Windows ("Acer", 7, 1024, "Intel-5", "Lithium-ion", "Cortana");
        w.tampilWindows();
    }
    
}
