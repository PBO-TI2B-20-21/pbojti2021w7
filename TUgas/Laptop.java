/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUgas;

public class Laptop extends Komputer {
     public String jnsBaterai;

    public Laptop() {
    }

    public Laptop(String merk, String jnsProsesor, int sizeMemory,int  kecProsesor, String jnsBaterai) {
    super(merk, jnsProsesor, sizeMemory, kecProsesor);
        this.jnsBaterai=jnsBaterai;

    }
public void tampiLaptop() {
        super.tampilDataKomputer();
        System.out.println("jenis Baterai  =" +jnsBaterai);
        
    }    
}
