/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Felipe/Wendel
 */
public class TelaAdvertencia extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdvertencia
     */
    public TelaAdvertencia() {
        initComponents();
        //Olámundo
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnGeralAdvertencia = new javax.swing.JPanel();
        lblDescricaoTelaAdvertencia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTxtDescricaoAdvertencia = new javax.swing.JTextArea();
        lblNomeTelaAdvertencia = new javax.swing.JLabel();
        cTxtNomeAdvertencia = new javax.swing.JTextField();
        cTxDtDeAdvertencia = new javax.swing.JFormattedTextField();
        lblDtAdvertenciaTelaAdvertencia = new javax.swing.JLabel();
        lblTipoTelaAdvertencia = new javax.swing.JLabel();
        cListTipoAdvertencia = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaTelaAdvertencia = new javax.swing.JTable();
        btRegistrarTelaAdvertencia = new javax.swing.JButton();
        btVoltarTelaAdvertencia = new javax.swing.JButton();
        btRegistrarTelaAdvertencia1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblDescricaoTelaAdvertencia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDescricaoTelaAdvertencia.setText("Descrição da advertência:");

        areaTxtDescricaoAdvertencia.setColumns(20);
        areaTxtDescricaoAdvertencia.setRows(5);
        areaTxtDescricaoAdvertencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaTxtDescricaoAdvertenciaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(areaTxtDescricaoAdvertencia);

        lblNomeTelaAdvertencia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblNomeTelaAdvertencia.setText("Nome:");

        cTxtNomeAdvertencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtNomeAdvertenciaKeyReleased(evt);
            }
        });

        try {
            cTxDtDeAdvertencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDtAdvertenciaTelaAdvertencia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDtAdvertenciaTelaAdvertencia.setText("Data de Advertência:");

        lblTipoTelaAdvertencia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTipoTelaAdvertencia.setText("Tipo:");

        cListTipoAdvertencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Aluno", "Professor" }));

        tabelaTelaAdvertencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "N° Chamada", "Titulo"
            }
        ));
        jScrollPane2.setViewportView(tabelaTelaAdvertencia);

        btRegistrarTelaAdvertencia.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btRegistrarTelaAdvertencia.setText("Registrar");
        btRegistrarTelaAdvertencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarTelaAdvertenciaActionPerformed(evt);
            }
        });

        btVoltarTelaAdvertencia.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btVoltarTelaAdvertencia.setText("Voltar");
        btVoltarTelaAdvertencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaAdvertenciaActionPerformed(evt);
            }
        });

        btRegistrarTelaAdvertencia1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btRegistrarTelaAdvertencia1.setText("Buscar");
        btRegistrarTelaAdvertencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarTelaAdvertencia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGeralAdvertenciaLayout = new javax.swing.GroupLayout(pnGeralAdvertencia);
        pnGeralAdvertencia.setLayout(pnGeralAdvertenciaLayout);
        pnGeralAdvertenciaLayout.setHorizontalGroup(
            pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeralAdvertenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGeralAdvertenciaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGeralAdvertenciaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btRegistrarTelaAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btVoltarTelaAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnGeralAdvertenciaLayout.createSequentialGroup()
                        .addComponent(lblNomeTelaAdvertencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cTxtNomeAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnGeralAdvertenciaLayout.createSequentialGroup()
                        .addGroup(pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricaoTelaAdvertencia)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnGeralAdvertenciaLayout.createSequentialGroup()
                                .addComponent(lblDtAdvertenciaTelaAdvertencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cTxDtDeAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGeralAdvertenciaLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblTipoTelaAdvertencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cListTipoAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(btRegistrarTelaAdvertencia1)
                                .addGap(250, 250, 250)))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        pnGeralAdvertenciaLayout.setVerticalGroup(
            pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeralAdvertenciaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTelaAdvertencia)
                    .addComponent(cTxtNomeAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipoTelaAdvertencia)
                        .addComponent(cListTipoAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btRegistrarTelaAdvertencia1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtAdvertenciaTelaAdvertencia)
                    .addComponent(cTxDtDeAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblDescricaoTelaAdvertencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarTelaAdvertencia)
                    .addComponent(btRegistrarTelaAdvertencia))
                .addGap(29, 29, 29))
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("ADVERTÊNCIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(pnGeralAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnGeralAdvertencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarTelaAdvertenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaAdvertenciaActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new TelaGerenciarEmprestimo().setVisible(true);
        
    }//GEN-LAST:event_btVoltarTelaAdvertenciaActionPerformed

    private void btRegistrarTelaAdvertenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarTelaAdvertenciaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btRegistrarTelaAdvertenciaActionPerformed

    private void cTxtNomeAdvertenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtNomeAdvertenciaKeyReleased
        // TODO add your handling code here:
         cTxtNomeAdvertencia.setText(cTxtNomeAdvertencia.getText().toUpperCase());
    }//GEN-LAST:event_cTxtNomeAdvertenciaKeyReleased

    private void areaTxtDescricaoAdvertenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTxtDescricaoAdvertenciaKeyReleased
        // TODO add your handling code here:
         areaTxtDescricaoAdvertencia.setText(areaTxtDescricaoAdvertencia.getText().toUpperCase());
    }//GEN-LAST:event_areaTxtDescricaoAdvertenciaKeyReleased

    private void btRegistrarTelaAdvertencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarTelaAdvertencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRegistrarTelaAdvertencia1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdvertencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdvertencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdvertencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdvertencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdvertencia().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTxtDescricaoAdvertencia;
    private javax.swing.JButton btRegistrarTelaAdvertencia;
    private javax.swing.JButton btRegistrarTelaAdvertencia1;
    private javax.swing.JButton btVoltarTelaAdvertencia;
    private javax.swing.JComboBox<String> cListTipoAdvertencia;
    private javax.swing.JFormattedTextField cTxDtDeAdvertencia;
    private javax.swing.JTextField cTxtNomeAdvertencia;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescricaoTelaAdvertencia;
    private javax.swing.JLabel lblDtAdvertenciaTelaAdvertencia;
    private javax.swing.JLabel lblNomeTelaAdvertencia;
    private javax.swing.JLabel lblTipoTelaAdvertencia;
    private javax.swing.JPanel pnGeralAdvertencia;
    private javax.swing.JTable tabelaTelaAdvertencia;
    // End of variables declaration//GEN-END:variables
}
