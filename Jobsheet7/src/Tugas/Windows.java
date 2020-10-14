/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Windows extends Leptop{
      public String fitur;
    
    public Windows(){
    }
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        this.fitur = fitur;
    }
    public void tampilWindows(){
        System.out.println("Merk : "+merk);
        System.out.println("kecProsesor : "+kecProsesor);
        System.out.println("sizeMemory : "+sizeMemory);
        System.out.println("jnsProsesor : "+jnsProsesor);
        System.out.println("jnsBatrei : "+jnsBatrei);
        System.out.println("Fitur : "+ fitur);
    }
}
