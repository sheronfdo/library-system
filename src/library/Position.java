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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jamit
 */
public class Position extends javax.swing.JFrame {

    /**
     * Creates new form Position
     */
    int id;
    String description;
    int employee;
    int member;
    int author;
    int publisher;
    int position;
    int book;
    int bookCheckout;
    int bookReturn;
    int bookRenew;
    int subject;
    int user;

    public Position() throws ClassNotFoundException, SQLException {
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/library/images/dictionary.png")).getImage());
        userName.setText(UserProfile.username);
        setLocationRelativeTo(null);
        setToTable();
        fillTable(null);
    }
    DefaultTableModel tableModel;

    public void fillTable(String sql) throws ClassNotFoundException, SQLException {
        if (sql == null) {
            sql = "select * from staffposition";
        }
        ResultSet rs = DBConnect.getFromDB(sql);
        tableModel = (DefaultTableModel) posTable.getModel();
        tableModel.setRowCount(0);
        while (rs.next()) {
            Vector v = new Vector();
            v.add(rs.getInt("posID"));
            v.add(rs.getString("description"));
            v.add(rs.getInt("employee"));
            v.add(rs.getInt("member"));
            v.add(rs.getInt("author"));
            v.add(rs.getInt("publisher"));
            v.add(rs.getInt("position"));
            v.add(rs.getInt("book"));
            v.add(rs.getInt("checkout"));
            v.add(rs.getInt("return"));
            v.add(rs.getInt("renew"));
            v.add(rs.getInt("subject"));
            v.add(rs.getInt("user"));
            v.add(rs.getInt("status"));

            tableModel.addRow(v);
        }
    }

