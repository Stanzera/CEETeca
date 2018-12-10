/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.NewHibernateUtil;
import java.util.List;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 *
 * @author PC
 */
public class TelaGerenciarEmprestimo extends javax.swing.JFrame {

    /**
     * Creates new form TelaEmprestimoGerenciar
     */
    public TelaGerenciarEmprestimo() {
        initComponents();

        ImageIcon icone = new ImageIcon(getClass().getResource("/images/ceetecaicon16x16.png"));
        this.setIconImage(icone.getImage());

        listarCadastros();
    }

    public void listarCadastros() {
        Session sessao = NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        //Chama a view  //p.idPessoa
        Query q = sessao.createSQLQuery("SELECT distinct p.nomePessoa as Nome,\n"
                + "p.cpfPessoa as CPF,\n"
                + "l.tituloLivro as Titulo,\n"
                + "e.idEmprestimo as N_Chamada,\n"
                + "e.dtDevolucaoEmprestimo as Data_Limite,\n"
                + "e.observacaoEmprestimo as Situacao \n"
                + "FROM pessoa p, emprestimo e, exemplar ex, livro l, livro_has_emprestimo le\n"
                + "\n"
                + "WHERE  p.idpessoa = e.pessoa_idPessoa and e.idEmprestimo = le.emprestimo_idEmprestimo \n"
                + "and le.exemplar_idExemplar = ex.idExemplar and ex.livro_idLivro = l.idLivro\n"
                + "\n"
                + " \n"
                + "order by e.idEmprestimo;").addEntity(viewmodel.viewGerEmprestimo.class);

        //pega o resultado da query e retorna uma lista
        List<viewmodel.viewGerEmprestimo> registrosTelaPrincipal = q.getResultList();
        sessao.getTransaction().commit();
        sessao.close();

        //pega o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tabelaGerEmprestimo.getModel();

        for (int i = 0; i < registrosTelaPrincipal.size(); i++) {
            //Pega o dado do registro usando i
            viewmodel.viewGerEmprestimo registro = registrosTelaPrincipal.get(i);
            //adiciona os valores na linha
            Object[] row = {
                registro.getnChamada(),
                registro.getTitulo(),
                registro.getNome(),
                registro.getCpf(),
                registro.getDtLimite(),
                registro.getSituacao()
            };
            //adiciona a linha no modelo da tabela
            model.addRow(row);
        }
        //adiciona o modelo novamente na tabela
        tabelaGerEmprestimo.setModel(model);

        //Atualiza a parte grafica da tabela mostrando os novos valores
        tabelaGerEmprestimo.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGerEmprestimo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cTxtBuscaGerEmprestimo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGerEmprestimo = new javax.swing.JTable();
        btCadastrarGerEmprestimos = new javax.swing.JButton();
        finalizarGerEmprestimo = new javax.swing.JButton();
        btVoltarGerEmprestimos = new javax.swing.JButton();
        btAdvertenciaGerEmprestimos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Termo para busca:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("(Digite o nome do usuário ou do autor!)");

        cTxtBuscaGerEmprestimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtBuscaGerEmprestimoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout painelGerEmprestimoLayout = new javax.swing.GroupLayout(painelGerEmprestimo);
        painelGerEmprestimo.setLayout(painelGerEmprestimoLayout);
        painelGerEmprestimoLayout.setHorizontalGroup(
            painelGerEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGerEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cTxtBuscaGerEmprestimo)
                    .addGroup(painelGerEmprestimoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGerEmprestimoLayout.setVerticalGroup(
            painelGerEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGerEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cTxtBuscaGerEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE EMPRÉSTIMOS");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Busca");

        tabelaGerEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Título", "N° Chamada", "Data Limite", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaGerEmprestimo);

        btCadastrarGerEmprestimos.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btCadastrarGerEmprestimos.setText("Cadastrar");
        btCadastrarGerEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarGerEmprestimosActionPerformed(evt);
            }
        });

        finalizarGerEmprestimo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        finalizarGerEmprestimo.setText("Finalizar");
        finalizarGerEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarGerEmprestimoActionPerformed(evt);
            }
        });

        btVoltarGerEmprestimos.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btVoltarGerEmprestimos.setText("Voltar");
        btVoltarGerEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarGerEmprestimosActionPerformed(evt);
            }
        });

        btAdvertenciaGerEmprestimos.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btAdvertenciaGerEmprestimos.setText("Advertência");
        btAdvertenciaGerEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdvertenciaGerEmprestimosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(painelGerEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(btAdvertenciaGerEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btCadastrarGerEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(finalizarGerEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btVoltarGerEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(painelGerEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarGerEmprestimos)
                    .addComponent(finalizarGerEmprestimo)
                    .addComponent(btVoltarGerEmprestimos)
                    .addComponent(btAdvertenciaGerEmprestimos))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarGerEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarGerEmprestimosActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        new TelaCadastroEmprestimo().setVisible(true);

    }//GEN-LAST:event_btCadastrarGerEmprestimosActionPerformed

    private void finalizarGerEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarGerEmprestimoActionPerformed
        //             
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja finalizar empréstimo?", "", JOptionPane.YES_NO_OPTION);
        switch (resposta) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Empréstimo finalizado");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Empréstimo NÃO finalizado");
                break;
        }
    }//GEN-LAST:event_finalizarGerEmprestimoActionPerformed

    private void btVoltarGerEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarGerEmprestimosActionPerformed

        setVisible(false);
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_btVoltarGerEmprestimosActionPerformed

    private void btAdvertenciaGerEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdvertenciaGerEmprestimosActionPerformed
        // TODO add your handling code here:

        /*setVisible(false);
        new TelaAdvertencia().setVisible(true);*/
    }//GEN-LAST:event_btAdvertenciaGerEmprestimosActionPerformed

    private void cTxtBuscaGerEmprestimoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtBuscaGerEmprestimoKeyReleased
        // TODO add your handling code here:

        cTxtBuscaGerEmprestimo.setText(cTxtBuscaGerEmprestimo.getText().toUpperCase());
    }//GEN-LAST:event_cTxtBuscaGerEmprestimoKeyReleased

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
            java.util.logging.Logger.getLogger(TelaGerenciarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdvertenciaGerEmprestimos;
    private javax.swing.JButton btCadastrarGerEmprestimos;
    private javax.swing.JButton btVoltarGerEmprestimos;
    private javax.swing.JTextField cTxtBuscaGerEmprestimo;
    private javax.swing.JButton finalizarGerEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel painelGerEmprestimo;
    private javax.swing.JTable tabelaGerEmprestimo;
    // End of variables declaration//GEN-END:variables
}
