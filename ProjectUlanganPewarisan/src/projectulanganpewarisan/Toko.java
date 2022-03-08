/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectulanganpewarisan;

/**
 *
 * @author Pandu Putrakelana G
 */
public class Toko extends Barang {

    private String barang;

    @Override
    public void Makanan() {
        System.out.println(super.namaToko);
        System.out.println("-----STRUK MAKANAN-----");
    }

    @Override
    public void Minuman() {
        System.out.println(super.namaToko);
        System.out.println("-----STRUK MINUMAN-----");
    }

    public void setBarang(String newBarang) {
        this.barang = newBarang;
    }

    public void BarangPembelian(int harga, int jumlahbarang) {
        int hasil = harga * jumlahbarang;
        System.out.println("Nama Barang         : " + barang);
        System.out.println("Jumlah Barang       : " + jumlahbarang);
        System.out.println("------------------------------------------");
        System.out.println("Harga Barang        : " + harga);
        System.out.println("Pembayaran         : " + hasil);
    }

    public void BarangPembelian(int harga, int jumlahbarang, int diskon) {
        int a = 100;
        int hasil = harga * jumlahbarang;
        int hasill = harga * jumlahbarang * diskon / a;
        int hasiltotal = hasil- hasill;
        System.out.println("Nama Barang         : " + barang);
        System.out.println("Jumlah Barang       : " + jumlahbarang);
        System.out.println("Harga Barang        : " + harga);
        System.out.println("------------------------------------------");
        System.out.println("Diskon Barang       : " + diskon + "%");
        System.out.println("Pembayaran         : " + hasiltotal);
    }

}
