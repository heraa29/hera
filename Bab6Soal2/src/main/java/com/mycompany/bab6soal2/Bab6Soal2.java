/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal2;

/**
 *
 * @author Lenovo
 */
public class Bab6Soal2 {

    public static void main(String[] args) {
        // Menetapkan nilai secara langsung
        String nim = "1111";  // NIM mahasiswa
        String nama = "Agustav";  // Nama mahasiswa
        int nilai = 85;  // Nilai mahasiswa

        // Menentukan grade dan keterangan berdasarkan nilai
        char grade;
        String keterangan;

        if (nilai >= 85) {
            grade = 'A';
            keterangan = "Lulus";
        } else if (nilai >= 70) {
            grade = 'B';
            keterangan = "Lulus";
        } else if (nilai >= 55) {
            grade = 'C';
            keterangan = "Lulus";
        } else if (nilai >= 40) {
            grade = 'D';
            keterangan = "Lulus dengan Bimbingan";
        } else {
            grade = 'E';
            keterangan = "Tidak Lulus";
        }

        // Menampilkan hasil output
        System.out.println("### Pendataan Nilai Mahasiswa ###");
        System.out.println("NIM: " + nim);
        System.out.println("NAMA: " + nama);
        System.out.println("NILAI: " + nilai);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
    }