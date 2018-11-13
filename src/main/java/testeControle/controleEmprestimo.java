/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeControle;

import javax.swing.JOptionPane;
import getSet.emprestimoGetSet;

/**
 *
 * @author Aluno
 */
public class controleEmprestimo {

    public boolean TestaConferirEmprestimos(emprestimoGetSet i) {
        boolean result = false;

        if (i != null
                && i.getDtDevolucao().length() > 0
                && i.getNome().length() > 0
                && i.getNumChamada().length() > 0
                && i.getTipo().length() > 0
                && i.getCpf().length()>0
                && i.getObservacoes().length()>0) {
            result = true;

        } else {
            JOptionPane.showMessageDialog(null, "Impossibilitado de concluir o cadastro");
        }

        return result;
    }

}
