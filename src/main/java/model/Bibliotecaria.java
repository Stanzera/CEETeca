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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */

@Entity
@Table(name = "bibliotecaria")
public class Bibliotecaria {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bibliotecariaSeq")
    @SequenceGenerator(name="bibliotecarioSeq", sequenceName="biblio_seq")
    @Column(name="numeroFuncionalBibliotecaria")
    private Long numeroFuncionalBibliotecaria;
    private String senhaBibliotecaria;
    //tirar duvida sobre chave estrangeira e sobre o numero funcional.
    //Se vai colocar o de cada tabela ou vai usar o extends para pegar
    //da tabela de pessoa e atribuir a tabela bibliotecario.


    public Long getNumeroFuncionalBibliotecaria() {
        return numeroFuncionalBibliotecaria;
    }

    public void setNumeroFuncionalBibliotecaria(Long numeroFuncionalBibliotecaria) {
        this.numeroFuncionalBibliotecaria = numeroFuncionalBibliotecaria;
    }
    
}
