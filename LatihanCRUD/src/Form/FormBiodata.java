package Form;

import Config.KoneksiDB;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class FormBiodata extends javax.swing.JFrame {
    
    private Statement st;
    private ResultSet rs;
    private Connection conn;
    private ButtonGroup buttonGroup1;
    
    public FormBiodata() {
        initComponents();
        conn = KoneksiDB.getKoneksi();
        tampilData();
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rbLaki);
        buttonGroup1.add(rbPerempuan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbProdi = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfNim = new javax.swing.JTextField();
        tfTTL = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfNomorTelp = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_biodata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Program Studi --", "Teknik Informatika", "Teknik Industri", "Teknik Lingkungan", "Teknik Arsitektur", "Manajemen" }));
        cmbProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdiActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("BIODATA");

        jLabel2.setText("Nama Mahasiswa/i :");

        jLabel3.setText("NIM :");

        jLabel4.setText("Tempat dan Tgl. Lahir :");

        jLabel5.setText("Jenis Kelamin :");

        jLabel6.setText("Prodi :");

        jLabel7.setText("Alamat :");

        tfNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNimActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel8.setText("Nomor Telp.");

        rbLaki.setText("Laki - laki");

        rbPerempuan.setText("Perempuan");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        taAlamat.setColumns(20);
        taAlamat.setRows(5);
        jScrollPane2.setViewportView(taAlamat);

        tbl_biodata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_biodata);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel8))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(rbLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tfNomorTelp)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfTTL, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfNim, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbLaki)
                            .addComponent(rbPerempuan))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfNomorTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnClear)
                                    .addComponent(btnSubmit)
                                    .addComponent(btnExit)
                                    .addComponent(btnUpdate)
                                    .addComponent(btnDelete)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cmbProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProdiActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
         if (tfNama.getText().equals("")
                || tfNim.getText().equals("")
                || tfTTL.getText().equals("")
                || tfNomorTelp.getText().equals("")
                || taAlamat.getText().equals("")
                || buttonGroup1.getSelection() == null // Periksa jika ada radio button yang dipilih
                || cmbProdi.getSelectedItem().equals("-- Program Studi --")) {
            JOptionPane.showMessageDialog(this, "Field harap di isi !",
                    "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String cekDB = "SELECT * FROM tbl_biodata WHERE NIM = '" + tfNim.getText() + "' ";
            st = conn.createStatement();
            rs = st.executeQuery(cekDB);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "NIM sudah tersedia !");
            } else {
                String jenisKelamin = rbLaki.isSelected() ? "Laki - Laki" : "Perempuan"; // Ganti nama variabel
                String sql = "INSERT INTO tbl_biodata (Nama, NIM, TTL, Jenis_Kelamin, Prodi, Nomor_Telp, Alamat) VALUES ('"
                        + tfNama.getText() + "', '" + tfNim.getText() + "', '" + tfTTL.getText() + "', '"
                        + jenisKelamin + "', '" + cmbProdi.getSelectedItem() + "', '" + tfNomorTelp.getText() + "', '"
                        + taAlamat.getText() + "') ";

                // Debug: Cetak SQL untuk melihat apakah ada kesalahans
                System.out.println("SQL: " + sql);

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                tampilData();
                clear();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally {
            // Pastikan untuk menutup ResultSet dan Statement jika perlu
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
         int jawab = JOptionPane.showConfirmDialog(this, "Ingin keluar?", "Exit", JOptionPane.NO_OPTION, JOptionPane.YES_OPTION);

        if (jawab == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String nim = JOptionPane.showInputDialog("Masukan NIM: ");

        try {
            // Cek apakah NIM ada di database
            PreparedStatement pStm = conn.prepareStatement("SELECT * FROM tbl_biodata WHERE nim = ?");
            pStm.setString(1, nim);
            ResultSet rst = pStm.executeQuery();

            if (rst.next()) {
                // Jika NIM ditemukan, minta pengguna untuk memasukkan data baru
                String namaBaru = JOptionPane.showInputDialog("Masukkan Nama Baru: ", rst.getString("nama"));
                String ttlBaru = JOptionPane.showInputDialog("Masukkan TTL Baru: ", rst.getString("ttl"));
                String jenisKelaminBaru = JOptionPane.showInputDialog("Masukkan Jenis Kelamin Baru: ", rst.getString("jenis_kelamin"));
                String nomorTelpBaru = JOptionPane.showInputDialog("Masukkan Nomor Telepon Baru: ", rst.getString("nomor_telp"));
                String alamatBaru = JOptionPane.showInputDialog("Masukkan Alamat Baru: ", rst.getString("alamat"));

                // Update data di database
                PreparedStatement updateStm = conn.prepareStatement("UPDATE tbl_biodata SET nama = ?, ttl = ?, jenis_kelamin = ?, nomor_telp = ?, alamat = ? WHERE nim = ?");
                updateStm.setString(1, namaBaru);
                updateStm.setString(2, ttlBaru);
                updateStm.setString(3, jenisKelaminBaru);
                updateStm.setString(4, nomorTelpBaru);
                updateStm.setString(5, alamatBaru);
                updateStm.setString(6, nim);

                int rowsAffected = updateStm.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!");
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal memperbarui data.");
                }

                // Menutup statement
                updateStm.close();
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }

            // Menutup statement
            pStm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tfNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNimActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         String nim = JOptionPane.showInputDialog("Masukan NIM: ");

        try {
            PreparedStatement pStm = conn.prepareStatement("DELETE FROM tbl_biodata WHERE nim = ?");
            pStm.setString(1, nim);
            int isSuccess = pStm.executeUpdate();

            if (isSuccess > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                tampilData();
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }          
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBiodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbProdi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTable tbl_biodata;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNim;
    private javax.swing.JTextField tfNomorTelp;
    private javax.swing.JTextField tfTTL;
    // End of variables declaration//GEN-END:variables

    private void tampilData() {
        DefaultTableModel kolomtabel = new DefaultTableModel();
        kolomtabel.addColumn("No");
        kolomtabel.addColumn("Nama");
        kolomtabel.addColumn("NIM");
        kolomtabel.addColumn("TTL");
        kolomtabel.addColumn("Jenis_Kelamin");
        kolomtabel.addColumn("Prodi");
        kolomtabel.addColumn("Nomor_Telp");
        kolomtabel.addColumn("Alamat");
        
        try {
            int nomor = 1;
            st = conn.createStatement();
            String sql = "SELECT * FROM tbl_biodata";
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                kolomtabel.addRow(new Object[]{
                    nomor++,
                    rs.getString("Nama"),
                    rs.getString("NIM"),
                    rs.getString("TTL"),
                    rs.getString("Jenis_Kelamin"),
                    rs.getString("Prodi"),
                    rs.getString("Nomor_Telp"),
                    rs.getString("Alamat")
                });
            }
            tbl_biodata.setModel(kolomtabel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menampilkan data. \n" + e.getMessage());
        }
    }

    private void clear() {
        tfNama.setText("");
        tfNim.setText("");
        tfTTL.setText("");
        buttonGroup1.clearSelection();
        cmbProdi.setSelectedItem("-- Program Studi --");
        tfNomorTelp.setText("");
        taAlamat.setText("");
        tfNama.requestFocus();
    }
   
    private void clearForm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class tabel_biodata {

        private static void setModel(DefaultTableModel kolomtabel) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void enable(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static int getSelectedRow() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static Object getValueAt(int selectedRow, int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public tabel_biodata() {
        }
    }

    private static class buttonGroup {

        private static void clearSelection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public buttonGroup() {
        }
    }

    private static class buttonGroup1 {

        private static boolean isSelected(Object object) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static Object getSelection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public buttonGroup1() {
        }
    }

    private static class rst {

        public rst() {
        }
    }
}
