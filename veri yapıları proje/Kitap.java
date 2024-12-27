package kitapci_stok;

public class Kitap {
    private int id;
    private String ad;
    private String yazar;
    private int stokAdedi;

    public Kitap(int id, String ad, String yazar, int stokAdedi) {
        this.id = id;
        this.ad = ad;
        this.yazar = yazar;
        this.stokAdedi = stokAdedi;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getYazar() {
        return yazar;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(int stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Ad: " + ad + ", Yazar: " + yazar + ", Stok: " + stokAdedi;
    }
}