/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodel;

import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "telaprincipal")
@Immutable
public class viewTabelaTelaPrincipal {
    /* create view telaPrincipal as
select distinct pessoa.nomePessoa as Nome, pessoa.matriculaPessoa as Matricula_Nº_Funcional, livro.tituloLivro as Titulo_Livro,
emprestimo.idEmprestimo as Nº_Chamada, emprestimo.dtDevolucaoEmprestimo as Limite_Data,
emprestimo.observacaoEmprestimo as Situacao
from pessoa
inner join emprestimo on pessoa.idPessoa = emprestimo.idEmprestimo
inner join livro_has_emprestimo on emprestimo_idEmprestimo = emprestimo.idEmprestimo
inner join exemplar ON livro_has_emprestimo.exemplar_idExemplar = exemplar.idExemplar
inner join livro ON exemplar.livro_idLivro = livro.idLivro*/
    @Id
    @Column(name = "Matricula_Nº_Funcional")
    private String Matricula;
    
    @Column(name = "Nome")
    private String Nome;

    @Column(name="Titulo_Livro")
    private String tituloLivro;

    @Column(name="Nº_Chamada")
    private int nChamada;

    @Column(name="Limite_Data")
    @Temporal(TemporalType.DATE)
    private Date dataLimite;
    
    @Column(name="Situacao")
    private String situacao;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public int getnChamada() {
        return nChamada;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setnChamada(int nChamada) {
        this.nChamada = nChamada;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }
    
}
