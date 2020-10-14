/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author WINDOWS 10
 */
public class Windows extends Laptop {

    public String fitur;

    public Windows() {}

    public Windows(String merk, String jnsProsessor, int kecProsessor, 
    int sizeMemory, String jnsBatrei, String fitur) {
        super(merk, jnsProsessor, kecProsessor, sizeMemory ,jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur               : " + fitur);
        System.out.println();
    }
}
