/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab11soal2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
        
public class Bab11Soal2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = input.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = input.nextLine();

        System.out.print("Masukkan Golongan (1, 2, 3, 4, 5): ");
        int golongan = input.nextInt();
        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan);

        System.out.println("\nData Karyawan:");
        karyawan.tampilkanDataKaryawan();
    }
}