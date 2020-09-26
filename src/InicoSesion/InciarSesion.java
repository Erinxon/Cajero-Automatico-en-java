package InicoSesion;

import Incio.Inicio;
import Registro.Registro;
import Validaciones.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.*;

public class InciarSesion extends javax.swing.JFrame {
      
    int xx,xy;
 
    private String usuario;
    private String password;
    
    public InciarSesion() {
        initComponents();      
        this.setLocationRelativeTo(null);
        this.btnInicarSesion.setCursor(new Cursor( Cursor.DEFAULT_CURSOR));
        this.cerrar1.setCursor(new Cursor( Cursor.DEFAULT_CURSOR));
             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cerrar1 = new javax.swing.JButton();
        textUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textPass = new javax.swing.JPasswordField();
        textValidar = new javax.swing.JLabel();
        textRegistro = new javax.swing.JLabel();
        btnInicarSesion = new newscomponents.RSButtonFlat_new();

        rSButtonMaterialIconTwo1.setText("rSButtonMaterialIconTwo1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sin título-1.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No estas registrado?");

        cerrar1.setBackground(new java.awt.Color(51, 51, 51));
        cerrar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cerrar1.setForeground(new java.awt.Color(255, 255, 255));
        cerrar1.setText("X");
        cerrar1.setToolTipText("");
        cerrar1.setBorder(null);
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar1.setFocusPainted(false);
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
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

        textUser.setBackground(new java.awt.Color(51, 51, 51));
        textUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textUser.setForeground(new java.awt.Color(255, 255, 255));
        textUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(125, 0, 229)));
        textUser.setCaretColor(new java.awt.Color(255, 255, 255));
        textUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pass.png"))); // NOI18N

        textPass.setBackground(new java.awt.Color(51, 51, 51));
        textPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textPass.setForeground(new java.awt.Color(255, 255, 255));
        textPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(125, 0, 229)));
        textPass.setCaretColor(new java.awt.Color(255, 255, 255));
        textPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPassActionPerformed(evt);
            }
        });

        textValidar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        textValidar.setForeground(new java.awt.Color(255, 255, 255));
        textValidar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textRegistro.setForeground(new java.awt.Color(204, 204, 204));
        textRegistro.setText("Registrate");
        textRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textRegistroMouseExited(evt);
            }
        });

        btnInicarSesion.setBackground(new java.awt.Color(125, 0, 229));
        btnInicarSesion.setText("Inciar Sesion");
        btnInicarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textRegistro))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textUser, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPass))
                            .addComponent(btnInicarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(textValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPass, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(textValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

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

    private void cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrar1ActionPerformed

    private void textUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserActionPerformed
        
    }//GEN-LAST:event_textUserActionPerformed

    private void cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseEntered
        cerrar1.setBackground(Color.red);
    }//GEN-LAST:event_cerrar1MouseEntered

    private void cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseExited
        cerrar1.setBackground(new Color(51,51,51));
        
    }//GEN-LAST:event_cerrar1MouseExited

    private void textPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPassActionPerformed

    private void textRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistroMouseClicked
     
        Registro registrar = new Registro();        
        registrar.run(); 
        this.setVisible(false);
    }//GEN-LAST:event_textRegistroMouseClicked

    private void textRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistroMouseEntered
        this.textRegistro.setForeground(new Color(125,0,229));
    }//GEN-LAST:event_textRegistroMouseEntered

    private void textRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistroMouseExited
        this.textRegistro.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_textRegistroMouseExited

    private void btnInicarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicarSesionActionPerformed
        usuario = textUser.getText();
        password = textPass.getText();
        Usuario validarDatos = new Usuario();
        try{         
            if(!validarDatos.validarSesion(usuario,password)){
                textValidar.setText("Usuario o password incorrectos");
                textValidar.setForeground(Color.RED);
                
            }else{
                //this.btnInicarSesion.setCursor(new Cursor( Cursor.WAIT_CURSOR));
                //Thread.sleep(1000);
                textValidar.setText("Sesion iniciada correctamente");
                textValidar.setForeground(Color.GREEN);
                Inicio home = new Inicio();
                home.mostrarDatos(usuario);
                this.setVisible(false);
                home.run();
               
            }
         
        }catch(Exception e){           
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
    }//GEN-LAST:event_btnInicarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnInicarSesion;
    private javax.swing.JButton cerrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JLabel textRegistro;
    private javax.swing.JTextField textUser;
    private javax.swing.JLabel textValidar;
    // End of variables declaration//GEN-END:variables

  
}
