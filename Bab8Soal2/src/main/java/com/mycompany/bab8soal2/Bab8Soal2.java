/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal2;

/**
 *
 * @author Lenovo
 */
public class Bab8Soal2 {

    public static void main(String[] args) {
        // Mendefinisikan nilai tahun awal dan tahun akhir
        int tahunAkhir = 2015;
        int tahunAwal = 1950;

        // Menampilkan hasil
        System.out.println("Hasil nya :");

        // Pengulangan for untuk menampilkan tahun dari tahunAkhir ke tahunAwal
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }
    }
}
