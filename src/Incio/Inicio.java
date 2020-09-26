package Incio;

import ConexionJDBC.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import OperacionesBancarias.*;

public class Inicio extends javax.swing.JFrame {

    private int xx, xy;

    private String users;

    Consultar c = new Consultar();

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void run() {
        setVisible(true);
    }

    public void mostrarDatos(String usuario) {
        try {
            Conexion cone = new Conexion();
            Statement instrucion;
            instrucion = cone.getConexion().createStatement();

            ResultSet result;

            result = instrucion.executeQuery("select u.users,u.nombre,u.apellido,u.edad,c.numCuenta from usuario as u\n"
                    + "inner join cuenta_bancaria as c on c.users = u.users\n"
                    + "where u.users = '" + usuario + "'");

            while (result.next()) {
                users = result.getString(1);
                txtNombre2.setText(result.getString(2));
                txtApellido.setText(result.getString(3));
                txtEdad.setText("Edad: " + String.valueOf(result.getInt(4)));
                txtCuenta.setText("Cuenta : " + String.valueOf(result.getString(5)));

            }
            instrucion.close();
            result.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado! " + e.toString());
        }

    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Card = new javax.swing.JPanel();
        imgDepositar = new javax.swing.JLabel();
        imgRetirar = new javax.swing.JLabel();
        imgConsultar = new javax.swing.JLabel();
        imgTransfe = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCuenta = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        labelIcon1 = new necesario.LabelIcon();
        txtEdad = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JLabel();
        cerrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Card.setBackground(new java.awt.Color(125, 0, 229));
        jPanel1Card.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1CardMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1CardMouseMoved(evt);
            }
        });
        jPanel1Card.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgDepositar.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        imgDepositar.setForeground(new java.awt.Color(255, 255, 255));
        imgDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/depositar.png"))); // NOI18N
        imgDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgDepositarMouseClicked(evt);
            }
        });
        jPanel1Card.add(imgDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 160, 120));

        imgRetirar.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        imgRetirar.setForeground(new java.awt.Color(255, 255, 255));
        imgRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Retirar.png"))); // NOI18N
        imgRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetirarMouseClicked(evt);
            }
        });
        jPanel1Card.add(imgRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 160, 150));

        imgConsultar.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        imgConsultar.setForeground(new java.awt.Color(255, 255, 255));
        imgConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consultar.png"))); // NOI18N
        imgConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgConsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgConsultarMouseEntered(evt);
            }
        });
        jPanel1Card.add(imgConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 140, 160));

        imgTransfe.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        imgTransfe.setForeground(new java.awt.Color(255, 255, 255));
        imgTransfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transferir.png"))); // NOI18N
        imgTransfe.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transferir.png"))); // NOI18N
        imgTransfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgTransfeMouseClicked(evt);
            }
        });
        jPanel1Card.add(imgTransfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 170, 120));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Transferir");
        jPanel1Card.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 130, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Depositar");
        jPanel1Card.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 130, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Retirar");
        jPanel1Card.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 130, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consultar");
        jPanel1Card.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 130, 50));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCuenta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtCuenta.setForeground(new java.awt.Color(255, 255, 255));
        txtCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCuenta.setText("Cuenta  #: ");
        txtCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, 50));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setText("Apellido");
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 50));

        labelIcon1.setForeground(new java.awt.Color(125, 0, 229));
        labelIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        jPanel1.add(labelIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 150));

        txtEdad.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEdad.setText("Edad: ");
        txtEdad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 50));

        txtNombre2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre2.setText("Nombre");
        txtNombre2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 50));

        jPanel1Card.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 520));

        cerrar1.setBackground(new java.awt.Color(125, 0, 229));
        cerrar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cerrar1.setForeground(new java.awt.Color(255, 255, 255));
        cerrar1.setText("X");
        cerrar1.setToolTipText("");
        cerrar1.setBorder(null);
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar1.setFocusPainted(false);
        cerrar1.setInheritsPopupMenu(true);
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
        jPanel1Card.add(cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 50, 40));

        getContentPane().add(jPanel1Card, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1CardMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1CardMouseMoved
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1CardMouseMoved

    private void jPanel1CardMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1CardMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1CardMouseDragged

    private void imgConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgConsultarMouseEntered


    }//GEN-LAST:event_imgConsultarMouseEntered

    private void imgConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgConsultarMouseClicked
        
        Consultar consultar = new Consultar();
        consultar.mostrar(this.users);
        consultar.setVisible(true);


    }//GEN-LAST:event_imgConsultarMouseClicked

    private void imgDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgDepositarMouseClicked
        Depositar depositar = new Depositar();
        depositar.mostrar(this.users);
        depositar.setVisible(true);

    }//GEN-LAST:event_imgDepositarMouseClicked

    private void imgTransfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTransfeMouseClicked
        Transferir transferir = new Transferir();
        transferir.mostrarUsuario(users);
        transferir.setVisible(true);
    }//GEN-LAST:event_imgTransfeMouseClicked

    private void imgRetirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetirarMouseClicked
        Retirar retirar = new Retirar();
        retirar.mostrar(users);
        retirar.setVisible(true);
    }//GEN-LAST:event_imgRetirarMouseClicked

    private void cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseEntered
        cerrar1.setBackground(Color.red);
    }//GEN-LAST:event_cerrar1MouseEntered

    private void cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseExited
        cerrar1.setBackground(new Color(125, 0, 229));

    }//GEN-LAST:event_cerrar1MouseExited

    private void cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar1ActionPerformed

        int salir = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "", JOptionPane.YES_NO_OPTION);
        if (salir == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_cerrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar1;
    private javax.swing.JLabel imgConsultar;
    private javax.swing.JLabel imgDepositar;
    private javax.swing.JLabel imgRetirar;
    private javax.swing.JLabel imgTransfe;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel1Card;
    private necesario.LabelIcon labelIcon1;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtCuenta;
    private javax.swing.JLabel txtEdad;
    private javax.swing.JLabel txtNombre2;
    // End of variables declaration//GEN-END:variables

}
