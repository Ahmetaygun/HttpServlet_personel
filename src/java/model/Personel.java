package model;

import java.util.List;

public class Personel {
    private String ad;
    private String soyad;
    private String sicilNumarasi;
    private List<String> departman; // Çoklu seçim için liste kullanılıyor
    private String telefon;
    private String iseGirisTarihi;
    private double maas;
    private boolean aktif;

    public Personel(String ad, String soyad, String sicilNumarasi, List<String> departman, String telefon, String iseGirisTarihi, double maas, boolean aktif) {
        this.ad = ad;
        this.soyad = soyad;
        this.sicilNumarasi = sicilNumarasi;
        this.departman = departman;
        this.telefon = telefon;
        this.iseGirisTarihi = iseGirisTarihi;
        this.maas = maas;
        this.aktif = aktif;
    }

    // Getter ve Setter metotları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSicilNumarasi() {
        return sicilNumarasi;
    }

    public void setSicilNumarasi(String sicilNumarasi) {
        this.sicilNumarasi = sicilNumarasi;
    }

    public List<String> getDepartman() {
        return departman;
    }

    public void setDepartman(List<String> departman) {
        this.departman = departman;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getIseGirisTarihi() {
        return iseGirisTarihi;
    }

    public void setIseGirisTarihi(String iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}
