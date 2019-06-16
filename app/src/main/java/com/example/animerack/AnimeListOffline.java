package com.example.animerack;

public class AnimeListOffline {
    private int Id;
    private String judul,season,penyimpanan;

    public AnimeListOffline() {

    }

    public AnimeListOffline(int id, String judul, String season, String penyimpanan){
        Id = id;
        this.judul = judul;
        this.season = season;
        this.penyimpanan = penyimpanan;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getPenyimpanan() {
        return penyimpanan;
    }

    public void setPenyimpanan(String penyimpanan) {
        this.penyimpanan = penyimpanan;
    }
}
