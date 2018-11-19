/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Aluno
 */
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cddLivro")
    private int cddLivro;
    @Column(name = "tituloLivro")
    private String tituloLivro ;
    @Column(name = "subTituloLivro")
    private String subTituloLivro;
    @Column(name = "autorLivro")
    private String autorLivro;
    @Column(name = "editoraLivro")
    private String editoraLivro;
    @Column(name = "edicaoLivro")
    private String edicaoLivro;
    @Column(name = "serieLivro")
    private String serieLivro; //passar para INT
    @Column(name = "anoLivro")
    private String anoLivro;
    @Column(name = "paginas")
    private String paginas; //passar para INT
    @Column(name = "assunto")
    private String assunto;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "idioma")
    private String idioma;
        
    
    public int getCddLivro() {
        return cddLivro;
    }

    public void setCddLivro(int cddLivro) {
        this.cddLivro = cddLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getSubTituloLivro() {
        return subTituloLivro;
    }

    public void setSubTituloLivro(String subTituloLivro) {
        this.subTituloLivro = subTituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getEdicaoLivro() {
        return edicaoLivro;
    }

    public void setEdicaoLivro(String edicaoLivro) {
        this.edicaoLivro = edicaoLivro;
    }

    public String getSerieLivro() {
        return serieLivro;
    }

    public void setSerieLivro(String serieLivro) {
        this.serieLivro = serieLivro;
    }

    public String getAnoLivro() {
        return anoLivro;
    }

    public void setAnoLivro(String anoLivro) {
        this.anoLivro = anoLivro;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}
