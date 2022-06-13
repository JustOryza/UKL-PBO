/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.pbo;

import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Perpuastakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("<<< Selamat Datang di Perpustakaan >>>");
        Scanner scan = new Scanner(System.in);
        
        Siswa siswa = new Siswa();
        Petugas petugas = new Petugas();
        Buku buku = new Buku();
        Peminjaman peminjaman = new Peminjaman();
        Laporan laporan = new Laporan();
        
            
        int jawab;
        do {
            laporan.laporan(petugas);
            laporan.laporan(siswa);
            laporan.laporan(buku);
            laporan.laporan(peminjaman, buku);
            
            peminjaman.prosesPeminjaman(siswa, peminjaman, buku, laporan);
            
            laporan.laporan(siswa);
            laporan.laporan(buku);
            laporan.laporan(peminjaman, buku);
            
            System.out.println("");
            System.out.println("Lanjutkan ---> 1");
            System.out.println("Matikan -----> 2");
            System.out.print("Lanjutkan atau matikan? [1 / 2] : ");
            jawab = scan.nextInt();
        } while (jawab == 1);
    }
    
    
}