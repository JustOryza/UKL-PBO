/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *polimor dinamis yaitu yang methodnya sama dengan implements
 */
package ukl.pbo;

import java.util.ArrayList;
/**
 *
 * @author MOKLET-2
 */

    
    public class Petugas implements User {

    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Petugas() {
        this.namaKaryawan.add("Doni");
        this.alamat.add("Malang");
        this.telepon.add("081111222333");
    }

    public int getJmlPetugas() {
        return this.namaKaryawan.size();
    }
    
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
    

}
//polimor dinamis yaitu yang methodnya sama dengan implements
//jika ingin mengakses class lain memakai method
//override adalah ingin mengakses data dengan menggunakan set get
//pengertian ovveride sendiri yaitu ingin mengakses data kembali yang ada di user