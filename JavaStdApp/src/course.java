
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Aukse
 */
public class course {
     public void insertUpdateDeleteStudent(char operation, Integer id,String label){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if(operation =='i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO `course`(`label`) VALUES (?)");

                ps.setString(1,label);
               
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"New Course added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }
     public void insertUpdateDeleteStudent1(char operation, Integer id,String fname,String lname,String sex, String bdate,
                                        String phone,String address, String course){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if(operation =='i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO course1 (first_name, last_name, sex, birthdate, phone, adress, course) VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);
                ps.setString(7, course);
                
                if(ps.executeUpdate() > 0){
                    ;//JOptionPane.showMessageDialog(null,"New Student added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            if(operation =='u')
        {
            try {
                ps = con.prepareStatement("UPDATE `course1` SET `first_name`= ?, `last_name`= ?, `sex`= ?, `birthdate`= ?, `phone`= ?, `adress`= ?, `course`= ? WHERE `id` = ?");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);
                ps.setString(7,course);
                ps.setInt(8,id);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Student Data updated");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
            if(operation =='d')
        {
            try {
                ps = con.prepareStatement("DELETE FROM `course1` WHERE `phone` = ?");
                ps.setString(1,phone);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Student deleted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                if(operation =='r')
        {
            try {
                ps = con.prepareStatement("DELETE FROM `course1`");
                if(ps.executeUpdate() > 0){
                    ;
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
     public void fillStudentJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course1` WHERE CONCAT(`first_name`, `last_name`, `phone`, `adress`)LIKE ?");
            ps.setString(1,"%"+valueToSearch+"%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
                row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     private int getCourseid (String courselabel)
     {
         int courseid = 0;
         
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         try{
         ps = con.prepareStatement("SELECT * FROM `course` WHERE `label` = ?");
         ps.setString(1,courselabel);
         ResultSet rs = ps.executeQuery();
         
         if(rs.next()){
             courseid = rs.getInt("Id");
         }
         } catch (SQLException ex) {
             Logger.getLogger(student.class.getName()).log(Level.SEVERE, null,ex);
         }
         
         return courseid;
     }
     public void fillCourseCombo(JComboBox combo)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` ");
           
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next()){
                combo.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
