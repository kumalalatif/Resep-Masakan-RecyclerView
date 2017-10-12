package com.kumalalatif.foodfood;

/**
 * Created by User on 09/10/2017.
 */

public class Makanan {
    private String judul,deskripsi,pembuatan;
    private int gambar;

    public Makanan(String judul, int gambar,String deskripsi,String pembuatan){
        this.judul=judul;
        this.gambar=gambar;
        this.deskripsi=deskripsi;
        this.pembuatan=pembuatan;

    }
    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){this.judul=judul;}
    public String getDeskripsi(){
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi){
        this.deskripsi=deskripsi;
    }
    public int getGambar(){
        return gambar;
    }
    public void setGambar(int gambar){
        this.gambar=gambar;
    }
    public String getPembuatan(){
        return pembuatan;
    }
    public void setPembuatan(String pembuatan){
        this.pembuatan=pembuatan;
    }
}
