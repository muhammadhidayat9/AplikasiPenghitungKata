import javax.swing.*; // Untuk JLabel, JTextArea, JScrollPane, JButton, dll.
import java.awt.event.ActionEvent; // Untuk event action
import java.awt.event.ActionListener; // Untuk ActionListener
import javax.swing.JFileChooser;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;



/**
 *
 * @author Acer
 */
public class PenghitungKata extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKata
     */
    public PenghitungKata() {
        initComponents();
    TextAreaInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    @Override
    public void insertUpdate(javax.swing.event.DocumentEvent e) {
        hitungOtomatis();
    }

    @Override
    public void removeUpdate(javax.swing.event.DocumentEvent e) {
        hitungOtomatis();
    }

    @Override
    public void changedUpdate(javax.swing.event.DocumentEvent e) {
        hitungOtomatis();
    }

    // Method untuk melakukan perhitungan otomatis
    private void hitungOtomatis() {
        String teks = TextAreaInput.getText();
        
        // Menghitung jumlah karakter
        int jumlahKarakter = teks.length();

        // Menghitung jumlah kata
        String[] kataArray = teks.trim().split("\\s+");
        int jumlahKata = (teks.isEmpty()) ? 0 : kataArray.length;

        // Menghitung jumlah kalimat
        String[] kalimatArray = teks.split("[.!?]");
        int jumlahKalimat = (teks.isEmpty()) ? 0 : kalimatArray.length;

        // Menampilkan hasil pada JLabel
        LabelJumlahKata.setText("Jumlah Kata: " + jumlahKata);
        LabelJumlahKarakter.setText("Jumlah Karakter: " + jumlahKarakter);
        LabelJumlahKalimat.setText("Jumlah Kalimat: " + jumlahKalimat);
    }
});

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaInput = new javax.swing.JTextArea();
        ButtonHitung = new javax.swing.JButton();
        LabelJumlahKata = new javax.swing.JLabel();
        LabelJumlahKarakter = new javax.swing.JLabel();
        LabelJumlahKalimat = new javax.swing.JLabel();
        ButtonSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextAreaInput.setColumns(20);
        TextAreaInput.setRows(5);
        jScrollPane2.setViewportView(TextAreaInput);

        ButtonHitung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonHitung.setText("Hitung");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });

        LabelJumlahKata.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelJumlahKata.setText("Jumlah Kata");

        LabelJumlahKarakter.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelJumlahKarakter.setText("Jumlah Karakter");

        LabelJumlahKalimat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelJumlahKalimat.setText("Jumlah Kalimat");

        ButtonSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSimpan.setText("Simpan");
        ButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PENGHITUNG KATA, KARAKTER, DAN KALIMAT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(LabelJumlahKata, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelJumlahKalimat, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(ButtonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(ButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelJumlahKarakter, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelJumlahKata, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(LabelJumlahKarakter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(LabelJumlahKalimat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed
                                            
    // Mengambil teks dari JTextArea
    String teks = TextAreaInput.getText();
    
    // Menghitung jumlah karakter
    int jumlahKarakter = teks.length();

    // Menghitung jumlah kata (dengan memisahkan berdasarkan spasi atau pemisah kata)
    String[] kataArray = teks.trim().split("\\s+");
    int jumlahKata = (teks.isEmpty()) ? 0 : kataArray.length;

    // Menghitung jumlah kalimat (berdasarkan tanda titik, tanda seru, atau tanda tanya)
    String[] kalimatArray = teks.split("[.!?]");
    int jumlahKalimat = (teks.isEmpty()) ? 0 : kalimatArray.length;

    // Menampilkan hasil perhitungan pada JLabel
    LabelJumlahKata.setText("Jumlah Kata: " + jumlahKata);
    LabelJumlahKarakter.setText("Jumlah Karakter: " + jumlahKarakter);
    LabelJumlahKalimat.setText("Jumlah Kalimat: " + jumlahKalimat);

    // Menampilkan pesan dialog hasil perhitungan
    JOptionPane.showMessageDialog(this, 
        "Hasil Perhitungan:\n" +
        "Jumlah Kata: " + jumlahKata + "\n" +
        "Jumlah Karakter: " + jumlahKarakter + "\n" +
        "Jumlah Kalimat: " + jumlahKalimat,
        "Hasil Hitung", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Teks:");
            writer.println(TextAreaInput.getText());
            writer.println("\nHasil Perhitungan:");
            writer.println("Jumlah Kata: " + LabelJumlahKata.getText());
            writer.println("Jumlah Karakter: " + LabelJumlahKarakter.getText());
            writer.println("Jumlah Kalimat: " + LabelJumlahKalimat.getText());
            JOptionPane.showMessageDialog(this, "File berhasil disimpan.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file.");
        }
    }
    

    }//GEN-LAST:event_ButtonSimpanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JLabel LabelJumlahKalimat;
    private javax.swing.JLabel LabelJumlahKarakter;
    private javax.swing.JLabel LabelJumlahKata;
    private javax.swing.JTextArea TextAreaInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
