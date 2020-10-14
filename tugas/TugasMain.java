/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author INDRAFN
 */
public class TugasMain {
    public static void main(String []args){
        
        Mac m = new Mac();
        m.merk = "Apple";
        m.kecProsesor = 2;
        m.sizeMemory = 8;
        m.jnsProsesor = "Intel Core i5";
        m.jnsBatrei = "Li-thium";
        m.security = "Satpam";
        m.tampilMac();
        
        System.out.println();
        
        Windows w = new Windows();
        w.merk = "Asus";
        w.kecProsesor = 3;
        w.sizeMemory = 12;
        w.jnsProsesor = "Intel Core i7";
        w.jnsBatrei = "Li-thium";
        w.fitur = "Windows Defender";
        w.tampilWindows();
    }
}
