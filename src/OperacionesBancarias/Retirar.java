package OperacionesBancarias;

import ConexionJDBC.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Retirar extends javax.swing.JFrame {
    
    int xx,xy;

    OpeacionesBD opeacionesBD = new OpeacionesBD();
    private int numCuenta;
    private float saldo_cuenta;
    public Retirar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void mostrar(String usuario){   
        try{
            
            Conexion cone = new Conexion();           
            Statement instrucion;
            instrucion = cone.getConexion().createStatement();
            
            ResultSet result;
            result = instrucion.executeQuery("select * from cuenta_bancaria where users= '"+usuario+"' "); 
            while(result.next()){              
                this.numCuenta = result.getInt(1);
                this.saldo_cuenta = result.getFloat(2);
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
        textRetirar = new RSMaterialComponent.RSTextFieldIconOne();
        btnRetirar = new newscomponents.RSButtonFlat_new();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Retirar");

        textRetirar.setForeground(new java.awt.Color(0, 0, 0));
        textRetirar.setBorderColor(new java.awt.Color(125, 0, 229));
        textRetirar.setColorIcon(new java.awt.Color(125, 0, 229));
        textRetirar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textRetirar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        textRetirar.setPlaceholder("Digite el dinero a retirar");
        textRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRetirarActionPerformed(evt);
            }
        });
        textRetirar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRetirarKeyTyped(evt);
            }
        });

        btnRetirar.setBackground(new java.awt.Color(125, 0, 229));
        btnRetirar.setText("Retirar");
        btnRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetirarMouseClicked(evt);
            }
        });
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void textRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRetirarActionPerformed

    }//GEN-LAST:event_textRetirarActionPerformed

    private void btnRetirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarMouseClicked
        if(!textRetirar.getText().equals("")){            
            float dinero = Float.parseFloat(textRetirar.getText());
            if(dinero>saldo_cuenta){
                JOptionPane.showMessageDialog(null,"Estas intentando retirar una cantidad de dinero mayor a la que tienes!"+
                        "\nTu saldo es de: '"+saldo_cuenta+"'","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                opeacionesBD.retirar_depositar(numCuenta, dinero, "{CALL retirar(?,?)}");  
                JOptionPane.showMessageDialog(null,"Retiro realizado con éxito!","Retiro éxitoso",JOptionPane.INFORMATION_MESSAGE);
                textRetirar.setText("");
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Error, El campo parece estar vacio\nIntentelo nuevamente","Error",JOptionPane.ERROR_MESSAGE);   
        }
      

    }//GEN-LAST:event_btnRetirarMouseClicked

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void textRetirarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRetirarKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car>'.')) evt.consume();
    }//GEN-LAST:event_textRetirarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnRetirar;
    private javax.swing.JButton cerrar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private RSMaterialComponent.RSTextFieldIconOne textRetirar;
    // End of variables declaration//GEN-END:variables


}
