package Chapters.chapter_09;

public class Home {
    private int yuzolcum;
    private int banyoSayisi;
    private int odaSayisi;
    private boolean garajVarmi;
    private int ucret;
    private int kira;
    private String cephe;
    private int yil;

    public Home(){
        this(0,0,0,false,0,0,"",0);
    }
    public Home(int yuzolcum, int banyoSayisi, int odaSayisi,boolean garajVarmi,int ucret,
                int kira,String cephe,int yil){

        this.yuzolcum = yuzolcum;
        this.banyoSayisi = banyoSayisi;
        this.odaSayisi = odaSayisi;
        this.garajVarmi = garajVarmi;
        this.ucret = ucret;
        this.kira = kira;
        this.cephe = cephe;
        this.yil = yil;

    }
    public int getYuzolcum() {
        return yuzolcum;
    }

    public void setYuzolcum(int yuzolcum) {
        this.yuzolcum = yuzolcum;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public boolean isGarajVarmi() {
        return garajVarmi;
    }

    public void setGarajVarmi(boolean garajVarmi) {
        this.garajVarmi = garajVarmi;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String print(){
        String ev;
        ev = "Yuzolcumu    : " + getYuzolcum() +
        "\nBanyo sayisi : " + getBanyoSayisi() +
        "\nOda sayisi   : " + getOdaSayisi() +
        "\nGaraj        : " + (isGarajVarmi() ? "var" : "yok") +
        "\nFiyat        : " + getUcret() +
        "\nKira         : " + getKira() +
        "\nCephe        : " + getCephe() +
        "\nYapim yili   : " + getYil();
        return ev;
    }
}
