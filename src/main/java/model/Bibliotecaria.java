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
    private int numeroFuncionalBibliotecaria;
    private String senhaBibliotecaria;
    //tirar duvida sobre chave estrangeira e sobre o numero funcional.
    //Se vai colocar o de cada tabela ou vai usar o extends para pegar
    //da tabela de pessoa e atribuir a tabela bibliotecario.


    public int getNumeroFuncionalBibliotecaria() {
        return numeroFuncionalBibliotecaria;
    }

    public void setNumeroFuncionalBibliotecaria(int numeroFuncionalBibliotecaria) {
        this.numeroFuncionalBibliotecaria = numeroFuncionalBibliotecaria;
    }
    
}
