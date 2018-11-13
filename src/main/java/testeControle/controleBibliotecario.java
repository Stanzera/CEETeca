/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeControle;

import javax.swing.JOptionPane;
import getSet.alunoGetSet;
import getSet.bibliotecarioGetSet;

/**
 *
 * @author Aluno
 */
public class controleBibliotecario {
    
    public boolean testaConferirBibliotecario(bibliotecarioGetSet i){
    boolean result = false;
    
        if (i!=null
                //Dados Pessoais
                && i.getNome().length()>0
                && i.getCpf().length()>0
                && i.getDtNascimento().length()>0
                && i.getNumFuncional().length()>0
                && i.getTurno().length()>0
                && i.getUsuario().length()>0
                && i.getSenha().length()>0
                && i.getConfirmSenha().length()>0
                //Endereço
                && i.getCep().length()>0
                && i.getRua().length()>0
                && i.getBairro().length()>0
                && i.getCidade().length()>0
                && i.getComplemento().length()>0
                && i.getNumero().length()>0
                && i.getUf().length()>0
                //contato
                && i.getEmail().length()>0
                && i.getCelular().length()>0
         
                ) {
            result = true;
            
        }else{
            JOptionPane.showMessageDialog(null, "Impossibilitado de concluir o cadastro.");
        }
        return result;
    }


}
