package com.bpbd.www.bpbdjember.helper;

public class DataKategori {
    private String id, kategori;

    public DataKategori(){}

    public DataKategori(String id, String kategori){
        this.id = id;
        this.kategori = kategori;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}

