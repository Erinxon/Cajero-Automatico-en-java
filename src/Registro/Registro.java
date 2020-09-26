package Registro;

import InicoSesion.InciarSesion;
import Validaciones.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Registro extends javax.swing.JFrame {

    int xx,xy;
 
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.btnRegistrarse.setCursor(new Cursor( Cursor.DEFAULT_CURSOR));
        this.cerrar1.setCursor(new Cursor( Cursor.DEFAULT_CURSOR));
    }

    public void run() {
        new Registro().setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarse = new newscomponents.RSButtonFlat_new();
        jLabel1 = new javax.swing.JLabel();
        textPassDos = new RSMaterialComponent.RSPasswordIconTwo();
        textPassUno = new RSMaterialComponent.RSPasswordIconTwo();
        textApellido = new RSMaterialComponent.RSTextFieldIconTwo();
        textUser = new RSMaterialComponent.RSTextFieldIconTwo();
        textEdad = new RSMaterialComponent.RSTextFieldIconTwo();
        textNombre = new RSMaterialComponent.RSTextFieldIconTwo();
        cerrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarse.setBackground(new java.awt.Color(125, 0, 229));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 520, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrate!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 46));

        textPassDos.setForeground(new java.awt.Color(0, 0, 0));
        textPassDos.setBorderColor(new java.awt.Color(125, 0, 229));
        textPassDos.setColorIcon(new java.awt.Color(125, 0, 229));
        textPassDos.setPlaceholder("Repetir Contraseña");
        jPanel1.add(textPassDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        textPassUno.setForeground(new java.awt.Color(0, 0, 0));
        textPassUno.setBorderColor(new java.awt.Color(125, 0, 229));
        textPassUno.setColorIcon(new java.awt.Color(125, 0, 229));
        textPassUno.setPlaceholder("Contraseña");
        jPanel1.add(textPassUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        textApellido.setForeground(new java.awt.Color(0, 0, 0));
        textApellido.setBorderColor(new java.awt.Color(125, 0, 229));
        textApellido.setColorIcon(new java.awt.Color(125, 0, 229));
        textApellido.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        textApellido.setPlaceholder("Apellido");
        jPanel1.add(textApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        textUser.setForeground(new java.awt.Color(0, 0, 0));
        textUser.setBorderColor(new java.awt.Color(125, 0, 229));
        textUser.setColorIcon(new java.awt.Color(125, 0, 229));
        textUser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        textUser.setPlaceholder("Elige un nombre de usuario");
        jPanel1.add(textUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        textEdad.setForeground(new java.awt.Color(0, 0, 0));
        textEdad.setBorderColor(new java.awt.Color(125, 0, 229));
        textEdad.setColorIcon(new java.awt.Color(125, 0, 229));
        textEdad.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TIMER);
        textEdad.setPlaceholder("Edad");
        textEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textEdadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEdadKeyTyped(evt);
            }
        });
        jPanel1.add(textEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        textNombre.setForeground(new java.awt.Color(0, 0, 0));
        textNombre.setBorderColor(new java.awt.Color(125, 0, 229));
        textNombre.setColorIcon(new java.awt.Color(125, 0, 229));
        textNombre.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        textNombre.setPlaceholder("Nombre");
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

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
        jPanel1.add(cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

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

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        try{
            Registrarse re = new Registrarse();
            Usuario validarUser = new Usuario();
            String u = this.textUser.getText();
            String n = this.textNombre.getText();
            String a = this.textApellido.getText();
            String p1 = this.textPassUno.getText();
            String p2 = this.textPassDos.getText();
            String e =  this.textEdad.getText();   
            
            if(!u.equals("") && !n.equals("") && !a.equals("") && !p1.equals(e) && !p2.equals("") && !e.equals("")){
                if(p1.equals(p2) || p2.equals(p1)){
                    if(validarUser.validarUsuario(u)){
                        this.textUser.setForeground(Color.red);
                        JOptionPane.showMessageDialog(null,"Ese usuario existe en nuestra base de datos\nIntente con otro","Error",JOptionPane.ERROR_MESSAGE);
                    }else{                      
                        try {
                            this.textUser.setForeground(Color.black);
                            re.registroUsuarios(u,n,a,p1,Integer.parseInt(e)); 
                            this.btnRegistrarse.setCursor(new Cursor( Cursor.WAIT_CURSOR));
                            Thread.sleep(3000);
                            JOptionPane.showMessageDialog(null,"Cuenta creada correctamente\nSerá redirigido automaticamente\nal panel de inicio de sesión ","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
                            InciarSesion sesion = new InciarSesion();
                            sesion.setVisible(true);
                            this.setVisible(false);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                   
                }else{
                    
                    JOptionPane.showMessageDialog(null,"Las contraseñas deben ser iguales","Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Todos los campos son requeridos","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Error, Ocurrio un error, por favor\nverifique los datos introducidos" +
                    "","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void textEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEdadKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_textEdadKeyTyped

    private void textEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEdadKeyPressed
       if(textEdad.getText().length()>=2)
       {
           textEdad.setText(textEdad.getText().substring(0, 1));
       }
    }//GEN-LAST:event_textEdadKeyPressed

    private void cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseEntered
        cerrar1.setBackground(Color.red);
    }//GEN-LAST:event_cerrar1MouseEntered

    private void cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseExited
        cerrar1.setBackground(new Color(51,51,51));

    }//GEN-LAST:event_cerrar1MouseExited

    private void cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrar1ActionPerformed

    

  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnRegistrarse;
    private javax.swing.JButton cerrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private RSMaterialComponent.RSTextFieldIconTwo textApellido;
    private RSMaterialComponent.RSTextFieldIconTwo textEdad;
    private RSMaterialComponent.RSTextFieldIconTwo textNombre;
    private RSMaterialComponent.RSPasswordIconTwo textPassDos;
    private RSMaterialComponent.RSPasswordIconTwo textPassUno;
    private RSMaterialComponent.RSTextFieldIconTwo textUser;
    // End of variables declaration//GEN-END:variables

}
