/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Aluno
 */
@Entity
public class Livro {

    @Id
    private Long cddLivro;
    
    private String tituloLivro ;
    private String subTituloLivro;
    private String autorLivro;
    private String editoraLivro;
    private String edicaoLivro;
    private String serieLivro; //passar para INT
    private String anoLivro;
    private String paginas; //passar para INT
    private String assunto;
    private String isbn;
    private String idioma;
        
    
    public Long getCddLivro() {
        return cddLivro;
    }

    public void setCddLivro(Long cddLivro) {
        this.cddLivro = cddLivro;
    }
    
}
