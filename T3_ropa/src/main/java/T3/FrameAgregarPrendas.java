/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package T3;

public class FrameAgregarPrendas extends javax.swing.JFrame {
    FrameListador padre;
    Ropas ropaseleccionada;
    int index;
    boolean das = false;
    public FrameAgregarPrendas() {
        initComponents();
    }
    public FrameAgregarPrendas(FrameListador padre) {
        initComponents();
        this.padre=padre;
    }
    public FrameAgregarPrendas(FrameListador padre,Ropas ropa){
        initComponents();
        this.padre=padre;
        ropaseleccionada=ropa;
        TxtPrenda.setText(ropaseleccionada.getPrenda());
        TxtTalla.setText(ropaseleccionada.getTalla());
        TxtPrecio.setText(ropaseleccionada.getPrecio());
        das=true;
    }
    public FrameAgregarPrendas(FrameListador padre,Ropas ropa ,int index){
        initComponents();
        this.padre=padre;
        this.index=index;
        ropaseleccionada=ropa;
        TxtPrenda.setText(ropaseleccionada.getPrenda());
        TxtTalla.setText(ropaseleccionada.getTalla());
        TxtPrecio.setText(ropaseleccionada.getPrecio());
        das=true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        TxtPrecio = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblPrenda = new javax.swing.JLabel();
        TxtPrenda = new javax.swing.JTextField();
        TxtTalla = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        lblPrenda1 = new javax.swing.JLabel();
        lblPrenda2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(60, 59, 59));
        fondo.setForeground(new java.awt.Color(255, 255, 255));

        TxtPrecio.setBackground(new java.awt.Color(23, 23, 23));
        TxtPrecio.setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Prenda");

        lblPrenda.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblPrenda.setForeground(new java.awt.Color(255, 255, 255));
        lblPrenda.setText("Precio:");

        TxtPrenda.setBackground(new java.awt.Color(23, 23, 23));
        TxtPrenda.setForeground(new java.awt.Color(255, 255, 255));

        TxtTalla.setBackground(new java.awt.Color(23, 23, 23));
        TxtTalla.setForeground(new java.awt.Color(255, 255, 255));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        lblPrenda1.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblPrenda1.setForeground(new java.awt.Color(255, 255, 255));
        lblPrenda1.setText("Tipo de prenda:");

        lblPrenda2.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblPrenda2.setForeground(new java.awt.Color(255, 255, 255));
        lblPrenda2.setText("Talla:");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(lblPrenda1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(lblPrenda2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(lblPrenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnGuardar)
                        .addGap(61, 61, 61))))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrenda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTalla)
                    .addComponent(lblPrenda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
        this.padre.setVisible(true);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
      if (das == false){
            Ropas ropa = new Ropas();
            ropa.setPrenda(TxtPrenda.getText());
            ropa.setTalla(TxtTalla.getText());
            ropa.setPrecio(TxtPrecio.getText());
            this.padre.agregarprenda(ropa);    
        }
        else
        {
            Ropas ropa = new Ropas();
            ropa.setPrenda(TxtPrenda.getText());
            ropa.setTalla(TxtTalla.getText());
            ropa.setPrecio(TxtPrecio.getText());
            this.padre.editarprendaBuscar(index, ropa);
        }
        
        this.padre.setVisible(true);
        this.dispose();
 
    }//GEN-LAST:event_BtnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameAgregarPrendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAgregarPrendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAgregarPrendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAgregarPrendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAgregarPrendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtPrenda;
    private javax.swing.JTextField TxtTalla;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel lblPrenda;
    private javax.swing.JLabel lblPrenda1;
    private javax.swing.JLabel lblPrenda2;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
