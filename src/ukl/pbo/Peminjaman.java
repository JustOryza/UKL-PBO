/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.pbo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public Peminjaman() {
        this.idSiswa.add(0);
        this.idBuku.add(2);
        this.banyak.add(1);

        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(2);

        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(3);
    }

    public void prosesPeminjaman(Siswa siswa, Peminjaman peminjaman, Buku buku, Laporan laporan) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("<<<<<<<<<< Silakan Meminjam Buku >>>>>>>>>>");
        System.out.println("");
        System.out.print("Masukkan id siswa : ");
        int idSiswa = scan.nextInt();
        System.out.println("Selamat datang " + siswa.getNama(idSiswa));

        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();

        int i = 0;
        int temp = 0;
        do {
            System.out.println("");
            System.out.print("Masukkan kode buku : or end file : 99 ---> ");
            temp = scan.nextInt();
            if (temp != 99) {
                idBuku.add(temp);
                System.out.print(buku.getNamaBuku(idBuku.get(i)) + " sebanyak : ");
                banyak.add(scan.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println();
        System.out.println("<<< Transaksi peminjaman " + siswa.getNama(idSiswa) + " sebagai berikut >>>");
        System.out.println("Nama Buku \tQty \tHarga Pinjam \tJumlah");

        int total = 0;
        int x = idBuku.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
            total += jumlah;
            System.out.println(buku.getNamaBuku(idBuku.get(j)) + "\t"
                    + banyak.get(j) + "\t"
                    + buku.getHarga(idBuku.get(j)) + "\t\t"
                    + jumlah);
            peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
        }
        System.out.println("Total peminjaman : " + total);
        System.out.println("");

        siswa.editStatus(idSiswa, false);
        System.out.println("Status " + siswa.getNama(idSiswa) + " : " + siswa.getStatus(idSiswa));
        System.out.println("Tidak boleh meminjam buku");
        laporan.laporan(buku);
        laporan.laporan(siswa);

        int jawab;
        do {
            System.out.println("");
            System.out.println("Ya ------> 1");
            System.out.println("Tidak ---> 2");
            System.out.print("Apakah Anda ingin mengembalikan buku? [1 /2] : ");
            jawab = scan.nextInt();
            if (jawab == 1) {
                siswa.editStatus(idSiswa, true);
                System.out.println("");
                System.out.println("Terima kasih sudah mengembalikan buku");
                System.out.println("Status " + siswa.getNama(idSiswa) + " : " + siswa.getStatus(idSiswa));
                for (int j = 0; j < x; j++) {
                    peminjaman.setPengembalian(buku, idBuku.get(j), banyak.get(j));
                }
            } else {
                System.out.println("");
                System.out.println("Anda belum mengembalikan buku");
                System.out.println("Silakan kembalikan buku terlebih dahulu");
                laporan.laporan(buku);
                laporan.laporan(siswa);
            }
        } while (jawab == 2);
    }

    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyaknya) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyaknya);
    }

    public void setPengembalian(Buku buku, int idBuku, int banyaknya) {
        buku.editStok(idBuku, buku.getStok(idBuku) + banyaknya);
    }

    public int getJmlPeminjaman() {
        return this.idSiswa.size();
    }

    public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }
    
    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }
    
    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

}