/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23_laundry;

/**
 *
 * @author Nitor 5 GK
 */
public class LayananLaundry {
    protected String layanan;
    protected int harga;

    public void tampilkanLayanan() {
        System.out.println("Layanan: " + layanan);
    }

    public int getHarga() {
        return harga;
    }

    public String getLayanan() {
        return layanan;
    }
}

class CuciSepatu extends LayananLaundry {
    public CuciSepatu() {
        layanan = "Cuci Sepatu";
        harga = 50000;
    }
} 

