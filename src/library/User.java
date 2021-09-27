/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.library.db.DBConnect;
import com.library.encrypt.MD5;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jamit
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() throws ClassNotFoundException, SQLException {
        initComponents();
        userName.setText(UserProfile.username);
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/library/images/dictionary.png")).getImage());
        loadEmployeeCombo();
    }

    public void loadEmployeeCombo() throws ClassNotFoundException, SQLException {
        ResultSet rs = DBConnect.getFromDB("select empID,name from employee where status=1");
        Vector v = new Vector();
        while (rs.next()) {
            String data = rs.getInt("empID") + " - " + rs.getString("name");
            v.add(data);
        }
        comboEmployee.setModel(new DefaultComboBoxModel(v));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        butInsert = new javax.swing.JButton();
        butDelete = new javax.swing.JButton();
        butEdit = new javax.swing.JButton();
        butCancel = new javax.swing.JButton();
        comboEmployee = new javax.swing.JComboBox<>();
        genderPanel = new javax.swing.JPanel();
        radioButInactive = new javax.swing.JRadioButton();
        radioButActive = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libra 1.0 - User Management");
        setPreferredSize(new java.awt.Dimension(439, 620));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 580));

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
        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3), "User Information"));
        formPanel.setPreferredSize(new java.awt.Dimension(370, 523));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

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

        comboEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Employee" }));
        comboEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)), "Employee"));
        comboEmployee.setPreferredSize(new java.awt.Dimension(98, 45));
        comboEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmployeeActionPerformed(evt);
            }
        });

        genderPanel.setBackground(new java.awt.Color(255, 255, 255));
        genderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Is Active"));

        radioButInactive.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioButInactive);
        radioButInactive.setText("Inactive");

        radioButActive.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioButActive);
        radioButActive.setText("Active");

        javax.swing.GroupLayout genderPanelLayout = new javax.swing.GroupLayout(genderPanel);
        genderPanel.setLayout(genderPanelLayout);
        genderPanelLayout.setHorizontalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioButActive)
                .addGap(55, 55, 55)
                .addComponent(radioButInactive)
                .addContainerGap())
        );
        genderPanelLayout.setVerticalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(radioButActive)
                .addComponent(radioButInactive))
        );

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2), "Default Password"));

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(butInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(genderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
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
                        .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInsertActionPerformed
        int empId = Integer.parseInt(comboEmployee.getSelectedItem().toString().split(" - ")[0]);
        String userName = txtName.getText();
        String password = MD5.getMd5(new String(txtPassword.getPassword()));
        int status = (radioButActive.isSelected()) ? 1 : 0;

        String sql = "INSERT INTO `userprofile`(`userName`, `password`, `empID`, `status`)"
                + " VALUES ('" + userName + "','" + password + "'," + empId + "," + status + ")";
        try {
            DBConnect.pushToDB(sql);
            JOptionPane.showMessageDialog(this, "Data inserted successfuly");
            clearAll();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butInsertActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        int empId = Integer.parseInt(comboEmployee.getSelectedItem().toString().split(" - ")[0]);
        String sql = "UPDATE `userprofile` SET `status`=0 WHERE `empID`='" + empId + "'";
        try {
            DBConnect.pushToDB(sql);
            JOptionPane.showMessageDialog(this, "Data deleted successfuly");
            clearAll();
// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butDeleteActionPerformed

    private void comboEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmployeeActionPerformed
        int empId = Integer.parseInt(comboEmployee.getSelectedItem().toString().split(" - ")[0]);
        String sql = "select * from userprofile where empid = " + Integer.toString(empId);
        try {
            ResultSet rs = DBConnect.getFromDB(sql);
            if (rs.next()) {
                txtName.setText(rs.getString("userName"));
                if (rs.getInt("status") == 0) {
                    radioButInactive.setSelected(true);
                }
                if (rs.getInt("status") == 1) {
                    radioButActive.setSelected(true);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboEmployeeActionPerformed

    private void butEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditActionPerformed
        int empId = Integer.parseInt(comboEmployee.getSelectedItem().toString().split(" - ")[0]);
        String userName = txtName.getText();
        String password = MD5.getMd5(new String(txtPassword.getPassword()));
        int status = (radioButActive.isSelected()) ? 1 : 0;
        String sql;
        if (password.equals("d41d8cd98f00b204e9800998ecf8427e")) {
            sql = "UPDATE `userprofile` SET `userName`='" + userName + "',`status`='"
                    + status + "' WHERE `empID`='" + empId + "'";
        } else {
            sql = "UPDATE `userprofile` SET `userName`='" + userName + "',`password`='"
                    + password + "',`status`='" + status + "' WHERE `empID`='" + empId + "'";
        }
        try {
            DBConnect.pushToDB(sql);
            JOptionPane.showMessageDialog(this, "Data edited successfuly");
            clearAll();
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butEditActionPerformed

    public void clearAll() throws ClassNotFoundException, SQLException {
        loadEmployeeCombo();
        txtName.setText("");
        txtPassword.setText("");
        radioButActive.setSelected(true);
    }

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        try {
            clearAll();        // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butCancelActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new User().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butEdit;
    private javax.swing.JButton butInsert;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboEmployee;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton radioButActive;
    private javax.swing.JRadioButton radioButInactive;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
