package kitapci_stok;

import java.util.ArrayList;

public class StokYonetimi {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();

    public void kitapEkle(Kitap kitap) {
        kitapListesi.add(kitap);
        System.out.println("Kitap başarıyla eklendi.");
    }

    public void kitapListele() {
        if (kitapListesi.isEmpty()) {
            System.out.println("Hiç kitap bulunmamaktadır.");
        } else {
            System.out.println("Mevcut Kitaplar:");
            for (Kitap kitap : kitapListesi) {
                System.out.println(kitap);
            }
        }
    }

    public void stokGuncelle(int id, int yeniStok) {
        for (Kitap kitap : kitapListesi) {
            if (kitap.getId() == id) {
                kitap.setStokAdedi(yeniStok);
                System.out.println("Stok başarıyla güncellendi.");
                return;
            }
        }
        System.out.println("Kitap bulunamadı.");
    }

    public void kitapSil(int id) {
        for (Kitap kitap : kitapListesi) {
            if (kitap.getId() == id) {
                kitapListesi.remove(kitap);
                System.out.println("Kitap başarıyla silindi.");
                return;
            }
        }
        System.out.println("Kitap bulunamadı.");
    }

    public ArrayList<Kitap> getKitapListesi() {
        return kitapListesi; // Kitap listesini döner
    }

    public Kitap kitapAra(int id) {
        for (Kitap kitap : kitapListesi) {
            if (kitap.getId() == id) {
                return kitap; // Kitabı döner
            }
        }
        return null; // Bulunamazsa null döner
    }
}