/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.library.db.DBConnect;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jamit
 */
public class bookIssue extends javax.swing.JFrame {
DefaultTableModel bookModel;
DefaultTableModel memModel;
    /**
     * Creates new form bookIssue
     */
    public bookIssue() throws ClassNotFoundException, SQLException {
        initComponents();
        setToTable();
        fillBookTable(null);
        fillMemTable(null);
    }
    
    public void fillMemTable(String sql) throws ClassNotFoundException, SQLException {
        memModel = (DefaultTableModel) memTable.getModel();
        memModel.setRowCount(0);
        if (sql == null) {
            sql = "select * from member where status = 1";
        }
        ResultSet rs = DBConnect.getFromDB(sql);
        while (rs.next()) {
            Vector v = new Vector();
            v.add(rs.getInt("memID"));
            v.add(rs.getString("name"));
            v.add(rs.getString("address"));
            v.add(rs.getString("telephoneNo"));
            v.add(rs.getString("email"));
            v.add(rs.getString("nic"));
            v.add(rs.getString("dob"));
            v.add(rs.getString("gender"));
            v.add(rs.getInt("status"));

            memModel.addRow(v);
        }
    }
    public void setToTable() {
        bookTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 11));
        bookTable.getTableHeader().setOpaque(false);
        bookTable.getTableHeader().setBackground(Color.white);
        bookTable.getTableHeader().setForeground(Color.black);
        
        memTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 11));
        memTable.getTableHeader().setOpaque(false);
        memTable.getTableHeader().setBackground(Color.white);
        memTable.getTableHeader().setForeground(Color.black);
    }
    public void fillBookTable(String sql) throws ClassNotFoundException, SQLException {
        bookModel = (DefaultTableModel) bookTable.getModel();
        bookModel.setRowCount(0);
        if (sql == null) {
            sql = "select * from book where status=1";
        }
        ResultSet rs = DBConnect.getFromDB(sql);
        while (rs.next()) {
            Vector v = new Vector();
            v.add(rs.getInt("bookID"));
            v.add(rs.getString("title"));
            v.add(rs.getInt("aurID"));
            v.add(rs.getInt("pubID"));
            v.add(rs.getString("edition"));
            v.add(rs.getInt("quantity"));
            v.add(rs.getString("isbn"));
            v.add(rs.getInt("subID"));
            v.add(rs.getDouble("value"));
            v.add(rs.getInt("status"));

            bookModel.addRow(v);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        txtSearchBook = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtSearchMember = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelBookTitle = new javax.swing.JLabel();
        labelBookId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelMemberName = new javax.swing.JLabel();
        labelMemberId = new javax.swing.JLabel();
        butInsert = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        memTable = new javax.swing.JTable();

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libra 1.0 - Issue Book");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/images/account .png"))); // NOI18N
        userName.setText("   USERNAME");

        title.setBackground(new java.awt.Color(255, 153, 0));
        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Libra 1.0");
        title.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bookTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Author", "Publisher", "Edition", "Quantity", "ISBN", "Subject", "Value Of Book", "Status"
            }
        ));
        bookTable.setFocusable(false);
        bookTable.setRowHeight(25);
        bookTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        bookTable.setShowVerticalLines(false);
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        txtSearchBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchBook.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        txtSearchBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchBookKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addComponent(txtSearchBook))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(txtSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchMember.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        txtSearchMember.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchMemberKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Book ID :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Book Title :");

        labelBookTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBookTitle.setText("\"book title\"");

        labelBookId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBookId.setText("\"book id\"");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Member ID :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Member Name :");

        labelMemberName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMemberName.setText("\"member name\"");

        labelMemberId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMemberId.setText("\"member id\"");

        butInsert.setBackground(new java.awt.Color(255, 204, 0));
        butInsert.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        butInsert.setText("Borrow Book");
        butInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        butInsert.setMinimumSize(new java.awt.Dimension(75, 25));
        butInsert.setPreferredSize(new java.awt.Dimension(80, 30));
        butInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInsertActionPerformed(evt);
            }
        });

        memTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        memTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Telephone", "Email", "NIC", "Birthday", "Gender", "Status"
            }
        ));
        memTable.setFocusable(false);
        memTable.setRowHeight(25);
        memTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        memTable.setShowVerticalLines(false);
        memTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memTableMouseClicked(evt);
            }
        });
        memTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                memTableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(memTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSearchMember, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelBookId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBookTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(119, 119, 119)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMemberId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(butInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelBookId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelBookTitle)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(labelMemberId))
                            .addComponent(butInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelMemberName))))
                .addGap(30, 30, 30)
                .addComponent(txtSearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        String bookID = bookModel.getValueAt(bookTable.getSelectedRow(), 0).toString();
        String bookName = bookModel.getValueAt(bookTable.getSelectedRow(), 1).toString();
        labelBookId.setText(bookID);
        labelBookTitle.setText(bookName);
    }//GEN-LAST:event_bookTableMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBookKeyReleased
        try {
            fillBookTable("SELECT * FROM `book` WHERE title like '%" + txtSearchBook.getText().toString() + "%'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBookKeyReleased

    private void memTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memTableMouseClicked
        String memID = memModel.getValueAt(memTable.getSelectedRow(), 0).toString();
        String memName = memModel.getValueAt(memTable.getSelectedRow(), 1).toString();
        labelMemberId.setText(memID);
        labelMemberName.setText(memName);
    }//GEN-LAST:event_memTableMouseClicked

    private void memTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memTableKeyReleased

    }//GEN-LAST:event_memTableKeyReleased

    private void txtSearchMemberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchMemberKeyReleased
        try {
            fillMemTable("SELECT * FROM `member` WHERE name like '%" + txtSearchMember.getText().toString() + "%'");
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchMemberKeyReleased

    private void butInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInsertActionPerformed
        int empID = UserProfile.empID;
        String bookID = labelBookId.getText().toString();
        String memID = labelMemberId.getText().toString();
        String sql = "INSERT INTO `issuebook`(`empID`, `bookID`, `memID`) VALUES ("+empID+","+bookID+","+memID+")";
    try {
        DBConnect.pushToDB(sql);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bookIssue.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bookIssue.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_butInsertActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bookIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new bookIssue().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(bookIssue.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(bookIssue.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton butInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelBookId;
    private javax.swing.JLabel labelBookTitle;
    private javax.swing.JLabel labelMemberId;
    private javax.swing.JLabel labelMemberName;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable memTable;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchBook;
    private javax.swing.JTextField txtSearchMember;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
