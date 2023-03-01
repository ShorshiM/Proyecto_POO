package Ventanas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import logi.Login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jorge
 */
public class Form_principal extends javax.swing.JFrame {

    Login log = new Login();
    Color azulSelec = new Color(84,127,206);
    Color azulNoSelec = new Color(71,120,197);
    Panel_nuevo_usuario nuevoUsuario = new Panel_nuevo_usuario();
    Panel_buscar buscarProducto = new Panel_buscar();
    Panel_eliminar eliminarProducto = new Panel_eliminar();
    Panel_modificar modificarProducto = new Panel_modificar();
    CardLayout vista;
    Date fecha1 = new Date();
    
    boolean buscar = buscarProducto.getjTextBuscar().isEmpty();
    boolean eliminar = eliminarProducto.getjTextBuscar().isEmpty() && eliminarProducto.getjTextCantidad().isEmpty() && eliminarProducto.getjTextCosto().isEmpty() && eliminarProducto.getjTextNombre().isEmpty();
    boolean modificar = modificarProducto.getjTextBuscar().isEmpty() && modificarProducto.getjTextCantidad().isEmpty() && modificarProducto.getjTextCosto().isEmpty() && modificarProducto.getjTextNombre().isEmpty();
    boolean nuevo = nuevoUsuario.getjTextCantidad().isEmpty() && nuevoUsuario.getjTextCosto().isEmpty() && nuevoUsuario.getjTextNombre().isEmpty();
    
