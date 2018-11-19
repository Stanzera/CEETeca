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
@Table(name = "bibliotecaria")
public class Bibliotecaria {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="numeroFuncionalBibliotecaria")
    private Long numeroFuncionalBibliotecaria;
    @Column(name="senhaBibliotecaria")
    private String senhaBibliotecaria;
    @OneToOne
    @JoinColumn(name="pessoa_codigoPessoa")
    private Pessoa codigoPessoa;
    //tirar duvida sobre chave estrangeira e sobre o numero funcional.
    //Se vai colocar o de cada tabela ou vai usar o extends para pegar
    //da tabela de pessoa e atribuir a tabela bibliotecario.


    public Long getNumeroFuncionalBibliotecaria() {
        return numeroFuncionalBibliotecaria;
    }

    public void setNumeroFuncionalBibliotecaria(Long numeroFuncionalBibliotecaria) {
        this.numeroFuncionalBibliotecaria = numeroFuncionalBibliotecaria;
    }

    public String getSenhaBibliotecaria() {
        return senhaBibliotecaria;
    }

    public void setSenhaBibliotecaria(String senhaBibliotecaria) {
        this.senhaBibliotecaria = senhaBibliotecaria;
    }

    public Pessoa getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(Pessoa codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }
    
}
