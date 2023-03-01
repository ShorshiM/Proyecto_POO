/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logi;

import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import AppPackage.AnimationClass;

/**
 *
 * @author Jorge
 */
public class Calculadora extends javax.swing.JInternalFrame {

    private int operacion=0;
    private int operacionEspecial=0;
    private boolean aceptar=false;
    private boolean conversion = false;
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        this.setTitle("Calculadora");
    }

    float numero1;
    float numero2;

    Color azulado = new Color(241,243,244);
    Color azulos = new Color(31,33,37);
    Color negrillo = new Color(41,48,67);
    Color azultip = new Color(140,173,237);
    Color negrita = new Color(9,11,13);
    Color plomo = new Color(204,204,204);
    
    private void resultado(){
        String[] captura = jTextResultado.getText().split(" ");
        float resultado=0;
        if(captura.length>3){
            numero1=Float.parseFloat(captura[1]);
            numero2=Float.parseFloat(captura[3]);
            switch(operacion){
                case 1:
                    resultado=numero1+numero2;
                    break;
                case 2:
                    resultado=numero1-numero2;
                    break;
                case 3:
                    resultado=numero1*numero2;
                    break;
                case 4:
                    if(numero2!=0){
                        resultado=numero1/numero2;
                    }else{
                        aceptar=true;
                    }
                    break;
            }
            
            switch(operacionEspecial){
                case 5:
                    if(!aceptar){
                        jTextResultado.setText("");
                        if(conversion){
                            jTextResultado.setText(String.valueOf(Math.sin(Math.toRadians(resultado))));
                        }else{
                            jTextResultado.setText(String.valueOf( Math.sin(resultado)));
                        }
                    }else{
                        jTextResultado.setText("ERROR calculo");
                    }
                    operacion=0;
                    operacionEspecial=0;
                    break;
                case 6:
                    if(!aceptar){
                        jTextResultado.setText("");
                        if(conversion){
                            jTextResultado.setText(String.valueOf( Math.cos(Math.toRadians(resultado))));
                        }else{
                            jTextResultado.setText(String.valueOf( Math.cos(resultado)));
                        }              
                    }else{
                        jTextResultado.setText("ERROR calculo");
                    }
                    operacion=0;
                    operacionEspecial=0;
                    break;
                case 7:
                    if(!aceptar){
                        jTextResultado.setText("");
                        if(conversion){
                            jTextResultado.setText(String.valueOf( Math.tan(Math.toRadians(resultado))));
                        }else{
                            jTextResultado.setText(String.valueOf( Math.tan(resultado)));
                        }     
                    }else{
                        jTextResultado.setText("ERROR calculo");
                    }
                    operacion=0;
                    operacionEspecial=0;
                    break;
                case 8:
                    if(!aceptar){
                        if(resultado>0){
                            jTextResultado.setText("");
                            jTextResultado.setText(String.valueOf( Math.sqrt(resultado)));
                        }else{
                            jTextResultado.setText("ERROR calculo");
                        }
                    }else{
                        jTextResultado.setText("ERROR calculo");
                    }
                    operacion=0;
                    operacionEspecial=0;
                    break;
                case 11:
                    if(!aceptar){
                        jTextResultado.setText("");
                        jTextResultado.setText(String.valueOf(Math.exp(resultado)));
                    }else{
                        jTextResultado.setText("ERROR calculo");
                    }
                    operacion=0;
                    operacionEspecial=0;
                    break;
            }
        }else{
            if(captura.length==3){
                numero1=Float.parseFloat(captura[0]);
                numero2=Float.parseFloat(captura[2]);
                
                switch(operacion){
                    case 1:
                        jTextResultado.setText("");
                        jTextResultado.setText(String.valueOf(numero1+numero2));
                        operacion=0;
                        operacionEspecial=0;
                        break;
                    case 2:
                        jTextResultado.setText("");
                        jTextResultado.setText(String.valueOf(numero1-numero2));
                        operacion=0;
                        operacionEspecial=0;
                        break;
                    case 3:
                        jTextResultado.setText("");
                        jTextResultado.setText(String.valueOf(numero1*numero2));
                        operacion=0;
                        operacionEspecial=0;
                        break;
                    case 4:
                        jTextResultado.setText("");
                        if(numero2!=0){
                            jTextResultado.setText(String.valueOf(numero1/numero2));
                        }else{
                            jTextResultado.setText("ERROR calculo");
                        }
                        operacion=0;
                        operacionEspecial=0;
                        break;
                }
            }
            if(captura.length == 2){
                switch(operacionEspecial){
                    case 5:
                        jTextResultado.setText("");
                        if(conversion){
                            jTextResultado.setText(String.valueOf( Math.sin(Math.toRadians(Float.parseFloat(captura[1])))));
                        }else{
                            jTextResultado.setText(String.valueOf( Math.sin(Float.parseFloat(captura[1]))));
                        }
                        operacion=0;
                        operacionEspecial=0;
                        break;
                    case 6:
                        jTextResultado.setText("");
                        if(conversion){
                            jTextResultado.setText(String.valueOf( Math.cos(Math.toRadians(Float.parseFloat(captura[1])))));
                        }else{
                            jTextResultado.setText(String.valueOf(Math.cos(Float.parseFloat(captura[1]))));
                        }
                        operacion=0;
                        operacionEspecial=0;
                        break;
                    case 7:
                        jTextResultado.setText("");
                        if(conversion){
                            jTextResultado.setText(String.valueOf( Math.tan(Math.toRadians(Float.parseFloat(captura[1])))));
                        }else{
                            jTextResultado.setText(String.valueOf(Math.tan(Float.parseFloat(captura[1]))));
                        }
                        operacion=0;
                        operacionEspecial=0;
                        break;
                    case 8:
                        jTextResultado.setText("");
                        jTextResultado.setText(String.valueOf( Math.sqrt(Float.parseFloat(captura[1]))));
                        operacion=0;
                        operacionEspecial=0;
                        break;
                    case 9:
                        jTextResultado.setText("");
                        jTextResultado.setText(String.valueOf(factorial(Integer.parseInt(captura[0]))));
                        operacion=0;
                        operacionEspecial=0;
                        break;
                    case 11:
                        jTextResultado.setText("");
                        jTextResultado.setText(String.valueOf( Math.exp(Float.parseFloat(captura[1]))));
                        operacion=0;
                        operacionEspecial=0;
                        break;
                }
            }
        }
    }
    
    public int factorial(int numero){
        int resultado=1;
        if(numero==0){
            return resultado;
        }else{
            for(int i=1;i<(numero+1);i++){
                resultado=i*resultado;
            }
            return resultado;
        } 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInicio = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonSuma = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonMultiplicacion = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jTextResultado = new javax.swing.JTextField();
        jButtonComa = new javax.swing.JButton();
        jButtonModo = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();
        jButtonSin = new javax.swing.JButton();
        jButtonCos = new javax.swing.JButton();
        jButtonTan = new javax.swing.JButton();
        jButtonFactorial = new javax.swing.JButton();
        jButtonExponente = new javax.swing.JButton();
        jButtonSigno = new javax.swing.JButton();
        jButtonRad = new javax.swing.JButton();
        jButtonDeg = new javax.swing.JButton();

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelTitulo.setText("Calculadora");
        jPanelInicio.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(241, 243, 244));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(9, 11, 13));
        jButton1.setText("1");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 60, 20));

        jButton2.setBackground(new java.awt.Color(241, 243, 244));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(9, 11, 13));
        jButton2.setText("2");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, 20));

        jButton3.setBackground(new java.awt.Color(241, 243, 244));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(9, 11, 13));
        jButton3.setText("3");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, 20));

        jButton4.setBackground(new java.awt.Color(241, 243, 244));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(9, 11, 13));
        jButton4.setText("4");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, 20));

        jButton5.setBackground(new java.awt.Color(241, 243, 244));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(9, 11, 13));
        jButton5.setText("5");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, 20));

        jButton6.setBackground(new java.awt.Color(241, 243, 244));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(9, 11, 13));
        jButton6.setText("6");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 60, 20));

        jButton7.setBackground(new java.awt.Color(241, 243, 244));
        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(9, 11, 13));
        jButton7.setText("7");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 20));

        jButton8.setBackground(new java.awt.Color(241, 243, 244));
        jButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(9, 11, 13));
        jButton8.setText("8");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 60, 20));

        jButton9.setBackground(new java.awt.Color(241, 243, 244));
        jButton9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(9, 11, 13));
        jButton9.setText("9");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 60, 20));

        jButton0.setBackground(new java.awt.Color(241, 243, 244));
        jButton0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton0.setForeground(new java.awt.Color(9, 11, 13));
        jButton0.setText("0");
        jButton0.setBorder(null);
        jButton0.setBorderPainted(false);
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 70, 20));

        jButtonSuma.setBackground(new java.awt.Color(241, 243, 244));
        jButtonSuma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSuma.setForeground(new java.awt.Color(140, 173, 237));
        jButtonSuma.setText("+");
        jButtonSuma.setBorder(null);
        jButtonSuma.setBorderPainted(false);
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 70, 70));

        jButtonResta.setBackground(new java.awt.Color(241, 243, 244));
        jButtonResta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonResta.setForeground(new java.awt.Color(155, 181, 222));
        jButtonResta.setText("-");
        jButtonResta.setBorder(null);
        jButtonResta.setBorderPainted(false);
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 20));

        jButtonIgual.setBackground(new java.awt.Color(241, 243, 244));
        jButtonIgual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonIgual.setForeground(new java.awt.Color(140, 173, 237));
        jButtonIgual.setText("=");
        jButtonIgual.setBorder(null);
        jButtonIgual.setBorderPainted(false);
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 60, 20));

        jButtonClear.setBackground(new java.awt.Color(241, 243, 244));
        jButtonClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(140, 173, 237));
        jButtonClear.setText("AC");
        jButtonClear.setBorder(null);
        jButtonClear.setBorderPainted(false);
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 70, 20));

        jButtonMultiplicacion.setBackground(new java.awt.Color(241, 243, 244));
        jButtonMultiplicacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonMultiplicacion.setForeground(new java.awt.Color(140, 173, 237));
        jButtonMultiplicacion.setText("*");
        jButtonMultiplicacion.setBorder(null);
        jButtonMultiplicacion.setBorderPainted(false);
        jButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacionActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 20));

        jButtonDivision.setBackground(new java.awt.Color(241, 243, 244));
        jButtonDivision.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonDivision.setForeground(new java.awt.Color(140, 173, 237));
        jButtonDivision.setText("/");
        jButtonDivision.setBorder(null);
        jButtonDivision.setBorderPainted(false);
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, 20));

        jTextResultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcion M G R", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jTextResultado.setFocusable(false);
        jTextResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextResultadoActionPerformed(evt);
            }
        });
        jPanelInicio.add(jTextResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 44, 370, 48));

        jButtonComa.setBackground(new java.awt.Color(241, 243, 244));
        jButtonComa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonComa.setForeground(new java.awt.Color(9, 11, 13));
        jButtonComa.setText(",");
        jButtonComa.setBorder(null);
        jButtonComa.setBorderPainted(false);
        jButtonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComaActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonComa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 50, 20));

        jButtonModo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_modoDark.png"))); // NOI18N
        jButtonModo.setBorder(null);
        jButtonModo.setBorderPainted(false);
        jButtonModo.setContentAreaFilled(false);
        jButtonModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModoActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonModo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 32, 32));

        jButtonRaiz.setBackground(new java.awt.Color(241, 243, 244));
        jButtonRaiz.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRaiz.setForeground(new java.awt.Color(140, 173, 237));
        jButtonRaiz.setText("sqrt");
        jButtonRaiz.setBorder(null);
        jButtonRaiz.setBorderPainted(false);
        jButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 60, 30));

        jButtonSin.setBackground(new java.awt.Color(241, 243, 244));
        jButtonSin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSin.setForeground(new java.awt.Color(140, 173, 237));
        jButtonSin.setText("sin");
        jButtonSin.setBorder(null);
        jButtonSin.setBorderPainted(false);
        jButtonSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSinActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 60, 30));

        jButtonCos.setBackground(new java.awt.Color(241, 243, 244));
        jButtonCos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCos.setForeground(new java.awt.Color(140, 173, 237));
        jButtonCos.setText("cos");
        jButtonCos.setBorder(null);
        jButtonCos.setBorderPainted(false);
        jButtonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCosActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 70, 30));

        jButtonTan.setBackground(new java.awt.Color(241, 243, 244));
        jButtonTan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonTan.setForeground(new java.awt.Color(140, 173, 237));
        jButtonTan.setText("tan");
        jButtonTan.setBorder(null);
        jButtonTan.setBorderPainted(false);
        jButtonTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTanActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 70, 30));

        jButtonFactorial.setBackground(new java.awt.Color(241, 243, 244));
        jButtonFactorial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonFactorial.setForeground(new java.awt.Color(140, 173, 237));
        jButtonFactorial.setText("x!");
        jButtonFactorial.setBorder(null);
        jButtonFactorial.setBorderPainted(false);
        jButtonFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFactorialActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 70, 30));

        jButtonExponente.setBackground(new java.awt.Color(241, 243, 244));
        jButtonExponente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonExponente.setForeground(new java.awt.Color(140, 173, 237));
        jButtonExponente.setText("e^");
        jButtonExponente.setBorder(null);
        jButtonExponente.setBorderPainted(false);
        jButtonExponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExponenteActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonExponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 70, 30));

        jButtonSigno.setBackground(new java.awt.Color(241, 243, 244));
        jButtonSigno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSigno.setForeground(new java.awt.Color(140, 173, 237));
        jButtonSigno.setText("+/-");
        jButtonSigno.setBorder(null);
        jButtonSigno.setBorderPainted(false);
        jButtonSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignoActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 70, 30));

        jButtonRad.setBackground(new java.awt.Color(241, 243, 244));
        jButtonRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRad.setForeground(new java.awt.Color(9, 11, 13));
        jButtonRad.setText("Rad");
        jButtonRad.setBorder(null);
        jButtonRad.setBorderPainted(false);
        jButtonRad.setEnabled(false);
        jButtonRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRadActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 60, 30));

        jButtonDeg.setBackground(new java.awt.Color(241, 243, 244));
        jButtonDeg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonDeg.setForeground(new java.awt.Color(9, 11, 13));
        jButtonDeg.setText("Deg");
        jButtonDeg.setBorder(null);
        jButtonDeg.setBorderPainted(false);
        jButtonDeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDegActionPerformed(evt);
            }
        });
        jPanelInicio.add(jButtonDeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText(jTextResultado.getText()+" + ");
            operacion = 1;
        }
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        if(jTextResultado.getText().length()!=0)
            resultado();
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        jTextResultado.setText(jTextResultado.getText()+"0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText(jTextResultado.getText()+" - ");
            operacion= 2;
        }else{
            jTextResultado.setText(jTextResultado.getText()+"-");
        }
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacionActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText(jTextResultado.getText()+" x ");
            operacion = 3;
        }
    }//GEN-LAST:event_jButtonMultiplicacionActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText(jTextResultado.getText()+" / ");
            operacion = 4;
        }
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextResultado.setText("");
        operacion=0;
        operacionEspecial=0;
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jTextResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextResultadoActionPerformed

    private void jButtonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComaActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        
        if(jTextResultado.getText().length()!=0)
            jTextResultado.setText(jTextResultado.getText()+".");
    }//GEN-LAST:event_jButtonComaActionPerformed

    private void jButtonModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModoActionPerformed
        boolean verificacion = jButtonModo.getBackground().equals(Color.white);
        jButtonModo.setBackground(Color.black);
        if(verificacion){
            jTextResultado.setBackground(negrillo);
            jLabelTitulo.setForeground(Color.white);
            jPanelInicio.setBackground(negrillo);
            jButtonSuma.setBackground(azulos);
            jButtonMultiplicacion.setBackground(azulos);
            jButtonResta.setBackground(azulos);
            jButtonDivision.setBackground(azulos);
            jButtonClear.setBackground(azulos);
            jButtonIgual.setBackground(azulos);
            jButton0.setBackground(azulos);
            jButton1.setBackground(azulos);
            jButton2.setBackground(azulos);
            jButton3.setBackground(azulos);
            jButton4.setBackground(azulos);
            jButton5.setBackground(azulos);
            jButton6.setBackground(azulos);
            jButton7.setBackground(azulos);
            jButton8.setBackground(azulos);
            jButton9.setBackground(azulos);
            jButtonComa.setBackground(azulos);
            jButtonSin.setBackground(azulos);
            jButtonCos.setBackground(azulos);
            jButtonTan.setBackground(azulos);
            jButtonFactorial.setBackground(azulos);
            jButtonExponente.setBackground(azulos);
            jButtonRaiz.setBackground(azulos);
            jButtonSigno.setBackground(azulos);
            jButtonRad.setBackground(azulos);
            jButtonDeg.setBackground(azulos);
            
            jButtonSuma.setForeground(azultip);
            jButtonMultiplicacion.setForeground(azultip);
            jButtonResta.setForeground(azultip);
            jButtonDivision.setForeground(azultip);
            jButtonClear.setForeground(azultip);
            jButtonIgual.setForeground(azultip);
            jButton0.setForeground(Color.white);
            jButton1.setForeground(Color.white);
            jButton2.setForeground(Color.white);
            jButton3.setForeground(Color.white);
            jButton4.setForeground(Color.white);
            jButton5.setForeground(Color.white);
            jButton6.setForeground(Color.white);
            jButton7.setForeground(Color.white);
            jButton8.setForeground(Color.white);
            jButton9.setForeground(Color.white);
            jButtonComa.setForeground(Color.white);
            jTextResultado.setForeground(Color.white);
            jButtonSin.setForeground(azultip);
            jButtonCos.setForeground(azultip);
            jButtonTan.setForeground(azultip);
            jButtonFactorial.setForeground(azultip);
            jButtonExponente.setForeground(azultip);
            jButtonRaiz.setForeground(azultip);
            jButtonSigno.setForeground(azultip);
            jButtonRad.setForeground(Color.white);
            jButtonDeg.setForeground(Color.white);
        }else{
            jTextResultado.setBackground(Color.white);
            jLabelTitulo.setForeground(Color.black);
            jButtonModo.setBackground(Color.white);
            jPanelInicio.setBackground(Color.white);
            jButtonSuma.setBackground(azulado);
            jButtonMultiplicacion.setBackground(azulado);
            jButtonResta.setBackground(azulado);
            jButtonDivision.setBackground(azulado);
            jButtonClear.setBackground(azulado);
            jButtonIgual.setBackground(azulado);
            jButton0.setBackground(azulado);
            jButton1.setBackground(azulado);
            jButton2.setBackground(azulado);
            jButton3.setBackground(azulado);
            jButton4.setBackground(azulado);
            jButton5.setBackground(azulado);
            jButton6.setBackground(azulado);
            jButton7.setBackground(azulado);
            jButton8.setBackground(azulado);
            jButton9.setBackground(azulado);
            jButtonComa.setBackground(azulado);
            jButtonSin.setBackground(azulado);
            jButtonCos.setBackground(azulado);
            jButtonTan.setBackground(azulado);
            jButtonFactorial.setBackground(azulado);
            jButtonExponente.setBackground(azulado);
            jButtonRaiz.setBackground(azulado);
            jButtonSigno.setBackground(azulado);
            jButtonRad.setBackground(azulado);
            jButtonDeg.setBackground(azulado);
            
            jButtonSuma.setForeground(azultip);
            jButtonMultiplicacion.setForeground(azultip);
            jButtonResta.setForeground(azultip);
            jButtonDivision.setForeground(azultip);
            jButtonClear.setForeground(azultip);
            jButtonIgual.setForeground(azultip);
            jButton0.setForeground(negrita);
            jButton1.setForeground(negrita);
            jButton2.setForeground(negrita);
            jButton3.setForeground(negrita);
            jButton4.setForeground(negrita);
            jButton5.setForeground(negrita);
            jButton6.setForeground(negrita);
            jButton7.setForeground(negrita);
            jButton8.setForeground(negrita);
            jButton9.setForeground(negrita);
            jButtonComa.setForeground(negrita);
            jTextResultado.setForeground(Color.black);
            jButtonSin.setForeground(azultip);
            jButtonCos.setForeground(azultip);
            jButtonTan.setForeground(azultip);
            jButtonFactorial.setForeground(azultip);
            jButtonExponente.setForeground(azultip);
            jButtonRaiz.setForeground(azultip);
            jButtonSigno.setForeground(azultip);
            jButtonRad.setForeground(negrita);
            jButtonDeg.setForeground(negrita);
        }
    }//GEN-LAST:event_jButtonModoActionPerformed

    private void jButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        operacionEspecial=8;
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText("sqrt "+jTextResultado.getText());
        }else{
            jTextResultado.setText("sqrt ");
        }
    }//GEN-LAST:event_jButtonRaizActionPerformed

    private void jButtonTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTanActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        operacionEspecial=7;
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText("tan "+jTextResultado.getText());
        }else{
            jTextResultado.setText("tan ");
        }
    }//GEN-LAST:event_jButtonTanActionPerformed

    private void jButtonSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSinActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        operacionEspecial=5;
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText("sin "+jTextResultado.getText());
        }else{
            jTextResultado.setText("sin ");
        }
    }//GEN-LAST:event_jButtonSinActionPerformed

    private void jButtonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCosActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        operacionEspecial=6;
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText("cos "+jTextResultado.getText());
        }else{
            jTextResultado.setText("cos ");
        }
    }//GEN-LAST:event_jButtonCosActionPerformed

    private void jButtonExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExponenteActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        operacionEspecial=11;
        if(jTextResultado.getText().length()!=0){
            jTextResultado.setText("e^ "+jTextResultado.getText());
        }else{
            jTextResultado.setText("e^ ");
        }
    }//GEN-LAST:event_jButtonExponenteActionPerformed

    private void jButtonFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFactorialActionPerformed
        if(jTextResultado.getText().equals("ERROR calculo"))
            jTextResultado.setText("");
        if(operacion==1 || operacion==2 || operacion==3 || operacion==4){
            
        }else{
            if(jTextResultado.getText().length()!=0){
                float comparacion;
                comparacion=Float.parseFloat(jTextResultado.getText());
                if(comparacion%1==0){
                    if(jTextResultado.getText().length()<2){
                        jTextResultado.setText(jTextResultado.getText()+" !");
                    }else{
                        if(jTextResultado.getText().substring((jTextResultado.getText().length()-2), jTextResultado.getText().length()).equals(".0")){
                            jTextResultado.setText(jTextResultado.getText().substring(0,(jTextResultado.getText().length()-2))+" !");
                        }else{
                            jTextResultado.setText(jTextResultado.getText()+" !");
                        }
                    }
                    operacionEspecial=9;
                }
            }
        }
    }//GEN-LAST:event_jButtonFactorialActionPerformed

    private void jButtonSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignoActionPerformed
        if(jTextResultado.getText().length()!=0){
            if(operacion==0 && operacionEspecial==0){
                float resultado = Float.parseFloat(jTextResultado.getText());
                jTextResultado.setText(String.valueOf(-resultado));
            }
        }
    }//GEN-LAST:event_jButtonSignoActionPerformed

    private void jButtonDegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDegActionPerformed
        jButtonDeg.setEnabled(false);
        jButtonRad.setEnabled(true);
        jTextResultado.setBorder(new TitledBorder(new LineBorder(plomo),"Funcion M G D",0,0,new Font("Segoe UI",Font.BOLD,12),plomo));
        conversion=true;
    }//GEN-LAST:event_jButtonDegActionPerformed

    private void jButtonRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRadActionPerformed
        jButtonDeg.setEnabled(true);
        jButtonRad.setEnabled(false);
        jTextResultado.setBorder(new TitledBorder(new LineBorder(plomo),"Funcion M G R",0,0,new Font("Segoe UI",Font.BOLD,12),plomo));
        conversion=false;
    }//GEN-LAST:event_jButtonRadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonComa;
    private javax.swing.JButton jButtonCos;
    private javax.swing.JButton jButtonDeg;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonExponente;
    private javax.swing.JButton jButtonFactorial;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonModo;
    private javax.swing.JButton jButtonMultiplicacion;
    private javax.swing.JButton jButtonRad;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSigno;
    private javax.swing.JButton jButtonSin;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JButton jButtonTan;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JTextField jTextResultado;
    // End of variables declaration//GEN-END:variables
}
