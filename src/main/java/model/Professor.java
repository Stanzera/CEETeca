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
public class Professor {

    @Id
    private int numeroFuncionalProfessor;
    

    public int getNumeroFuncionalProfessor() {
        return numeroFuncionalProfessor;
    }

    public void setNumeroFuncionalProfessor(int numeroFuncionalProfessor) {
        this.numeroFuncionalProfessor = numeroFuncionalProfessor;
    }
    
    
}
