package OperacionesBancarias;
import ConexionJDBC.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Transferir extends javax.swing.JFrame {

    int xx,xy;
    private int numCuenta;
     
    OpeacionesBD opeacionesBD = new OpeacionesBD();
    private float saldo;
    
    public Transferir() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void mostrarUsuario(String usuario){   
        try{
            String consulta = "select cuenta_bancaria.numCuenta,cuenta_bancaria.saldo from usuario\n" +
            "inner join cuenta_bancaria on cuenta_bancaria.users = usuario.users\n" +
            "where usuario.users = '"+usuario+"' ";
            Conexion cone = new Conexion();           
            Statement instrucion;
            instrucion = cone.getConexion().createStatement();
            
            ResultSet result;
            result = instrucion.executeQuery(consulta); 
            while(result.next()){               
                this.numCuenta = result.getInt(1);
                this.saldo = result.getFloat(2);
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
        btnTransferir = new newscomponents.RSButtonFlat_new();
        textTransferir = new RSMaterialComponent.RSTextFieldIconOne();
        textNumeroCuenta = new RSMaterialComponent.RSTextFieldOne();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transferir");

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

        btnTransferir.setBackground(new java.awt.Color(125, 0, 229));
        btnTransferir.setText("Transferir");
        btnTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransferirMouseClicked(evt);
            }
        });
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        textTransferir.setForeground(new java.awt.Color(0, 0, 0));
        textTransferir.setBorderColor(new java.awt.Color(125, 0, 229));
        textTransferir.setColorIcon(new java.awt.Color(125, 0, 229));
        textTransferir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textTransferir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        textTransferir.setPlaceholder("Digite el dinero a retirar");
        textTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTransferirActionPerformed(evt);
            }
        });
        textTransferir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTransferirKeyTyped(evt);
            }
        });

        textNumeroCuenta.setForeground(new java.awt.Color(0, 0, 0));
        textNumeroCuenta.setBorderColor(new java.awt.Color(125, 0, 229));
        textNumeroCuenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textNumeroCuenta.setPlaceholder("Digite la cuenta del destinatario");
        textNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNumeroCuentaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(103, Short.MAX_VALUE)
                    .addComponent(textTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(83, 83, 83)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(textNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(textTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnTransferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirMouseClicked
     
    }//GEN-LAST:event_btnTransferirMouseClicked

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed

        try{
            int numero = Integer.valueOf(textNumeroCuenta.getText());
            float dinero = Float.parseFloat(textTransferir.getText());
            if(opeacionesBD.validarNumeroCuenta(numero)){
                if(numCuenta==numero){
                   JOptionPane.showMessageDialog(null,"No puedes transferirte dinero a tu propia cuenta","Error",JOptionPane.ERROR_MESSAGE);
                }else{   
                    if(dinero>saldo){
                        JOptionPane.showMessageDialog(null,"Estas intentando transferir una cantidad de dinero mayor a la que tienes!"+
                        "\nTu saldo es de: '"+saldo+"'","Error",JOptionPane.ERROR_MESSAGE);
                    }else{
                        opeacionesBD.transferir(numCuenta, dinero, numero);  
                        this.textTransferir.setText("");
                        textNumeroCuenta.setText("");
                        JOptionPane.showMessageDialog(null,"Transferencia realizada con éxito!");
                    }
                    
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Ese numero de cuenta no existe\nen nuestra base de datos","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Todos los campos son requeridos\nIntentelo nuevamente","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void textTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTransferirActionPerformed
        
    }//GEN-LAST:event_textTransferirActionPerformed

    private void textTransferirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTransferirKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.')) evt.consume();
    }//GEN-LAST:event_textTransferirKeyTyped

    private void textNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNumeroCuentaKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car>'.')) evt.consume();
    }//GEN-LAST:event_textNumeroCuentaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnTransferir;
    private javax.swing.JButton cerrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private RSMaterialComponent.RSTextFieldOne textNumeroCuenta;
    private RSMaterialComponent.RSTextFieldIconOne textTransferir;
    // End of variables declaration//GEN-END:variables
}
