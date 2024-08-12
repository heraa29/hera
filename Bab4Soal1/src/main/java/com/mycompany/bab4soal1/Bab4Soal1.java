/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab4soal1;

/**
 *
 * @author Lenovo
 */
public class Bab4Soal1 {

    public static void main(String[] args) {
     // Deklarasi dan inisialisasi variabel
        int angka1 = 10;
        int angka2 = 3;

        // Operasi aritmatika
        int hasilPenambahan = angka1 + angka2;
        int hasilPengurangan = angka1 - angka2;
        int hasilPerkalian = angka1 * angka2;
        double hasilPembagian = (double) angka1 / angka2;

        // Menampilkan hasil
        System.out.println("a. Hasil Pertambahan A + B = " + hasilPenambahan);
        System.out.println("b. Hasil Pengurangan A - B = " + hasilPengurangan);
        System.out.println("c. Hasil Perkalian A * B = " + hasilPerkalian);
        System.out.printf("d. Hasil Pembagian A / B = %.5f\n", hasilPembagian);
    }
}