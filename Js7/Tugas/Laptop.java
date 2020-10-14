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
public class Laptop extends Komputer {

    public String jnsBatrei;

    public Laptop() {

    }

    public Laptop(String merk, String jnsProsessor, 
    int kecProsessor, int sizeMemory, String jnsBatrei) {
        super(merk, jnsProsessor, kecProsessor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai       : " + jnsBatrei);
    }
}
