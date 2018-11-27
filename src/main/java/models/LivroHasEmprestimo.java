package models;
// Generated 27/11/2018 14:35:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LivroHasEmprestimo generated by hbm2java
 */
public class LivroHasEmprestimo  implements java.io.Serializable {


     private int idLivroEmprestimo;
     private Emprestimo emprestimo;
     private Exemplar exemplar;
     private Set advertencias = new HashSet(0);

    public LivroHasEmprestimo() {
    }

	
    public LivroHasEmprestimo(int idLivroEmprestimo, Emprestimo emprestimo, Exemplar exemplar) {
        this.idLivroEmprestimo = idLivroEmprestimo;
        this.emprestimo = emprestimo;
        this.exemplar = exemplar;
    }
    public LivroHasEmprestimo(int idLivroEmprestimo, Emprestimo emprestimo, Exemplar exemplar, Set advertencias) {
       this.idLivroEmprestimo = idLivroEmprestimo;
       this.emprestimo = emprestimo;
       this.exemplar = exemplar;
       this.advertencias = advertencias;
    }
   
    public int getIdLivroEmprestimo() {
        return this.idLivroEmprestimo;
    }
    
    public void setIdLivroEmprestimo(int idLivroEmprestimo) {
        this.idLivroEmprestimo = idLivroEmprestimo;
    }
    public Emprestimo getEmprestimo() {
        return this.emprestimo;
    }
    
    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    public Exemplar getExemplar() {
        return this.exemplar;
    }
    
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
    public Set getAdvertencias() {
        return this.advertencias;
    }
    
    public void setAdvertencias(Set advertencias) {
        this.advertencias = advertencias;
    }




}


