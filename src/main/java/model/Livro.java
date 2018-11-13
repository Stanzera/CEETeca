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
    
    private String nomePessoa;
    
    
    public Long getCddLivro() {
        return cddLivro;
    }

    public void setCddLivro(Long cddLivro) {
        this.cddLivro = cddLivro;
    }
    
}
