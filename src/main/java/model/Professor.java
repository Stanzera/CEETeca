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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */

@Entity
@Table(name="professor")
public class Professor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="numeroFuncionalProfessor")
    private int numeroFuncionalProfessor;
    @OneToOne
    @JoinColumn(name="pessoa_codigoPessoa")
    private int codigoPessoa;
    
    
    public int getNumeroFuncionalProfessor() {
        return numeroFuncionalProfessor;
    }

    public void setNumeroFuncionalProfessor(int numeroFuncionalProfessor) {
        this.numeroFuncionalProfessor = numeroFuncionalProfessor;
    }

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }
    
    
}
