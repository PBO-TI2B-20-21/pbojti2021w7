/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class Laptop extends Komputer{
    public String jnsBatrai;
    
    public Laptop(){
        
    }
    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrai){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.jnsBatrai=jnsBatrai;
    }
    public void tampilDataLaptop(){
        System.out.println("Merk ="+merk);
        System.out.println("Kecepatan Prosesor ="+kecProsesor);
        System.out.println("Kapasitas Memori ="+sizeMemory);
        System.out.println("Jenis Prosesor ="+jnsProsesor);
        System.out.println("Jenis Baterai ="+jnsBatrai);
    }
}
