/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author hp
 */
public class Pc extends Komputer {

    public int ukuranMonitor;

    public Pc() {

    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        System.out.println("Merk : " + merk);
        System.out.println("kecProsesor : " + kecProsesor);
        System.out.println("sizeMemory : " + sizeMemory);
        System.out.println("jnsProsesor : " + jnsProsesor);
        System.out.println("ukuranMonitor : " + ukuranMonitor);
    }
}