/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dani
 */
public class ConsultarExistencias extends javax.swing.JFrame {

    static public ResultSet r;
    static public ResultSet r2;
    static public ResultSet r3;
    static public Connection connection;

    /**
     * Creates new form ConsultarExistencias
     */
    public ConsultarExistencias() throws SQLException {
        initComponents();
         String url ="jdbc:mysql://localhost:3306/tiendaanimales";
        String user="root";
        String contra="";
        connection = DriverManager.getConnection(url, user, contra);

        Statement s = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txt2 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        txt1 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("Nombre");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        nombre3.setEditable(false);
        getContentPane().add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 440, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Existencias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setText("Nombre");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mas", "Menos" }));
        getContentPane().add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 240, -1));

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar productos que tengan...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jButton3.setText("Anterior");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextField1.setText("0");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 82, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/foto2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 62, 51));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Existencias  o ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        nombre1.setEditable(false);
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 440, -1));

        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Nombre");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        nombre2.setEditable(false);
        getContentPane().add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 440, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/bosque.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int numeros = Integer.parseInt(jTextField1.getText());
            String mm = (String) combo1.getSelectedItem();
            String query = "", query2 = "", query3 = "";
            if (mm.equals("Mas")) {
                query = "SELECT cui.Nombre FROM Cuidados cui,articulos art WHERE art.Articulo=cui.Articulo AND art.Existencias>=" + numeros;
                query2 = "SELECT comp.Nombre FROM Complementos comp,articulos art WHERE art.Articulo=comp.Articulo AND art.Existencias>=" + numeros;
                query3 = "SELECT obj.Nombre FROM Objetos obj,articulos art WHERE art.Articulo=obj.Articulo AND art.Existencias>=" + numeros;
            } else {
                  query = "SELECT cui.Nombre FROM Cuidados cui,articulos art WHERE art.Articulo=cui.Articulo AND art.Existencias<=" + numeros;
                query2 = "SELECT comp.Nombre FROM Complementos comp,articulos art WHERE art.Articulo=comp.Articulo AND art.Existencias<=" + numeros;
                query3 = "SELECT obj.Nombre FROM Objetos obj,articulos art WHERE art.Articulo=obj.Articulo AND art.Existencias<=" + numeros;
            }

            Statement s = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement s2 = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement s3 = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            r = s.executeQuery(query);
            r2 = s2.executeQuery(query2);
            r3 = s3.executeQuery(query3);
            
            if (r.first()) {                
                                       
                    nombre1.setText(r.getString("cui.Nombre"));
                
            } 
            if (r3.first()) {                
                                  
                    nombre3.setText(r3.getString("obj.Nombre"));
                
            } 
            if (r2.first()) {     
                                      
                    nombre2.setText(r2.getString("comp.Nombre"));
               
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarExistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char a = evt.getKeyChar();
        if (!Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
              if (r.next()) {                
                                       
                    nombre1.setText(r.getString("cui.Nombre"));
                
            } 
            if (r3.next()) {                
                                  
                    nombre3.setText(r3.getString("obj.Nombre"));
                
            } 
            if (r2.next()) {     
                                      
                    nombre2.setText(r2.getString("comp.Nombre"));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarExistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
               if (r.previous()) {                
                                       
                    nombre1.setText(r.getString("cui.Nombre"));
                
            } 
            if (r3.previous()) {                
                                  
                    nombre3.setText(r3.getString("obj.Nombre"));
                
            } 
            if (r2.previous()) {     
                                      
                    nombre2.setText(r2.getString("comp.Nombre"));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarExistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.setVisible(false);
        log.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Menu menyo=new Menu();
        this.setVisible(false);
        menyo.setVisible(true);
        menyo.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombre3;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
}
