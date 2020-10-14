/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class PC extends Komputer{
    public int ukuranMonitor;
    
    public PC(){
        
    }
    public PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilDataPC(){
        super.tampilDataKomputer();
        System.out.println("Merk ="+merk);
        System.out.println("Kecepatan Prosesor ="+kecProsesor);
        System.out.println("Kapasitas Memori ="+sizeMemory);
        System.out.println("Jenis Prosesor ="+jnsProsesor);
        System.out.println("Ukuran Monitor ="+ukuranMonitor);
    }
}
