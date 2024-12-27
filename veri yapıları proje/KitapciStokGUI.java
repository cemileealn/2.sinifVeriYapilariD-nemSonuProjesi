package kitapci_stok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapciStokGUI extends JFrame {
    private StokYonetimi stokYonetimi;
    private JTextField idField, adField, yazarField, stokField;

    public KitapciStokGUI() {
        stokYonetimi = new StokYonetimi();
        setTitle("Kitapçı Stok Yönetimi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Kitap ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Kitap Adı:"));
        adField = new JTextField();
        inputPanel.add(adField);

        inputPanel.add(new JLabel("Yazar:"));
        yazarField = new JTextField();
        inputPanel.add(yazarField);

        inputPanel.add(new JLabel("Stok Adedi:"));
        stokField = new JTextField();
        inputPanel.add(stokField);

        JButton ekleButton = new JButton("Kitap Ekle");
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kitapEkle();
            }
        });

        add(inputPanel, BorderLayout.CENTER);
        add(ekleButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void kitapEkle() {
        try {
            int id = Integer.parseInt(idField.getText());
            String ad = adField.getText();
            String yazar = yazarField.getText();
            int stok = Integer.parseInt(stokField.getText());
            stokYonetimi.kitapEkle(new Kitap(id, ad, yazar, stok));
            JOptionPane.showMessageDialog(this, "Kitap başarıyla eklendi!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Lütfen geçerli bilgiler giriniz!");
        }
    }

    // *Buraya eklenen main metodu*
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KitapciStokGUI());
    }
}