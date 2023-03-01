/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logi;

import Conexion.Metodos_sql;
import Metodos.TextPrompt;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jorge
 */
public class Contactos extends javax.swing.JInternalFrame {

    Metodos_sql metodo = new Metodos_sql();
    boolean aceptar = false;
    Color rojoo = new Color(255,142,142);
    Color rojito = new Color(249,24,83);
    Color azulito = new Color(0,162,232);
    Color rojis = new Color(248,66,85);
    Color blancoo = new Color(255,255,255);
    Color verdesito = new Color(84,180,106);
    boolean ingreso=false;
    String datoCedula="";
    /**
     * Creates new form Contactos
     */
    
    FondoPanel fondo = new FondoPanel();
    
    public Contactos() { 
        this.setContentPane(fondo);
        
        initComponents();
        
        TextPrompt text = new TextPrompt("Campo obligatorio",jTextNombre);
        TextPrompt text1 = new TextPrompt("Campo obligatorio",jTextCorreo);
        TextPrompt text2 = new TextPrompt("Campo obligatorio",jTextTelefono);
        TextPrompt text3 = new TextPrompt("Campo obligatorio",jTextCedula);
        TextPrompt text4 = new TextPrompt("Campo obligatorio",jTextDireccion);
        jTableMostrar.setModel(metodo.mostrarContacto());
    }

    public void validar(){
        if(jTextNombre.getText().isEmpty()){
            jTextNombre.setBackground(rojoo);
        }
        if(jTextDireccion.getText().isEmpty()){
            jTextDireccion.setBackground(rojoo);
        }
        if(jTextTelefono.getText().isEmpty()){
            jTextTelefono.setBackground(rojoo);
        }
        if(jTextCedula.getText().isEmpty()){
            jTextCedula.setBackground(rojoo);
        }

        if(jTextCorreo.getText().isEmpty()){
            jTextCorreo.setBackground(rojoo);
            aceptar = true;
        }
    }
    
    public void limpiar(){
        jTextNombre.setText("");
        jTextDireccion.setText("");
        jTextTelefono.setText("");
        jTextCedula.setText("");
        jTextCorreo.setText("");
    }
    
    public void verContacto(){
        int columna = jTableMostrar.getSelectedRow();
        int fila = jTableMostrar.getSelectedColumnCount();
        if(fila<1){
            
        }else{
            jTextNombre.setText(jTableMostrar.getValueAt(columna, 0).toString());
            jTextDireccion.setText(jTableMostrar.getValueAt(columna, 1).toString());
            jTextTelefono.setText(jTableMostrar.getValueAt(columna, 2).toString());
            jTextCedula.setText(jTableMostrar.getValueAt(columna, 4).toString());
            jTextCorreo.setText(jTableMostrar.getValueAt(columna, 3).toString());
            datoCedula = jTextCedula.getText();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextCorreo = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Direccion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jTextNombre.setBorder(null);
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, 30));

