/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnote;

import Controlador.Nota;
import Controlador.UserSesion;
import Modelo.Consulta;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Alex
 */
public class nuevaNote extends javax.swing.JFrame {

    /**
     * Creates new form nuevaNote
     */
    Consulta consulta = new Consulta();
    UserSesion us = new UserSesion();

    private boolean estado;

    public nuevaNote() {
        initComponents();
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
        jtxtTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtContenido = new javax.swing.JTextArea();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jlbMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("nNote | Nueva Nota");
        setResizable(false);

        jtxtTitulo.setForeground(java.awt.Color.gray);
        jtxtTitulo.setText("Titulo...");
        jtxtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtTituloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtTituloFocusLost(evt);
            }
        });

        jtxtContenido.setColumns(20);
        jtxtContenido.setForeground(java.awt.Color.gray);
        jtxtContenido.setRows(5);
        jtxtContenido.setText("Escriba aquí...");
        jtxtContenido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtContenidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtContenidoFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(jtxtContenido);

        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/squared-cross.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setToolTipText("");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jlbMensaje.setForeground(new java.awt.Color(0, 74, 190));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbMensaje))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnCancelar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtTituloFocusGained
        if (jtxtTitulo.getText().equals("Titulo...")) {
            jtxtTitulo.setText("");
            jtxtTitulo.setForeground(Color.black);
        } else {
            jtxtTitulo.setText(jtxtTitulo.getText());
        }
    }//GEN-LAST:event_jtxtTituloFocusGained

    private void jtxtTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtTituloFocusLost
        if (jtxtTitulo.getText().equals("")) {
            jtxtTitulo.setText("Titulo...");
            jtxtTitulo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtxtTituloFocusLost

    private void jtxtContenidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContenidoFocusGained
        if (jtxtContenido.getText().equals("Escriba aquí...")) {
            jtxtContenido.setText("");
            jtxtContenido.setForeground(Color.black);
        } else {
            jtxtContenido.setText(jtxtContenido.getText());
        }
    }//GEN-LAST:event_jtxtContenidoFocusGained

    private void jtxtContenidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContenidoFocusLost
        if (jtxtContenido.getText().equals("")) {
            jtxtContenido.setText("Escriba aquí...");
            jtxtContenido.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtxtContenidoFocusLost

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        limpiar();
        cancelar();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        if (!jtxtTitulo.getText().equals("") && !jtxtContenido.getText().equals("")) {
            try {
                Nota nota = new Nota(jtxtTitulo.getText(), jtxtContenido.getText(), us.getId());

                consulta.crearNota(nota);

                limpiar();
                jlbMensaje.setForeground(Color.decode("#004ABE"));
                jlbMensaje.setText("Nota creada correctamente! :)");
                //estado = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error:" + e.getMessage() + "\nVerifique");
                estado = false;
            }
            /*if(estado == true){
             limpiar();
             jlbMensaje.setForeground(Color.decode("#004ABE"));
             jlbMensaje.setText("Nota creada correctamente! :)");
             } else {
             jlbMensaje.setForeground(Color.decode("#ff0000"));
             jlbMensaje.setText("Ocurrio un errar al intentar crear la nota! :(");
             }*/

        } else {
            jlbMensaje.setForeground(Color.decode("#ff0000"));
            jlbMensaje.setText("Debe completar todos los campos!");
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void cancelar() {
        this.dispose();
    }

    public void limpiar() {
        jtxtTitulo.setText("Titulo...");
        jtxtTitulo.setForeground(Color.gray);
        jtxtContenido.setText("Escriba aquí...");
        jtxtContenido.setForeground(Color.gray);
    }

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

            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            //UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            //UIManager.setLookAndFeel(new SeaGlassLookAndFeel());

            //UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
         if ("Nimbus".equals(info.getName())) {
         javax.swing.UIManager.setLookAndFeel(info.getClassName());
         break;
         }
         }
         } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(nuevaNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(nuevaNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(nuevaNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(nuevaNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevaNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JTextArea jtxtContenido;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}
