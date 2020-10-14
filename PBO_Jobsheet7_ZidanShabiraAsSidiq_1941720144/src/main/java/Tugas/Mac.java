/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class Mac extends Laptop{
    public String security;
    
    public Mac(){
        
    }
    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrai, String security){
       super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBatrai);
       this.security=security;
    }

    public void tampilDataMac(){
        super.tampilDataLaptop();
        System.out.println("Security ="+security);    
    }
}
