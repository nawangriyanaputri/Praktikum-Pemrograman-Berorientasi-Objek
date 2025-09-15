/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author MSii
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;
    
    //Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin){
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    //Getter dan Setter untuk variable private nama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    //Getter dan Setter untuk kecepatanmaks
    public int getkecepatanMaks(){
        return kecepatanMaks;
    }
    public void setkecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
    //Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan(){
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + "km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
