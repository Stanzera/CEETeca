package models;
// Generated 27/11/2018 14:35:48 by Hibernate Tools 4.3.1



/**
 * AlunoHasCurso generated by hbm2java
 */
public class AlunoHasCurso  implements java.io.Serializable {


     private int idalunoHasCurso;
     private Aluno aluno;
     private Curso curso;

    public AlunoHasCurso() {
    }

    public AlunoHasCurso(int idalunoHasCurso, Aluno aluno, Curso curso) {
       this.idalunoHasCurso = idalunoHasCurso;
       this.aluno = aluno;
       this.curso = curso;
    }
   
    public int getIdalunoHasCurso() {
        return this.idalunoHasCurso;
    }
    
    public void setIdalunoHasCurso(int idalunoHasCurso) {
        this.idalunoHasCurso = idalunoHasCurso;
    }
    public Aluno getAluno() {
        return this.aluno;
    }
    
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }




}


