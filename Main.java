/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author MSii
 */
public class Main {
   public static void main(String[] args) {
       Hewan kucing = new Hewan("Mimi", 3);
       kucing.nama = "Mimi";
       kucing.umur = 3;
       kucing.suara();
       Hewan anjing = new Hewan("Doggy", 5);
       anjing.berlari();
   }
}