    /**
     * Creates new form Form_principal
     */
    public Form_principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        animacion().start();
        pintarMes();
        vista = (CardLayout) jPanelVistaPrincipal.getLayout();
    }

    public void pintarMes(){
        SimpleDateFormat form = new SimpleDateFormat("dd/MM");
        jLabelMes.setText(form.format(fecha1));
    }
    
    public Timer animacion(){
        Timer time = new Timer(1000, (ActionEvent e) -> {
            Date fecha = new Date();
            if(fecha.getMinutes()<10){
                if(fecha.getSeconds()<10){
                    jLabelFecha.setText(fecha.getHours()+":"+"0"+fecha.getMinutes()+":"+"0"+fecha.getSeconds());
                }else{
                    jLabelFecha.setText(fecha.getHours()+":"+"0"+fecha.getMinutes()+":"+fecha.getSeconds());
                }
            }else{
                if(fecha.getSeconds()<10){
                    jLabelFecha.setText(fecha.getHours()+":"+fecha.getMinutes()+":"+"0"+fecha.getSeconds());
                }else{
                    jLabelFecha.setText(fecha.getHours()+":"+fecha.getMinutes()+":"+fecha.getSeconds());
                }
            }
        });
        return time;
    }
    
    Color rojoo = new Color(249,24,83);
    
    public void vaciar(){
        buscarProducto.setjTextBuscar("");
        eliminarProducto.setjTextBuscar("");
        eliminarProducto.setjTextNombre("");
        eliminarProducto.setjTextCosto("");
        eliminarProducto.setjTextCantidad("");
        modificarProducto.setjTextBuscar("");
        modificarProducto.setjTextNombre("");
        modificarProducto.setjTextCosto("");
        modificarProducto.setjTextCantidad("");
        nuevoUsuario.setjTextNombre("");
        nuevoUsuario.setjTextCosto("");
        nuevoUsuario.setjTextCantidad("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonModificarUsuario = new javax.swing.JButton();
        jButtonNuevoUsuario = new javax.swing.JButton();
        jButtonBuscarUsuario = new javax.swing.JButton();
        jButtonEliminarUsuario = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelMes = new javax.swing.JLabel();
        jPanelVistaPrincipal = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(56, 75, 94));

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonModificarUsuario.setBackground(new java.awt.Color(71, 120, 197));
        jButtonModificarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_modificar_usuario.png"))); // NOI18N
        jButtonModificarUsuario.setText("Modificar datos del producto");
        jButtonModificarUsuario.setBorder(null);
        jButtonModificarUsuario.setBorderPainted(false);
        jButtonModificarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonModificarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonModificarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonModificarUsuarioMouseExited(evt);
            }
        });
        jButtonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 308, 50));

        jButtonNuevoUsuario.setBackground(new java.awt.Color(71, 120, 197));
        jButtonNuevoUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_agregar_usuario_1.png"))); // NOI18N
        jButtonNuevoUsuario.setText("Nuevo producto");
        jButtonNuevoUsuario.setBorder(null);
        jButtonNuevoUsuario.setBorderPainted(false);
        jButtonNuevoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoUsuarioMouseExited(evt);
            }
        });
        jButtonNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 308, 50));

        jButtonBuscarUsuario.setBackground(new java.awt.Color(71, 120, 197));
        jButtonBuscarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_buscar.png"))); // NOI18N
        jButtonBuscarUsuario.setText("Buscar producto");
        jButtonBuscarUsuario.setBorder(null);
        jButtonBuscarUsuario.setBorderPainted(false);
        jButtonBuscarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonBuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBuscarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBuscarUsuarioMouseExited(evt);
            }
        });
        jButtonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 308, 50));

        jButtonEliminarUsuario.setBackground(new java.awt.Color(71, 120, 197));
        jButtonEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_eliminar_usuario.png"))); // NOI18N
        jButtonEliminarUsuario.setText("Eliminar producto");
        jButtonEliminarUsuario.setBorder(null);
        jButtonEliminarUsuario.setBorderPainted(false);
        jButtonEliminarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonEliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarUsuarioMouseExited(evt);
            }
        });
        jButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 308, 50));

        jButtonCerrar.setBackground(new java.awt.Color(71, 120, 197));
        jButtonCerrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_cerrar.png"))); // NOI18N
        jButtonCerrar.setText("Cerrar Sesión");
        jButtonCerrar.setBorderPainted(false);
        jButtonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCerrarMouseExited(evt);
            }
        });
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 308, 50));

        jPanel5.setBackground(new java.awt.Color(120, 168, 252));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_calendario.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Administrador");

        jLabelFecha.setFont(new java.awt.Font("Roboto Thin", 0, 36)); // NOI18N

        jLabelMes.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMes, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 308, 190));

        jPanelVistaPrincipal.setBackground(new java.awt.Color(244, 242, 245));
        jPanelVistaPrincipal.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(71, 120, 197));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Principal");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelVistaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelVistaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarMouseEntered
        jButtonCerrar.setForeground(rojoo);
        jButtonCerrar.setBackground(azulSelec);
    }//GEN-LAST:event_jButtonCerrarMouseEntered

    private void jButtonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarMouseExited
        jButtonCerrar.setForeground(Color.white);
        jButtonCerrar.setBackground(azulNoSelec);
    }//GEN-LAST:event_jButtonCerrarMouseExited

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
                int result = JOptionPane.showConfirmDialog(null, "Seguro que quiere Salir", "EXIT", dialog);
                if(result == 0){
                    this.dispose();
                    log.setVisible(true);
                }
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarUsuarioActionPerformed
        if(nuevo && eliminar && buscar){
            vaciar();
            jPanelVistaPrincipal.removeAll();
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
            
            jPanelVistaPrincipal.add(modificarProducto,"modificacion");
            vista.show(jPanelVistaPrincipal, "modificacion");
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
        }else{
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Tiene datos llenados quiere salir?", "EXIT", dialog);
            if(result == 0){
                vaciar();
                jPanelVistaPrincipal.removeAll();
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();

                jPanelVistaPrincipal.add(modificarProducto,"modificacion");
                vista.show(jPanelVistaPrincipal, "modificacion");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            }
        }
    }//GEN-LAST:event_jButtonModificarUsuarioActionPerformed

    private void jButtonNuevoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoUsuarioMouseEntered
        jButtonNuevoUsuario.setBackground(azulSelec);
    }//GEN-LAST:event_jButtonNuevoUsuarioMouseEntered

    private void jButtonModificarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarUsuarioMouseEntered
        jButtonModificarUsuario.setBackground(azulSelec);
    }//GEN-LAST:event_jButtonModificarUsuarioMouseEntered

    private void jButtonEliminarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarUsuarioMouseEntered
        jButtonEliminarUsuario.setBackground(azulSelec);
    }//GEN-LAST:event_jButtonEliminarUsuarioMouseEntered

    private void jButtonBuscarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuarioMouseEntered
        jButtonBuscarUsuario.setBackground(azulSelec);
    }//GEN-LAST:event_jButtonBuscarUsuarioMouseEntered

    private void jButtonNuevoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoUsuarioMouseExited
        jButtonNuevoUsuario.setBackground(azulNoSelec);
    }//GEN-LAST:event_jButtonNuevoUsuarioMouseExited

    private void jButtonModificarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarUsuarioMouseExited
        jButtonModificarUsuario.setBackground(azulNoSelec);
    }//GEN-LAST:event_jButtonModificarUsuarioMouseExited

    private void jButtonEliminarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarUsuarioMouseExited
        jButtonEliminarUsuario.setBackground(azulNoSelec);
    }//GEN-LAST:event_jButtonEliminarUsuarioMouseExited

    private void jButtonBuscarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuarioMouseExited
        jButtonBuscarUsuario.setBackground(azulNoSelec);
    }//GEN-LAST:event_jButtonBuscarUsuarioMouseExited

    private void jButtonNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoUsuarioActionPerformed
        if(eliminar && modificar && buscar){
            vaciar();
            jPanelVistaPrincipal.removeAll();
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
            
            jPanelVistaPrincipal.add(nuevoUsuario,"producto");
            vista.show(jPanelVistaPrincipal, "producto");
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
        }else{
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Tiene datos llenados quiere salir?", "EXIT", dialog);
            if(result == 0){
                vaciar();
                jPanelVistaPrincipal.removeAll();
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();

                jPanelVistaPrincipal.add(nuevoUsuario,"producto");
                vista.show(jPanelVistaPrincipal, "producto");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            }
        }
    }//GEN-LAST:event_jButtonNuevoUsuarioActionPerformed

    private void jButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarUsuarioActionPerformed
        if(nuevo && modificar && buscar){
            vaciar();
            jPanelVistaPrincipal.removeAll();
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
            
            jPanelVistaPrincipal.add(eliminarProducto,"eliminar");
            vista.show(jPanelVistaPrincipal, "eliminar");
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
        }else{
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Tiene datos llenados quiere salir?", "EXIT", dialog);
            if(result == 0){
                vaciar();
                jPanelVistaPrincipal.removeAll();
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();

                jPanelVistaPrincipal.add(eliminarProducto,"eliminar");
                vista.show(jPanelVistaPrincipal, "eliminar");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            }
        }
    }//GEN-LAST:event_jButtonEliminarUsuarioActionPerformed

    private void jButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuarioActionPerformed
        if(nuevo && eliminar && modificar){
            vaciar();
            jPanelVistaPrincipal.removeAll();
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
            
            jPanelVistaPrincipal.add(buscarProducto,"buscar");
            vista.show(jPanelVistaPrincipal, "buscar");
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
        }else{
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Tiene datos llenados quiere salir?", "EXIT", dialog);
            if(result == 0){
                vaciar();
                jPanelVistaPrincipal.removeAll();
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();

                jPanelVistaPrincipal.add(buscarProducto,"buscar");
                vista.show(jPanelVistaPrincipal, "buscar");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            }
        }
    }//GEN-LAST:event_jButtonBuscarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEliminarUsuario;
    private javax.swing.JButton jButtonModificarUsuario;
    private javax.swing.JButton jButtonNuevoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelVistaPrincipal;
    // End of variables declaration//GEN-END:variables
}