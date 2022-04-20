
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aukse
 */
public class attend extends javax.swing.JFrame {

    /**
     * Creates new form attend
     */
    DefaultTableModel model;
    student std = new student();
    course j = new course();
    takeattendance g = new takeattendance();
    public int id;
    public static String attdate;
    public static String bdate;
    public String fname, lname, phone, address, course, sex;

    public attend() {
        initComponents();
        String was ="";
        std.insertUpdateDeleteStudent('c', null, null, null, null, null, null, null, null, was);
        std.fillStudentJtableatt(jTableatt, ""); ///
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jRadioButton_Present);
        bg1.add(jRadioButton_Absent);
        model = (DefaultTableModel) jTableatt.getModel();
        jTableatt.setRowHeight(40);
        jTableatt.setShowGrid(true);
        jTableatt.setGridColor(Color.red);
        jTableatt.setSelectionBackground(Color.BLACK);

    }
    public attend(String date) {
        initComponents();
        attdate = date;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jButtonEditStudent7 = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTableatt = new javax.swing.JTable();
        jLabel93 = new javax.swing.JLabel();
        jRadioButton_Present = new javax.swing.JRadioButton();
        jRadioButton_Absent = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel85.setText("Take attendance by date");

        jButtonEditStudent7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonEditStudent7.setText("Edit");
        jButtonEditStudent7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudent7ActionPerformed(evt);
            }
        });

        jTableatt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "Birthdate", "Phone", "Address", "course", "was"
            }
        ));
        jTableatt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableattMouseClicked(evt);
            }
        });
        jTableatt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableattKeyReleased(evt);
            }
        });
        jScrollPane16.setViewportView(jTableatt);

        jLabel93.setText("Was/Wasnt:");

        jRadioButton_Present.setText("Present");

        jRadioButton_Absent.setText("Absent");

        jButton1.setText("Show attendance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jRadioButton_Present)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Absent)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonEditStudent7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel85)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel93))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85)
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jRadioButton_Present)
                    .addComponent(jRadioButton_Absent)
                    .addComponent(jButtonEditStudent7))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        laikotarpis AddSf = new laikotarpis();
        AddSf.setVisible(true);
        AddSf.pack();
        AddSf.setLocationRelativeTo(null);
        AddSf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableattKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableattKeyReleased
        int rowIndex;
        if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            rowIndex = jTableatt.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)jTableatt.getModel();
            sex = String.valueOf(model.getValueAt(rowIndex, 3).toString());
            id = Integer.valueOf(model.getValueAt(rowIndex, 0).toString());
            fname = String.valueOf(model.getValueAt(rowIndex, 1).toString());
            lname = String.valueOf(model.getValueAt(rowIndex, 2).toString());
            phone = String.valueOf(model.getValueAt(rowIndex, 5).toString());
            address = String.valueOf(model.getValueAt(rowIndex, 6).toString());
            course = String.valueOf(model.getValueAt(rowIndex, 7).toString());
            Date bdate1;
            try {
                bdate1 = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
                bdate = String.valueOf(model.getValueAt(rowIndex, 4).toString());
            } catch (ParseException ex) {
                Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTableattKeyReleased

    private void jTableattMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableattMouseClicked
        int rowIndex;
        rowIndex = jTableatt.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTableatt.getModel();
        sex = String.valueOf(model.getValueAt(rowIndex, 3).toString());
        id = Integer.valueOf(model.getValueAt(rowIndex, 0).toString());
        fname = String.valueOf(model.getValueAt(rowIndex, 1).toString());
        lname = String.valueOf(model.getValueAt(rowIndex, 2).toString());
        phone = String.valueOf(model.getValueAt(rowIndex, 5).toString());
        address = String.valueOf(model.getValueAt(rowIndex, 6).toString());
        course = String.valueOf(model.getValueAt(rowIndex, 7).toString());
        Date bdate1;
        try {
            bdate1 = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
            bdate = String.valueOf(model.getValueAt(rowIndex, 4).toString());
        } catch (ParseException ex) {
            Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableattMouseClicked

    private void jButtonEditStudent7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudent7ActionPerformed
        String was = "";
        if (jRadioButton_Present.isSelected()) {
            was = "Present";
        } else if (jRadioButton_Absent.isSelected()) {
            was = "Absent";
        }
        student std = new student();
        std.UpdateStudent('u', id, null, null, null, null, null, null, null, was);
        jTableatt.setModel(new DefaultTableModel(null, new Object[]{"Id", "First Name", "Last Name", "Sex", "Birthdate", "Phone", "Address", "course", "was"}));
        std.fillStudentJtableatt(jTableatt, "");
        if (was == "Present") {
            std.insertStudent('i', null, fname, lname, sex, bdate, phone, address, course, attdate);
        }

    }//GEN-LAST:event_jButtonEditStudent7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        takeattendance Addat = new takeattendance();
                    Addat.setVisible(true);
                    Addat.pack();
                    Addat.setLocationRelativeTo(null);
                    Addat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(attend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEditStudent7;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton_Absent;
    private javax.swing.JRadioButton jRadioButton_Present;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JTable jTableatt;
    // End of variables declaration//GEN-END:variables
}
