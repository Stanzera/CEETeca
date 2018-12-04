/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodel;

import javax.persistence.*;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author Aluno
 */
/*SELECT p.nomePessoa as Nome , 
p.cpfPessoa as CPF, 
c.emailContato as E_mail, 
c.telefoneContato as Telefone, 
c.CelularContato as Celular

FROM pessoa p, professor pe, contato c

WHERE p.idPessoa = pe.pessoa_idpessoa and p.idPessoa= c.pessoa_idPessoa
order by p.nomePessoa;
*/
@Entity
@Immutable
public class viewGerProfessor {
    @Id
    @Column(name="CPF")
    private String CPF;
    
    @Column(name="Nome")
    private String nome;
    
    @Column(name="E_mail")
    private String email;
    
    @Column(name="Telefone")
    private String telefone;
    
    @Column(name="Celular")
    private String celular;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
