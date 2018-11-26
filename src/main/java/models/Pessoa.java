package models;
// Generated 23/11/2018 17:35:30 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pessoa generated by hbm2java
 */
public class Pessoa  implements java.io.Serializable {


     private int idPessoa;
     private String matriculaPessoa;
     private String nomePessoa;
     private Date dtnascimento;
     private String cpfPessoa;
     private char tipo;
     private Set contatos = new HashSet(0);
     private Set emprestimos = new HashSet(0);
     private Set bibliotecarias = new HashSet(0);
     private Set professors = new HashSet(0);
     private Set alunos = new HashSet(0);
     private Set enderecos = new HashSet(0);

    public Pessoa() {
    }

	
    public Pessoa(int idPessoa, String matriculaPessoa, String nomePessoa, Date dtnascimento, String cpfPessoa, char tipo) {
        this.idPessoa = idPessoa;
        this.matriculaPessoa = matriculaPessoa;
        this.nomePessoa = nomePessoa;
        this.dtnascimento = dtnascimento;
        this.cpfPessoa = cpfPessoa;
        this.tipo = tipo;
    }
    public Pessoa(int idPessoa, String matriculaPessoa, String nomePessoa, Date dtnascimento, String cpfPessoa, char tipo, Set contatos, Set emprestimos, Set bibliotecarias, Set professors, Set alunos, Set enderecos) {
       this.idPessoa = idPessoa;
       this.matriculaPessoa = matriculaPessoa;
       this.nomePessoa = nomePessoa;
       this.dtnascimento = dtnascimento;
       this.cpfPessoa = cpfPessoa;
       this.tipo = tipo;
       this.contatos = contatos;
       this.emprestimos = emprestimos;
       this.bibliotecarias = bibliotecarias;
       this.professors = professors;
       this.alunos = alunos;
       this.enderecos = enderecos;
    }
   
    public int getIdPessoa() {
        return this.idPessoa;
    }
    
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getMatriculaPessoa() {
        return this.matriculaPessoa;
    }
    
    public void setMatriculaPessoa(String matriculaPessoa) {
        this.matriculaPessoa = matriculaPessoa;
    }
    public String getNomePessoa() {
        return this.nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public Date getDtnascimento() {
        return this.dtnascimento;
    }
    
    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }
    public String getCpfPessoa() {
        return this.cpfPessoa;
    }
    
    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }
    public char getTipo() {
        return this.tipo;
    }
    
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public Set getContatos() {
        return this.contatos;
    }
    
    public void setContatos(Set contatos) {
        this.contatos = contatos;
    }
    public Set getEmprestimos() {
        return this.emprestimos;
    }
    
    public void setEmprestimos(Set emprestimos) {
        this.emprestimos = emprestimos;
    }
    public Set getBibliotecarias() {
        return this.bibliotecarias;
    }
    
    public void setBibliotecarias(Set bibliotecarias) {
        this.bibliotecarias = bibliotecarias;
    }
    public Set getProfessors() {
        return this.professors;
    }
    
    public void setProfessors(Set professors) {
        this.professors = professors;
    }
    public Set getAlunos() {
        return this.alunos;
    }
    
    public void setAlunos(Set alunos) {
        this.alunos = alunos;
    }
    public Set getEnderecos() {
        return this.enderecos;
    }
    
    public void setEnderecos(Set enderecos) {
        this.enderecos = enderecos;
    }




}

