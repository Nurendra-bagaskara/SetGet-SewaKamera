/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author ASUS
 */
//me ngextends pada Class InputData
public class Pilihan extends InputData {

    public void Pilih() {
        //perulangan do while
        do {
            System.out.println("");
            System.out.println("Pada Data Diatas Mana yang Anda Pilih ? ");
            System.out.println(" 1.Canon\n 2.Nikon\n 3.Sony");
            System.out.print("Masukan Angka Menu Sesuai Pilihan Anda : ");
            String Pilihan = input.next();
            //percabangan
            
            switch (Pilihan) {
                case "1":
                    System.out.println("Pilihan Anda 'Canon' ");
                    System.out.println("Harga Sewa Rp.50.000/Hari");
                    harga = 50000;
                    System.out.print("Masukan Jumlah Barang Yang diinginkan\t\t : ");
                    Barang = input.nextInt();
                    System.out.print("Berapa Hari Anda Sewa\t\t\t\t : ");
                    hari = input.nextInt();
                    total = harga * Barang * hari;
                    System.out.println("Total Harga Sewa Canon\t\t\t\t : Rp." + total);
                    System.out.print("Apakah Ada yang Mau Disewa lagi (true/false)\t : ");
                    tambah = input.nextBoolean();
                    break;
                case "2":
                    System.out.println("Pilihan Anda 'Nikon' ");
                    System.out.println("Harga Sewa Rp.60.000/Hari");
                    harga = 60000;
                    System.out.print("Masukan Jumlah Barang Yang diinginkan\t\t : ");
                    Barang = input.nextInt();
                    System.out.print("Berapa Hari Anda Sewa\t\t\t\t : ");
                    hari = input.nextInt();
                    total = harga * Barang * hari;
                    System.out.println("Total Harga Sewa Nikon\t\t\t\t : Rp." + total);
                    System.out.print("Apakah Ada yang Mau Disewa lagi (true/false)\t : ");
                    tambah = input.nextBoolean();
                    break;
                case "3":
                    System.out.println("Pilihan Anda 'Sony' ");
                    System.out.println("Harga Sewa Rp.45.000/Hari");
                    harga = 45000;
                    System.out.print("Masukan Jumlah Barang Yang diinginkan\t\t : ");
                    Barang = input.nextInt();
                    System.out.print("Berapa Hari Anda Sewa\t\t\t\t : ");
                    hari = input.nextInt();
                    total = harga * Barang * hari;
                    System.out.println("Total Harga Sewa Sony\t\t\t\t : Rp." + total);
                    System.out.print("Apakah Ada yang Mau Disewa lagi (true/false)\t : ");
                    tambah = input.nextBoolean();
                    break;
            }
            p = p + total;
        } while (tambah == true);
        
        //proses penghitungan
        System.out.println("----------------------------------------------------------");
        System.out.println("total harga\t\t\t\t\t : Rp." + p);
        System.out.print("Masukan nominal uang anda\t\t\t : Rp.");
        uang = input.nextInt();
        //percabangan kondisi menentukan kembalian
        
        if (p < uang) {
            kembalian = uang - p;
            System.out.println("Kembalian Anda Sebesar\t\t\t\t : " + kembalian);
            System.out.println("==========================================================");
            System.out.println("                  <<< Terimakasih >>>                     ");
            System.out.println("==========================================================");
        } else if (p == uang) {
            System.out.println("==========================================================");
            System.out.println("           <<< Uang Anda Pas Terimakasih >>>              ");
            System.out.println("==========================================================");
        } else {
            System.out.println("==========================================================");
            System.out.println("---------------------Transaksi Gagal----------------------");
            System.out.println("==========================================================");
        }

    }
}
