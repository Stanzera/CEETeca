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
public class HibernatePopulate {

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
        Date data = new Date();
        data.setDate(10);
        data.setMonth(8);
        data.setYear(1992);/*
        data.setHours(18);
        data.setMinutes(0);
        data.setSeconds(0);*/
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNomePessoa("Waldiskleyson");
        pessoa.setCpfPessoa("123.456.789-10");
        pessoa.setMatriculaPessoa("1234567890");
        pessoa.setDtnascimento(data);
        
        Contato contao = new Contato();
        contao.setCelularContato("9999-8888");
        contao.setEmailContato("waldin@milk.shake");
        contao.setTelefoneContato("3333-1010");
        contao.setPessoa(pessoa);
        
        Endereco endereco = new Endereco();
        endereco.setBairroEndereco("Bairro Celona");
        endereco.setCep("12340-580");
        endereco.setCidadeEndereco("Morro");
        endereco.setComplementoEndereco("Atras dá boate Drags Albergs");
        endereco.setLogradouroEndereco("Rua das Manas");
        endereco.setNumeroEndereco(1124);
        endereco.setPessoa(pessoa);
        
        Aluno aluno = new Aluno();
        aluno.setPessoa(pessoa);
        
        Modulo modes = new Modulo();
        modes.setDescricaoModulo("IV");
        
        Turno turno = new Turno();
        turno.setDescricaoTurno("Matutino");
        
        Curso curso = new Curso();
        curso.setDescricaoCurso("Necromancia");
        curso.setModulo(modes);
        curso.setTurno(turno);
        
        AlunoHasCurso ahc = new AlunoHasCurso();
        ahc.setAluno(aluno);
        ahc.setCurso(curso);
                
        //Salva o objeto na sessão
        actualSession.saveOrUpdate(pessoa);
        actualSession.saveOrUpdate(contao);
        actualSession.saveOrUpdate(endereco);
        actualSession.saveOrUpdate(aluno);
        actualSession.saveOrUpdate(turno);
        actualSession.saveOrUpdate(modes);
        actualSession.saveOrUpdate(curso);
        actualSession.saveOrUpdate(ahc);
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
        pessoa.setCpfPessoa("123.456.789-10");
        pessoa.setMatriculaPessoa("1234567890");
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
