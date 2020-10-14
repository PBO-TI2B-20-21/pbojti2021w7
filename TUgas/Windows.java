/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUgas;

public class Windows extends Laptop{
   public String fitur;

    public Windows() {
    }

    public Windows(String merk, String jnsProsesor, int sizeMemory,int  kecProsesor, String jnsBaterai) {
    super(merk, jnsProsesor, sizeMemory, kecProsesor,jnsBaterai);
        this.fitur=fitur;

    }
public void tamplWindows() {
        super.tampiLaptop();
        System.out.println("Fitur  =" +fitur);
    }        
}
