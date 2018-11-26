/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeControle;

import javax.swing.JOptionPane;
import models.Exemplar;
import models.Livro;

/**
 *
 * @author Aluno
 */
public class controleLivro {

    public boolean TestaConferirLivro(Livro l, Exemplar e) {

        boolean result = false;

        if (l != null
                && e !=null
                && l.getTituloLivro().length() > 0
                && l.getSubTituloLivro().length() > 0
                && l.getAutorLivro().length() > 0
                && l.getAssunto().length() > 0
                && l.getIsbn().length() > 0
                && l.getCddLivro().length() > 0
                && l.getEditoraLivro().length() > 0
                && l.getEdicaoLivro().length() > 0
                && l.getIdioma().length() >0
                && l.getSerieLivro().length()>0
                && l.getAnoLivro().length()>0
                && l.getPaginas().length()>0
                && e.getQuantidadeExemplar().) {
            
            result = true;
        }else{
            JOptionPane.showMessageDialog(null, "Impossibilitado de concluir o cadastro!!");
        }

        return result;
    }

}
