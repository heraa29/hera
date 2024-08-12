/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal1;

/**
 *
 * @author Lenovo
 */
public class Bab8Soal1 {

    public static void main(String[] args) {
        int nilaiAwal = 5; // Nilai awal
        int nilaiAkhir = 100; // Nilai akhir

        System.out.println("Bilangan pertambahan 5 dari " + nilaiAwal + " hingga " + nilaiAkhir + " adalah:");

        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(i);
        }
    }
}
