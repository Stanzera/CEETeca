/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Aluno
 */

@Entity
public class Bibliotecaria {

    @Id
    private Long numeroFuncionalBibliotecaria;
    

    public Long getNumeroFuncionalBibliotecaria() {
        return numeroFuncionalBibliotecaria;
    }

    public void setNumeroFuncionalBibliotecaria(Long numeroFuncionalBibliotecaria) {
        this.numeroFuncionalBibliotecaria = numeroFuncionalBibliotecaria;
    }
    
}
