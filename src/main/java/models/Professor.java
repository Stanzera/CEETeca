package models;
// Generated 27/11/2018 14:35:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Professor generated by hbm2java
 */
public class Professor  implements java.io.Serializable {


     private int idProfessor;
     private Pessoa pessoa;
     private Set professorHasCursos = new HashSet(0);

    public Professor() {
    }

	
    public Professor(int idProfessor, Pessoa pessoa) {
        this.idProfessor = idProfessor;
        this.pessoa = pessoa;
    }
    public Professor(int idProfessor, Pessoa pessoa, Set professorHasCursos) {
       this.idProfessor = idProfessor;
       this.pessoa = pessoa;
       this.professorHasCursos = professorHasCursos;
    }
   
    public int getIdProfessor() {
        return this.idProfessor;
    }
    
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Set getProfessorHasCursos() {
        return this.professorHasCursos;
    }
    
    public void setProfessorHasCursos(Set professorHasCursos) {
        this.professorHasCursos = professorHasCursos;
    }




}


