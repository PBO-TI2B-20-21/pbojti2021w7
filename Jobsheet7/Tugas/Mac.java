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
public class Mac extends Laptop{
    public String security;
    
    public Mac(){
        
    }
    
    public Mac(String merk, int kecProsessor, int sizeMemory, String jnsProsessor, String jnsBatrei, String security){
        super(merk,kecProsessor,sizeMemory,jnsProsessor, jnsBatrei);
        this.security=security;
    }
    
    public void tampilDataMac(){
        System.out.println("==============MAC==============");
        super.tampilDataLaptop();
        System.out.println("Keamanan               : "+security);
        System.out.println("");
        
    }
    
}
