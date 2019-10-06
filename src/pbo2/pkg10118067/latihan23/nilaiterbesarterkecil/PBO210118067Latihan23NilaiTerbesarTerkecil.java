/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana menampilkan nilai terbesar atau 
 *  terkecil
 */
public class PBO210118067Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai"
                + " Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner scanner = new Scanner(System.in);
        String petugas = scanner.nextLine();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jumlahMhs = scanner.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        int terbesar = -99999;
        int terkecil = 99999;
        
        for(int i = 0; i < jumlahMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilaiMhs[i] = scanner.nextInt();
            
            if (nilaiMhs[i] > terbesar) terbesar = nilaiMhs[i];
            if (nilaiMhs[i] < terkecil) terkecil = nilaiMhs[i];
            
            
        }
        System.out.println(" ");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for(int i = 0; i < jumlahMhs; i++){
            System.out.println("Nilai Mahasiswa ke-" +(i+1) +" = " +nilaiMhs[i]);
            
    }
        System.out.println(" ");
        System.out.println("Nilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
        
    }
    
}
