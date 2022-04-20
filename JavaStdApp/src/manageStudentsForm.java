
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Aukse
 */
public class manageStudentsForm extends javax.swing.JFrame {

    /**
     * Creates new form manageStudentsForm
     */
    public int i;
    student std = new student();
    course j = new course();
    DefaultTableModel model;

    public manageStudentsForm() {
        initComponents();
        j.fillCourseCombo(jComboBox_cour);
        std.fillStudentJtable(jTable1, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonMale);
        bg.add(jRadioButtonFemale);
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.red);
        jTable1.setSelectionBackground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_FName = new javax.swing.JTextField();
        jTextField_LName = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jTextField_Phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonRemoveStudent = new javax.swing.JButton();
        jDateChooserBirthDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jTextField_STD_ID = new javax.swing.JTextField();
        jButtonEditStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jComboBox_cour = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("Manage Students");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Sex:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Birthdate:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Address:");

        jRadioButtonMale.setText("Male");

        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jButtonAddStudent.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonAddStudent.setText("Add");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jButtonRemoveStudent.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonRemoveStudent.setText("Remove");
        jButtonRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveStudentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Id:");

        jTextField_STD_ID.setEditable(false);

        jButtonEditStudent.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonEditStudent.setText("Edit");
        jButtonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudentActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "Birthdate", "Phone", "Address", "course"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Export(excel)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Import(excel)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Export(csv)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Import(csv)");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("course:");

