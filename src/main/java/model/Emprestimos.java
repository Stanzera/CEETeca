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
public class Emprestimos {

    @Id
    private int codigoEmprestimo;
    
    private String quantidadeLivroEmprestimo; //converter para INT
    private String dtSaidaEmprestimo; //converter para DATE
    private String dtDevolucaoEmprestimo; ////converter para DATE
    //Chave estrangeira perguntar ao Saulo.

    public int getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }
    
    
}
