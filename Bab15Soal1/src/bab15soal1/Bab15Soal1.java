/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab15soal1;

/**
 *
 * @author Lenovo
 */
public class Bab15Soal1 {

   public static void main(String[] args) {
       // Membuat objek dari class Kalkulator
        KALKULATOR kalkulator = new KALKULATOR();

        // Menggunakan method pengurangan
        int hasilPengurangan = kalkulator.pengurangan(20, 10);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        // Menggunakan method pembagian
        float hasilPembagian = kalkulator.pembagian(20.0f, 10.0f);
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Menggunakan method perkalian
        float hasilPerkalian = kalkulator.perkalian(20.0f, 10.0f);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
}