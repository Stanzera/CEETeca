/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import models.*;
import org.hibernate.Session;

/**
 *
 * @author Aluno
 */
public class HibernateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        INSERIRALUNO();  
    }
    
    public static void INSERIRALUNO(){
        
        Session actualSession = NewHibernateUtil.getSessionFactory().openSession();
        
        //Inicializa a trasição
        actualSession.beginTransaction();
        
        //Cria uma query
        Query q = actualSession.createQuery("from Pessoa");
        
        //Pega os resultados da query em uma lista
        List<Pessoa> pessoas = q.getResultList();
        
        //Cria uma nova pessoa
        Pessoa pessoa = new Pessoa();
        Date data = new Date();
        data.setDate(10);
        data.setMonth(8);
        data.setYear(1992);/*
        data.setHours(18);
        data.setMinutes(0);
        data.setSeconds(0);*/
        
        pessoa.setNomePessoa("Waldiskleyson");
        pessoa.setMatriculaPessoa("1234567890");
        pessoa.setCpfPessoa("12345678910");
        pessoa.setTipo('a');
        pessoa.setDtnascimento(data);
        
        //Busca a lista de pessoa para pegar um usuário
        for (int i = 0; i < pessoas.size(); i++) {
            pessoa = pessoas.get(i);
            if(pessoa.getIdPessoa()== 0){
                break;
            }
        }
        
        //Criação de um curso
        Curso curso = new Curso(0,"Necromancia");
        
        //Criação de um turno
        Turno turno = new Turno(12, curso, 'V');
        
        //Criação de um módulo
        Modulo modulo = new Modulo();
        modulo.setDescricaoModulo("XI");
        modulo.setTurno(turno);
        //Cria um novo aluno
        Aluno aluno = new Aluno();
        aluno.setIdAluno(0);
        aluno.setPessoa(pessoa);
        aluno.setModulo(modulo);
        
        //Salva o objeto na sessão
        actualSession.save(pessoa);
        actualSession.save(curso);
        actualSession.save(turno);
        actualSession.save(modulo);
        actualSession.save(aluno);
        actualSession.getTransaction().commit();
        
        //Fecha a conexão com o banco
        actualSession.close();
        NewHibernateUtil.getSessionFactory().close();
    }
    
    public static void INSERIR(){
        //Faz a chamada da sessão
        Session actualSession = NewHibernateUtil.getSessionFactory().openSession();
        
        //Inicializa a trasição
        actualSession.beginTransaction();
        
        //Cria os objeto
        Date data = new Date();
        data.setDate(10);
        data.setMonth(8);
        data.setYear(1992);/*
        data.setHours(18);
        data.setMinutes(0);
        data.setSeconds(0);*/
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNomePessoa("Waldiskleyson");
        pessoa.setCpfPessoa("12345678910");
        pessoa.setTipo('a');
        pessoa.setDtnascimento(data);
        
        //Salva o objeto na sessão
        actualSession.save(pessoa);
        
        //Confirma a transação
        actualSession.getTransaction().commit();
        
        //Fecha a conexão com o banco
        actualSession.close();
        NewHibernateUtil.getSessionFactory().close();
    }
    
}
