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
public class Mac extends Laptop {

    public String security;

    public Mac() {

    }

    public Mac(String merk, String jnsProsessor, int kecProsessor, 
    int sizeMemory, String jnsBatrei, String security) {
        super(merk, jnsProsessor, kecProsessor, sizeMemory ,jnsBatrei);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security            : " + security);
    }
}
