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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input data
        InputData input = new InputData();
        JenisKamera masuk = new JenisKamera();
        Pilihan hitung = new Pilihan();

        input.Data();
        //menampilkan jenis kamera 
        masuk.sethargaCanon(50000);
        masuk.gethargaCanon();
        masuk.sethargaNikon(60000);
        masuk.gethargaNikon();
        masuk.sethargaSonny(45000);
        masuk.gethargaSonny();
        //memasukan pilihan
        hitung.Pilih();
    }

}
