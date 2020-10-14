/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUgas;

/**
 *
 * @author USER
 */
public class Pc extends Komputer{
    public int ukuranMonitor;

    public Pc() {
    }

    public Pc(String merk, String jnsProsesor, int sizeMemory,int  kecProsesor, int ukuranMonitor) {
    super(merk, jnsProsesor, sizeMemory, kecProsesor);
        this.ukuranMonitor=ukuranMonitor;

    }
public void tampiPc() {
        super.tampilDataKomputer();
        System.out.println("Merk  =" +merk);
        System.out.println("Ukuran Monitor    =" + ukuranMonitor);
        
    }    
    
}
