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
public class Pc extends Komputer {

    public int ukuranMonitor;

    public Pc() {

    }

    public Pc(String merk, String jnsProsessor, int kecProsessor, 
    int sizeMemory, int ukuranMonitor) {
        super(merk, jnsProsessor, kecProsessor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor      : " + ukuranMonitor);
    }
}
