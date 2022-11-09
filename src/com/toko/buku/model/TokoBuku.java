/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.buku.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @RYAN RULLYANTO
 */
@Entity
@Table(name = "Toko_Buku")
public class TokoBuku implements Serializable{
    @Id
    @Column(name = "kd_buku", length = 15)
    private String kd_buku;
    @Column(name = "kd_nama", length = 20)
    private String nama;
    @Column(name = "kd_harga", length = 20)
    private String harga;
    @Column(name = "kd_jumlah", length = 15)
    private String jumlah;

    public String getKd_buku() {
        return kd_buku;
    }

    public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
   
    
}
