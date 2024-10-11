/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Utilitario.JPanelImage;
import java.awt.BorderLayout;

/**
 *
 * @author user
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        JPanelImage mImagen = new JPanelImage(panIcon, "/icons/INSIGNIA.png");
        panIcon.add(mImagen).repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pprincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDatos = new javax.swing.JButton();
        btnAsistencia = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        panIcon = new javax.swing.JPanel();
        lblRol = new javax.swing.JLabel();
        Pcontenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pprincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenid@");

        btnDatos.setBackground(new java.awt.Color(130, 171, 255));
        btnDatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDatos.setText("Datos ");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        btnAsistencia.setBackground(new java.awt.Color(130, 171, 255));
        btnAsistencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAsistencia.setText("Asistencia");

        btnReportes.setBackground(new java.awt.Color(130, 171, 255));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReportes.setText("Reportes");

        javax.swing.GroupLayout panIconLayout = new javax.swing.GroupLayout(panIcon);
        panIcon.setLayout(panIconLayout);
        panIconLayout.setHorizontalGroup(
            panIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        panIconLayout.setVerticalGroup(
            panIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        lblRol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRol.setText("Usuario");

        javax.swing.GroupLayout PprincipalLayout = new javax.swing.GroupLayout(Pprincipal);
        Pprincipal.setLayout(PprincipalLayout);
        PprincipalLayout.setHorizontalGroup(
            PprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PprincipalLayout.createSequentialGroup()
                .addGroup(PprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PprincipalLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(PprincipalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PprincipalLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(panIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PprincipalLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblRol)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PprincipalLayout.setVerticalGroup(
            PprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PprincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRol)
                .addGap(39, 39, 39)
                .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(panIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout PcontenedorLayout = new javax.swing.GroupLayout(Pcontenedor);
        Pcontenedor.setLayout(PcontenedorLayout);
        PcontenedorLayout.setHorizontalGroup(
            PcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        PcontenedorLayout.setVerticalGroup(
            PcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        // TODO add your handling code here:
        PGradoySeccion p1 = new PGradoySeccion();
        p1.setSize(1200, 1500);
        p1.setLocation(0, 0);
        Pcontenedor.removeAll();
        Pcontenedor.add(p1,BorderLayout.CENTER);
        Pcontenedor.revalidate();
        Pcontenedor.repaint();
    }//GEN-LAST:event_btnDatosActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pcontenedor;
    private javax.swing.JPanel Pprincipal;
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRol;
    private javax.swing.JPanel panIcon;
    // End of variables declaration//GEN-END:variables
}
