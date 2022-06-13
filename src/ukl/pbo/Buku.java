/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.pbo;

import java.util.ArrayList;
/**
 *
 * @author MOKLET-2
 */
public class Buku {
   

    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() {
        this.namaBuku.add("Buku Umum");
        this.stok.add(30);
        this.harga.add(1000);

        this.namaBuku.add("Buku Agama");
        this.stok.add(20);
        this.harga.add(2000);

        this.namaBuku.add("Buku Novel");
        this.stok.add(10);
        this.harga.add(3000);
    }

    public int getJmlBuku() {
        return this.namaBuku.size();
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    public void editStok(int idBuku, int stok) {
        this.stok.set(idBuku, stok);;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku.add(namaBuku);
    }

    public String getNamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }

}