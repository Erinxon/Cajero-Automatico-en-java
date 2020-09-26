package OperacionesBancarias;
import ConexionJDBC.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Depositar extends javax.swing.JFrame {

   
    OpeacionesBD opeacionesBD = new OpeacionesBD();
    
    private int xx,xy;
    private int numCuenta;
    


    public Depositar() {
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
        jLabel1 = new javax.swing.JLabel();
        cerrar1 = new javax.swing.JButton();
        textDepositar = new RSMaterialComponent.RSTextFieldIconOne();
        btnDepositar = new newscomponents.RSButtonFlat_new();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Depositar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 78));

        cerrar1.setBackground(new java.awt.Color(125, 0, 229));
        cerrar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cerrar1.setForeground(new java.awt.Color(255, 255, 255));
        cerrar1.setText("X");
        cerrar1.setToolTipText("");
        cerrar1.setBorder(null);
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar1.setFocusPainted(false);
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar1MouseExited(evt);
            }
        });
        cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 47, 41));

        textDepositar.setForeground(new java.awt.Color(0, 0, 0));
        textDepositar.setBorderColor(new java.awt.Color(125, 0, 229));
        textDepositar.setColorIcon(new java.awt.Color(125, 0, 229));
        textDepositar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textDepositar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        textDepositar.setPlaceholder("Digite el dinero a depositar");
        textDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDepositarActionPerformed(evt);
            }
        });
        textDepositar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDepositarKeyTyped(evt);
            }
        });
        jPanel1.add(textDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 131, 370, 50));

        btnDepositar.setBackground(new java.awt.Color(125, 0, 229));
        btnDepositar.setText("Depositar");
        btnDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepositarMouseClicked(evt);
            }
        });
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
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

    private void cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseEntered
        cerrar1.setBackground(Color.red);
    }//GEN-LAST:event_cerrar1MouseEntered

    private void cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseExited
        cerrar1.setBackground(new Color(125,0,229));

    }//GEN-LAST:event_cerrar1MouseExited

    private void cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar1ActionPerformed
        
    }//GEN-LAST:event_cerrar1ActionPerformed

    private void cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseClicked
        
        setVisible(false);
    }//GEN-LAST:event_cerrar1MouseClicked

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void textDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDepositarActionPerformed
        
    }//GEN-LAST:event_textDepositarActionPerformed

    private void btnDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositarMouseClicked
        if(!textDepositar.getText().equals("")){
            
            float dinero = Float.parseFloat(textDepositar.getText());
            if(dinero>10000000){
                JOptionPane.showMessageDialog(null,"Esta excediendo el limite de deposito\nSolo puedes depositar en el rango de 100 y 9999999","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                if(dinero<100){                 
                    JOptionPane.showMessageDialog(null,"Esta excediendo el minimo de deposito\nSolo puedes depositar en el rango de 100 y 9999999","Error",JOptionPane.ERROR_MESSAGE);
                }else{                 
                    opeacionesBD.retirar_depositar(numCuenta, dinero, "{CALL depositar(?,?)}");
                    JOptionPane.showMessageDialog(null,"Diposito realizado con éxito!");
                    textDepositar.setText("");
                }
                
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Error, El campo parece estar vacio\nIntentelo nuevamente","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDepositarMouseClicked

    private void textDepositarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDepositarKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car>'.')) evt.consume();
    }//GEN-LAST:event_textDepositarKeyTyped

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnDepositar;
    private javax.swing.JButton cerrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private RSMaterialComponent.RSTextFieldIconOne textDepositar;
    // End of variables declaration//GEN-END:variables
}
