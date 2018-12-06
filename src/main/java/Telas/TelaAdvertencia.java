/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.NewHibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Advertencia;
import models.Pessoa;
import org.hibernate.Session;

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

        ImageIcon icone = new ImageIcon(getClass().getResource("/images/ceetecaicon16x16.png"));
        this.setIconImage(icone.getImage());

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
                + "order by e.idEmprestimo;").addEntity(viewmodel.viewAdvertencia.class);

        //pega o resultado da query e retorna uma lista
        List<viewmodel.viewAdvertencia> registrosTelaPrincipal = q.getResultList();
        sessao.getTransaction().commit();
        sessao.close();

        //pega o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tabelaTelaAdvertencia.getModel();

        for (int i = 0; i < registrosTelaPrincipal.size(); i++) {
            //Pega o dado do registro usando i
            viewmodel.viewAdvertencia registro = registrosTelaPrincipal.get(i);
            //adiciona os valores na linha
            Object[] row = {
                registro.getId(),
                registro.getTitulo(),
                registro.getNome(),
                registro.getCpf()
            };
            //adiciona a linha no modelo da tabela
            model.addRow(row);
        }
        //adiciona o modelo novamente na tabela
        tabelaTelaAdvertencia.setModel(model);

        //Atualiza a parte grafica da tabela mostrando os novos valores
        tabelaTelaAdvertencia.setVisible(true);

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
        lblNomeTelaAdvertencia = new javax.swing.JLabel();
        cTxtNomeAdvertencia = new javax.swing.JTextField();
        cTxtDtAdvertencia = new javax.swing.JFormattedTextField();
        lblDtAdvertenciaTelaAdvertencia = new javax.swing.JLabel();
        lblTipoTelaAdvertencia = new javax.swing.JLabel();
        cListTipoAdvertencia = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaTelaAdvertencia = new javax.swing.JTable();
        btRegistrarTelaAdvertencia = new javax.swing.JButton();
        btVoltarTelaAdvertencia = new javax.swing.JButton();
        btRegistrarTelaAdvertencia1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        cTxtDescricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CEETECA");
        setResizable(false);

        lblDescricaoTelaAdvertencia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDescricaoTelaAdvertencia.setText("Descrição da advertência:");

        lblNomeTelaAdvertencia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblNomeTelaAdvertencia.setText("Nome:");

        cTxtNomeAdvertencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtNomeAdvertenciaKeyReleased(evt);
            }
        });

        try {
            cTxtDtAdvertencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
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

            },
            new String [] {
                "N° Chamada", "Titulo", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        cTxtDescricao.setColumns(20);
        cTxtDescricao.setRows(5);
        jScrollPane3.setViewportView(cTxtDescricao);

        javax.swing.GroupLayout pnGeralAdvertenciaLayout = new javax.swing.GroupLayout(pnGeralAdvertencia);
        pnGeralAdvertencia.setLayout(pnGeralAdvertenciaLayout);
        pnGeralAdvertenciaLayout.setHorizontalGroup(
            pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeralAdvertenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGeralAdvertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGeralAdvertenciaLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
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
                                .addComponent(cTxtDtAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(cTxtDtAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblDescricaoTelaAdvertencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        String nomeDoMeliante = cTxtNomeAdvertencia.getText();
        Date dtAdv = null;
        try {
            SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
            dtAdv = out.parse(cTxtDtAdvertencia.getText());
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadBibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
        String obs = cTxtDescricao.getText();

        Advertencia adv = new Advertencia();
        adv.setDescricaoAdvertencia(obs);
        adv.setDtAdvertencia(dtAdv);
        Pessoa pss = new Pessoa();
        pss.setNomePessoa(nomeDoMeliante);

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja aplicar advertência?", "", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            try (Session actualSession = NewHibernateUtil.getSessionFactory().openSession()) {
                actualSession.beginTransaction();
                actualSession.saveOrUpdate(pss);
                actualSession.saveOrUpdate(adv);
                actualSession.getTransaction().commit();
                actualSession.close();
                JOptionPane.showMessageDialog(null, "Advertência aplicada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Advertência NÃO aplicada");
        }

    }//GEN-LAST:event_btRegistrarTelaAdvertenciaActionPerformed

    private void cTxtNomeAdvertenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtNomeAdvertenciaKeyReleased
        // TODO add your handling code here:
        cTxtNomeAdvertencia.setText(cTxtNomeAdvertencia.getText().toUpperCase());
    }//GEN-LAST:event_cTxtNomeAdvertenciaKeyReleased

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
    private javax.swing.JButton btRegistrarTelaAdvertencia;
    private javax.swing.JButton btRegistrarTelaAdvertencia1;
    private javax.swing.JButton btVoltarTelaAdvertencia;
    private javax.swing.JComboBox<String> cListTipoAdvertencia;
    private javax.swing.JTextArea cTxtDescricao;
    private javax.swing.JFormattedTextField cTxtDtAdvertencia;
    private javax.swing.JTextField cTxtNomeAdvertencia;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDescricaoTelaAdvertencia;
    private javax.swing.JLabel lblDtAdvertenciaTelaAdvertencia;
    private javax.swing.JLabel lblNomeTelaAdvertencia;
    private javax.swing.JLabel lblTipoTelaAdvertencia;
    private javax.swing.JPanel pnGeralAdvertencia;
    private javax.swing.JTable tabelaTelaAdvertencia;
    // End of variables declaration//GEN-END:variables
}
