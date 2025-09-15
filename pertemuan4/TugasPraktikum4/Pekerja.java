/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum4;

/**
 *
 * @author MSii
 */
public class Pekerja extends Manusia{
    private double gaji;

    public Pekerja(String nama, int usia, String pekerjaan, double gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    public double getGaji(){
        return gaji;
    }
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    public String toString(){
        return "Nama: " + getNama() +
                ", Usia: " + usia + 
                ", Pekerjaan: " + pekerjaan +
                ", Gaji: " + gaji;
    }
}