        jTextDireccion.setBorder(null);
        jTextDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 292, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Numero celular");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Correo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jTextCorreo.setBorder(null);
        jTextCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCorreoKeyReleased(evt);
            }
        });
        jPanel1.add(jTextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 292, 30));

        jTextTelefono.setBorder(null);
        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 126, 180, 30));

        jButtonGuardar.setBackground(new java.awt.Color(0, 162, 232));
        jButtonGuardar.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseExited(evt);
            }
        });
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 80, 30));

        jButtonBuscar.setBackground(new java.awt.Color(0, 162, 232));
        jButtonBuscar.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseExited(evt);
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 80, 30));

        jButtonEliminar.setBackground(new java.awt.Color(0, 162, 232));
        jButtonEliminar.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseExited(evt);
            }
        });
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 80, 30));

        jButtonActualizar.setBackground(new java.awt.Color(0, 162, 232));
        jButtonActualizar.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setBorder(null);
        jButtonActualizar.setBorderPainted(false);
        jButtonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarMouseExited(evt);
            }
        });
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 90, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Cedula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextCedula.setBorder(null);
        jTextCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(jTextCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Registro de Contactos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 290, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 157, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 290, 10));

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMostrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 240, 620, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String nombre = jTextNombre.getText();
        String direccion = jTextDireccion.getText();
        String telefono = jTextTelefono.getText();
        String correo = jTextCorreo.getText();
        String cedula = jTextCedula.getText();
        if(nombre.equals("") || direccion.equals("") || telefono.equals("") || correo.equals("") || cedula.equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar todas las casillas");
        }else{
            if(jTextTelefono.getText().substring(0, 2).equals("09")){
                if(ingreso){
                    int resultado = metodo.compararCedula(cedula);
                    if(resultado==0){
                        int opcion = metodo.guardarContacto(nombre, direccion, telefono, correo, cedula);
                        if(opcion>0){
                            JOptionPane.showMessageDialog(null, "Usuario Guardado");
                            jTableMostrar.setModel(metodo.mostrarContacto());
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al guardar");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "El numero de cedula ya existe");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Correo no valaido");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Numero celular no valido");
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyReleased
        jTextNombre.setBackground(Color.white);
    }//GEN-LAST:event_jTextNombreKeyReleased

    private void jTextCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCedulaKeyTyped
        int key = evt.getKeyChar();
        if(key>=48 && key<=57 || key==8){
            if(jTextCedula.getText().length()>=10){
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }else{
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextCedulaKeyTyped

    private void jTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyTyped
        int key = evt.getKeyChar();
        if(key>=48 && key<=57 || key==8){
            if(jTextTelefono.getText().length()>=10){
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }else{
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key>=65 && key<=90;
        boolean minusculas = key>=97 && key<=122;
        if(!(mayusculas || minusculas || key==32 || key==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDireccionKeyTyped
        /*int key = evt.getKeyChar();
        boolean mayusculas = key>=65 && key<=90;
        boolean minusculas = key>=97 && key<=122;
        if(!(mayusculas || minusculas || key==32 || key==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }*/
    }//GEN-LAST:event_jTextDireccionKeyTyped

    private void jTextDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDireccionKeyReleased
        jTextDireccion.setBackground(Color.white);
    }//GEN-LAST:event_jTextDireccionKeyReleased

    private void jTextTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyReleased
        jTextTelefono.setBackground(Color.white);
    }//GEN-LAST:event_jTextTelefonoKeyReleased

    private void jTextCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCorreoKeyReleased
        if(jTextCorreo.getText().isEmpty()){
            jTextCorreo.setBackground(blancoo);
        }else{
            if(!jTextCorreo.getText().contains("@") || !jTextCorreo.getText().contains(".")){
                jTextCorreo.setBackground(rojis);
            }else{
                jTextCorreo.setBackground(verdesito);
                ingreso=true;
            }
        }
    }//GEN-LAST:event_jTextCorreoKeyReleased

    private void jTextCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCedulaKeyReleased
        jTextCedula.setBackground(Color.white);
    }//GEN-LAST:event_jTextCedulaKeyReleased

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int resultado = 0;
        datoCedula = jTextCedula.getText();
        if(datoCedula.equals("")){
            JOptionPane.showMessageDialog(null, "Debe escribir la cedula del contacto en la casilla correspondiente");
            limpiar();
        }else{
            if(datoCedula.length() == 10){
                resultado = metodo.eliminarContacto(datoCedula);
                if(resultado>0){
                    jTableMostrar.setModel(metodo.mostrarContacto());
                }
            }else{
                JOptionPane.showMessageDialog(null, "La cedula ingresada no es valida");
                limpiar();
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTableMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMostrarMouseClicked
        verContacto();
    }//GEN-LAST:event_jTableMostrarMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String[] datos = new String[5];
        datos = Metodos_sql.buscarContacto(jTextNombre.getText());
        jTextNombre.setText(datos[0]);
        jTextDireccion.setText(datos[1]);
        jTextTelefono.setText(datos[2]);
        jTextCorreo.setText(datos[3]);
        jTextCedula.setText(datos[4]);
        datoCedula="";
        if(jTextCedula.getText().equals("No existe")){
            
        }else{
            datoCedula = jTextCedula.getText();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        String nombre = jTextNombre.getText();
        String direccion = jTextDireccion.getText();
        String telefono = jTextTelefono.getText();
        String correo = jTextCorreo.getText();
        String cedula = jTextCedula.getText();
        metodo.actualizarContacto(datoCedula, nombre, direccion, telefono, cedula, correo);
        jTableMostrar.setModel(metodo.mostrarContacto());
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseEntered
        jButtonGuardar.setBackground(rojito);
    }//GEN-LAST:event_jButtonGuardarMouseEntered

    private void jButtonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseExited
        jButtonGuardar.setBackground(azulito);
    }//GEN-LAST:event_jButtonGuardarMouseExited

    private void jButtonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseEntered
        jButtonBuscar.setBackground(rojito);
    }//GEN-LAST:event_jButtonBuscarMouseEntered

    private void jButtonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseEntered
        jButtonEliminar.setBackground(rojito);
    }//GEN-LAST:event_jButtonEliminarMouseEntered

    private void jButtonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarMouseEntered
        jButtonActualizar.setBackground(rojito);
    }//GEN-LAST:event_jButtonActualizarMouseEntered

    private void jButtonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseExited
        jButtonBuscar.setBackground(azulito);
    }//GEN-LAST:event_jButtonBuscarMouseExited

    private void jButtonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseExited
        jButtonEliminar.setBackground(azulito);
    }//GEN-LAST:event_jButtonEliminarMouseExited

    private void jButtonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarMouseExited
        jButtonActualizar.setBackground(azulito);
    }//GEN-LAST:event_jButtonActualizarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTableMostrar;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/img/wallpaper_img.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
