/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUgas;
public class main {
    public static void main(String[] args) {
        Pc pc = new Pc();
        pc.merk="Asus";
        pc.kecProsesor=243;
        pc.sizeMemory=4;
        pc.jnsProsesor="NVIDIA";
        pc.ukuranMonitor=20;
        pc.tampiPc();
        
        System.out.println("");
        
        Mac mac = new Mac();
        mac.merk="Garuda";
        mac.kecProsesor=21;
        mac.sizeMemory=2;
        mac.jnsProsesor="NVIDIA";
        mac.jnsBaterai="La Liga";
        mac.security="Mac OS";
        mac.tampiMac();
        
        System.out.println("");
        
        Windows wd = new Windows();
        wd.merk="Toshiba";
        wd.kecProsesor=50;
        wd.sizeMemory=3;
        wd.jnsProsesor="Mantap";
        wd.jnsBaterai="Tokek";
        wd.fitur="TouchScreen";
        wd.tamplWindows();
        
        System.out.println("");
    }
}
