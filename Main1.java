/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author MSii
 */
public class Main1 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        mobil1.displayInfo();
        mobil1.startEngine();
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");
        mobil2.displayInfo();
        mobil2.startEngine();
        mobil2.ubahWarna("Merah");
        mobil2.displayInfo();
    }
}