    public void setToTable() {
        posTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 11));
        posTable.getTableHeader().setOpaque(false);
        posTable.getTableHeader().setBackground(Color.white);
        posTable.getTableHeader().setForeground(Color.black);
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
        txtDescription = new javax.swing.JTextField();
        butInsert = new javax.swing.JButton();
        butDelete = new javax.swing.JButton();
        butEdit = new javax.swing.JButton();
        butCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cBoxEmployee = new javax.swing.JCheckBox();
        cBoxMember = new javax.swing.JCheckBox();
        cBoxAuthor = new javax.swing.JCheckBox();
        cBoxPublisher = new javax.swing.JCheckBox();
        cBoxReturn = new javax.swing.JCheckBox();
        cBoxCheckout = new javax.swing.JCheckBox();
        cBoxPosition = new javax.swing.JCheckBox();
        cBoxBook = new javax.swing.JCheckBox();
        cBoxRenew = new javax.swing.JCheckBox();
        cBoxSubject = new javax.swing.JCheckBox();
        cBoxUser = new javax.swing.JCheckBox();
        tablePanel = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        posTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libra 1.0 - Staff Positions");

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
        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3), "Position Information"));

        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Accessbility", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        cBoxEmployee.setBackground(new java.awt.Color(255, 255, 255));
        cBoxEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxEmployee.setText("Employee");
        cBoxEmployee.setIconTextGap(10);

        cBoxMember.setBackground(new java.awt.Color(255, 255, 255));
        cBoxMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxMember.setText("Member");
        cBoxMember.setIconTextGap(10);

        cBoxAuthor.setBackground(new java.awt.Color(255, 255, 255));
        cBoxAuthor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxAuthor.setText("Author");
        cBoxAuthor.setIconTextGap(10);

        cBoxPublisher.setBackground(new java.awt.Color(255, 255, 255));
        cBoxPublisher.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxPublisher.setText("Publisher");
        cBoxPublisher.setIconTextGap(10);

        cBoxReturn.setBackground(new java.awt.Color(255, 255, 255));
        cBoxReturn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxReturn.setSelected(true);
        cBoxReturn.setText("Book Return");
        cBoxReturn.setIconTextGap(10);

        cBoxCheckout.setBackground(new java.awt.Color(255, 255, 255));
        cBoxCheckout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxCheckout.setSelected(true);
        cBoxCheckout.setText("Book Checkout");
        cBoxCheckout.setIconTextGap(10);

        cBoxPosition.setBackground(new java.awt.Color(255, 255, 255));
        cBoxPosition.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxPosition.setText("Staff Position");
        cBoxPosition.setIconTextGap(10);

        cBoxBook.setBackground(new java.awt.Color(255, 255, 255));
        cBoxBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxBook.setSelected(true);
        cBoxBook.setText("Book");
        cBoxBook.setIconTextGap(10);

        cBoxRenew.setBackground(new java.awt.Color(255, 255, 255));
        cBoxRenew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxRenew.setSelected(true);
        cBoxRenew.setText("Book Renew");
        cBoxRenew.setIconTextGap(10);

        cBoxSubject.setBackground(new java.awt.Color(255, 255, 255));
        cBoxSubject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxSubject.setText("Subject");
        cBoxSubject.setIconTextGap(10);

        cBoxUser.setBackground(new java.awt.Color(255, 255, 255));
        cBoxUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cBoxUser.setText("User");
        cBoxUser.setIconTextGap(10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cBoxPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cBoxAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cBoxMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cBoxEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cBoxUser)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cBoxRenew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cBoxReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cBoxCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cBoxBook, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxSubject))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cBoxEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxPublisher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxPosition)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxSubject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxBook)
                .addGap(3, 3, 3)
                .addComponent(cBoxCheckout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxRenew)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formPanelLayout.createSequentialGroup()
                        .addComponent(butInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));
        tablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3), "All Position Details"));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        posTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        posTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "Employee", "Member", "Author", "Publisher", "Staff Position", "Book", "Book Checkout", "Book Return", "Book  Renew", "Subject", "User", "Status"
            }
        ));
        posTable.setFocusable(false);
        posTable.setRowHeight(25);
        posTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        posTable.setShowVerticalLines(false);
        posTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(posTable);

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
        description = txtDescription.getText();
        employee = (cBoxEmployee.isSelected()) ? 1 : 0;
        member = (cBoxMember.isSelected()) ? 1 : 0;
        author = (cBoxAuthor.isSelected()) ? 1 : 0;
        publisher = (cBoxPublisher.isSelected()) ? 1 : 0;
        position = (cBoxPosition.isSelected()) ? 1 : 0;
        book = (cBoxBook.isSelected()) ? 1 : 0;
        bookCheckout = (cBoxCheckout.isSelected()) ? 1 : 0;
        bookReturn = (cBoxReturn.isSelected()) ? 1 : 0;
        bookRenew = (cBoxRenew.isSelected()) ? 1 : 0;
        subject = (cBoxSubject.isSelected()) ? 1 : 0;
        user = (cBoxUser.isSelected()) ? 1 : 0;

        String sql = "INSERT INTO `staffposition`(`description`, `employee`,"
                + " `member`, `author`, `publisher`, `position`, `book`, `checkout`,"
                + " `return`, `renew` , `subject`, `user`) "
                + "VALUES ('" + description + "'," + employee + "," + member + "," + author + "," + publisher + "," + position + ""
                + "," + book + "," + bookCheckout + "," + bookReturn + "," + bookRenew + "," + subject + "," + user + ")";
        try {
            DBConnect.pushToDB(sql);
            JOptionPane.showMessageDialog(this, "Data inserted successfuly");
            fillTable(null);
            clearAll();
// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butInsertActionPerformed

    private void posTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posTableMouseClicked
        id = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 0).toString());
        description = tableModel.getValueAt(posTable.getSelectedRow(), 1).toString();
        employee = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 2).toString());
        member = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 3).toString());
        author = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 4).toString());
        publisher = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 5).toString());
        position = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 6).toString());
        book = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 7).toString());
        bookCheckout = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 8).toString());
        bookReturn = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 9).toString());
        bookRenew = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 10).toString());
        subject = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 11).toString());
        user = Integer.parseInt(tableModel.getValueAt(posTable.getSelectedRow(), 12).toString());
        
        txtDescription.setText(description);
        cBoxEmployee.setSelected((employee == 1));
        cBoxMember.setSelected((member == 1));
        cBoxAuthor.setSelected((author == 1));
        cBoxPublisher.setSelected((publisher == 1));
        cBoxPosition.setSelected((position == 1));
        cBoxBook.setSelected((book == 1));
        cBoxCheckout.setSelected((bookCheckout == 1));
        cBoxReturn.setSelected((bookReturn == 1));
        cBoxRenew.setSelected((bookRenew == 1));
        cBoxSubject.setSelected((subject == 1));
        cBoxUser.setSelected((user == 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_posTableMouseClicked

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        try {
            DBConnect.pushToDB("DELETE FROM `staffposition` WHERE posID=" + id);
            JOptionPane.showMessageDialog(this, "Data deleted successfuly");
            fillTable(null);
            clearAll();
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butDeleteActionPerformed

    private void butEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditActionPerformed
        description = txtDescription.getText();
        employee = (cBoxEmployee.isSelected()) ? 1 : 0;
        member = (cBoxMember.isSelected()) ? 1 : 0;
        author = (cBoxAuthor.isSelected()) ? 1 : 0;
        publisher = (cBoxPublisher.isSelected()) ? 1 : 0;
        position = (cBoxPosition.isSelected()) ? 1 : 0;
        book = (cBoxBook.isSelected()) ? 1 : 0;
        bookCheckout = (cBoxCheckout.isSelected()) ? 1 : 0;
        bookReturn = (cBoxReturn.isSelected()) ? 1 : 0;
        bookRenew = (cBoxRenew.isSelected()) ? 1 : 0;

        String sql = "UPDATE `staffposition` SET `description`='" + description + "',"
                + "`employee`=" + employee + ",`member`=" + member + ",`author`=" + author + ",`publisher`=" + publisher + ","
                + "`position`=" + position + ",`book`=" + book + ",`checkout`=" + bookCheckout + ",`return`=" + bookReturn + ","
                + "`renew`=" + bookRenew + "`subject`=" + subject + "`user`=" + user + " WHERE `posID`=" + id + "";
        try {
            DBConnect.pushToDB(sql);
            JOptionPane.showMessageDialog(this, "Data edited successfuly");
            fillTable(null);
            clearAll();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_butEditActionPerformed

    public void clearAll() throws ClassNotFoundException, SQLException {
        txtSearch.setText("");
        txtDescription.setText("");
        cBoxEmployee.setSelected(false);
        cBoxMember.setSelected(false);
        cBoxAuthor.setSelected(false);
        cBoxPublisher.setSelected(false);
        cBoxPosition.setSelected(false);
        cBoxBook.setSelected(true);
        cBoxCheckout.setSelected(true);
        cBoxReturn.setSelected(true);
        cBoxRenew.setSelected(true);

        id = 0;
        description = null;
        employee = 0;
        member = 0;
        author = 0;
        publisher = 0;
        position = 0;
        book = 0;
        bookCheckout = 0;
        bookReturn = 0;
        bookRenew = 0;
        fillTable(null);
    }

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        try {
            clearAll();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butCancelActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {
            fillTable("SELECT * FROM `staffposition` WHERE description like '%" + txtSearch.getText().toString() + "%'");
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(Position.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Position.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Position.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Position.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Position().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Position.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butEdit;
    private javax.swing.JButton butInsert;
    private javax.swing.JCheckBox cBoxAuthor;
    private javax.swing.JCheckBox cBoxBook;
    private javax.swing.JCheckBox cBoxCheckout;
    private javax.swing.JCheckBox cBoxEmployee;
    private javax.swing.JCheckBox cBoxMember;
    private javax.swing.JCheckBox cBoxPosition;
    private javax.swing.JCheckBox cBoxPublisher;
    private javax.swing.JCheckBox cBoxRenew;
    private javax.swing.JCheckBox cBoxReturn;
    private javax.swing.JCheckBox cBoxSubject;
    private javax.swing.JCheckBox cBoxUser;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable posTable;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
