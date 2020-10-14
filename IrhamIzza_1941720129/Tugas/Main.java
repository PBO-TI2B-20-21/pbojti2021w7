package Tugas;
public class Main {
    public static void main(String[] args) {
    Windows W= new Windows("ASUS",3,32,"Intel Celeron 3xxx", "Nickel Cadmium (Ni-Cd)", "Dark Mode File Explorer");
    W.tampilWindows(); 
    
    Mac M= new Mac("HP",4,64,"Motorolla 68000", "Nickel Metal Hydride (Ni-MH)", "Security MAC");
    M.tampilMac();  
   
    }
    
 
}
