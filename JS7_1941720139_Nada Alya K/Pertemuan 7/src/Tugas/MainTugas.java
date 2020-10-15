/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Nada Alya
 */
public class MainTugas {

    public static void main(String[] args) {
        Pc pc = new Pc("GigaByte Sabre 15 P45G", 3, 8, "Intel Core i7", 15);
        pc.tampilPc();

        Mac mac = new Mac("MacBook Pro 13 inch", 3, 8, "Intel Core i5 gen 8", "Baterai lithium-polymer bawaan 58,2 watt-jam", "macOS Mojave 10.14");
        mac.tampilMac();

        Windows windows = new Windows("Lenovo legion Y740 15", 4, 16, "Intel Core i7", " Lithium polymer battery", "Corsair iCUE,Lenovo Antivirus Plus");
        windows.tampilWindows();
    }

}
