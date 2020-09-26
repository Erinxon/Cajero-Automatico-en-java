package OperacionesBancarias;

import ConexionJDBC.Conexion;
import java.awt.Color;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Consultar extends javax.swing.JFrame {

    private int xx,xy;
    
    public Consultar() {
        initComponents();
        this.setLocationRelativeTo(null);
       
        

          
    }

    private Consultar(Frame parent, boolean modal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void mostrar(String usuario){   
        try{
       
            Conexion cone = new Conexion();           
            Statement instrucion;
            instrucion = cone.getConexion().createStatement();
            
            ResultSet result;
            result = instrucion.executeQuery("select * from cuenta_bancaria where users= '"+usuario+"' "); 
            while(result.next()){   
               
               this.textConsulatar.setText((Float.toString(result.getFloat(2))) + " RD$");   
            }
            instrucion.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado! " + e.toString());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cerrar3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textConsulatar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        cerrar3.setBackground(new java.awt.Color(125, 0, 229));
        cerrar3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cerrar3.setForeground(new java.awt.Color(255, 255, 255));
        cerrar3.setText("X");
        cerrar3.setToolTipText("");
        cerrar3.setBorder(null);
        cerrar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar3.setFocusPainted(false);
        cerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar3MouseExited(evt);
            }
        });
        cerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Saldo disponible");

        textConsulatar.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        textConsulatar.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textConsulatar, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(textConsulatar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
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

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void cerrar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar3MouseEntered
        cerrar3.setBackground(Color.red);
    }//GEN-LAST:event_cerrar3MouseEntered

    private void cerrar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar3MouseExited
        cerrar3.setBackground(new Color(125,0,229));

    }//GEN-LAST:event_cerrar3MouseExited

    private void cerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar3ActionPerformed
        
    }//GEN-LAST:event_cerrar3ActionPerformed

    private void cerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar3MouseClicked
       
       setVisible(false);     
                 
    }//GEN-LAST:event_cerrar3MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textConsulatar;
    // End of variables declaration//GEN-END:variables

}
