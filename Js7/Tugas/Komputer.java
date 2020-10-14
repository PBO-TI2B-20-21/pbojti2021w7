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
public class Komputer {
    public String merk, jnsProsessor;
    public int kecProsessor, sizeMemory;

    public Komputer() {

    }
    public Komputer(String merk, String jnsProsessor, int kecProsessor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsessor = jnsProsessor;
        this.kecProsessor = kecProsessor;
        this.sizeMemory = sizeMemory;
    }
    public void tampilData () {
        System.out.println();
        System.out.println("Merk                : " + merk);
        System.out.println("Jenis Prosessor     : " + jnsProsessor);
        System.out.println("Kecepatan Prosessor : " + kecProsessor);
        System.out.println("Size Memory         : " + sizeMemory);
    }
}
