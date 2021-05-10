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
public class JenisKamera extends InputData {

    // jenis jenis kamera
    //penerapan parameter
    public void sethargaCanon(float harga) {
        System.out.println("1.Canon");
        super.harga = harga;
    }

    public float gethargaCanon() {
        System.out.println("  Harga Sewa/Hari\t: Rp." + harga);
        return harga;
    }

    public void sethargaNikon(float harga) {
        System.out.println("2.Nikon");
        super.harga = harga;
    }

    public float gethargaNikon() {
        System.out.println("  Harga Sewa/Hari\t: Rp." + harga);
        return harga;
    }

    public void sethargaSonny(float harga) {
        System.out.println("3.Sonny");
        super.harga = harga;
    }

    public float gethargaSonny() {
        System.out.println("  Harga Sewa/Hari\t: Rp." + harga);
        System.out.println("==========================================================");
        return harga;
    }
}
