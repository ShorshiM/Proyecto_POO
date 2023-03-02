/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Metodos.TablaImagen;
import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class Metodos_sql {
    public static Conexion conexio = new Conexion();

    private static PreparedStatement sentenciaPreparada;
    private static ResultSet resultado;
    private static String sql;
    private static int resultadoNumero;
    private static String usuarioo;
    
    public int guardar(String nombre, String apellido, String email, String contraseña, String usuario){
        int resultado=0;
        Connection conexion = null;
        String sentenciaGuardar = ("INSERT INTO usuarios (usuario,nombre,apellido,password,email) VALUES (?,?,?,?,?)");
        
        try {
            conexion = Conexion.conectar();
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            
            sentenciaPreparada.setString(1, usuario);
            sentenciaPreparada.setString(2, nombre);
            sentenciaPreparada.setString(3, apellido);
            sentenciaPreparada.setString(4, contraseña);
            sentenciaPreparada.setString(5, email);
            
            resultado = sentenciaPreparada.executeUpdate();
            
            sentenciaPreparada.close();
            
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        
        return resultado;
    }
    
    public int guardarProducto(String nombre, double precio, int cantidad,String ruta){
        int resultado=0;
        Connection conexion=null;
        String guardarProducto = ("INSERT INTO productos (producto,precio,cantidad,imagen) VALUES (?,?,?,?)");
        FileInputStream rutaArchivo=null;
        try {
            conexion = Conexion.conectar();
            
            File file = new File(ruta);
            rutaArchivo = new FileInputStream(file);
            
            sentenciaPreparada = conexion.prepareStatement(guardarProducto);
            
            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setDouble(2, precio);
            sentenciaPreparada.setInt(3, cantidad);
            sentenciaPreparada.setBinaryStream(4, rutaArchivo);
            
            resultado = sentenciaPreparada.executeUpdate();
            
            sentenciaPreparada.close();
            conexion.close();
        } catch (FileNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return resultado;
    }
    
    public int guardarContacto(String nombre, String direccion, String telefono, String correo, String cedula){
        int resultado = 0;
        Connection conexion = null;
        String sentenciaGuardar = ("INSERT INTO contacto (nombre,direccion,telefono,correo,cedula,cliente) VALUES (?,?,?,?,?,?)");
        try {
            conexion = Conexion.conectar();
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            
            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setString(2, direccion);
            sentenciaPreparada.setString(3, telefono);
            sentenciaPreparada.setString(4, correo);
            sentenciaPreparada.setString(5, cedula);
            sentenciaPreparada.setString(6, usuarioo);
            
            resultado = sentenciaPreparada.executeUpdate();
            
            sentenciaPreparada.close();
            
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return resultado;
    }
    
    public DefaultTableModel mostrarContacto(){
        Statement st;
        Connection conexion = Conexion.conectar();
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Nombre");
        table.addColumn("Direccion");
        table.addColumn("Telefono");
        table.addColumn("Correo");
        table.addColumn("Cedula");
        String[] datos = new String[5];
        try {
            String sentencia = ("SELECT nombre,direccion,telefono,correo,cedula FROM contacto WHERE cliente = '"+usuarioo+"'");
            st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery(sentencia);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                table.addRow(datos);
            }
            
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showInternalConfirmDialog(null, "Error: "+e);
        }
        return table;
    }
    
    public void buscarProductos(JTable tabla, String producto){
        Statement st;
        Connection conexion = Conexion.conectar();
        DefaultTableModel table = new DefaultTableModel();
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        
        table.addColumn("Nombre");
        table.addColumn("Precio");
        table.addColumn("Cantidad");
        table.addColumn("Producto");
        Object[] datos = new Object[4];
        try {
            String sentencia = ("SELECT producto,precio,cantidad,imagen FROM productos WHERE producto ='"+producto+"'");
            st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery(sentencia);
            while(rs.next()){
                datos[0]=rs.getObject(1);
                datos[1]=rs.getObject(2);
                datos[2]=rs.getObject(3);
                Blob blob = (Blob) rs.getBlob(4);
                
                if(blob != null){
                    try {
                        byte[] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img =null;
                        try {
                            img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error: "+e);
                        }
                        ImageIcon icon = new ImageIcon(img);
                        datos[3] = new JLabel(icon);
                    } catch (SQLException e) {
                        datos[3]="No imagen";
                    }
                }else{
                    datos[3]="No imagen";
                }
                
                table.addRow(datos);
                tabla.setRowHeight(90);
            }
            
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showInternalConfirmDialog(null, "Error: "+e);
        }
        tabla.setModel(table);
    }
    
    public void mostrarProductos(JTable tabla){
        Statement st;
        Connection conexion = Conexion.conectar();
        DefaultTableModel table = new DefaultTableModel();
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        
        table.addColumn("Nombre");
        table.addColumn("Precio");
        table.addColumn("Cantidad");
        table.addColumn("Producto");
        Object[] datos = new Object[4];
        try {
            String sentencia = ("SELECT * FROM productos");
            st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery(sentencia);
            while(rs.next()){
                datos[0]=rs.getObject(2);
                datos[1]=rs.getObject(3);
                datos[2]=rs.getObject(4);
                Blob blob = (Blob) rs.getBlob(5);
                
                if(blob != null){
                    try {
                        byte[] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img =null;
                        try {
                            img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error: "+e);
                        }
                        ImageIcon icon = new ImageIcon(img);
                        datos[3] = new JLabel(icon);
                    } catch (SQLException e) {
                        datos[3]="No imagen";
                    }
                }else{
                    datos[3]="No imagen";
                }
                
                table.addRow(datos);
                tabla.setRowHeight(90);
            }
            
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showInternalConfirmDialog(null, "Error: "+e);
        }
        tabla.setModel(table);
    }
    
    public static String[] lanzarProducto(String producto, JLabel label){
        Connection conexion = null;
        String mostrarDatos = ("SELECT producto,precio,cantidad,imagen FROM productos WHERE producto ='"+producto+"'");
        String[] datos = new String[3];
        try {
            conexion = Conexion.conectar();
            sentenciaPreparada = conexion.prepareStatement(mostrarDatos);
            resultado = sentenciaPreparada.executeQuery();
            if(resultado.next()){
                datos[0]=resultado.getString(1);
                datos[1]=String.valueOf(resultado.getDouble(2));
                datos[2]=String.valueOf(resultado.getInt(3));
                Blob blob = (Blob) resultado.getBlob(4);
                if(blob != null){
                    try {
                        byte[] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img =null;
                        try {
                            img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error: "+e);
                        }
                        ImageIcon icon = new ImageIcon(img);
                        label.setIcon(icon);
                    } catch (SQLException e) {
                    }
                }
            }else{
                datos[0]="No existe";
                datos[1]="No existe";
                datos[2]="No existe";
                label.setIcon(null);
            }
            
            sentenciaPreparada.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return datos;
    }
    
    public static String[][] datosProductos(){
        String[][] datos = new String[12][3];
        Connection conexion = null;
        String mostrarProductos = ("SELECT producto,precio,cantidad FROM productos");
        try {
            int i=0;
            conexion = Conexion.conectar();
            sentenciaPreparada = conexion.prepareStatement(mostrarProductos);
            resultado = sentenciaPreparada.executeQuery();
            while(resultado.next()){
                datos[i][0]=resultado.getString(1);
                datos[i][1]=String.valueOf(resultado.getDouble(2));
                datos[i][2]=String.valueOf(resultado.getInt(3));
                i++;
            }
            
            sentenciaPreparada.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return datos;
    }
    
    public void actualizarContacto(String cedula, String nom, String dir, String tel, String ced, String cor){
        Connection conexion=null;
        String actualizarContacto = ("UPDATE contacto SET nombre = '"+nom+"', direccion = '"+dir+"', telefono = '"+tel+"', correo = '"+cor+"', cedula = '"+ced+"' WHERE cedula = '"+cedula+"'");
        try {
            if(cedula.equals("")){
                JOptionPane.showMessageDialog(null, "Error usuario no encontrado en el registro");
            }else{
                conexion = Conexion.conectar();
          
                sentenciaPreparada = conexion.prepareStatement(actualizarContacto);
                sentenciaPreparada.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Contacto actualizado");
            
                conexion.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    
    public void actualizarProducto(String nombre, String producto, double precio, int cantidad, String ruta) throws FileNotFoundException{
        Connection conexion = null;
        String actualizarProducto="";
        FileInputStream rutaArchivo = null;
        if(ruta.equals("")){
            actualizarProducto = ("UPDATE productos SET producto='"+producto+"', precio='"+precio+"', cantidad='"+cantidad+"' WHERE producto = '"+nombre+"'");
            try {
                conexion = Conexion.conectar();
                sentenciaPreparada = conexion.prepareStatement(actualizarProducto);
                sentenciaPreparada.executeUpdate();

                JOptionPane.showMessageDialog(null, "Producto actualizado");

                sentenciaPreparada.close();
                conexion.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null,"Error: "+ e);
            }
        }else{
            actualizarProducto = ("UPDATE productos SET producto='"+producto+"', precio='"+precio+"', cantidad='"+cantidad+"', imagen = ? WHERE producto = '"+nombre+"'");
            
            try {
                conexion = Conexion.conectar();
                
                File file = new File(ruta);
                rutaArchivo = new FileInputStream(file);
                
                sentenciaPreparada = conexion.prepareStatement(actualizarProducto);
                sentenciaPreparada.setBlob(1, rutaArchivo);
                sentenciaPreparada.executeUpdate();

                JOptionPane.showMessageDialog(null, "Producto actualizado");

                sentenciaPreparada.close();
                conexion.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null,"Error: "+ e);
            }
        }
    }
    
    public void compraProducto(int[] cantidad, String[] nombre){
        Connection conexion = null;
        String actualizarCantidad = ("UPDATE productos SET cantidad =? WHERE producto =?");
        try {
            conexion = Conexion.conectar();
            
            for(int i=0;i<cantidad.length;i++){
                sentenciaPreparada = conexion.prepareStatement(actualizarCantidad);
                sentenciaPreparada.setInt(1, cantidad[i]);
                sentenciaPreparada.setString(2, nombre[i]);
                sentenciaPreparada.executeUpdate();
            }
            
            sentenciaPreparada.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    
    public int eliminarContacto(String cedula){
        int resultado=0;
        Connection conexion = null;
        String eliminarContacto = ("DELETE from contacto WHERE cedula = '"+cedula+"'");
        try {
            conexion = Conexion.conectar();
            sentenciaPreparada = conexion.prepareStatement(eliminarContacto);
            
            resultado = sentenciaPreparada.executeUpdate();
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "El usuario no existe");
            }
            
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return resultado;
    }
    
    public int eliminarProducto(String producto){
        int resultado=0;
        Connection conexion=null;
        String eliminarProducto = ("DELETE from productos WHERE producto ='"+producto+"'");
        try {
            conexion = Conexion.conectar();
            sentenciaPreparada = conexion.prepareStatement(eliminarProducto);
            resultado = sentenciaPreparada.executeUpdate();
            
            sentenciaPreparada.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return resultado;
    }
    
    public static String[] buscarContacto(String nombre){
        String[] buscarContacto = new String[5];
        Connection conexion = null;
        try {
            conexion = Conexion.conectar();
            String sentenciaGuardar = ("SELECT nombre,direccion,telefono,correo,cedula FROM contacto WHERE nombre = '"+nombre+"' && cliente = '"+usuarioo+"'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            resultado = sentenciaPreparada.executeQuery();
            
            if(resultado.next()){
                String nombres = resultado.getString("nombre");
                String direccion = resultado.getString("direccion");
                String telefono = resultado.getString("telefono");
                String correo = resultado.getString("correo");
                String cedula = resultado.getString("cedula");
                buscarContacto[0]=nombres;
                buscarContacto[1]=direccion;
                buscarContacto[2]=telefono;
                buscarContacto[3]=correo;
                buscarContacto[4]=cedula;
            }else{
                buscarContacto[0]=(nombre+" (Usuario no existe)");
                buscarContacto[1]="No existe";
                buscarContacto[2]="No existe";
                buscarContacto[3]="No existe";
                buscarContacto[4]="No existe";
                JOptionPane.showMessageDialog(null, "El usuario no existe en el registro de contactos");
            }
            
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return buscarContacto;
    }
    
    public static String buscarNombre(String usuario){
        String buscarNombre = null;
        Connection conexion = null;
        try {
           conexion = Conexion.conectar();
           String buscar = ("SELECT nombre,apellido FROM usuarios WHERE usuario = '"+usuario+"'");
           sentenciaPreparada = conexion.prepareStatement(buscar);
           resultado = sentenciaPreparada.executeQuery();
           
           if(resultado.next()){
               usuarioo = usuario;
               String nombre = resultado.getString("nombre");
               String apellido = resultado.getString("apellido");
               buscarNombre = (nombre+" "+apellido);
           }
           
           conexion.close();
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Error: "+e);
       }
        return buscarNombre;
    }
   
   public static String buscarUsuario(String usuario, String password){
       String buscarUsuario=null;
       Connection conexion=null;
       try {
           conexion = Conexion.conectar();
           String sentenciaBuscar = ("SELECT usuario,nombre,apellido,password,email FROM usuarios WHERE usuario = '"+usuario+"' && password = '"+password+"'");
           sentenciaPreparada = conexion.prepareStatement(sentenciaBuscar);
           resultado = sentenciaPreparada.executeQuery();
           if(resultado.next()){
               buscarUsuario = "Bienvenido";
           }else{
               buscarUsuario = "El usuario no existe";
           }
           
           conexion.close();
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Error: "+e);
       }
       return buscarUsuario;
   }
   
   public String getUsuario(){
       return usuarioo;
   }
   
   public int compararCedula(String cedula){
       int result=0;
       Connection conexion=null;
       String compararCedula = ("SELECT nombre,direccion,telefono,correo,cedula FROM contacto WHERE cedula = '"+cedula+"'");
       try {
           conexion = Conexion.conectar();
           sentenciaPreparada = conexion.prepareStatement(compararCedula);
           resultado = sentenciaPreparada.executeQuery();
           if(resultado.next()){
               result=1;
           }
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error: "+e);
       }
       return result;
   }
   
   public int compararUsuario(String usuario){
       int result=0;
       Connection conexion=null;
       String compararCedula = ("SELECT usuario,nombre FROM usuarios WHERE usuario = '"+usuario+"'");
       try {
           conexion = Conexion.conectar();
           sentenciaPreparada = conexion.prepareStatement(compararCedula);
           resultado = sentenciaPreparada.executeQuery();
           if(resultado.next()){
               result=1;
           }
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error: "+e);
       }
       return result;
   }
}
