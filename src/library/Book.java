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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jamit
 */
public class Book extends javax.swing.JFrame {

    DefaultTableModel bookModel;
    String id;
    String bookTitle;
    String author;
    String publisher;
    String edition;
    String quantity;
    String isbn;
    String subject;
    String value;
    String status;

    /**
     * Creates new form Book
     */
    public Book() throws ClassNotFoundException, SQLException {
        initComponents();
        userName.setText(UserProfile.userPosition);
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/library/images/dictionary.png")).getImage());
        setToTable();
        loadAuthor();
        loadPublisher();
        loadSubject();
        fillTable(null);
    }

    public void fillTable(String sql) throws ClassNotFoundException, SQLException {
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

    public void clearAll() throws ClassNotFoundException, SQLException {
        txtTitle.setText("");
        txtEdition.setText("");
        txtQuantity.setText("");
        txtIsbn.setText("");
        txtValue.setText("");
        comboAuthor.setSelectedIndex(0);
        comboPublisher.setSelectedIndex(0);
        comboSubject.setSelectedIndex(0);
        txtSearch.setText("");
        fillTable(null);
    }

    public void loadAuthor() throws ClassNotFoundException, SQLException {
        ResultSet rs = DBConnect.getFromDB("select * from author where status=1");
        Vector v = new Vector();
        while (rs.next()) {
            String data = rs.getInt("aurID") + " - " + rs.getString("name");
            v.add(data);
        }
        comboAuthor.setModel(new DefaultComboBoxModel(v));
    }

    public void loadPublisher() throws ClassNotFoundException, SQLException {
        ResultSet rs = DBConnect.getFromDB("select * from publisher where status=1");
        Vector v = new Vector();
        while (rs.next()) {
            String data = rs.getInt("pubID") + " - " + rs.getString("name");
            v.add(data);
        }
        comboPublisher.setModel(new DefaultComboBoxModel(v));
    }

    public void loadSubject() throws ClassNotFoundException, SQLException {
        ResultSet rs = DBConnect.getFromDB("select * from subject where status=1");
        Vector v = new Vector();
        while (rs.next()) {
            String data = rs.getInt("subID") + " - " + rs.getString("description");
            v.add(data);
        }
        comboSubject.setModel(new DefaultComboBoxModel(v));
    }

    public void setToTable() {
        bookTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 11));
        bookTable.getTableHeader().setOpaque(false);
        bookTable.getTableHeader().setBackground(Color.white);
        bookTable.getTableHeader().setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        txtEdition = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        butInsert = new javax.swing.JButton();
        butDelete = new javax.swing.JButton();
        butEdit = new javax.swing.JButton();
        butCancel = new javax.swing.JButton();
        txtIsbn = new javax.swing.JTextField();
        comboPublisher = new javax.swing.JComboBox<>();
        comboAuthor = new javax.swing.JComboBox<>();
        comboSubject = new javax.swing.JComboBox<>();
        txtValue = new javax.swing.JTextField();
        tablePanel = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libre 1.0 - Book");

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

