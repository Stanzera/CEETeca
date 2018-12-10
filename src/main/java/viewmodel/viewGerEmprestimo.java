/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author Aluno
 */
/*
SELECT distinct p.nomePessoa as Nome,
p.cpfPessoa as CPF,
l.tituloLivro as Titulo,
e.idEmprestimo as N_Chamada,
e.dtDevolucaoEmprestimo as Data_Limite,
e.observacaoEmprestimo as Situacao 
FROM pessoa p, emprestimo e, exemplar ex, livro l, livro_has_emprestimo le

WHERE  p.idpessoa = e.pessoa_idPessoa and e.idEmprestimo = le.emprestimo_idEmprestimo 
and le.exemplar_idExemplar = ex.idExemplar and ex.livro_idLivro = l.idLivro

 
order by e.idEmprestimo;
*/
@Entity
@Immutable
public class viewGerEmprestimo {
    
    
    @Column(name="Nome")
    private String nome;
    @Column(name="CPF")
    private String cpf;
    @Column(name="Titulo")
    private String titulo;
    @Id
    @Column(name="N_Chamada")
    private int nChamada;
    @Column(name="Data_Limite")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtLimite;
    @Column(name="Situacao")
    private String situacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnChamada() {
        return nChamada;
    }

    public void setnChamada(int nChamada) {
        this.nChamada = nChamada;
    }

    public Date getDtLimite() {
        return dtLimite;
    }

    public void setDtLimite(Date dtLimite) {
        this.dtLimite = dtLimite;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}






