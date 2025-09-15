/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author MSii
 */
public class Praktikum_PBO4 {
    public static void main(String[] args){
        Kendaraan mobil = new Kendaraan("Toyota Avanza", 150, "Bensin");
        //Menampilkan data awal
        mobil.tampilkanInfoKendaraan();
        //Mengubah data
        mobil.setNama("Toyota Rush");
        //Menampilkan data setelah perubahan
        System.out.println("Nama baru: " + mobil.getNama());
        mobil.tampilkanInfoKendaraan();
        mobil.jenisMesin = "Diesel";
        System.out.println("Setelah jenis mesin diubah: ");
        mobil.tampilkanInfoKendaraan();
    }
}