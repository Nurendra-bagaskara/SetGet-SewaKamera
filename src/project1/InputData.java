/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class InputData {

    Scanner input = new Scanner(System.in);
    String Nama, alamat, noHp, noKtp;
    float harga;
    boolean tambah = true;
    int Barang, hari, uang;
    double total = 0;
    double p = 0;
    double kembalian;

    public void Data() {

        // input data user
        System.out.println("==========================================================");
        System.out.println("    <<<< Selamat Datang Diprogram Penyewaan Kamera >>>>   ");
        System.out.println("==========================================================");
        System.out.println("Masukan Data Diri Anda Terlebih Dahulu");
        System.out.print("Nama\t: ");
        Nama = input.nextLine();
        System.out.print("Alamat\t: ");
        alamat = input.nextLine();
        System.out.print("No.HP\t: ");
        noHp = input.nextLine();
        System.out.print("No.KTP\t: ");
        noKtp = input.nextLine();
        System.out.println("==========================================================");
        System.out.println("Menu Kamera yang Tersedia :");

    }

}
