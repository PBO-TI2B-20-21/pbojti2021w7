/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Risky
 */
public class Laptop extends Komputer {
    public String jnsBaterai;
    
    public Laptop(){
        
    }
    public Laptop(String merk,int kecProsesor ,int sizeMemory,String jnsProsesor,String jnsBaterai){
        super(merk,kecProsesor,sizeMemory,jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai : " + jnsBaterai);
    }
}
