/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Leptop extends Komputer {

    public String jnsBatrei;
    
    public Leptop(){
        
    }
    public Leptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLeptop() {
        System.out.println("Merk : " + merk);
        System.out.println("kecProsesor : " + kecProsesor);
        System.out.println("sizeMemory : " + sizeMemory);
        System.out.println("jnsProsesor : " + jnsProsesor);
        System.out.println("jnsBatrei : " + jnsBatrei);
    }
}
