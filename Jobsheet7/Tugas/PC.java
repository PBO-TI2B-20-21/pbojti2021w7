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
public class PC extends Komputer {
    int ukuranMonitor;
    
    PC(){
        
    }
    
    public PC(String merk, int kecProsessor, int sizeMemory, String jnsProsessor, int ukuranMonitor){
        super(merk,kecProsessor,sizeMemory,jnsProsessor);
        this.ukuranMonitor=ukuranMonitor;
    }
    
    public void tampilDataPC(){
        System.out.println("==============PC==============");
        super.tampilDataKomputer();
        System.out.println("Ukuran Monitor        : "+ukuranMonitor+" inch");
        System.out.println();
    }
}
