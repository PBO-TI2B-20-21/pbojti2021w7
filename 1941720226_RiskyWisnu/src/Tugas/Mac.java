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
public class Mac extends Laptop {
     public String security;
    
    public Mac(){
        
    }
    public Mac(String merk,int kecProsesor ,int sizeMemory,String jnsProsesor,String jnsBaterai,
            String security){
        super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBaterai);
        this.security = security;
    }
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Jenis Security : " + security );
    }
}
