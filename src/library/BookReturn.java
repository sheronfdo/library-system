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
public class BookReturn extends javax.swing.JFrame {

    DefaultTableModel bookModel;
    String issueId;
    boolean isReturn = true;

    /**
     * Creates new form BookReturn
     */
    public BookReturn() throws ClassNotFoundException, SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/library/images/dictionary.png")).getImage());
        userName.setText(UserProfile.username);
        fillTable(null);
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
        title = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIssueId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelIssueDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelBookId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelEmployeeId = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelMemberId = new javax.swing.JLabel();
        butFind = new javax.swing.JButton();
        butReturn = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        labelBookName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelMemberName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libra 1.0 - Return Book");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(255, 153, 0));
        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Libra 1.0");
        title.setOpaque(true);

        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/images/account .png"))); // NOI18N
        userName.setText("   USERNAME");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Issue ID : ");

        txtIssueId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIssueId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIssueIdKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Issue Date : ");

        labelIssueDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelIssueDate.setText("\"date\"");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Book ID : ");

        labelBookId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelBookId.setText("\"bookId\"");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Employee : ");

        labelEmployeeId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelEmployeeId.setText("\"empID\"");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Member ID : ");

        labelMemberId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelMemberId.setText("\"memberID\"");

        butFind.setBackground(new java.awt.Color(255, 153, 0));
        butFind.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butFind.setText("Find");
        butFind.setBorder(null);
        butFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFindMouseClicked(evt);
            }
        });
        butFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFindActionPerformed(evt);
            }
        });

        butReturn.setBackground(new java.awt.Color(255, 153, 0));
        butReturn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butReturn.setText("Return Book");
        butReturn.setBorder(null);
        butReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butReturnMouseClicked(evt);
            }
        });
        butReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butReturnActionPerformed(evt);
            }
        });

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
                "Issue ID", "Date", "Time", "Issued Employee Name", "Book ID", "Book Titke", "Member ID", "Member Name", "Return ID", "Return Date and Time", "Return Time", "Return Got Employee"
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Book Name : ");

        labelBookName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelBookName.setText("\"bookId\"");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Member Name : ");

        labelMemberName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelMemberName.setText("\"memberID\"");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Status : ");

        labelStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelStatus.setText("\"stat\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(txtIssueId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(butFind, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(374, 650, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearch)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMemberId)
                                    .addComponent(labelMemberName))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtIssueId))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(labelIssueDate)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(labelBookId))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(labelMemberId)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(labelEmployeeId))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(labelBookName))
                    .addComponent(jLabel9)
                    .addComponent(labelMemberName))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(labelStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 734, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setToTable() {
        bookTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 11));
        bookTable.getTableHeader().setOpaque(false);
        bookTable.getTableHeader().setBackground(Color.white);
        bookTable.getTableHeader().setForeground(Color.black);
    }

    public void fillTable(String sql) throws ClassNotFoundException, SQLException {
        bookModel = (DefaultTableModel) bookTable.getModel();
        bookModel.setRowCount(0);
        if (sql == null) {
            sql = "select issuebook.issueID  as issueID,issuebook.issueDATE as issueDate,"
                    + "employee.name as employeeName,issuebook.bookID as bookId,"
                    + "book.title as bookTitle,issuebook.memID as memberId,member.name as memberName "
                    + "from (((issuebook inner join employee on issuebook.empID=employee.empID) "
                    + "inner join book on issuebook.bookID=book.bookID) "
                    + "inner join member on issuebook.memID=member.memID) where issuebook.status=1 order by issueID desc";
        } else {
            sql = "select issuebook.issueID  as issueID,issuebook.issueDATE as issueDate,"
                    + "employee.name as employeeName,issuebook.bookID as bookId,"
                    + "book.title as bookTitle,issuebook.memID as memberId,member.name as memberName "
                    + "from (((issuebook inner join employee on issuebook.empID=employee.empID) "
                    + "inner join book on issuebook.bookID=book.bookID) "
                    + "inner join member on issuebook.memID=member.memID) where issuebook.status=1 and "
                    + "(book.title like '%" + sql + "%' or member.name like '%" + sql + "%') order by issueID desc";
        }
        ResultSet rs = DBConnect.getFromDB(sql);
        while (rs.next()) {
            ResultSet rs2 = DBConnect.getFromDB("select returnbook.retID as retID,"
                    + "returnbook.DATE as retDate,employee.name as employee from "
                    + "returnbook inner join employee on returnbook.empID=employee.empID where returnbook.issueID=" + rs.getInt("issueID") + " and returnbook.status=1");

            Vector v = new Vector();
            v.add(rs.getInt("issueID"));
            v.add(rs.getDate("issueDate"));
            v.add(rs.getTime("issueDate"));
            v.add(rs.getString("employeeName"));
            v.add(rs.getInt("bookId"));
            v.add(rs.getString("bookTitle"));
            v.add(rs.getInt("memberId"));
            v.add(rs.getString("memberName"));
            if (rs2.next()) {
                v.add(rs2.getInt("retID"));
                v.add(rs2.getDate("retDate"));
                v.add(rs2.getTime("retDate"));
                v.add(rs2.getString("employee"));
            }
            bookModel.addRow(v);
        }

    }

    public void fillTableAndDetail(int issueId) throws ClassNotFoundException, SQLException {
        bookModel = (DefaultTableModel) bookTable.getModel();
        bookModel.setRowCount(0);
        String sql = null;
        if (issueId == 0) {
            sql = "select issuebook.issueID  as issueID,issuebook.issueDATE as issueDate,"
                    + "employee.name as employeeName,issuebook.bookID as bookId,"
                    + "book.title as bookTitle,issuebook.memID as memberId,member.name as memberName "
                    + "from (((issuebook inner join employee on issuebook.empID=employee.empID) "
                    + "inner join book on issuebook.bookID=book.bookID) "
                    + "inner join member on issuebook.memID=member.memID) where issuebook.status=1 order by issueID desc";
        } else {
            sql = "select issuebook.issueID  as issueID,issuebook.issueDATE as issueDate,"
                    + "employee.name as employeeName,issuebook.bookID as bookId,"
                    + "book.title as bookTitle,issuebook.memID as memberId,member.name as memberName "
                    + "from (((issuebook inner join employee on issuebook.empID=employee.empID) "
                    + "inner join book on issuebook.bookID=book.bookID) "
                    + "inner join member on issuebook.memID=member.memID) where issuebook.status=1 and issuebook.issueID=" + issueId + " order by issueID desc";
        }
        ResultSet rs = DBConnect.getFromDB(sql);
        while (rs.next()) {
            ResultSet rs2 = DBConnect.getFromDB("select returnbook.retID as retID,"
                    + "returnbook.DATE as retDate,employee.name as employee from "
                    + "returnbook inner join employee on returnbook.empID=employee.empID where returnbook.issueID=" + rs.getInt("issueID") + " and returnbook.status=1");

            Vector v = new Vector();
            v.add(rs.getInt("issueID"));
            v.add(rs.getDate("issueDate"));
            v.add(rs.getTime("issueDate"));
            v.add(rs.getString("employeeName"));
            v.add(rs.getInt("bookId"));
            v.add(rs.getString("bookTitle"));
            v.add(rs.getInt("memberId"));
            v.add(rs.getString("memberName"));
            int retId = 0;
            if (rs2.next()) {
                retId = rs2.getInt("retID");
                v.add(rs2.getInt("retID"));
                v.add(rs2.getDate("retDate"));
                v.add(rs2.getTime("retDate"));
                v.add(rs2.getString("employee"));
            }
            bookModel.addRow(v);
            if (issueId != 0) {
                labelIssueDate.setText(rs.getDate("issueDate") + " " + rs.getTime("issueDate"));
                labelBookId.setText(Integer.toString(rs.getInt("bookId")));
                labelBookName.setText(rs.getString("bookTitle"));
                labelEmployeeId.setText(rs.getString("employeeName"));
                labelMemberId.setText(Integer.toString(rs.getInt("memberId")));
                labelMemberName.setText(rs.getString("memberName"));
                if (retId > 0) {
                    isReturn = true;
                    labelStatus.setText("Returned");
                } else {
                    isReturn = false;
                    labelStatus.setText("Not Returned");
                }
            } else if (issueId == 0) {
                clearAll();
            }
        }

    }

    public void clearAll() throws ClassNotFoundException,SQLException{
        txtIssueId.setText("");
        labelIssueDate.setText("");
        labelBookId.setText("");
        labelBookName.setText("");
        labelEmployeeId.setText("");
        labelMemberId.setText("");
        labelMemberName.setText("");
        labelStatus.setText("");
        fillTable(null);
    }
    private void butFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFindMouseClicked
        try {
            int issueID = Integer.parseInt(txtIssueId.getText().toString().equals("") ? "0" : txtIssueId.getText().toString());
            fillTableAndDetail(issueID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butFindMouseClicked

    private void butReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butReturnMouseClicked
        if (!isReturn) {
            String bookId = labelBookId.getText().toString();
            String sql = "insert into returnbook (`issueID`, `empID`)  VALUES (" + txtIssueId.getText().toString() + "," + UserProfile.empID + ");";
            String sql1 = "UPDATE `book` SET `quantity`=`quantity`+1 WHERE bookID=" + bookId;
            try {
                DBConnect.pushToDB(sql);
                DBConnect.pushToDB(sql1);
                JOptionPane.showMessageDialog(this, "Book returned successfuly");
                clearAll();
// TODO add your handling code here:
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "This Book already Returned or Not selected a book");
            try {
                clearAll();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_butReturnMouseClicked

    private void butReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butReturnActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {
            fillTable(txtSearch.getText().toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IssuedBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IssuedBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        int issueid = Integer.parseInt(bookTable.getValueAt(bookTable.getSelectedRow(), 0).toString());
        try {
            txtIssueId.setText(Integer.toString(issueid));
            fillTableAndDetail(issueid);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookTableMouseClicked

    private void butFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butFindActionPerformed

    private void txtIssueIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIssueIdKeyReleased
        try {
            int issueID = Integer.parseInt(txtIssueId.getText().toString().equals("") ? "0" : txtIssueId.getText().toString());
            fillTableAndDetail(issueID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIssueIdKeyReleased

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
            java.util.logging.Logger.getLogger(BookReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BookReturn().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BookReturn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton butFind;
    private javax.swing.JButton butReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBookId;
    private javax.swing.JLabel labelBookName;
    private javax.swing.JLabel labelEmployeeId;
    private javax.swing.JLabel labelIssueDate;
    private javax.swing.JLabel labelMemberId;
    private javax.swing.JLabel labelMemberName;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtIssueId;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
