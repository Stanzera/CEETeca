/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author Aluno
 */
/*
select distinct e.idEmprestimo as N_Chamada, l.tituloLivro as Titulo, l.autorLivro as Autor, l.assunto as Assunto, e.observacaoEmprestimo
 as Situacao
from livro l, emprestimo e, livro_has_emprestimo le, exemplar ex

where e.idEmprestimo = le.emprestimo_idEmprestimo and le.exemplar_idExemplar= ex.idExemplar and  ex.livro_idLivro = l.idLivro

*/
@Entity
@Immutable
public class selectBuscarCadEmprestimo {
    
    @Id
    @Column(name="N_Chamada")
    private int nChamada;
    
    @Column(name="Titulo")
    private String titulo;
    
    @Column(name="Autor")
    private String autor;
    
    @Column(name="Assunto")
    private String assunto;
    
    @Column(name="Situacao")
    private String situacao;

    public int getnChamada() {
        return nChamada;
    }

    public void setnChamada(int nChamada) {
        this.nChamada = nChamada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
}
