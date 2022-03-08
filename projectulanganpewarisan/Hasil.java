/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectulanganpewarisan;

import java.util.Scanner;

/**
 *
 * @author Pandu Putrakelana G
 */
public class Hasil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Toko tk = new Toko();

        System.out.println("Makanan / Minuman");
        String pilihan = scan.next();
        

        if (pilihan.equalsIgnoreCase("makanan")) {
            //Makanan
            System.out.println("Apakah Barang Memiliki Diskon(ya/tidak)");
            String pilihann = scan.next();
            if (pilihann.equalsIgnoreCase("ya")) {
                //Diskon
                System.out.print("Masukkan Nama Barang       : ");
                String newBarang = scan.next();
                tk.setBarang(newBarang);

                System.out.print("Masukkan Jumlah Barang     : ");
                int harga = scan.nextInt();

                System.out.print("Masukkan Harga Per Barang  : ");
                int jumlahbarang = scan.nextInt();

                System.out.print("Masukkan Diskon Barang    : ");
                int diskon = scan.nextInt();

                tk.Makanan();
                tk.BarangPembelian(harga, jumlahbarang, diskon);
                System.out.println("-----TERIMA KASIH-----");
            } else {
                //Tidak Diskon
                System.out.print("Masukkan Nama Barang       : ");
                String newBarang = scan.next();
                tk.setBarang(newBarang);

                System.out.print("Masukkan Jumlah Barang     : ");
                int harga = scan.nextInt();

                System.out.print("Masukkan Harga Per Barang  : ");
                int jumlahbarang = scan.nextInt();

                tk.Makanan();
                tk.BarangPembelian(harga, jumlahbarang);
                System.out.println("-----TERIMA KASIH-----");
            }

        } else {
            //Minuman
            System.out.println("Apakah Barang Memiliki Diskon(ya/tidak)");
            String pilihann = scan.next();
            if (pilihann.equalsIgnoreCase("ya")) {
                //Diskon
                System.out.print("Masukkan Nama Barang       : ");
                String newBarang = scan.next();
                tk.setBarang(newBarang);

                System.out.print("Masukkan Jumlah Barang     : ");
                int harga = scan.nextInt();

                System.out.print("Masukkan Harga Per Barang  : ");
                int jumlahbarang = scan.nextInt();

                System.out.print("Masukkan Diskon Barang    : ");
                int diskon = scan.nextInt();

                tk.Makanan();
                tk.BarangPembelian(harga, jumlahbarang, diskon);
                System.out.println("-----TERIMA KASIH-----");
            } else {
                //Tidak Diskon
                System.out.print("Masukkan Nama Barang       : ");
                String newBarang = scan.next();
                tk.setBarang(newBarang);

                System.out.print("Masukkan Jumlah Barang     : ");
                int harga = scan.nextInt();

                System.out.print("Masukkan Harga Per Barang  : ");
                int jumlahbarang = scan.nextInt();

                tk.Minuman();
                tk.BarangPembelian(harga, jumlahbarang);
                System.out.println("-----TERIMA KASIH-----");

            }

        }
        
        //Beli Lagi
        System.out.println("Apakah Membeli Barang Lagi ?");
        String pilih = scan.next();

        if (pilih.equalsIgnoreCase("ya")) {
            System.out.println("Makanan / Minuman");
            String pilihann = scan.next();
            //Makanan
            if (pilihann.equalsIgnoreCase("makanan")) {
                System.out.println("Apakah Barang Memiliki Diskon(ya/tidak)");
                String pilihannn = scan.next();
                if (pilihannn.equalsIgnoreCase("ya")) {
                    //Diskon
                    System.out.print("Masukkan Nama Barang       : ");
                    String newBarang = scan.next();
                    tk.setBarang(newBarang);

                    System.out.print("Masukkan Jumlah Barang     : ");
                    int harga = scan.nextInt();

                    System.out.print("Masukkan Harga Per Barang  : ");
                    int jumlahbarang = scan.nextInt();

                    System.out.print("Masukkan Diskon Barang    : ");
                    int diskon = scan.nextInt();

                    tk.Makanan();
                    tk.BarangPembelian(harga, jumlahbarang, diskon);
                    System.out.println("-----TERIMA KASIH-----");
                } else {
                    //Tidak Diskon
                    System.out.print("Masukkan Nama Barang       : ");
                    String newBarang = scan.next();
                    tk.setBarang(newBarang);

                    System.out.print("Masukkan Jumlah Barang     : ");
                    int harga = scan.nextInt();

                    System.out.print("Masukkan Harga Per Barang  : ");
                    int jumlahbarang = scan.nextInt();

                    tk.Makanan();
                    tk.BarangPembelian(harga, jumlahbarang);
                    System.out.println("-----TERIMA KASIH-----");
                }
            } else {

                //Minuman
                System.out.println("Apakah Barang Memiliki Diskon(ya/tidak)");
                String pilihannn = scan.next();
                if (pilihannn.equalsIgnoreCase("ya")) {
                    //Diskon
                    System.out.print("Masukkan Nama Barang       : ");
                    String newBarang = scan.next();
                    tk.setBarang(newBarang);

                    System.out.print("Masukkan Jumlah Barang     : ");
                    int harga = scan.nextInt();

                    System.out.print("Masukkan Harga Per Barang  : ");
                    int jumlahbarang = scan.nextInt();

                    System.out.print("Masukkan Diskon Barang    : ");
                    int diskon = scan.nextInt();

                    tk.Makanan();
                    tk.BarangPembelian(harga, jumlahbarang, diskon);
                    System.out.println("-----TERIMA KASIH-----");
                } else {
                    //Tidak Diskon
                    System.out.print("Masukkan Nama Barang       : ");
                    String newBarang = scan.next();
                    tk.setBarang(newBarang);

                    System.out.print("Masukkan Jumlah Barang     : ");
                    int harga = scan.nextInt();

                    System.out.print("Masukkan Harga Per Barang  : ");
                    int jumlahbarang = scan.nextInt();

                    tk.Minuman();
                    tk.BarangPembelian(harga, jumlahbarang);
                    System.out.println("-----TERIMA KASIH-----");

                }

            }

        } else {
            System.out.println("-----PEMBELIAN SELESAI-----");
        }

    }
}
