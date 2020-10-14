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
public class Komputer {
    public String merk, jnsProsessor;
    public int kecProsessor,sizeMemory;
    
    public Komputer(){
        
    }
    
    public Komputer(String merk, int kecProsessor, int sizeMemory, String jnsProsessor){
        this.merk=merk;
        this.kecProsessor=kecProsessor;
        this.sizeMemory=sizeMemory;
        this.jnsProsessor=jnsProsessor;      
    }
    
    public void tampilDataKomputer(){
        System.out.println("Merk                  : "+merk);
        System.out.println("Kecepatan Prosessor   : "+kecProsessor+"GHz");
        System.out.println("Size Memory           : "+sizeMemory+"GB");
        System.out.println("Jenis Prosessor       : "+jnsProsessor);
         
    }
}
