/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeControle;

import javax.swing.JOptionPane;
import getSet.professorGetSet;

/**
 *
 * @author Aluno
 */
public class controleProfessor {
    
    
    public boolean TestaConferirProfessor(professorGetSet i) {
        boolean result = false;

        if (i != null
                && i.getNome().length() > 0
                && i.getCpf().length() > 0
                && i.getDtNascimento().length() > 0
                && i.getNumFuncional().length() > 0
                && i.getEmail().length() > 0
                && i.getCelular().length() > 0
                && i.getlCurso().length() > 0
                && i.getCursoSelect().length() >0
                && i.getTurno().length() > 0
                && i.getCep().length() > 0
                && i.getLogradouro().length() > 0
                && i.getNumResidencia().length() > 0
                && i.getBairro().length() > 0
                && i.getCidade().length() > 0
                && i.getComplemento().length() > 0
                && i.getEstado().length() > 0) {
            result = true;

        } else {
            JOptionPane.showMessageDialog(null, "Impossibilitado de concluir o cadastro!");
        }

        return result;
    }

    
}
