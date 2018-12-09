/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.NewHibernateUtil;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import models.Bibliotecaria;
import models.Contato;
import models.Emprestimo;
import models.Endereco;
import org.hibernate.Session;
import viewmodel.viewGerBibliotecaria;

/**
 *
 * @author PC
 */
public class TelaGerenciarBibliotecario extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciarBiblitecario
     */
    public TelaGerenciarBibliotecario() {
        initComponents();

        ImageIcon icone = new ImageIcon(getClass().getResource("/images/ceetecaicon16x16.png"));
        this.setIconImage(icone.getImage());

        listarCadastros();
    }

    public void listarCadastros() {
        Session sessao = NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        //Chama a view
        Query q = sessao.createSQLQuery("SELECT bi.idBibliotecaria, p.nomePessoa as Nome , p.cpfPessoa as CPF, c.emailContato as E_mail, c.telefoneContato as Telefone, c.CelularContato as Celular\n"
                + "\n"
                + "FROM pessoa p, bibliotecaria bi, contato c\n"
                + "\n"
                + "WHERE p.idPessoa = bi.pessoa_idPessoa and p.idPessoa = c.pessoa_idPessoa\n"
                + "order by p.nomePessoa;").addEntity(viewmodel.viewGerBibliotecaria.class);
        
        //pega o resultado da query e retorna uma lista
        List<viewmodel.viewGerBibliotecaria> registrosTelaPrincipal = q.getResultList();
        sessao.getTransaction().commit();
        sessao.close();
        
        //pega o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tabelaGerBibliotecario.getModel();

        for (int i = 0; i < registrosTelaPrincipal.size(); i++) {
            //Pega o dado do registro usando i
            viewmodel.viewGerBibliotecaria registro = registrosTelaPrincipal.get(i);
            //adiciona os valores na linha
            Object[] row = {
                registro.getId(),
                registro.getNome(),
                registro.getCpf(),
                registro.getEmail(),
                registro.getTelefone(),
                registro.getCelular()
            };
            //adiciona a linha no modelo da tabela
            model.addRow(row);
        }
        //adiciona o modelo novamente na tabela
        tabelaGerBibliotecario.setModel(model);

        //Atualiza a parte grafica da tabela mostrando os novos valores
        tabelaGerBibliotecario.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGerBibliotecario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cTxtBuscaGerBibliotecario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGerBibliotecario = new javax.swing.JTable();
        btVoltarGerBibliotecario = new javax.swing.JButton();
        btExcluirGerBibliotecario = new javax.swing.JButton();
        btEditarGerBibliotecario = new javax.swing.JButton();
        btCadastrarGerBibliotecario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CEETECA");
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Termo para busca:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("(Digite o nome ou CPF do bibliotecário!)");

        cTxtBuscaGerBibliotecario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtBuscaGerBibliotecarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout painelGerBibliotecarioLayout = new javax.swing.GroupLayout(painelGerBibliotecario);
        painelGerBibliotecario.setLayout(painelGerBibliotecarioLayout);
        painelGerBibliotecarioLayout.setHorizontalGroup(
            painelGerBibliotecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerBibliotecarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGerBibliotecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cTxtBuscaGerBibliotecario)
                    .addGroup(painelGerBibliotecarioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 392, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGerBibliotecarioLayout.setVerticalGroup(
            painelGerBibliotecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerBibliotecarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGerBibliotecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cTxtBuscaGerBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE BIBLIOTECÁRIO");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Busca");

        tabelaGerBibliotecario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "CPF", "Nome", "E-mail", "Telefone", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGerBibliotecario.setToolTipText("");
        jScrollPane1.setViewportView(tabelaGerBibliotecario);

        btVoltarGerBibliotecario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btVoltarGerBibliotecario.setText("Voltar");
        btVoltarGerBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarGerBibliotecarioActionPerformed(evt);
            }
        });

        btExcluirGerBibliotecario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btExcluirGerBibliotecario.setText("Excluir");
        btExcluirGerBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirGerBibliotecarioActionPerformed(evt);
            }
        });

        btEditarGerBibliotecario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btEditarGerBibliotecario.setText("Editar");
        btEditarGerBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarGerBibliotecarioActionPerformed(evt);
            }
        });

        btCadastrarGerBibliotecario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btCadastrarGerBibliotecario.setText("Cadastrar");
        btCadastrarGerBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarGerBibliotecarioActionPerformed(evt);
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
                                .addGap(271, 271, 271)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(painelGerBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCadastrarGerBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btEditarGerBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btExcluirGerBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btVoltarGerBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGerBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarGerBibliotecario)
                    .addComponent(btExcluirGerBibliotecario)
                    .addComponent(btEditarGerBibliotecario)
                    .addComponent(btCadastrarGerBibliotecario))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarGerBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarGerBibliotecarioActionPerformed

        this.setVisible(false);
        new TelaCadBibliotecario().setVisible(true);
    }//GEN-LAST:event_btCadastrarGerBibliotecarioActionPerformed

    private void btVoltarGerBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarGerBibliotecarioActionPerformed
        // Volta para a tela anterior

        setVisible(false);
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_btVoltarGerBibliotecarioActionPerformed

    private void cTxtBuscaGerBibliotecarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtBuscaGerBibliotecarioKeyReleased
        // TODO add your handling code here:

        cTxtBuscaGerBibliotecario.setText(cTxtBuscaGerBibliotecario.getText().toUpperCase());
    }//GEN-LAST:event_cTxtBuscaGerBibliotecarioKeyReleased

    private void btExcluirGerBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirGerBibliotecarioActionPerformed
       
         int sim = JOptionPane.showConfirmDialog(null, "Deseja excluir?", "", JOptionPane.YES_NO_OPTION);

        if (sim == JOptionPane.YES_NO_OPTION) {
            // metodo editar         
            this.setVisible(false);

            DefaultTableModel dtm = (DefaultTableModel) tabelaGerBibliotecario.getModel();

            //Pega a linha da jtable
            Vector row = (Vector) dtm.getDataVector().elementAt(tabelaGerBibliotecario.getSelectedRow());

            //Abre a sessão
            Session sessao = NewHibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            //Pega o primeiro valor da linha
            int id = (int) row.get(0);
            
            Bibliotecaria bibliotecaria =(Bibliotecaria)sessao.get(Bibliotecaria.class, id);
            
            //conferir
            //Pega o objeto 
            
            List<Endereco> enderecos =  new ArrayList<Endereco>(bibliotecaria.getPessoa().getEnderecos());
            
            for(Endereco endereco : enderecos){
                sessao.remove(endereco);
            }
            sessao.getTransaction().commit();
            sessao.beginTransaction();
            
            List<Contato> contatos = new ArrayList<Contato>(bibliotecaria.getPessoa().getContatos());
            
            for(Contato contato : contatos){
                sessao.remove(contato);
            }
            
             sessao.getTransaction().commit();
             sessao.beginTransaction();
             
             List<Emprestimo> emprestimos = new ArrayList<>(bibliotecaria.getPessoa().getEmprestimos());
            
            for(Emprestimo emprestimo  : emprestimos){
                sessao.remove(emprestimo);
            }
            
             sessao.getTransaction().commit();
             sessao.beginTransaction();
            
   
            //Deleta o objeto do banco
            sessao.remove(bibliotecaria);
            sessao.getTransaction().commit();
            sessao.close();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");

            TelaCadBibliotecario tela = new TelaCadBibliotecario();

            tela.SetInformacoes(bibliotecaria);

            tela.setVisible(true);

            this.dispose();

            //JOptionPane.showMessageDialog(null, "Alteração Realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão não realizada");
        }
 
    }//GEN-LAST:event_btExcluirGerBibliotecarioActionPerformed

    private void btEditarGerBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarGerBibliotecarioActionPerformed
        int sim = JOptionPane.showConfirmDialog(null, "Deseja editar?", "", JOptionPane.YES_NO_OPTION);

        if (sim == 0) {
            // metodo editar         
            this.setVisible(false);

            DefaultTableModel dtm = (DefaultTableModel) tabelaGerBibliotecario.getModel();

            //Pega a linha da jtable
            Vector row = (Vector) dtm.getDataVector().elementAt(tabelaGerBibliotecario.getSelectedRow());

            //Abre a sessão
            Session sessao = NewHibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            //Pega o primeiro valor da linha
            int id = (int) row.get(0);

            //Pega o objeto bibliotecario
            Bibliotecaria bibliotecario = sessao.get(Bibliotecaria.class, id);

            TelaCadBibliotecario tela = new TelaCadBibliotecario();

            tela.SetInformacoes(bibliotecario);

            tela.setVisible(true);

            this.dispose();

            //JOptionPane.showMessageDialog(null, "Alteração Realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Alteração NÃO realizada");
        }
    }//GEN-LAST:event_btEditarGerBibliotecarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciarBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarBibliotecario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarGerBibliotecario;
    private javax.swing.JButton btEditarGerBibliotecario;
    private javax.swing.JButton btExcluirGerBibliotecario;
    private javax.swing.JButton btVoltarGerBibliotecario;
    private javax.swing.JTextField cTxtBuscaGerBibliotecario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel painelGerBibliotecario;
    private javax.swing.JTable tabelaGerBibliotecario;
    // End of variables declaration//GEN-END:variables
}
