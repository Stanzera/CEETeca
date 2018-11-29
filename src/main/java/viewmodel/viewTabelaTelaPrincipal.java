/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodel;

/**
 *
 * @author Aluno
 */
public class viewTabelaTelaPrincipal {
    /* create view telaPrincipal as
select distinct pessoa.nomePessoa as Nome, pessoa.matriculaPessoa as Matricula_Nº_Funcional, livro.tituloLivro as Titulo_Livro,
emprestimo.idEmprestimo as Nº_Chamada, emprestimo.dtDevolucaoEmprestimo as Limite_Data,
emprestimo.observacaoEmprestimo as Situacao
from pessoa
inner join emprestimo on pessoa.idPessoa = emprestimo.idEmprestimo
inner join livro_has_emprestimo on emprestimo_idEmprestimo = emprestimo.idEmprestimo
inner join exemplar ON livro_has_emprestimo.exemplar_idExemplar = exemplar.idExemplar
inner join livro ON exemplar.livro_idLivro = livro.idLivro*/
}
