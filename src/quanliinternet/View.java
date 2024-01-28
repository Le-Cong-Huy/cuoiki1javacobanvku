/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanliinternet;
//import java.lang.System.Logger;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
public class View extends javax.swing.JFrame {
    public View() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jTable1.setDefaultEditor(Object.class, null); // không cho chỉnh sửa table
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanliinternet","root","Leconghuy050813");
            Statement st = con.createStatement();
            String query = "SELECT * FROM quanliinternet.bangtable ORDER BY CAST(ID AS UNSIGNED) ASC";  //ORDER BY CAST(ID AS UNSIGNED) ASC sắp cột id theo thứ tự từ nhỏ đến lớn 
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int column= rsmd.getColumnCount();
            String[] columnName = new String[column];
            for(int i=0;i<column;i++)
                columnName[i] =rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(columnName);
                String ID,Name,Sex,PhoneNumber,Address,HoursofUse,TotalAmount;
            while(rs.next()){
            ID=rs.getString(1);
                Name=rs.getString(2);
                Sex=rs.getString(3);
                PhoneNumber=rs.getString(4);
                Address=rs.getString(5);
                HoursofUse=rs.getString(6);
                TotalAmount=rs.getString(7);
                String[] row = {ID,Name,Sex,PhoneNumber,Address,HoursofUse,TotalAmount};
                model.addRow(row);
            }
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
    }
    /*
     hàm do netbeans tạo ra không chỉnh sửa được
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        thembutton = new javax.swing.JButton();
        suabutton = new javax.swing.JButton();
        xoabutton = new javax.swing.JButton();
        timkiembutton = new javax.swing.JButton();
        tinhtienbutton = new javax.swing.JButton();
        lammoibuuton = new javax.swing.JButton();
        thoatbutton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        namradio = new javax.swing.JRadioButton();
        nuradio = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        idtextfield = new javax.swing.JTextField();
        tentextfield = new javax.swing.JTextField();
        sdttextfield = new javax.swing.JTextField();
        diachitextfield = new javax.swing.JTextField();
        sogiosudungtextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lí Internet");
        setPreferredSize(new java.awt.Dimension(825, 600));
        getContentPane().setLayout(null);

        thembutton.setBackground(new java.awt.Color(13, 236, 231));
        thembutton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        thembutton.setText("Add");
        thembutton.setPreferredSize(new java.awt.Dimension(160, 34));
        thembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thembuttonActionPerformed(evt);
            }
        });
        getContentPane().add(thembutton);
        thembutton.setBounds(0, 120, 190, 60);

        suabutton.setBackground(new java.awt.Color(255, 51, 255));
        suabutton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        suabutton.setText("Edit");
        suabutton.setPreferredSize(new java.awt.Dimension(112, 23));
        suabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suabuttonActionPerformed(evt);
            }
        });
        getContentPane().add(suabutton);
        suabutton.setBounds(0, 190, 190, 60);

        xoabutton.setBackground(new java.awt.Color(255, 153, 51));
        xoabutton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        xoabutton.setText("Delete");
        xoabutton.setPreferredSize(new java.awt.Dimension(112, 23));
        xoabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoabuttonActionPerformed(evt);
            }
        });
        getContentPane().add(xoabutton);
        xoabutton.setBounds(0, 260, 190, 60);

        timkiembutton.setBackground(new java.awt.Color(51, 255, 51));
        timkiembutton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        timkiembutton.setText("Search");
        timkiembutton.setPreferredSize(new java.awt.Dimension(112, 23));
        timkiembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiembuttonActionPerformed(evt);
            }
        });
        getContentPane().add(timkiembutton);
        timkiembutton.setBounds(0, 330, 190, 60);

        tinhtienbutton.setBackground(new java.awt.Color(255, 102, 102));
        tinhtienbutton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        tinhtienbutton.setText("Prepare The Bill");
        tinhtienbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tinhtienbutton.setBorderPainted(false);
        tinhtienbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tinhtienbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtienbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(tinhtienbutton);
        tinhtienbutton.setBounds(0, 50, 190, 60);

        lammoibuuton.setBackground(new java.awt.Color(255, 255, 0));
        lammoibuuton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lammoibuuton.setText("Refesh");
        lammoibuuton.setPreferredSize(new java.awt.Dimension(112, 23));
        lammoibuuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lammoibuutonActionPerformed(evt);
            }
        });
        getContentPane().add(lammoibuuton);
        lammoibuuton.setBounds(0, 400, 190, 60);

        thoatbutton.setBackground(new java.awt.Color(0, 51, 153));
        thoatbutton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        thoatbutton.setText("Exit");
        thoatbutton.setPreferredSize(new java.awt.Dimension(112, 23));
        thoatbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(thoatbutton);
        thoatbutton.setBounds(0, 470, 190, 60);

        jLabel18.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel18.setText("ID");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(240, 50, 50, 50);

        jLabel19.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel19.setText("Name");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(230, 90, 70, 50);

        jLabel20.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel20.setText("PhoneNumber");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(196, 130, 110, 50);

        jLabel21.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel21.setText("Address");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(490, 60, 80, 30);

        jLabel22.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel22.setText("Hours of Use");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(480, 90, 110, 50);

        jLabel23.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel23.setText("Sex");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(500, 130, 60, 50);

        buttonGroup2.add(namradio);
        namradio.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        namradio.setText("Male");
        getContentPane().add(namradio);
        namradio.setBounds(690, 130, 80, 50);

        buttonGroup2.add(nuradio);
        nuradio.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        nuradio.setText("Female");
        getContentPane().add(nuradio);
        nuradio.setBounds(590, 130, 80, 50);

        jLabel14.setFont(new java.awt.Font("Segoe WP Black", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText("Internet Management");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(220, -20, 440, 90);
        getContentPane().add(idtextfield);
        idtextfield.setBounds(310, 60, 160, 30);
        getContentPane().add(tentextfield);
        tentextfield.setBounds(310, 100, 160, 30);

        sdttextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdttextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(sdttextfield);
        sdttextfield.setBounds(310, 140, 160, 30);

        diachitextfield.setPreferredSize(new java.awt.Dimension(64, 26));
        diachitextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diachitextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(diachitextfield);
        diachitextfield.setBounds(590, 60, 160, 30);

        sogiosudungtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sogiosudungtextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(sogiosudungtextfield);
        sogiosudungtextfield.setBounds(590, 100, 160, 30);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(600, 350));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 180, 600, 350);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanliinternet/sieudep.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-250, 0, 1190, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thembuttonActionPerformed
        them();
    }//GEN-LAST:event_thembuttonActionPerformed

    private void suabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suabuttonActionPerformed
        sua();
    }//GEN-LAST:event_suabuttonActionPerformed

    private void xoabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoabuttonActionPerformed
        xoa();
    }//GEN-LAST:event_xoabuttonActionPerformed

    private void timkiembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiembuttonActionPerformed
        timkiem();
    }//GEN-LAST:event_timkiembuttonActionPerformed

    private void tinhtienbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhtienbuttonActionPerformed
        // TODO add your handling code here:
        String sex = "";
        if(namradio.isSelected()){
            sex+="Male";}
        if(nuradio.isSelected()){
            sex+="Female";}
        String id = idtextfield.getText();
        String sogiosudung = sogiosudungtextfield.getText();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please Enter ID!");
            return ;
        }
        String name = tentextfield.getText();
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please Enter Name!");
            return ;
        }
        String sdt =sdttextfield.getText();
        if(sdt.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please Enter phoneNumber!");
            return ;
        }
        String diachi = diachitextfield.getText();
        if(diachi.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please Enter Address!");
            return ;
        }
        if(sogiosudung.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please Enter Hours of Use!");
            return ;
        }
        int giatienmoigio = 5000;
        double x = giatienmoigio * Double.parseDouble(sogiosudung);
        //        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //        model.addRow(new Object[]{model.getRowCount()+1,name,sex,sdt,diachi,sogiosudung,x});
        //        jTable1.setModel(model);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanliinternet","root","Leconghuy050813");
            PreparedStatement pst ;
            pst = con.prepareStatement("insert into bangtable(ID,Name,Sex,PhoneNumber,Address,HoursofUse,TotalAmount)values(?,?,?,?,?,?,?)");
            pst.setString(1, idtextfield.getText());
            pst.setString(2, tentextfield.getText());
            pst.setString(3, sex);
            pst.setString(4, sdttextfield.getText());
            pst.setString(5, diachitextfield.getText());
            pst.setString(6, sogiosudungtextfield.getText());
            pst.setDouble(7, x);
            pst.executeUpdate();
            getdatatable();
            JOptionPane.showMessageDialog(rootPane, "Billing successfully");

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tinhtienbuttonActionPerformed

    private void lammoibuutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lammoibuutonActionPerformed
        // TODO add your handling code here:
        lammoi();
    }//GEN-LAST:event_lammoibuutonActionPerformed

    private void thoatbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatbuttonActionPerformed
        thoat();
    }//GEN-LAST:event_thoatbuttonActionPerformed

    private void diachitextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diachitextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diachitextfieldActionPerformed

    private void sogiosudungtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sogiosudungtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sogiosudungtextfieldActionPerformed

    private void sdttextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdttextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdttextfieldActionPerformed
        private void them(){
        String id = JOptionPane.showInputDialog("ID");
        String ten = JOptionPane.showInputDialog("Name");
        String gioitinh = JOptionPane.showInputDialog("Sex");
        String sdt = JOptionPane.showInputDialog("PhoneNumber");
        String diachi = JOptionPane.showInputDialog("Address");
        String sogiosudung = JOptionPane.showInputDialog("Hours of Use");
        int sotienmoigio = 5000;
        double x = sotienmoigio*Double.parseDouble(sogiosudung);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanliinternet","root","Leconghuy050813");
            // Kiểm tra xem ID đã tồn tại trong cơ sở dữ liệu hay chưa
        String checkQuery = "SELECT COUNT(*) FROM bangtable WHERE ID = ?";
        PreparedStatement checkStatement = con.prepareStatement(checkQuery);
        checkStatement.setString(1, id);
        ResultSet resultSet = checkStatement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        if (count > 0) {
            // ID đã tồn tại, báo lỗi
            JOptionPane.showMessageDialog(null, "ID already exists. Cannot insert duplicate ID.");
        }
        else{
            //PreparedStatement pst ;
            PreparedStatement pst = con.prepareStatement("insert into bangtable(ID,Name,Sex,PhoneNumber,Address,HoursofUse,TotalAmount)values(?,?,?,?,?,?,?)");
            pst.setString(1,id);
            pst.setString(2,ten);
            pst.setString(3,gioitinh);
            pst.setString(4,sdt);
            pst.setString(5,diachi);
            pst.setString(6,sogiosudung);
            pst.setDouble(7,x );
            pst.executeUpdate();
            getdatatable();
            JOptionPane.showMessageDialog(rootPane, " Add success !");
        }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    private void sua(){
        //String newid  ="";
        String newten ="";
        String newgt="";
        String newsdt="";
        String newdiachi="";
        String newsogiosudung="";
        Double x =0.0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int sua = jTable1.getSelectedRow();
        if(sua!=-1){
            int sotienmoigio = 5000;
            //String id = jTable1.getValueAt(sua,0).toString();
            String ten = jTable1.getValueAt(sua,1).toString();
            String gt = jTable1.getValueAt(sua,2).toString();
            String sdt = jTable1.getValueAt(sua,3).toString();
            String diachi = jTable1.getValueAt(sua,4).toString();
            String sogiosudung = jTable1.getValueAt(sua,5).toString();
            //newid =JOptionPane.showInputDialog("Please enter a new ID",id);
            newten = JOptionPane.showInputDialog("Please enter a new name",ten);
            newgt = JOptionPane.showInputDialog("Please enter a new gender",gt);
            newsdt = JOptionPane.showInputDialog("Please enter new phone number",sdt);
            newdiachi = JOptionPane.showInputDialog("Please enter a new address",diachi);
            newsogiosudung = JOptionPane.showInputDialog("Please enter new access hours",sogiosudung);
            //jTable1.setValueAt(newid, sua,0);
            jTable1.setValueAt(newten, sua,1);
            jTable1.setValueAt(newgt, sua,2);
            jTable1.setValueAt(newsdt, sua,3);
            jTable1.setValueAt(newdiachi, sua,4);
            jTable1.setValueAt(newsogiosudung, sua,5);
            x = sotienmoigio*Double.parseDouble(newsogiosudung);
            jTable1.setValueAt(x, sua,6 );
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Please enter and select 1 row to edit!");
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanliinternet","root","Leconghuy050813");
            PreparedStatement pst ;
            pst = con.prepareStatement("UPDATE bangtable SET Name=? ,Sex=?, PhoneNumber=?, Address=?, HoursofUse=? ,TotalAmount=? WHERE ID=?");
            pst.setString(1, newten);
            pst.setString(2, newgt);
            pst.setString(3, newsdt);
            pst.setString(4, newdiachi);
            pst.setString(5, newsogiosudung);
            pst.setDouble(6, x);
            pst.setInt(7, Integer.parseInt(jTable1.getValueAt(sua, 0).toString()));     
            pst.executeUpdate();
            getdatatable();
            JOptionPane.showMessageDialog(rootPane, "Successfully fixed!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);

        }
    }    private void xoa (){
        //        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        //        int xoa = jTable1.getSelectedRow();
        //        if(xoa!=-1){
        //            model.removeRow(xoa); 
        //        }
        //        else{
        //            JOptionPane.showMessageDialog(rootPane, "Please select 1 row to delete");
        //        }
        //        JOptionPane.showMessageDialog(rootPane, "Delete success!");
        //String xoa = JOptionPane.showInputDialog("Nhập ID cần xoá ");
        String xoa = JOptionPane.showInputDialog("Please enter the ID to delete");
        if(xoa!=null){
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            boolean found = false ;
            for(int i=0; i<model.getRowCount();i++){
                String id = model.getValueAt(i, 0).toString();
                if(id.equals(xoa)){
                    jTable1.setRowSelectionInterval(i, i);
                    found = true;
                    break;
                }
            }
            if(found){
                JOptionPane.showMessageDialog(rootPane, "ID deleted "+xoa);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "ID not found "+xoa);
            }
        }
        try {
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/quanliinternet","root","Leconghuy050813");
            PreparedStatement pst ;
            pst = con.prepareStatement("delete from bangtable where ID =?");
            pst.setString(1, xoa );
            pst.executeUpdate();
            getdatatable();
            // JOptionPane.showMessageDialog(rootPane, "Delete success!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    private void timkiem(){
        String timkiemid = JOptionPane.showInputDialog("Please enter the ID to search");
        if(timkiemid!=null){
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            boolean found = false ;
            for(int i=0; i<model.getRowCount();i++){
                String id = model.getValueAt(i, 0).toString();
                if(id.equals(timkiemid)){
                    jTable1.setRowSelectionInterval(i, i);
                    found = true;
                    break;
                }
            }
            if(found){
                JOptionPane.showMessageDialog(rootPane, "ID found "+timkiemid);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "ID not found "+timkiemid);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Please enter the ID to search");
        }
    }    private void thoat(){
         int choose =JOptionPane.showConfirmDialog(rootPane, "Do you want to escape or not?");
        if(choose==JOptionPane.YES_OPTION){
            new login().setVisible(true);
        this.dispose();
        }
        else {
           
        }
    }    public  void getdatatable(){
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanliinternet","root","Leconghuy050813");
            PreparedStatement pst ;
            Statement st = con.createStatement();
            String query = "SELECT * FROM quanliinternet.bangtable ORDER BY CAST(ID AS UNSIGNED) ASC";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // xoa du lieu trong bang
            int column= rsmd.getColumnCount();
            String[] columnName = new String[column];
            for(int i=0;i<column;i++)
                columnName[i] =rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(columnName);
                String ID,Name,Sex,PhoneNumber,Address,HoursofUse,TotalAmount;
            while(rs.next()){
            ID=rs.getString(1);
                Name=rs.getString(2);
                Sex=rs.getString(3);
                PhoneNumber=rs.getString(4);
                Address=rs.getString(5);
                HoursofUse=rs.getString(6);
                TotalAmount=rs.getString(7);
                String[] row = {ID,Name,Sex,PhoneNumber,Address,HoursofUse,TotalAmount};
                model.addRow(row);
            }
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
    }    private void lammoi(){
    idtextfield.setText("");
    sogiosudungtextfield.setText("");
    tentextfield.setText("");
    sdttextfield.setText("");
    diachitextfield.setText("");
    }    
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField diachitextfield;
    private javax.swing.JTextField idtextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton lammoibuuton;
    private javax.swing.JRadioButton namradio;
    private javax.swing.JRadioButton nuradio;
    private javax.swing.JTextField sdttextfield;
    private javax.swing.JTextField sogiosudungtextfield;
    private javax.swing.JButton suabutton;
    private javax.swing.JTextField tentextfield;
    private javax.swing.JButton thembutton;
    private javax.swing.JButton thoatbutton;
    private javax.swing.JButton timkiembutton;
    private javax.swing.JButton tinhtienbutton;
    private javax.swing.JButton xoabutton;
    // End of variables declaration//GEN-END:variables
}
