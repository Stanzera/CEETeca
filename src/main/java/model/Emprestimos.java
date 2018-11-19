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
import javax.persistence.OneToMany;

/**
 *
 * @author Aluno
 */
@Entity
public class Emprestimos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigoEmprestimo")
    private int codigoEmprestimo;
    @Column(name = "quantidadeLivroEmprestimo")
    private String quantidadeLivroEmprestimo; //converter para INT
    @Column(name = "dtSaidaEmprestimo")
    private String dtSaidaEmprestimo; //converter para DATE
    @Column(name = "dtDevolucaoEmprestimo")
    private String dtDevolucaoEmprestimo; ////converter para DATE
    //Chave estrangeira perguntar ao Saulo.
    @OneToMany(mappedBy = "pessoa_codigoPessoa")
    private Pessoa codigoPessoa;

    public int getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public String getQuantidadeLivroEmprestimo() {
        return quantidadeLivroEmprestimo;
    }

    public void setQuantidadeLivroEmprestimo(String quantidadeLivroEmprestimo) {
        this.quantidadeLivroEmprestimo = quantidadeLivroEmprestimo;
    }

    public String getDtSaidaEmprestimo() {
        return dtSaidaEmprestimo;
    }

    public void setDtSaidaEmprestimo(String dtSaidaEmprestimo) {
        this.dtSaidaEmprestimo = dtSaidaEmprestimo;
    }

    public String getDtDevolucaoEmprestimo() {
        return dtDevolucaoEmprestimo;
    }

    public void setDtDevolucaoEmprestimo(String dtDevolucaoEmprestimo) {
        this.dtDevolucaoEmprestimo = dtDevolucaoEmprestimo;
    }

    public Pessoa getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(Pessoa codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

}
