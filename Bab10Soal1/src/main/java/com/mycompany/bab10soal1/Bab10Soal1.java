/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soal1;

/**
 *
 * @author Lenovo
 */
public class Bab10Soal1 {

    public class Aritmatika3 extends Aritmatika2 {
    
    // Metode pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Membuat objek Aritmatika3
       
        
        // Contoh penggunaan metode
        int a = 10;
        int b = 5;
        
        // Menggunakan metode tambah dari Aritmatika2
        System.out.println("Penjumlahan: " + aritmatika.tambah(a, b));
        
        // Menggunakan metode pengurangan dari Aritmatika3
        System.out.println("Pengurangan: " + aritmatika.pengurangan(a, b));
    }
}
}