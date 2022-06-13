package ukl.pbo;
import java.util.ArrayList;
public class Buku {

    private ArrayList<String> namaBuku = new ArrayList<String>(); //inisialisasi array
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() { //->Constructor
        this.namaBuku.add("Buku Umum"); //Method untuk menambahkan data kedalam array
        this.stok.add(30);
        this.harga.add(1000);

        this.namaBuku.add("Buku Agama"); //Method untuk menambahkan data kedalam array
        this.stok.add(20);
        this.harga.add(2000);

        this.namaBuku.add("Buku Novel"); //Method untuk menambahkan data kedalam array
        this.stok.add(10);
        this.harga.add(3000);}
   
    public int getJmlBuku() { //getter -> inheritance -> Mendapatkan data jumlah buku
        return this.namaBuku.size();}

    public void setStok(int stok) { //setter -> inheritance ->Set jumlah stok buku
        this.stok.add(stok);}

    public int getStok(int idBuku) { //getter ->Mendapatkan stok buku atau jumlah buku yang tersisa
        return this.stok.get(idBuku);}

    public void editStok(int idBuku, int stok) { //setter ->Mengedit jumlah stok
        this.stok.set(idBuku, stok);}

    public void setNamaBuku(String namaBuku) { //setter ->Memberi nama buku
        this.namaBuku.add(namaBuku);
    }

    public String getNamaBuku(int idBuku) { //getter ->Mendapatka nama buku
        return this.namaBuku.get(idBuku);}

    public void setHarga(int harga) { //Melakukan set harga buku
        this.harga.add(harga); }

    public int getHarga(int idBuku) { //mendapatkan / menampilkan harga buku
        return this.harga.get(idBuku);
    }
}
