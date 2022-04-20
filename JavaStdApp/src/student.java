
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aukse
 */
public class student {
   
    public void insertUpdateDeleteStudent(char operation, Integer id,String fname,String lname,String sex, String bdate,
                                        String phone,String address, String course,String was){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if(operation =='i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO student (first_name, last_name, sex, birthdate, phone, adress, course, was) VALUES (?,?,?,?,?,?,?,?)");
                
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);
                ps.setString(7, course);
                 ps.setString(8, was);
                
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"New Student added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            if(operation =='u')
        {
            try {
                ps = con.prepareStatement("UPDATE `student` SET `first_name`= ?, `last_name`= ?, `sex`= ?, `birthdate`= ?, `phone`= ?, `adress`= ?, `course`= ? WHERE `id` = ?");
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
                ps = con.prepareStatement("DELETE FROM `student` WHERE `id` = ?");
                ps.setInt(1,id);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Student deleted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
               if(operation =='c')
        {
            try {
                ps = con.prepareStatement("UPDATE `student` SET `was` = ?");
                ps.setString(1,was);
                
                if(ps.executeUpdate() > 0){
                    ;//JOptionPane.showMessageDialog(null,"Student deleted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                     if(operation =='y')
        {
            try {
                ps = con.prepareStatement("DELETE FROM `attendanceone`");
                if(ps.executeUpdate() > 0){
                    ;
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                                  if(operation =='j')
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
            ps = con.prepareStatement("SELECT * FROM `student` WHERE CONCAT(`first_name`, `last_name`, `phone`, `adress`, `course`)LIKE ?");
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
                //row[8] = rs.getString(9);

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   public void UpdateStudent(char operation, Integer id,String fname,String lname,String sex, String bdate,
                                        String phone,String address, String course,String was){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
            if(operation =='u')
        {
            try {
                ps = con.prepareStatement("UPDATE `student` SET `was`= ? WHERE `id` = ?");
                ps.setString(1,was);
                ps.setInt(2,id);
                
                if(ps.executeUpdate() > 0){
                    ;//JOptionPane.showMessageDialog(null,"Student Data updated");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
               if(operation =='d')
        {
            try {
                ps = con.prepareStatement("DELETE FROM `student` WHERE `phone` = ?");
                ps.setString(1,phone);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Student deleted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                   if(operation =='p')
        {
            try {
                ps = con.prepareStatement("UPDATE `student` SET `first_name`= ?, `last_name`= ?, `sex`= ?, `birthdate`= ?, `adress`= ?, `course`= ? WHERE `phone` = ?");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
               
                ps.setString(5, address);
                ps.setString(6,course);
                ps.setString(7,phone);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Student Data updated");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
            
        }
        
    public void filter(JTable table, String valueToSearch,String valueToSearch1)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM student WHERE  birthdate >= ? and birthdate <=  ? ");
            ps.setString(1,valueToSearch);
            ps.setString(2,valueToSearch1);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void filtergroup(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM student WHERE  course = ? ");
            ps.setString(1,valueToSearch);
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
                row = new Object[9];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void fillStudentJtableatt(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `student` WHERE CONCAT(`first_name`, `last_name`, `phone`, `adress`, `course`)LIKE ?");
            ps.setString(1,"%"+valueToSearch+"%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
                row = new Object[9];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void fillStudentJtableattendance(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `attendanceone` WHERE CONCAT(`first_name`, `last_name`, `phone`, `adress`, `course`)LIKE ?");
            ps.setString(1,"%"+valueToSearch+"%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
                row = new Object[9];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public void insertStudent(char operation, Integer id,String fname,String lname,String sex, String bdate,
                                        String phone,String address, String course,String date){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if(operation =='i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO attendanceone (first_name, last_name, sex, birthdate, phone, adress, course, date) VALUES (?,?,?,?,?,?,?,?)");
                
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);
                ps.setString(7, course);
                 ps.setString(8, date);
                
                
                if(ps.executeUpdate() > 0){
                    ;//JOptionPane.showMessageDialog(null,"New Student added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }
     public void filterlank(JTable table, String valueToSearch,String valueToSearch1)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM attendanceone WHERE  date >= ? and date <=  ? ");
            ps.setString(1,valueToSearch);
            ps.setString(2,valueToSearch1);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
                row = new Object[9];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
