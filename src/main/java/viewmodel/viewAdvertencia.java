/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author Aluno
 */
/*
select distinct p.nomePessoa as Nome, p.cpfPessoa as CPF, e.idEmprestimo, l.tituloLivro as Titulo

from pessoa p, emprestimo e, livro l, livro_has_emprestimo le, exemplar ex

where p.idPessoa = e.pessoa_idPessoa and e.idEmprestimo = le.emprestimo_idEmprestimo 
and le.emprestimo_idEmprestimo = ex.livro_idLivro and ex.livro_idLivro = l.idLivro
*/
@Entity
@Immutable
public class viewAdvertencia {
    
    @Id
    @Column(name="idEmprestimo")
    private int id;
    @Column(name="Titulo")
    private String titulo;
    @Column(name="Nome")
    private String nome;
    @Column(name="CPF")
    private String cpf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
