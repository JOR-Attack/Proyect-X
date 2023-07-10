/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectx;

/**
 *
 * @author MIKE
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
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

        IMG_FONDO = new javax.swing.JPanel();
        FONDO_AZUL = new javax.swing.JPanel();
        FONDO_NEGRO = new javax.swing.JPanel();
        TITULO_INICIOSESION = new javax.swing.JLabel();
        INSERT_USUARIO = new javax.swing.JTextField();
        TEXTO_USUARIO = new javax.swing.JLabel();
        TEXTO_CONTRASENA = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IMG_FONDO.setBackground(new java.awt.Color(255, 255, 255));
        IMG_FONDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FONDO_AZUL.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout FONDO_AZULLayout = new javax.swing.GroupLayout(FONDO_AZUL);
        FONDO_AZUL.setLayout(FONDO_AZULLayout);
        FONDO_AZULLayout.setHorizontalGroup(
            FONDO_AZULLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        FONDO_AZULLayout.setVerticalGroup(
            FONDO_AZULLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        IMG_FONDO.add(FONDO_AZUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 510));

        FONDO_NEGRO.setBackground(new java.awt.Color(255, 255, 255));

        TITULO_INICIOSESION.setBackground(new java.awt.Color(255, 255, 255));
        TITULO_INICIOSESION.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        TITULO_INICIOSESION.setText("INICIO SESION");

        TEXTO_USUARIO.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TEXTO_USUARIO.setText("USUARIO");

        TEXTO_CONTRASENA.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TEXTO_CONTRASENA.setText("CONTRASEÑA");

        jToggleButton1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jToggleButton1.setText("INGRESAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FONDO_NEGROLayout = new javax.swing.GroupLayout(FONDO_NEGRO);
        FONDO_NEGRO.setLayout(FONDO_NEGROLayout);
        FONDO_NEGROLayout.setHorizontalGroup(
            FONDO_NEGROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FONDO_NEGROLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(FONDO_NEGROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITULO_INICIOSESION, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FONDO_NEGROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TEXTO_CONTRASENA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                        .addComponent(TEXTO_USUARIO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(INSERT_USUARIO, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        FONDO_NEGROLayout.setVerticalGroup(
            FONDO_NEGROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FONDO_NEGROLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(TITULO_INICIOSESION, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(TEXTO_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(INSERT_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TEXTO_CONTRASENA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jToggleButton1)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        IMG_FONDO.add(FONDO_NEGRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 430, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IMG_FONDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IMG_FONDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // BOTON
        PEDIDO INGRESAR = new PEDIDO();
        INGRESAR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FONDO_AZUL;
    private javax.swing.JPanel FONDO_NEGRO;
    private javax.swing.JPanel IMG_FONDO;
    private javax.swing.JTextField INSERT_USUARIO;
    private javax.swing.JLabel TEXTO_CONTRASENA;
    private javax.swing.JLabel TEXTO_USUARIO;
    private javax.swing.JLabel TITULO_INICIOSESION;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
