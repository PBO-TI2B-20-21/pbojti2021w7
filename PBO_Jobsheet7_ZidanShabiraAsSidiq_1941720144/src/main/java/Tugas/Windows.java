/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class Windows extends Laptop{
    public String fitur;
    
    public Windows(){
        
    }
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrai, String fitur){
        super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBatrai);
        this.fitur=fitur;
    }

    public void tampilDataWindows(){
        super.tampilDataLaptop();
        System.out.println("Fitur ="+fitur);    
    }
}
