/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import Conexion.Metodos_sql;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Panel_modificar extends javax.swing.JPanel {

    Metodos_sql metodo = new Metodos_sql();
    String ruta="";
    /**
     * Creates new form Panel_modificar
     */
    public Panel_modificar() {
        initComponents();
    }

    public void limpiar(){
        jTextBuscar.setText("");
        jTextNombre.setText("");
        jTextCosto.setText("");
        jTextCantidad.setText("");
        jLabelImagen.setIcon(null);
    }
    
    public void setjTextBuscar(String dato){
        jTextBuscar.setText(dato);
    }
    
    public String getjTextBuscar(){
        return jTextBuscar.getText();
    }
    
    public void setjTextNombre(String dato){
        jTextNombre.setText(dato);
    }
    
    public String getjTextNombre(){
        return jTextNombre.getText();
    }
    
    public void setjTextCosto(String dato){
        jTextCosto.setText(dato);
    }
    
    public String getjTextCosto(){
        return jTextCosto.getText();
    }
    
    public void setjTextCantidad(String dato){
        jTextCantidad.setText(dato);
    }
    
    public String getjTextCantidad(){
        return jTextCantidad.getText();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        jLabelImagen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jButtonUrl = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Modificar producto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre del producto");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Costo del producto");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Imagen:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jTextNombre.setBorder(null);
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jPanel3.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cantidad");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jTextCantidad.setBorder(null);
        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        jPanel3.add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, 30));

        jTextCosto.setBorder(null);
        jTextCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCostoActionPerformed(evt);
            }
        });
        jPanel3.add(jTextCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, 30));
        jPanel3.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 220, 190));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 240, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Imagen del producto:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jButtonUrl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_folder_32px.png"))); // NOI18N
        jButtonUrl.setText("Abrir");
        jButtonUrl.setContentAreaFilled(false);
        jButtonUrl.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUrlActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 100, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 680, 460));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16))); // NOI18N

        jButtonBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_buscar_producto.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_actualizar_producto.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setContentAreaFilled(false);
        jButtonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonActualizar))
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButtonBuscar)
                .addGap(39, 39, 39)
                .addComponent(jButtonActualizar)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 200, 460));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel8.setText("Producto:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jTextBuscar.setBorder(null);
        jPanel2.add(jTextBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 82, 220, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 112, 220, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 850, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadActionPerformed

    private void jTextCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostoActionPerformed

    private void jButtonUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUrlActionPerformed
        JFileChooser buscar = new JFileChooser();
        int resultado = buscar.showOpenDialog(this);
        if(resultado==JFileChooser.APPROVE_OPTION){
            ruta = buscar.getSelectedFile().getAbsolutePath();
            jLabelImagen.setIcon(new ImageIcon(ruta));
        }
    }//GEN-LAST:event_jButtonUrlActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String buscador=jTextBuscar.getText();
        if(!buscador.isEmpty()){
            String[] datos = Metodos_sql.lanzarProducto(buscador,jLabelImagen);
            jTextNombre.setText(datos[0]);
            jTextCosto.setText(datos[1]);
            jTextCantidad.setText(datos[2]);
        }else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el nombre del producto");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        String nombre = jTextBuscar.getText();
        String producto = jTextNombre.getText();
        if(!nombre.isEmpty()){
            if(!(producto.equals("No existe") && jTextCosto.getText().equals("No existe") && jTextCantidad.getText().equals("No existe"))){
                double precio = Double.parseDouble(jTextCosto.getText());
                int cantidad = Integer.parseInt(jTextCantidad.getText());
                try {
                    metodo.actualizarProducto(nombre, producto, precio, cantidad, ruta);
                    limpiar();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Panel_modificar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El producto no existe");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe ingresar los datos del producto");
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonUrl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
