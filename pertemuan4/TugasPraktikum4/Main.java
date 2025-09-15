/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum4;

/**
 *
 * @author MSii
 */
public class Main {
    public static void main(String[] args){
        Pekerja pekerja1 = new Pekerja("Thomas", 22, "Progammer", 7000000);
        System.out.println("Informasi Pekerja");
        System.out.println(pekerja1.toString());
        
        pekerja1.setNama("Rozan");
        System.out.println("Setelah Ubah Nama: " + pekerja1.toString());
    }
}
