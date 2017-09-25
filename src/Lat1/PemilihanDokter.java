package Lat1;

public class PemilihanDokter extends javax.swing.JFrame {
    
public PemilihanDokter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pilih = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        kewar = new javax.swing.JTextField();
        wp = new javax.swing.JTextField();
        ds = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        gd = new javax.swing.JTextField();
        jk = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pemilihan Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 20, 133, 41);

        jLabel3.setText("Dokter Spesialis");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 380, 80, 24);

        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "DR. Farras Yassar", "DR. Dian Sikahita", "DR. Harun Ulum Fajar" }));
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        getContentPane().add(pilih);
        pilih.setBounds(110, 70, 120, 20);

        jLabel4.setText("Pilih Dokter");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(43, 68, 58, 24);

        jLabel5.setText("Identitas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 110, 50, 24);

        jLabel6.setText("Nama");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 140, 30, 24);

        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 170, 40, 24);

        jLabel8.setText("Usia");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 200, 20, 24);

        jLabel9.setText("Jenis Kelamin");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 230, 70, 24);

        jLabel10.setText("Golongan Darah");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 260, 80, 24);

        jLabel11.setText("Status");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 290, 40, 24);

        jLabel12.setText("Kewarganegaraan");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 320, 90, 24);

        jLabel13.setText("Waktu Praktek");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 350, 70, 24);
        getContentPane().add(nama);
        nama.setBounds(140, 140, 120, 20);
        getContentPane().add(kewar);
        kewar.setBounds(140, 320, 120, 20);
        getContentPane().add(wp);
        wp.setBounds(140, 350, 120, 20);
        getContentPane().add(ds);
        ds.setBounds(140, 380, 120, 20);
        getContentPane().add(status);
        status.setBounds(140, 290, 120, 20);
        getContentPane().add(gd);
        gd.setBounds(140, 260, 120, 20);
        getContentPane().add(jk);
        jk.setBounds(140, 230, 120, 20);
        getContentPane().add(usia);
        usia.setBounds(140, 200, 120, 20);
        getContentPane().add(alamat);
        alamat.setBounds(140, 170, 120, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 110, 260, 320);

        setBounds(0, 0, 480, 518);
    }// </editor-fold>//GEN-END:initComponents

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        if(pilih.getSelectedItem().equals("DR. Farras Yassar")){
            nama.setText("DR. Farras Yassar ");
            alamat.setText(" Jl. Surabaya 16, Malang ");
            usia.setText(" 20 Tahun ");
            jk.setText(" Laki-laki ");
            gd.setText(" A ");
            status.setText(" Belum Menikah ");
            kewar.setText(" Indonesia ");
            ds.setText("Dokter Umum");
            wp.setText(" Pagi (07.00-15.00) ");
        }
        else
        if(pilih.getSelectedItem().equals("DR. Dian Shikahita")){
            nama.setText("DR. Dian Shikahita ");
            alamat.setText(" Jl. Veteran 10, Malang ");
            usia.setText(" 25 Tahun ");
            jk.setText(" Perempuan ");
            gd.setText(" B ");
            status.setText(" Belum Menikah ");
            kewar.setText(" Indonesia ");
            ds.setText("Dokter Kandungan");
            wp.setText(" Pagi (08.00-17.00) ");
        }
        else
        if(pilih.getSelectedItem().equals("DR. Harun Ulum Fajar")){
            nama.setText("DR. Harun Ulum Fajar ");
            alamat.setText(" Jl. Jakarta 1, Malang ");
            usia.setText(" 29 Tahun ");
            jk.setText(" Laki-laki ");
            gd.setText(" O ");
            status.setText(" Sudah Menikah ");
            kewar.setText(" Indonesia ");
            ds.setText("Dokter Gigi");
            wp.setText(" Pagi (09.00-18.00) ");
    }//GEN-LAST:event_pilihActionPerformed
    }
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
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemilihanDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField ds;
    private javax.swing.JTextField gd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jk;
    private javax.swing.JTextField kewar;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField wp;
    // End of variables declaration//GEN-END:variables
}