        formPanel.setBackground(new java.awt.Color(255, 255, 255));
        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3), "Book Information"));

        txtEdition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEdition.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Edition", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Title", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        butInsert.setBackground(new java.awt.Color(255, 204, 0));
        butInsert.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        butInsert.setText("INSERT");
        butInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        butInsert.setMinimumSize(new java.awt.Dimension(75, 25));
        butInsert.setPreferredSize(new java.awt.Dimension(80, 30));
        butInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInsertActionPerformed(evt);
            }
        });

        butDelete.setBackground(new java.awt.Color(255, 204, 0));
        butDelete.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        butDelete.setText("DELETE");
        butDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        butDelete.setMinimumSize(new java.awt.Dimension(75, 25));
        butDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        butEdit.setBackground(new java.awt.Color(255, 204, 0));
        butEdit.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        butEdit.setText("EDIT");
        butEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        butEdit.setMinimumSize(new java.awt.Dimension(75, 25));
        butEdit.setPreferredSize(new java.awt.Dimension(80, 30));
        butEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditActionPerformed(evt);
            }
        });

        butCancel.setBackground(new java.awt.Color(255, 204, 0));
        butCancel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        butCancel.setText("CANCEL");
        butCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        butCancel.setMinimumSize(new java.awt.Dimension(75, 25));
        butCancel.setPreferredSize(new java.awt.Dimension(80, 30));
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });

        txtIsbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIsbn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "ISBN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        comboPublisher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Publisher" }));
        comboPublisher.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)), "Publisher"));
        comboPublisher.setPreferredSize(new java.awt.Dimension(98, 45));

        comboAuthor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Author" }));
        comboAuthor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)), "Author"));
        comboAuthor.setPreferredSize(new java.awt.Dimension(98, 45));

        comboSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject" }));
        comboSubject.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)), "Subject"));
        comboSubject.setPreferredSize(new java.awt.Dimension(98, 45));

        txtValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValue.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Value Of Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitle)
                    .addComponent(txtEdition)
                    .addComponent(txtQuantity)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(butInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboAuthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboPublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValue))
                .addContainerGap())
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));
        tablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3), "All Book Details"));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

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

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
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
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInsertActionPerformed
        bookTitle = txtTitle.getText();
        author = comboAuthor.getSelectedItem().toString().split(" - ")[0];
        publisher = comboPublisher.getSelectedItem().toString().split(" - ")[0];
        edition = txtEdition.getText();
        quantity = txtQuantity.getText();
        isbn = txtIsbn.getText();
        subject = comboSubject.getSelectedItem().toString().split(" - ")[0];
        value = txtValue.getText();

        String sql = "INSERT INTO `book`(`title`, `edition`, `aurID`, `subID`,"
                + " `pubID`, `quantity`, `isbn`, `value`) VALUES ('" + bookTitle + "','" + edition + "',"
                + "" + author + "," + subject + "," + publisher + "," + quantity + ",'" + isbn + "'," + value + ")";
        try {
            DBConnect.pushToDB(sql);
            JOptionPane.showMessageDialog(this, "Data inserted successfuly");
            clearAll();
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butInsertActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {
            fillTable("SELECT * FROM `book` WHERE title like '%" + txtSearch.getText().toString() + "%'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        try {
            clearAll();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butCancelActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        id = bookModel.getValueAt(bookTable.getSelectedRow(), 0).toString();
        bookTitle = bookModel.getValueAt(bookTable.getSelectedRow(), 1).toString();
        author = bookModel.getValueAt(bookTable.getSelectedRow(), 2).toString();
        publisher = bookModel.getValueAt(bookTable.getSelectedRow(), 3).toString();
        edition = bookModel.getValueAt(bookTable.getSelectedRow(), 4).toString();
        quantity = bookModel.getValueAt(bookTable.getSelectedRow(), 5).toString();
        isbn = bookModel.getValueAt(bookTable.getSelectedRow(), 6).toString();
        subject = bookModel.getValueAt(bookTable.getSelectedRow(), 7).toString();
        value = bookModel.getValueAt(bookTable.getSelectedRow(), 8).toString();
        status = bookModel.getValueAt(bookTable.getSelectedRow(), 9).toString();

        txtTitle.setText(bookTitle);
        txtEdition.setText(edition);
        txtQuantity.setText(quantity);
        txtIsbn.setText(isbn);
        txtValue.setText(value);
        String sql = "";
        ResultSet rs;
        try {
            {
                sql = "select aurID,name from author where aurID=" + author;
                rs = DBConnect.getFromDB(sql);
                if (rs.next()) {
                    String data = rs.getInt("aurID") + " - " + rs.getString("name");
                    comboAuthor.setSelectedItem(data);
                }
            }
            {
                sql = "select pubID,name from publisher where pubID=" + publisher;
                rs = DBConnect.getFromDB(sql);
                if (rs.next()) {
                    String data = rs.getInt("pubID") + " - " + rs.getString("name");
                    comboPublisher.setSelectedItem(data);
                }
            }
            {
                sql = "select subID,description from subject where subID=" + subject;
                rs = DBConnect.getFromDB(sql);
                if (rs.next()) {
                    String data = rs.getInt("subID") + " - " + rs.getString("description");
                    comboSubject.setSelectedItem(data);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookTableMouseClicked

    private void butEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditActionPerformed
        bookTitle = txtTitle.getText();
        author = comboAuthor.getSelectedItem().toString().split(" - ")[0];
        publisher = comboPublisher.getSelectedItem().toString().split(" - ")[0];
        edition = txtEdition.getText();
        quantity = txtQuantity.getText();
        isbn = txtIsbn.getText();
        subject = comboSubject.getSelectedItem().toString().split(" - ")[0];
        value = txtValue.getText();

        String sql = "UPDATE `book` SET `title`='" + bookTitle + "',`edition`='" + edition + "',"
                + "`aurID`='" + author + "',`subID`='" + subject + "',`pubID`='" + publisher + "',`quantity`='" + quantity + "',"
                + "`isbn`='" + isbn + "',`value`='" + value + "' WHERE `bookID`='" + id + "'";
        try {
            DBConnect.pushToDB(sql);
            JOptionPane.showMessageDialog(this, "Data edited successfuly");
            clearAll();
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_butEditActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        String sql = "UPDATE `book` SET `status`=0 WHERE `bookID`='" + id + "'";
        try {
            DBConnect.pushToDB(sql);
            JOptionPane.showMessageDialog(this, "Data deleted successfuly");
            clearAll();
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_butDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Book().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butEdit;
    private javax.swing.JButton butInsert;
    private javax.swing.JComboBox<String> comboAuthor;
    private javax.swing.JComboBox<String> comboPublisher;
    private javax.swing.JComboBox<String> comboSubject;
    private javax.swing.JPanel formPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtEdition;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtValue;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
