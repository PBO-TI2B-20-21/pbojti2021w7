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
public class Laptop extends Komputer {
    public String jnsBatrei;
    
    public Laptop(){
        
    }
    
    public Laptop(String merk, int kecProsessor, int sizeMemory, String jnsProsessor, String jnsBatrei){
      super(merk,kecProsessor,sizeMemory,jnsProsessor);
      this.jnsBatrei=jnsBatrei;  
    }
    public void tampilDataLaptop(){
        super.tampilDataKomputer();
        System.out.println("Jenis Batrei          : "+jnsBatrei);
    }
    
}
