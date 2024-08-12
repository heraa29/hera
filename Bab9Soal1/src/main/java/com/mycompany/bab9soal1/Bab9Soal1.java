/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal1;

/**
 *
 * @author Lenovo
 */
public class Bab9Soal1 {

    public static void main(String[] args) {
        // Header informasi
        System.out.println("Universitas Pamulang");
        System.out.println("Sistem Informasi");
        System.out.println("Pemrograman Berorientasi Objek (Java 1) 116");
        System.out.println("Sistem Informasi S-1");
        
        // Variabel untuk baris
        int i = 1;
        
        // Menggunakan while loop untuk baris
        while (i <= 5) {
            // Variabel untuk kolom
            int j = 1;
            
            // Menggunakan while loop untuk kolom
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            
            System.out.println(); // Baris baru setelah selesai mencetak baris saat ini
            i++;
        }
    }
}
