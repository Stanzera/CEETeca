/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeControle;

import javax.swing.JOptionPane;
import getSet.livroGetSet;

/**
 *
 * @author Aluno
 */
public class controleLivro {

    public boolean TestaConferirLivro(livroGetSet i) {

        boolean result = false;

        if (i != null
                && i.getTitulo().length() > 0
                && i.getSubtitulo().length() > 0
                && i.getAutor().length() > 0
                && i.getAssunto().length() > 0
                && i.getIsbn().length() > 0
                && i.getCdd().length() > 0
                && i.getQtdExemplar().length() > 0
                && i.getEditora().length() > 0
                && i.getEdicao().length() > 0
                && i.getIdioma().length() >0
                && i.getSerie().length()>0
                && i.getAnoPublicacao().length()>0
                && i.getNumPaginas().length()>0) {
            
            result = true;
        }else{
            JOptionPane.showMessageDialog(null, "Impossibilitado de concluir o cadastro!!");
        }

        return result;
    }

}
