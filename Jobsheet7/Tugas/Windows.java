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
public class Windows extends Laptop {
    public String fitur;
    
    Windows(){
        
    }
    
    public Windows(String merk, int kecProsessor, int sizeMemory, String jnsProsessor, String jnsBatrei, String fitur){
        super(merk,kecProsessor,sizeMemory,jnsProsessor,jnsBatrei);
        this.fitur=fitur;
    }
    
    public void tampilWindows(){
        System.out.println("==============Windows==============");
        super.tampilDataLaptop();
        System.out.println("Fitur                 : "+fitur);
        System.out.println();
    }
}
