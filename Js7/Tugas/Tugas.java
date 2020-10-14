/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author WINDOWS 10
 */
public class Tugas {

    public static void main(String[] args) {

        Pc pc = new Pc("Asus", "Intel Core I9", 2, 8, 20);
        pc.tampilPc();

        Mac mc = new Mac("MacBook Pro", "Intel Core I9", 4, 4, " lithium-polyme",
         "Chip Apple T2");
        mc.tampilMac();

        Windows wd = new Windows("Lenovo", "AMD Ryzen 7", 4, 8, 
        "Standard Capacity Lithium Ion ", "FlipScreen");
        wd.tampilWindows();
    }
}
