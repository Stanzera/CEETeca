package models;
// Generated 23/11/2018 17:35:30 by Hibernate Tools 4.3.1



/**
 * ProfessorHasCurso generated by hbm2java
 */
public class ProfessorHasCurso  implements java.io.Serializable {


     private int idProfessorHasCurso;
     private Curso curso;
     private Professor professor;

    public ProfessorHasCurso() {
    }

    public ProfessorHasCurso(int idProfessorHasCurso, Curso curso, Professor professor) {
       this.idProfessorHasCurso = idProfessorHasCurso;
       this.curso = curso;
       this.professor = professor;
    }
   
    public int getIdProfessorHasCurso() {
        return this.idProfessorHasCurso;
    }
    
    public void setIdProfessorHasCurso(int idProfessorHasCurso) {
        this.idProfessorHasCurso = idProfessorHasCurso;
    }
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Professor getProfessor() {
        return this.professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }




}

