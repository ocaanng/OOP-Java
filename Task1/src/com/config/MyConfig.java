package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class MyConfig {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_produk";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    protected static Connection connect;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;
    protected static String query;

    public static void connection() {
        try { 
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Sudah TerConnect database, Sukses");
            
        } catch (SQLException e) {
            e.printStackTrace();

            
        }
    }   
    
}

// jTable1 = new javax.swing.JTable();

// jTable1.setModel(new javax.swing.table.DefaultTableModel(
//     new Object [][] {
//         {null, null, null, null},
//         {null, null, null, null},
//         {null, null, null, null},
//         {null, null, null, null}
//     },
//     new String [] {
//         "Title 1", "Title 2", "Title 3", "Title 4"
//     }
// ));

// jScrollPane1.setViewportView(jTable1);


// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import javax.swing.table.DefaultTableModel;

// public class App extends javax.swing.JFrame {
//     private int totalBelanja = 0;
//     /**
//      * Creates new form App
//      */
//     public App() {
//         initComponents();
//         loadData();
//     }
    
//    private void loadData() {
//         // Konfigurasi koneksi database
//         String url = "jdbc:mysql://localhost:3306/db_produk";
//         String username = "root";
//         String password = "";
    
//         // Koneksi ke database
//         try (Connection conn = DriverManager.getConnection(url, username, password)) {
//             // Statement untuk menjalankan query
//             Statement stmt = conn.createStatement();
    
//             // Query untuk mengambil data dari tabel
//             String query = "SELECT * FROM tb_produk";
    
//             // Eksekusi query dan ambil hasilnya
//             ResultSet rs = stmt.executeQuery(query);
    
//             // Buat model tabel
//             DefaultTableModel model = (DefaultTableModel) tabel.getModel();
    
//             // Hapus semua baris yang ada di tabel
//             model.setRowCount(0);
    
//             // Loop melalui hasil query dan tambahkan data ke dalam model tabel
//             while (rs.next()) {
//                 int id = rs.getInt("ID");
//                 String nama = rs.getString("Nama");
//                 long harga = rs.getLong("Harga");
//                 int jumlah = rs.getInt("jumlah");
    
//                 // Tambahkan data ke dalam baris baru pada model tabel
//                 model.addRow(new Object[]{id, nama, harga, jumlah});
//             }
    
//             // Tutup statement dan result set
//             stmt.close();
//             rs.close();
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//     private void initComponents() {

//         jPanel1 = new javax.swing.JPanel();
//         jPanel2 = new javax.swing.JPanel();
//         jLabel1 = new javax.swing.JLabel();
//         jScrollPane1 = new javax.swing.JScrollPane();
//         tabel = new javax.swing.JTable();
//         jLabel2 = new javax.swing.JLabel();
//         jLabel3 = new javax.swing.JLabel();
//         jLabel4 = new javax.swing.JLabel();
//         textNama = new javax.swing.JTextField();
//         textHarga = new javax.swing.JTextField();
//         textJumlah = new javax.swing.JTextField();
//         buttonTambah = new javax.swing.JButton();
//         buttonHapus = new javax.swing.JButton();
//         buttonClear = new javax.swing.JButton();
//         jPanel3 = new javax.swing.JPanel();
//         jLabel5 = new javax.swing.JLabel();
//         jLabel6 = new javax.swing.JLabel();
//         jLabel7 = new javax.swing.JLabel();
//         textTotal = new javax.swing.JTextField();
//         textTunai = new javax.swing.JTextField();
//         textKembali = new javax.swing.JTextField();
//         buttonSimpan = new javax.swing.JButton();
//         buttonBayar = new javax.swing.JButton();

//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//         jPanel1.setBackground(new java.awt.Color(51, 51, 51));

//         jPanel2.setBackground(new java.awt.Color(102, 102, 102));
//         jPanel2.setForeground(new java.awt.Color(51, 51, 51));

//         jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
//         jLabel1.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel1.setText("CASH-COMP");

//         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//         jPanel2.setLayout(jPanel2Layout);
//         jPanel2Layout.setHorizontalGroup(
//             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanel2Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(jLabel1)
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//         );
//         jPanel2Layout.setVerticalGroup(
//             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanel2Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(jLabel1)
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//         );

//         tabel.setModel(new javax.swing.table.DefaultTableModel(
//             new Object [][] {
//                 {null, null, null, null},
//                 {null, null, null, null},
//                 {null, null, null, null},
//                 {null, null, null, null}
//             },
//             new String [] {
//                 "ID", "NAMA", "HARGA", "JUMLAH"
//             }
//         ) {
//             Class[] types = new Class [] {
//                 java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class
//             };

//             public Class getColumnClass(int columnIndex) {
//                 return types [columnIndex];
//             }
//         });
//         jScrollPane1.setViewportView(tabel);

//         jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
//         jLabel2.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel2.setText("Nama Barang");

//         jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
//         jLabel3.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel3.setText("Harga Barang");

//         jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
//         jLabel4.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel4.setText("Jumlah Barang");

//         textNama.setBackground(new java.awt.Color(102, 102, 102));
//         textNama.setForeground(new java.awt.Color(255, 255, 255));

//         textHarga.setBackground(new java.awt.Color(102, 102, 102));
//         textHarga.setForeground(new java.awt.Color(255, 255, 255));

//         textJumlah.setBackground(new java.awt.Color(102, 102, 102));
//         textJumlah.setForeground(new java.awt.Color(255, 255, 255));
//         textJumlah.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 textJumlahActionPerformed(evt);
//             }
//         });

