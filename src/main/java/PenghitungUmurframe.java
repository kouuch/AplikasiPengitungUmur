/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class PenghitungUmurframe extends javax.swing.JFrame {
    private PenghitungUmurHelper helper;
    private volatile boolean stopFetching = false;
    private Thread peristiwaThread;


    /**
     * Creates new form PenghitungUmurframe
     */
    public PenghitungUmurframe() {
        initComponents();
        helper = new PenghitungUmurHelper();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        dateChooserTanggalLahir = new com.toedter.calendar.JDateChooser();
        txtUmur = new java.awt.TextField();
        btnHitung = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtHariUlangTahunBerikutnya = new java.awt.TextField();
        jPanel2 = new javax.swing.JPanel();
        txtAreaPeristiwa = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penghitung Umur");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Pilih Tanggal Lahir ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Umur Anda");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Hari Ulang Tahun Berikutnya");

        label1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        label1.setText("Aplikasi Penghitung Umur");

        dateChooserTanggalLahir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserTanggalLahirPropertyChange(evt);
            }
        });

        txtUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmurActionPerformed(evt);
            }
        });

        btnHitung.setBackground(new java.awt.Color(51, 255, 0));
        btnHitung.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnHitung.setText("Hitung Umur ");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(255, 51, 51));
        btnKeluar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        txtHariUlangTahunBerikutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHariUlangTahunBerikutnyaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUmur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateChooserTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtHariUlangTahunBerikutnya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)))
                .addComponent(btnHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dateChooserTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHitung)
                            .addComponent(btnKeluar)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtHariUlangTahunBerikutnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout());

        txtAreaPeristiwa.setColumns(20);
        txtAreaPeristiwa.setRows(20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAreaPeristiwa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 181, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtAreaPeristiwa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        Date tanggalLahir = dateChooserTanggalLahir.getDate();
if (tanggalLahir != null) {
    // Menghitung umur dan hari ulang tahun berikutnya
    LocalDate lahir = tanggalLahir.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate sekarang = LocalDate.now();
    String umur = helper.hitungUmurDetail(lahir, sekarang);
    txtUmur.setText(umur);

    // Menghitung tanggal ulang tahun berikutnya
    LocalDate ulangTahunBerikutnya = helper.hariUlangTahunBerikutnya(lahir, sekarang);
    String hariUlangTahunBerikutnya = helper.getDayOfWeekInIndonesian(ulangTahunBerikutnya);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String tanggalUlangTahunBerikutnya = ulangTahunBerikutnya.format(formatter);
    txtHariUlangTahunBerikutnya.setText(hariUlangTahunBerikutnya + "(" + tanggalUlangTahunBerikutnya + ")");

    // Set stop flag untuk thread sebelumnya
    stopFetching = true;
    if (peristiwaThread != null && peristiwaThread.isAlive()) {
        peristiwaThread.interrupt(); // Beri sinyal ke thread untuk berhenti
    }

    // Reset flag untuk thread baru
    stopFetching = false;

    // Mendapatkan peristiwa penting secara asinkron
    peristiwaThread = new Thread(() -> {
        try {
            txtAreaPeristiwa.setText("Tunggu, sedang mengambil data...\n");
            helper.getPeristiwaBarisPerBaris(ulangTahunBerikutnya, txtAreaPeristiwa, () -> stopFetching);

            // Update UI setelah pengambilan data selesai
            if (!stopFetching) {
                javax.swing.SwingUtilities.invokeLater(() -> txtAreaPeristiwa.append("Selesai mengambil data peristiwa"));
            }
        } catch (Exception e) {
            // Memastikan bahwa pengambilan data yang terputus ditangani
            if (Thread.currentThread().isInterrupted()) {
                javax.swing.SwingUtilities.invokeLater(() -> txtAreaPeristiwa.setText("Pengambilan data dibatalkan.\n"));
            } else {
                e.printStackTrace(); // Cetak stack trace untuk debugging
            }
        }
    });
    peristiwaThread.start();
}

    }//GEN-LAST:event_btnHitungActionPerformed

    private void txtUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUmurActionPerformed

    private void txtHariUlangTahunBerikutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHariUlangTahunBerikutnyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHariUlangTahunBerikutnyaActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void dateChooserTanggalLahirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserTanggalLahirPropertyChange
        txtUmur.setText("");
        txtHariUlangTahunBerikutnya.setText("");
        // Hentikan thread yang sedang berjalan saat tanggal lahir berubah
stopFetching = true;
if (peristiwaThread != null && peristiwaThread.isAlive()) {
 peristiwaThread.interrupt();
}
txtAreaPeristiwa.setText("");

    }//GEN-LAST:event_dateChooserTanggalLahirPropertyChange

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
            java.util.logging.Logger.getLogger(PenghitungUmurframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungUmurframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private com.toedter.calendar.JDateChooser dateChooserTanggalLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.TextArea txtAreaPeristiwa;
    private java.awt.TextField txtHariUlangTahunBerikutnya;
    private java.awt.TextField txtUmur;
    // End of variables declaration//GEN-END:variables
}
