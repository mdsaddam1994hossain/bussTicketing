/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusTekatManagement;

import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author User
 */
public class AdvanceTeketBoek extends javax.swing.JFrame implements MouseListener{

    /**
     * Creates new form AdvanceTeketBoek
     */
    public AdvanceTeketBoek() {
        initComponents();
        
        s1.addMouseListener(this);
        s2.addMouseListener(this);
        s3.addMouseListener(this);
        s4.addMouseListener(this);
        s5.addMouseListener(this);
        s6.addMouseListener(this);
        s7.addMouseListener(this);
        s8.addMouseListener(this);
        s9.addMouseListener(this);
        s10.addMouseListener(this);
        s11.addMouseListener(this);
        s12.addMouseListener(this);
        
        connect();
    }
 
    int seatno =0;
    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    public  void connect(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodproject", "j2ee", "1234");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdvanceTeketBoek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceTeketBoek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bill(){
    
        
        String custname= txcustname.getText();
        int seat= seatno;
        int price = Integer.parseInt(txprice.getText());
        
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(jCalendar1.getDate());
        
        jTextArea1.setText(jTextArea1.getText() +"**************************************\n");
        jTextArea1.setText(jTextArea1.getText() +"*****************Bill*****************\n");
        jTextArea1.setText(jTextArea1.getText() +"**************************************\n");
        jTextArea1.setText(jTextArea1.getText() + "customer name " +"\t"+ custname +"\n");
        jTextArea1.setText(jTextArea1.getText() + "customer seat No " +"\t"+ seat +"\n");
        jTextArea1.setText(jTextArea1.getText() + "Seat price " +"\t"+ price +"\n");
        jTextArea1.setText(jTextArea1.getText() + "Jurny Date " +"\t"+ date +"\n"); 
        jTextArea1.setText(jTextArea1.getText() +" ***************************************\n");
        jTextArea1.setText(jTextArea1.getText() +"*****************thank you**************\n");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        s8 = new javax.swing.JLabel();
        s9 = new javax.swing.JLabel();
        s10 = new javax.swing.JLabel();
        s11 = new javax.swing.JLabel();
        s12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txcustname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        s1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s1.setText("1");

        s2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s2.setText("2");

        s3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s3.setText("3");

        s4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s4.setText("4");

        s5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s5.setText("5");

        s6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s6.setText("6");

        s7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s7.setText("7");

        s8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s8.setText("8");

        s9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s9.setText("9");

        s10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s10.setText("10");

        s11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s11.setText("11");

        s12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s12.setText("12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s7)
                    .addComponent(s1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s8)
                    .addComponent(s2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s10)
                    .addComponent(s4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s11)
                    .addComponent(s5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s12)
                    .addComponent(s6))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1)
                    .addComponent(s2)
                    .addComponent(s3)
                    .addComponent(s4)
                    .addComponent(s5)
                    .addComponent(s6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s7)
                    .addComponent(s8)
                    .addComponent(s9)
                    .addComponent(s10)
                    .addComponent(s11)
                    .addComponent(s12))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("Advance Bus Booking System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Price");

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(txprice, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txcustname, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txcustname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String custname= txcustname.getText();
        int seat= seatno;
        String x = String.valueOf(seat);
        int price = Integer.parseInt(txprice.getText());
        
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(jCalendar1.getDate());
        
        try {
         PreparedStatement pst= con.prepareStatement("select * from book where date =? and seatno=?");
            pst.setString(1, date);
            pst.setString(2, x);
            rs=pst.executeQuery();
            
            if(rs.next() == true){
                 JOptionPane.showMessageDialog(this, "this Seat no Already Booked");
            
            }else{
                pst = con.prepareStatement("insert into book(custname,seatno,price,date) values(?,?,?,?)");
                pst.setString(1, custname);
                pst.setInt(2, seat);
                pst.setInt(3, price);
                pst.setString(4, date);
                
               pst.executeUpdate();
                
               JOptionPane.showMessageDialog(this, "Seat Booked");
//                if(x==1){
//                     JOptionPane.showMessageDialog(this, "Seat Booked");
//                     bill();
//                }else{
//                     JOptionPane.showMessageDialog(this, "Something wrong");
//                }
        
        }
            
            
            
            
        } catch (SQLException ex) {
            ex.fillInStackTrace();
            Logger.getLogger(AdvanceTeketBoek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
        BookingSeatCheck sc= new BookingSeatCheck();
        sc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
     
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
     
        
        if(e.getSource() == s1){
         
            seatno = 1;
        }
        else if(e.getSource()==s2){
         seatno = 2;
        }
        else if(e.getSource()==s3){
         seatno = 3;
        }
        else if(e.getSource()==s4){
         seatno = 4;
        }
        else if(e.getSource()==s5){
         seatno = 5;
        }
        else if(e.getSource()==s6){
         seatno = 6;
        }
        else if(e.getSource()==s7){
         seatno = 7;
        }
        else if(e.getSource()==s8){
         seatno = 8;
        }
        else if(e.getSource()==s9){
         seatno = 9;
        }
        else if(e.getSource()==s10){
         seatno = 10;
        }
        else if(e.getSource()==s11){
         seatno = 11;
        }
        else if(e.getSource()==s12){
         seatno = 12;
        }
        
        
        JOptionPane.showMessageDialog(this, seatno);
        
        
        
        
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
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
            java.util.logging.Logger.getLogger(AdvanceTeketBoek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvanceTeketBoek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvanceTeketBoek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvanceTeketBoek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdvanceTeketBoek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s10;
    private javax.swing.JLabel s11;
    private javax.swing.JLabel s12;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JLabel s7;
    private javax.swing.JLabel s8;
    private javax.swing.JLabel s9;
    private javax.swing.JTextField txcustname;
    private javax.swing.JTextField txprice;
    // End of variables declaration//GEN-END:variables

    
}