//         buttonTambah.setBackground(new java.awt.Color(102, 102, 102));
//         buttonTambah.setText("ADD");
//         buttonTambah.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 buttonTambahActionPerformed(evt);
//             }
//         });

//         buttonHapus.setBackground(new java.awt.Color(102, 102, 102));
//         buttonHapus.setText("DELETE");
//         buttonHapus.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 buttonHapusActionPerformed(evt);
//             }
//         });

//         buttonClear.setBackground(new java.awt.Color(153, 0, 0));
//         buttonClear.setText("CLEAR");

//         jPanel3.setBackground(new java.awt.Color(153, 153, 153));

//         jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
//         jLabel5.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel5.setText("Total");

//         jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
//         jLabel6.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel6.setText("Cash");

//         jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
//         jLabel7.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel7.setText("Change");

//         textTotal.setBackground(new java.awt.Color(204, 204, 204));

//         textTunai.setBackground(new java.awt.Color(204, 204, 204));

//         textKembali.setBackground(new java.awt.Color(204, 204, 204));

//         buttonSimpan.setBackground(new java.awt.Color(102, 102, 102));
//         buttonSimpan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
//         buttonSimpan.setText("ADD TO CART");

//         buttonBayar.setBackground(new java.awt.Color(102, 102, 102));
//         buttonBayar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
//         buttonBayar.setText("PAY");

//         javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
//         jPanel3.setLayout(jPanel3Layout);
//         jPanel3Layout.setHorizontalGroup(
//             jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanel3Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(jPanel3Layout.createSequentialGroup()
//                         .addComponent(jLabel7)
//                         .addGap(18, 18, 18)
//                         .addComponent(textKembali))
//                     .addGroup(jPanel3Layout.createSequentialGroup()
//                         .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(jLabel5)
//                             .addComponent(jLabel6))
//                         .addGap(35, 35, 35)
//                         .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(textTotal)
//                             .addComponent(textTunai)))
//                     .addGroup(jPanel3Layout.createSequentialGroup()
//                         .addComponent(buttonSimpan)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(buttonBayar)
//                         .addGap(0, 43, Short.MAX_VALUE)))
//                 .addContainerGap())
//         );
//         jPanel3Layout.setVerticalGroup(
//             jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanel3Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(jLabel5)
//                     .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(jLabel6)
//                     .addComponent(textTunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(jLabel7)
//                     .addComponent(textKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
//                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(buttonSimpan)
//                     .addComponent(buttonBayar))
//                 .addContainerGap())
//         );

//         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//         jPanel1.setLayout(jPanel1Layout);
//         jPanel1Layout.setHorizontalGroup(
//             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanel1Layout.createSequentialGroup()
//                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
//                     .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
//                         .addContainerGap()
//                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
//                             .addComponent(jScrollPane1)
//                             .addGroup(jPanel1Layout.createSequentialGroup()
//                                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                     .addGroup(jPanel1Layout.createSequentialGroup()
//                                         .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                         .addComponent(buttonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
//                                     .addGroup(jPanel1Layout.createSequentialGroup()
//                                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                             .addComponent(jLabel2)
//                                             .addComponent(jLabel3)
//                                             .addComponent(jLabel4))
//                                         .addGap(25, 25, 25)
//                                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                             .addComponent(textNama, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
//                                             .addComponent(textHarga)
//                                             .addComponent(textJumlah)))
//                                     .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                 .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//         );
//         jPanel1Layout.setVerticalGroup(
//             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanel1Layout.createSequentialGroup()
//                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                     .addGroup(jPanel1Layout.createSequentialGroup()
//                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(jLabel2)
//                             .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(jLabel3)
//                             .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(textJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jLabel4))
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(buttonTambah)
//                             .addComponent(buttonHapus))
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(buttonClear))
//                     .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                 .addGap(0, 3, Short.MAX_VALUE))
//         );

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//         );

//         pack();
//         setLocationRelativeTo(null);
//     }// </editor-fold>                        

//     private void textJumlahActionPerformed(java.awt.event.ActionEvent evt) {                                           
//         // TODO add your handling code here:
//     }                                          

//     private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {                                            
//         // TODO add your handling code here:
//     }                                           

//     private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {                                             
//         // TODO add your handling code here:
//     }                                            

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//          */
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>

//         /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new App().setVisible(true);
//             }
//         });
//     }

//     // Variables declaration - do not modify                     
//     private javax.swing.JButton buttonBayar;
//     private javax.swing.JButton buttonClear;
//     private javax.swing.JButton buttonHapus;
//     private javax.swing.JButton buttonSimpan;
//     private javax.swing.JButton buttonTambah;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JLabel jLabel2;
//     private javax.swing.JLabel jLabel3;
//     private javax.swing.JLabel jLabel4;
//     private javax.swing.JLabel jLabel5;
//     private javax.swing.JLabel jLabel6;
//     private javax.swing.JLabel jLabel7;
//     private javax.swing.JPanel jPanel1;
//     private javax.swing.JPanel jPanel2;
//     private javax.swing.JPanel jPanel3;
//     private javax.swing.JScrollPane jScrollPane1;
//     private javax.swing.JTable tabel;
//     private javax.swing.JTextField textHarga;
//     private javax.swing.JTextField textJumlah;
//     private javax.swing.JTextField textKembali;
//     private javax.swing.JTextField textNama;
//     private javax.swing.JTextField textTotal;
//     private javax.swing.JTextField textTunai;
//     // End of variables declaration                   
// }
