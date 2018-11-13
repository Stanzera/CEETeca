/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import getSet.alunoGetSet;
import getSet.bibliotecarioGetSet;
import getSet.emprestimoGetSet;
import getSet.livroGetSet;
import getSet.professorGetSet;

/**
 *
 * @author pedro
 */
public class Banco {
        public static ArrayList<alunoGetSet> alunos = new ArrayList<>();
        public static ArrayList<bibliotecarioGetSet> bibliotecarios = new ArrayList<>();
        public static ArrayList<emprestimoGetSet> emprestimos = new ArrayList<>();
        public static ArrayList <livroGetSet> livros = new ArrayList<>();
        public static ArrayList<professorGetSet> professores = new ArrayList<>();
 
}