        jButton6.setText("take attendance by date");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox_cour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_courActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_LName, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(jComboBox_cour, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_FName)
                                        .addComponent(jTextField_Phone)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonMale)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButtonFemale))
                                        .addComponent(jTextField_STD_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton4))))
                        .addContainerGap(981, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_STD_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jRadioButtonFemale))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox_cour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRemoveStudent)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonAddStudent)
                                .addComponent(jButtonEditStudent)
                                .addComponent(jButton6)))))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed

    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        AddStudentForm AddSf = new AddStudentForm();
        AddSf.setVisible(true);
        AddSf.pack();
        AddSf.setLocationRelativeTo(null);
        AddSf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jButtonRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStudentActionPerformed
        if (jTextField_STD_ID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No Student selected");
        } else {
            int id = Integer.valueOf(jTextField_STD_ID.getText());
            std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null, null, null);

            jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id", "First Name", "Last Name", "Sex", "Birthdate", "Phone", "Address", "course"}));
            std.fillStudentJtable(jTable1, "");
            MainForm.jLabel_StdCount.setText("Student Count = " + Integer.toString(MyFunction.countData("student")));
            jTextField_STD_ID.setText("");
            jTextArea_Address.setText("");
            jTextField_FName.setText("");
            jTextField_LName.setText("");
            jTextField_Phone.setText("");
            jRadioButtonMale.setSelected(false);
            jRadioButtonFemale.setSelected(false);
            jDateChooserBirthDate.setDate(null);

        }
    }//GEN-LAST:event_jButtonRemoveStudentActionPerformed
    public boolean verifText() {
        if (jTextField_FName.getText().equals("") || jTextField_LName.getText().equals("") || jTextField_Phone.getText().equals("")
                || jTextField_STD_ID.getText().equals("") || jTextArea_Address.getText().equals("") || jDateChooserBirthDate.getDate() == null) {
            JOptionPane.showMessageDialog(null, "One or more empty field");
            return false;
        } else if (jDateChooserBirthDate.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "No Student from the future are aloowed");
            return false;
        } else {
            return true;
        }

    }
    private void jButtonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudentActionPerformed
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String address = jTextArea_Address.getText();
        String course = jComboBox_cour.getSelectedItem().toString();
        String sex = "";
        int id = Integer.valueOf(jTextField_STD_ID.getText());
        if (jRadioButtonFemale.isSelected()) {
            sex = "Female";
        } else if (jRadioButtonFemale.isSelected()) {
            sex = "Male";
        }
        if (verifText()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(jDateChooserBirthDate.getDate());
            student std = new student();
            std.insertUpdateDeleteStudent('u', id, fname, lname, sex, bdate, phone, address, course, null);
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id", "First Name", "Last Name", "Sex", "Birthdate", "Phone", "Address", "course"}));
            std.fillStudentJtable(jTable1, "");
        }
    }//GEN-LAST:event_jButtonEditStudentActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex;
        rowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (model.getValueAt(rowIndex, 3).toString().equals("Male")) {
            jRadioButtonMale.setSelected(true);
            jRadioButtonFemale.setSelected(false);
        } else {
            jRadioButtonFemale.setSelected(true);
            jRadioButtonMale.setSelected(false);
        }
        jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
        jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
        jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
        jComboBox_cour.setSelectedItem(model.getValueAt(rowIndex, 7).toString());
        Date bdate;
        try {
            bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
            jDateChooserBirthDate.setDate(bdate);
        } catch (ParseException ex) {
            Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        int rowIndex;
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            rowIndex = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
            jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
            jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
            jComboBox_cour.setSelectedItem(model.getValueAt(rowIndex, 7).toString());
            if (model.getValueAt(rowIndex, 3).toString().equals("Male")) {
                jRadioButtonMale.setSelected(true);
                jRadioButtonFemale.setSelected(false);
            } else {
                jRadioButtonFemale.setSelected(true);
                jRadioButtonMale.setSelected(false);
            }
            Date bdate;
            try {
                bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
                jDateChooserBirthDate.setDate(bdate);
            } catch (ParseException ex) {
                Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileOutputStream excelPOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;
        JFileChooser excelFileChooser = new JFileChooser("C:\\Users\\Aukse\\Desktop");
        excelFileChooser.setDialogTitle("Save as");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xlsx", "xls", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(null);

        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
                Row headerRow = excelSheet.createRow(0);

                Cell headerCell = headerRow.createCell(0);
                headerCell.setCellValue("Id");

                headerCell = headerRow.createCell(1);
                headerCell.setCellValue("First Name");

                headerCell = headerRow.createCell(2);
                headerCell.setCellValue("Last Name");

                headerCell = headerRow.createCell(3);
                headerCell.setCellValue("Sex");

                headerCell = headerRow.createCell(4);
                headerCell.setCellValue("Birthdate");

                headerCell = headerRow.createCell(5);
                headerCell.setCellValue("Phone");

                headerCell = headerRow.createCell(6);
                headerCell.setCellValue("Address");

                headerCell = headerRow.createCell(7);
                headerCell.setCellValue("course");

                headerCell = headerRow.createCell(8);
                headerCell.setCellValue("was");
                DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();

                for (int i = 0; i < model1.getRowCount(); i++) {
                    XSSFRow excelRow = excelSheet.createRow(i);
                    for (int j = 0; j < model1.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow.createCell(j);

                        excelCell.setCellValue(Objects.toString(model1.getValueAt(i, j), ""));
                    }
                }
                excelPOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelPOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null, "Exported Successfully");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelPOU != null) {
                        excelPOU.close();
                    }
                    if (excelJTableExporter != null) {
                        excelJTableExporter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String excelFilePath = "C:\\Users\\Aukse\\Desktop\\at.xlsx";

        int batchSize = 20;

        Connection connection = null;

        try {
            long start = System.currentTimeMillis();

            FileInputStream inputStream = new FileInputStream(excelFilePath);

            Workbook workbook = new XSSFWorkbook(inputStream);

            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = firstSheet.iterator();

            connection = DriverManager.getConnection("jdbc:mysql://localhost/stdmgdb", "root", "");
            connection.setAutoCommit(false);

            String sql = "INSERT INTO student (id,first_name, last_name, sex, birthdate, phone, adress,course,was) VALUES (?,?,?, ?, ?, ?,?,?,?)";
            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            int count = 0;
            //rowIterator.next(); // skip the header row
            while (rowIterator.hasNext()) {
                Row nextRow = rowIterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                java.util.Date date = new java.util.Date();
                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();
                    int columnIndex = nextCell.getColumnIndex();
                    switch (columnIndex) {
                        case 0:
                            double id = nextCell.getNumericCellValue();
                            statement.setInt(1, (int) id);
                            break;
                        case 1:
                            String first_name = nextCell.getStringCellValue();
                            statement.setString(2, first_name);
                            break;
                        case 2:
                            String last_name = nextCell.getStringCellValue();
                            statement.setString(3, last_name);
                            break;
                        case 3:
                            String sex = nextCell.getStringCellValue();
                            statement.setString(4, sex);
                            break;
                        case 4:
                            nextCell = nextRow.getCell(4);
                            short x = workbook.createDataFormat().getFormat("yyyy-MM-dd;@");
                            CellStyle dateCellFormat = workbook.createCellStyle();
                            dateCellFormat.setDataFormat(x);
                            nextCell.setCellStyle(dateCellFormat);
                            DataFormatter dataFormatter = new DataFormatter();
                            String birthdate = dataFormatter.formatCellValue(nextCell).toString();
                            statement.setString(5, birthdate);
                            break;
                        case 5:
                            double phone = nextCell.getNumericCellValue();
                            statement.setInt(6, (int) phone);
                            break;
                        case 6:
                            String adress = nextCell.getStringCellValue();
                            statement.setString(7, adress);
                            break;
                        case 7:
                            String course = nextCell.getStringCellValue();
                            statement.setString(8, course);
                            String was = "";
                            statement.setString(9, was);
                            break;
      
                    }
                    
                }
                
                statement.addBatch();
                
                
                if (count % batchSize == 0) {
                    statement.executeBatch();
   
                }  
            }
            workbook.close();
            statement.executeBatch();
            connection.commit();
            connection.close();

            long end = System.currentTimeMillis();
            System.out.printf("Import done in %d ms\n", (end - start));

        } catch (IOException ex1) {
            System.out.println("Error reading file");
            ex1.printStackTrace();
        } catch (SQLException ex2) {
            System.out.println("Database error");
            ex2.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            PrintWriter pw = new PrintWriter(new File("C:\\Users\\Aukse\\Desktop\\abc.csv"));
            StringBuilder sb = new StringBuilder();
            Connection con = null;
            ResultSet rs = null;
            con = MyConnection.getConnection();
            PreparedStatement ps;
            String query = "select * from student";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                sb.append(rs.getString("Id"));
                sb.append(",");
                sb.append(rs.getString("first_name"));
                sb.append(",");
                sb.append(rs.getString("last_name"));
                sb.append(",");
                sb.append(rs.getString("sex"));
                sb.append(",");
                sb.append(rs.getString("birthdate"));
                sb.append(",");
                sb.append(rs.getString("phone"));
                sb.append(",");
                sb.append(rs.getString("adress"));
                sb.append(",");
                sb.append(rs.getString("course"));
                sb.append(",");
                sb.append(rs.getString("was"));
                sb.append("\r\n");

            }
            pw.write(sb.toString());
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String jdbcURL = "jdbc:mysql://localhost/stdmgdb";
        String username = "root";
        String password = "";

        String csvFilePath = "C:\\Users\\Aukse\\Desktop\\abc.csv";

        int batchSize = 20;

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {

            connection.setAutoCommit(false);

            String sql = "INSERT INTO student (id, first_name, last_name, sex, birthdate, phone, adress,course,was) VALUES (?,?,?, ?, ?, ?, ?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;

            int count = 0;

            //lineReader.readLine(); // skip header line
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String id = data[0];
                String first_name = data[1];
                String last_name = data[2];
                String sex = data[3];
                String birthdate = data[4];
                String phone = data[5];
                String adress = data[6];
                String course = data[7];

                String was = data.length == 9 ? data[8] : "";
                statement.setString(1, id);
                statement.setString(2, first_name);
                statement.setString(3, last_name);
                statement.setString(4, sex);

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try {
                    date = simpleDateFormat.parse(birthdate);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                String strDate = simpleDateFormat.format(date);  
                statement.setString(5, strDate);

                statement.setString(6, phone);

                statement.setString(7, adress);
                statement.setString(8, course);

                statement.setString(9, was);
                statement.addBatch();

                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
            }

            lineReader.close();

            // execute the remaining queries
            statement.executeBatch();

            connection.commit();
            connection.close();

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            ex.printStackTrace();

            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        takeattendance Addat = new takeattendance();
        Addat.setVisible(true);
        Addat.pack();
        Addat.setLocationRelativeTo(null);
        Addat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox_courActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_courActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_courActionPerformed

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
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JButton jButtonRemoveStudent;
    public static javax.swing.JComboBox jComboBox_cour;
    private com.toedter.calendar.JDateChooser jDateChooserBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_STD_ID;
    // End of variables declaration//GEN-END:variables
}
