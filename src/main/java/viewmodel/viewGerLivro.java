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
SELECT distinct l.idLivro as N_Chamada ,
l.tituloLivro as Titulo,
l.autorLivro as Autor,
l.assunto as Assunto,
l.editoraLivro as Editora,
e.quantidadeExemplar as Quantidade

FROM livro l, exemplar e

WHERE l.idlivro = e.livro_idLivro
order by l.idLivro;
*/
@Entity
@Immutable
public class viewGerLivro {
    
    @Id
    @Column(name="N_Chamada")
    private int nChamada;
    
    @Column(name="Titulo")
    private String titulo;
    
    @Column(name="Autor")
    private String autor;
    
    @Column(name="Assunto")
    private String assunto;
    
    @Column(name="Editora")
    private String editora;
    
    @Column(name="Quantidade")
    private int quantidadeEx;

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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQuantidadeEx() {
        return quantidadeEx;
    }

    public void setQuantidadeEx(int quantidadeEx) {
        this.quantidadeEx = quantidadeEx;
    }
    
}
