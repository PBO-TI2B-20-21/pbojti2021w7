/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUgas;

public class Mac extends Laptop{
     public String security;

    public Mac() {
    }

    public Mac(String merk, String jnsProsesor, int sizeMemory,int  kecProsesor, String jnsBaterai) {
    super(merk, jnsProsesor, sizeMemory, kecProsesor,jnsBaterai);
        this.security=security;

    }
public void tampiMac() {
        super.tampiLaptop();
        System.out.println("jSecurity  =" +security);
        
    }    
}
