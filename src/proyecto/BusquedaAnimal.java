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
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author AlumMati
 */
public class BusquedaAnimal extends javax.swing.JFrame {
static public ResultSet r;
static public ResultSet r2;
static public ResultSet r3;
static public ResultSet r4;
static public Connection connection;
    /**
     * Creates new form BusquedaAnimal
     */
    public BusquedaAnimal() throws SQLException {
        initComponents();
             
          Connection con = null;
       String url ="jdbc:mysql://localhost:3306/tiendaanimales";
        String user="root";
        String contra="";
        connection = DriverManager.getConnection(url,user,contra);
        
        Statement s = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        metodoquery();
        cosa();
    }
    public void metodoquery() throws SQLException{
         DefaultComboBoxModel value1 = new DefaultComboBoxModel();
         String query="SELECT * FROM animales";
         Statement s = connection.createStatement();            
         r = s.executeQuery(query);
         while(r.next()){
            value1.addElement(r.getString("Animal"));
         }
         combo1.setModel(value1); 
         
    }
    public int calcularIdAnimal() throws SQLException{
        String Animalico=(String) combo1.getSelectedItem();
          String query="SELECT IdAnimal FROM animales WHERE Animal ='"+Animalico+"'";
         Statement s2 = connection.createStatement();            
         r2 = s2.executeQuery(query);
         r2.first();
         return r2.getInt("IdAnimal");
    }
    public void  cosa() throws SQLException{
        int idloco=calcularIdAnimal();
       String consultaca="SELECT Nombre,Descripcion FROM complementos WHERE Tipo="+idloco;
       String consultaca1="SELECT Nombre,Descripcion FROM cuidados WHERE Tipo="+idloco;
       Statement s3 = connection.createStatement();   
       Statement s4 = connection.createStatement(); 
       r3= s3.executeQuery(consultaca);
       r4=s4.executeQuery(consultaca1);
       DefaultListModel<String> model = new DefaultListModel<>();
       while(r3.next()){
           if(r3.getString("Nombre")!=null){
             model.addElement(r3.getString("Nombre")+" "+r3.getString("Descripcion"));  
           }
       }
       while(r4.next()){         
           if(r4.getString("Nombre")!=null){
             model.addElement(r4.getString("Nombre")+" "+r4.getString("Descripcion"));  
           }
       }
       
  
   lista.setModel(model);
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/foto2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 62, 51));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 390, 70, -1));

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        getContentPane().add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 390, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda por Animal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Animal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 390, 280));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/bosque.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
    try {
       cosa();
    } catch (SQLException ex) {
        Logger.getLogger(BusquedaAnimal.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_combo1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.setVisible(false);      
        log.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu menyo=new Menu();
        this.setVisible(false);
        menyo.setVisible(true);
        menyo.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
