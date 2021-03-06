package models;
// Generated 27/11/2018 14:35:48 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Contato generated by hbm2java
 */
public class Contato  implements java.io.Serializable {


     private int idContato;
     private Pessoa pessoa;
     private String emailContato;
     private String telefoneContato;
     private String celularContato;

    public Contato() {
    }

	
    public Contato(int idContato, Pessoa pessoa, String emailContato, String celularContato) {
        this.idContato = idContato;
        this.pessoa = pessoa;
        this.emailContato = emailContato;
        this.celularContato = celularContato;
    }
    public Contato(int idContato, Pessoa pessoa, String emailContato, String telefoneContato, String celularContato) {
       this.idContato = idContato;
       this.pessoa = pessoa;
       this.emailContato = emailContato;
       this.telefoneContato = telefoneContato;
       this.celularContato = celularContato;
    }
   
    public int getIdContato() {
        return this.idContato;
    }
    
    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getEmailContato() {
        return this.emailContato;
    }
    
    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
    public String getTelefoneContato() {
        return this.telefoneContato;
    }
    
    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
    public String getCelularContato() {
        return this.celularContato;
    }
    
    public void setCelularContato(String celularContato) {
        this.celularContato = celularContato;
    }




}



